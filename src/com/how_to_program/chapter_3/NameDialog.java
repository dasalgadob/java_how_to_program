package com.how_to_program.chapter_3;

import javax.swing.*;

public class NameDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        String message = String.format("Welcome to this demo app %s", name);
        JOptionPane.showMessageDialog(null, message);
    }
}
