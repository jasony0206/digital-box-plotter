package com.aiaa.urp.electronics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MasterWindow extends JFrame {

    // This class represents the master window of the application.
    // It has buttons that open a new window for graphing when pressed.
    // A newly opened window will plot a time-value line graph
    // real time from the data returned by the master device.

    public MasterWindow() {
        initUI();
    }

    private void initUI() {
        setTitle("AIAA URP Digital Box Plotter");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create buttons for plotting graphs
        JButton forceGraphButton = new JButton("Force");
        JButton pressureGraphButton = new JButton("Pressure");

        forceGraphButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("force button pressed!");
            }
        });

        pressureGraphButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("pressure button pressed!");
            }
        });

        createLayout(forceGraphButton, pressureGraphButton);
    }

    private void createLayout(JComponent... arg) {
        // Content pane is an area where child components can be placed
        Container pane = getContentPane();

        // Child components are organized by a layout manager.
        // Here, we use a type called GroupLayout manager.
        GroupLayout layout = new GroupLayout(pane);
        pane.setLayout(layout);

        // Leave margin between components
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createParallelGroup()
                        .addComponent(arg[0])
                        .addComponent(arg[1])
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                        .addComponent(arg[0])
                        .addComponent(arg[1])
        );
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
