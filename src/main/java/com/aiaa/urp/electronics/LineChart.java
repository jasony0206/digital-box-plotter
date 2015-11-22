package com.aiaa.urp.electronics;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.JFrame;
import java.util.Timer;
import java.util.TimerTask;

public class LineChart extends JFrame {

    public DefaultCategoryDataset dataset;
    private int count = 6;

    public LineChart(String applicationTitle, String chartTitle) {
        super(applicationTitle);
        dataset = createDataSet();

        JFreeChart lineChart = ChartFactory.createLineChart(
                chartTitle,
                "Years","Number of Schools",
                dataset,
                PlotOrientation.VERTICAL,
                true,true,false);

        ChartPanel chartPanel = new ChartPanel( lineChart );
        chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
        setContentPane( chartPanel );
    }

    private DefaultCategoryDataset createDataSet( ) {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset( );
        dataSet.addValue(15, "schools", "1970");
        dataSet.addValue(30, "schools", "1980");
        dataSet.addValue(60, "schools", "1990");
        dataSet.addValue(120, "schools", "2000");
        dataSet.addValue(240, "schools", "2010");
        dataSet.addValue(300, "schools", "2014");

        return dataSet;
    }

    public static void openChartWindow(String windowTitle, String chartTitle) {
        LineChart chart = new LineChart(windowTitle, chartTitle);
        chart.pack( );
        RefineryUtilities.centerFrameOnScreen( chart );
        chart.setVisible( true );
        chart.setTimer();
    }

    private void setTimer() {
        // creating timer task, timer
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                String year = String.valueOf(1970 + 10 * count);
                count++;
                dataset.addValue(100, "schools", year);

            }
        };
        Timer timer = new Timer();

        // scheduling the task at fixed rate delay
        timer.scheduleAtFixedRate(task, 500, 1000);
    }
}
