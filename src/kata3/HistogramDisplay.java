/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.awt.Container;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author usuario
 */
public class HistogramDisplay extends ApplicationFrame{

    public HistogramDisplay() {
        super("HISTROGRAMA");
        setContentPane(createPanel());
        pack();
    }

    private ChartPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 450));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart("Histograma de Barras", "Dominios", "Nº emails", dataset, PlotOrientation.VERTICAL, true, true, false);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(8, "ENE", "gmail.com");
        dataset.addValue(10, "ENE", "hotmail.com");
        dataset.addValue(7, "ENE", "ulpgc.es");
        dataset.addValue(9, "ENE", "ull.es");
        dataset.addValue(8, "FEB", "gmail.com");
        dataset.addValue(11, "FEB", "hotmail.com");
        dataset.addValue(6, "FEB", "ulpgc.es");
        dataset.addValue(8, "FEB", "ull.es");
        dataset.addValue(9, "MAR", "gmail.com");
        dataset.addValue(10, "MAR", "hotmail.com");
        dataset.addValue(8, "MAR", "ulpgc.es");
        dataset.addValue(10, "MAR", "ull.es");
        return dataset;
    }
    
    public void execute(){
        setVisible(true);
    }
    
    
}
