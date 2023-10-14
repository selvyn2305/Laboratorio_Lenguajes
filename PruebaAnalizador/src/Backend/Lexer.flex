package Backend;
import static Backend.Tokens.*;

%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio = [' ', '\t', '\r', '\n']+  

%{
    public String lexema;
    private int fila = 1;
    private int columna = 1;
%}

%%
\n { fila++; columna = 1; }
and |
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
False | 
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
not | 
or |
pass |
raise |
return | 
True | 
try | 
while |
with |
yield { lexema = yytext(); return Palabras_Claves; }
{espacio} {/* Ignorar */}
"//".* {/* Ignorar */}
"=" | 
"+" | 
"-" | 
"*" | 
"/" | 
"%" { lexema = yytext(); return Aritmeticos; }
"(" | 
")" | 
"{" | 
"}" | 
"[" | 
"]" | 
 , | 
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
{L}({L}|{D}|_)* { lexema = yytext(); return Identificador; }
("-"?{D}+("."{D}+)?)|{D}+ { lexema = yytext(); return Constante; }
#[a-zA-Z0-9]*  { lexema = yytext(); return Comentarios; }
\"[^\"]*\" { lexema = yytext(); return CadenaDoble; }
\'[^\']*\' { lexema = yytext(); return CadenaSimple; }
. { fila++; columna++; return ERROR; }
