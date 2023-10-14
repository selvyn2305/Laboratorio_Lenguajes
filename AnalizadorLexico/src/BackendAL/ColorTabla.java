/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackendAL;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
//import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SELVYN
 */
public class ColorTabla extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);

        Object cellValue = table.getValueAt(row, 0);
        if (cellValue != null) {
            String cellText = cellValue.toString();

            if ("Identificador".equals(cellText)) {
                setForeground(Color.blue);
            } else if ("Palabra Reservada".equals(cellText)) {
                setForeground(Color.pink);
            } else if ("Aritmetico".equals(cellText) || "Comparacion".equals(cellText) || "Asignacion".equals(cellText)) {
                setForeground(Color.cyan);
            } else if ("Constante".equals(cellText )) {
                setForeground(Color.red);
            } else if ("Cadenas".equals(cellText)) {
                setForeground(Color.orange);
            } else if ("Comentarios".equals(cellText)) {
                setForeground(Color.gray);
            } else if ("Otros".equals(cellText)) {
                setForeground(Color.green);
            } else {
                // Reiniciar el color de texto a su valor predeterminado
                setForeground(table.getForeground());
            }
        } else {
            // Restablecer el color de texto a su valor predeterminado si el valor de la celda es nulo
            setForeground(table.getForeground());
        }

        return component;
    }

}
