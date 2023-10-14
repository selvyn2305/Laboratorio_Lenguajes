package BackEnd.AnalizadorLexico;
import static BackEnd.AnalizadorLexico.Tokens.*;
import BackEnd.AnalizadorLexico.TipoToken;

%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
%{
    public String lexema;
    public int fila = 1;
    public int columna = 1;
%}
%%  
as |  
assert |
break |
class |
continue | 
def |
del | 
elif | 
else | 
except | 
finally | 
for |
from | 
global |
if |
import |
in | 
is | 
lambda | 
None | 
nonlocal | 
pass |
raise |
return |  
try | 
while |
with |
yield { lexema = yytext(); return Palabras_Claves; }
[ \t\r\n]+ { // Reconoce espacios en blanco, tabulaciones y saltos de línea
    String texto = yytext();
    for (int i = 0; i < texto.length(); i++) {
        if (texto.charAt(i) == '\n') {
            fila++;
            columna = 1;
        } else {
            columna++;
        }
    }
}
"=" | 
"+" | 
"-" | 
"*" | 
"/" |
"//" | 
"**" |
"%" { lexema = yytext(); return Aritmeticos; }
"(" | 
")" | 
"{" | 
"}" | 
"[" | 
"]" | 
"," | 
";" | 
":" { lexema = yytext(); return Otros; } 
"==" | 
"<" |   
">" |  
"<=" | 
">=" | 
"!=" { lexema = yytext(); return Comparacion; }  
"+=" |   
"-=" |   
"//=" |  
"/=" |    
"%=" { lexema = yytext(); return Asignacion; }  
and |
or |
not { lexema = yytext(); return Logicos; }
True |
False { lexema = yytext(); return Booleanos; }
"&" |
"|" |
"^" |
"<<" |
">>" { lexema = yytext(); return Bits; }  
{L}({L}|{D}|_)* { lexema = yytext();  columna += lexema.length();  return Identificador; }
("-"?{D}+("."{D}+)?)|{D}+ { lexema = yytext(); return Constante; }
#.+  { lexema = yytext(); return Comentarios; }
\"[^\"]*\" { lexema = yytext(); return CadenaDoble; }
\'[^\']*\' { lexema = yytext(); return CadenaSimple; }
. { lexema = yytext(); return ERROR; }


