package com.how_to_program.chapter_3;

import javax.swing.JOptionPane;

public class DialogBoxTesting {

    public static void main(String[] args){
        //JOptionPane.showMessageDialog(null, "Welcolme to Java Swings GUI!");
        int selection = JOptionPane.showConfirmDialog(null, "Are you sure you want to do this?", "Please check", JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.printf("The option selected was: %d\n", selection);
    }
}
