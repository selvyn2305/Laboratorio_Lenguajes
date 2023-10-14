/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackendAL;


import static Frontend.Archivo.txtArchivo;
import static Frontend.GenerarGrafico.Visual;
import java.awt.Desktop;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author SELVYN
 */
public class SubirArchivo {

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

    public  void AbrirArchivo(String nombreArchivo) {
        try {
            File path = new File("Manuales/" + nombreArchivo);
            Desktop.getDesktop().open(path);
            JOptionPane.showMessageDialog(null, "Archivo leído correctamente");
        } catch (IOException ex) {
            ex.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public  void CargarImagenAutomata(String imagePath) {
        // Cargar la imagen desde el archivo
        ImageIcon imageIcon = new ImageIcon(imagePath);

        // Establecer la imagen en el JLabel
        Visual.setIcon(imageIcon);

        // Escalar la imagen al tamaño del JLabel
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(Visual.getWidth(), Visual.getHeight(), Image.SCALE_SMOOTH);
        Visual.setIcon(new ImageIcon(scaledImage));
    }

    public  void CargarImagenes(String oopcion) {

        String imagenPath = "Diagramas/";

        switch (oopcion) {
            case "and":
                imagenPath += "opcion1.png";
                break;
            case "as":
                imagenPath += "opcion2.png";
                break;
            case "assert":
                imagenPath += "opcion3.png";
                break;
            case "break":
                imagenPath += "opcion4.png";
                break;
            case "class":
                imagenPath += "opcion5.png";
                break;
            case "continue":
                imagenPath += "opcion6.png";
                break;
            case "def":
                imagenPath += "opcion7.png";
                break;
            case "del":
                imagenPath += "opcion8.png";
                break;
            case "elif":
                imagenPath += "opcion9.png";
                break;
            case "else":
                imagenPath += "opcion10.png";
                break;
            case "except":
                imagenPath += "opcion11.png";
                break;
            case "False":
                imagenPath += "opcion12.png";
                break;
            case "finally":
                imagenPath += "opcion13.png";
                break;
            case "for":
                imagenPath += "opcion14.png";
                break;
            case "from":
                imagenPath += "opcion15.png";
                break;
            case "global":
                imagenPath += "opcion16.png";
                break;
            case "if":
                imagenPath += "opcion17.png";
                break;
            case "import":
                imagenPath += "opcion18.png";
                break;
            case "in":
                imagenPath += "opcion19.png";
                break;
            case "is":
                imagenPath += "opcion20.png";
                break;
            case "lambda":
                imagenPath += "opcion21.png";
                break;
            case "None":
                imagenPath += "opcion22.png";
                break;
            case "nonlocal":
                imagenPath += "opcion23.png";
                break;
            case "not":
                imagenPath += "opcion24.png";
                break;
            case "or":
                imagenPath += "opcion25.png";
                break;
            case "pass":
                imagenPath += "opcion26.png";
                break;
            case "raise":
                imagenPath += "opcion27.png";
                break;
            case "return":
                imagenPath += "opcion28.png";
                break;
            case "True":
                imagenPath += "opcion29.png";
                break;
            case "try":
                imagenPath += "opcion30.png";
                break;
            case "while":
                imagenPath += "opcion31.png";
                break;
            case "whith":
                imagenPath += "opcion32.png";
                break;
            case "yield":
                imagenPath += "opcion33.png";
                break;
            // Agrega más casos según tus opciones
            default:
                // Si no coincide con ninguna opción específica, puedes establecer una imagen por defecto o manejarlo de otra manera.
                break;
        }
        CargarImagenAutomata(imagenPath);
    }
}
