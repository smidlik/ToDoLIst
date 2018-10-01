package cz.uhk.pro2.app;

import cz.uhk.pro2.GUI.MainFrame;

import javax.swing.*;

public class App {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);

            }
        });
    }
}
