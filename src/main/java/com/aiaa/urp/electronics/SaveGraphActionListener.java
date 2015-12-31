package com.aiaa.urp.electronics;

import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class SaveGraphActionListener implements ActionListener {

    // This class implements the action listener interface for the button
    // that is used for saving the graph.

    private JFreeChart chart;

    public SaveGraphActionListener(JFreeChart chart) {
        this.chart = chart;
    }

    // TODO: Use a unique filename for each instance: maybe append an aggregate counter?
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("save graph button pressed!");

        int width = 640; /* Width of the image */
        int height = 480; /* Height of the image */
        File lineChart = new File( "LineChart.jpeg" );

        try {
            ChartUtilities.saveChartAsJPEG(lineChart, chart, width, height);
        } catch(IOException exception) {
            exception.printStackTrace();
        }
    }
}
