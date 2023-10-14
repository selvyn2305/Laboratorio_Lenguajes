/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.AnalizadorLexico;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static FrontEnd.Principal.txtArchivo;

/**
 *
 * @author SELVYN
 */
public class SubirArchivos {

    public void AgregarArchivo() {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        File Archivo = fc.getSelectedFile();

        try {
            FileReader fr = new FileReader(Archivo);
            BufferedReader br = new BufferedReader(fr);
            String texto = "";
            String linea = "";
            while ((linea = br.readLine()) != null) {
                texto += linea + "\n";
            }
            txtArchivo.setText(texto);
            JOptionPane.showMessageDialog(null, "Archivo leído correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
}
