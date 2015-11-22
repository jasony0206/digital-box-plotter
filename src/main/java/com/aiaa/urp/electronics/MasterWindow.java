package com.aiaa.urp.electronics;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class MasterWindow extends JFrame {

    // This class represents the master window of the application.
    // It has buttons that open a new window for graphing when pressed.
    // A newly opened window will display a time-value line graph
    // live from the data returned by the master device.

    public MasterWindow() {
        initUI();
    }

    private void initUI() {
        setTitle("AIAA URP Digital Box Plotter");
        setSize(400, 300);
        // center the window on the screen
        setLocationRelativeTo(null);
        // exit when close button is pressed
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // ensure that all UI updates are concurrency safe
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MasterWindow masterWindow = new MasterWindow();
                masterWindow.setVisible(true);
            }
        });
    }
}
