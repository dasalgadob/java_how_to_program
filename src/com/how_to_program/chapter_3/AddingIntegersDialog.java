package com.how_to_program.chapter_3;

import javax.swing.*;

public class AddingIntegersDialog {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog("Inserta el primer dígito:"));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog("Inserta el segundo dígito:"));
        int result = number1 + number2;
        JOptionPane.showMessageDialog(null, String.format("El resultado es: %d", result) );

    }
}
