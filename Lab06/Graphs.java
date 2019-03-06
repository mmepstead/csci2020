package Lab06;

import javafx.application.Application;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import javafx.geometry.Insets;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.collections.FXCollections;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class Graphs extends Application {

    private static double[] avgHousingPricesByYear = {
            247381.0,264171.4,287715.3,294736.1,
            308431.4,322635.9,340253.0,363153.7
    };
    private static double[] avgCommercialPricesByYear = {
            1121585.3,1219479.5,1246354.2,1295364.8,
            1335932.6,1472362.0,1583521.9,1613246.3
    };
    private static String[] ageGroups = {
            "18-25", "26-35", "36-45", "46-55", "56-65", "65+"
    };
    private static int[] purchasesByAgeGroup = {
            648, 1021, 2453, 3173, 1868, 2247
    };
    private static Color[] pieColours = {
            Color.AQUA, Color.GOLD, Color.DARKORANGE,
            Color.DARKSALMON, Color.LAWNGREEN, Color.PLUM
    };

    @Override
    public void start(Stage primaryStage) throws Exception {

        CategoryAxis xaxis = new CategoryAxis();
        xaxis.setLabel("Type");
        NumberAxis yaxis = new NumberAxis();
        yaxis.setLabel("Value");
        BarChart prices = new BarChart(xaxis, yaxis);
        TextField text = new TextField();
        Button btnChart = new Button("Chart");
        XYChart.Series dataSeries = new XYChart.Series();
        XYChart.Series dataSeries2 = new XYChart.Series();
        for(int i=0; i<avgHousingPricesByYear.length; i+=1)
        {
            dataSeries.getData().add(new XYChart.Data(Integer.toString((2000+i)), avgHousingPricesByYear[i]));
        }
        for(int i=0; i<avgCommercialPricesByYear.length; i+=1)
        {
            dataSeries2.getData().add(new XYChart.Data(Integer.toString(2000+i), avgCommercialPricesByYear[i]));
        }
        dataSeries.setName("Housing");
        dataSeries2.setName("Commercial");
        prices.getData().addAll(dataSeries, dataSeries2);

        PieChart pie = new PieChart();
        for(int i=0; i<ageGroups.length; i+=1)
        {
            PieChart.Data data = new PieChart.Data(ageGroups[i],purchasesByAgeGroup[i]);
            pie.getData().add(new PieChart.Data(ageGroups[i],purchasesByAgeGroup[i]));
        }


        VBox vbox = new VBox();
        vbox.getChildren().addAll(prices,pie);
        vbox.setPadding(new Insets(15,15,15,15));
        BorderPane pane = new BorderPane();
        pane.setLeft(vbox);
        Scene scene = new Scene(pane, 800, 600);
        primaryStage.setTitle("Lab 6 Solution");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
