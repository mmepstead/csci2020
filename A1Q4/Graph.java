package A1Q4;

import javafx.application.Application;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.collections.FXCollections;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class Graph extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        CategoryAxis xaxis = new CategoryAxis();
        xaxis.setLabel("Letters");
        NumberAxis yaxis = new NumberAxis();
        yaxis.setLabel("Count");
        BarChart letters = new BarChart(xaxis, yaxis);
        TextField text = new TextField();
        Button btnChart = new Button("Chart");
        btnChart.setOnAction(e -> {
            File file = new File(text.getText());
            System.out.println(file.exists());
            String fulltext = "";
            try {
                Scanner input = new Scanner(file);
                while (input.hasNext()) {
                    fulltext += input.nextLine();
                }
                input.close();
            }
            catch(IOException m)
            {
                System.out.println("File Does Not Exist");
                System.exit(1);
            }
            int aCount = 0;
            int bCount = 0;
            int cCount = 0;
            int dCount = 0;
            int eCount = 0;
            int fCount = 0;
            int gCount = 0;
            int hCount = 0;
            int iCount = 0;
            int jCount = 0;
            int kCount = 0;
            int lCount = 0;
            int mCount = 0;
            int nCount = 0;
            int oCount = 0;
            int pCount = 0;
            int qCount = 0;
            int rCount = 0;
            int sCount = 0;
            int tCount = 0;
            int uCount = 0;
            int vCount = 0;
            int wCount = 0;
            int xCount = 0;
            int yCount = 0;
            int zCount = 0;
            for(char character : fulltext.toCharArray())
            {
                switch(character)
                {
                    case('A'):
                    {
                        aCount += 1;
                        break;
                    }
                    case('a'):
                    {
                        aCount += 1;
                        break;
                    }
                    case('B'):
                    {
                        bCount += 1;
                        break;
                    }
                    case('b'):
                    {
                        bCount += 1;
                        break;
                    }
                    case('C'):
                    {
                        cCount += 1;
                        break;
                    }
                    case('c'):
                    {
                        cCount += 1;
                        break;
                    }
                    case('D'):
                    {
                        dCount += 1;
                        break;
                    }
                    case('d'):
                    {
                        dCount += 1;
                        break;
                    }
                    case('E'):
                    {
                        eCount += 1;
                        break;
                    }
                    case('e'):
                    {
                        eCount += 1;
                        break;
                    }
                    case('F'):
                    {
                        fCount += 1;
                        break;
                    }
                    case('f'):
                    {
                        fCount += 1;
                        break;
                    }
                    case('G'):
                    {
                        gCount += 1;
                        break;
                    }
                    case('g'):
                    {
                        gCount += 1;
                        break;
                    }
                    case('H'):
                    {
                        hCount += 1;
                        break;
                    }
                    case('h'):
                    {
                        hCount += 1;
                        break;
                    }
                    case('I'):
                    {
                        iCount += 1;
                        break;
                    }
                    case('i'):
                    {
                        iCount += 1;
                        break;
                    }
                    case('J'):
                    {
                        jCount += 1;
                        break;
                    }
                    case('j'):
                    {
                        jCount += 1;
                        break;
                    }
                    case('K'):
                    {
                        kCount += 1;
                        break;
                    }
                    case('k'):
                    {
                        kCount += 1;
                        break;
                    }
                    case('L'):
                    {
                        lCount += 1;
                        break;
                    }
                    case('l'):
                    {
                        lCount += 1;
                        break;
                    }
                    case('M'):
                    {
                        mCount += 1;
                        break;
                    }
                    case('m'):
                    {
                        mCount += 1;
                        break;
                    }
                    case('N'):
                    {
                        nCount += 1;
                        break;
                    }
                    case('n'):
                    {
                        nCount += 1;
                        break;
                    }
                    case('O'):
                    {
                        oCount += 1;
                        break;
                    }
                    case('o'):
                    {
                        oCount += 1;
                        break;
                    }
                    case('P'):
                    {
                        pCount += 1;
                        break;
                    }
                    case('p'):
                    {
                        pCount += 1;
                        break;
                    }
                    case('Q'):
                    {
                        qCount += 1;
                        break;
                    }
                    case('q'):
                    {
                        qCount += 1;
                        break;
                    }
                    case('R'):
                    {
                        rCount += 1;
                        break;
                    }
                    case('r'):
                    {
                        rCount += 1;
                        break;
                    }
                    case('S'):
                    {
                        sCount += 1;
                        break;
                    }
                    case('s'):
                    {
                        sCount += 1;
                        break;
                    }
                    case('T'):
                    {
                        tCount += 1;
                        break;
                    }
                    case('t'):
                    {
                        tCount += 1;
                        break;
                    }
                    case('U'):
                    {
                        uCount += 1;
                        break;
                    }
                    case('u'):
                    {
                        uCount += 1;
                        break;
                    }
                    case('V'):
                    {
                        vCount += 1;
                        break;
                    }
                    case('v'):
                    {
                        vCount += 1;
                        break;
                    }
                    case('W'):
                    {
                        wCount += 1;
                        break;
                    }
                    case('w'):
                    {
                        wCount += 1;
                        break;
                    }
                    case('X'):
                    {
                        xCount += 1;
                        break;
                    }
                    case('x'):
                    {
                        xCount += 1;
                        break;
                    }
                    case('Y'):
                    {
                        yCount += 1;
                        break;
                    }
                    case('y'):
                    {
                        yCount += 1;
                        break;
                    }
                    case('Z'):
                    {
                        zCount += 1;
                        break;
                    }
                    case('z'):
                    {
                        zCount += 1;
                        break;
                    }
                }
            }
            XYChart.Series dataSeries = new XYChart.Series();
            dataSeries.getData().addAll(new XYChart.Data("A", aCount),new XYChart.Data("B", bCount),
                    new XYChart.Data("C", cCount), new XYChart.Data("D", dCount),
                    new XYChart.Data("E", eCount), new XYChart.Data("F", fCount),
                    new XYChart.Data("G", gCount),new XYChart.Data("H", hCount),
                    new XYChart.Data("I", iCount), new XYChart.Data("J", jCount),
                    new XYChart.Data("K", kCount), new XYChart.Data("L", lCount),
            new XYChart.Data("M", mCount),new XYChart.Data("N", nCount),
                    new XYChart.Data("O", oCount), new XYChart.Data("P", pCount),
                    new XYChart.Data("Q", qCount), new XYChart.Data("R", rCount),
            new XYChart.Data("S", sCount),new XYChart.Data("T", tCount),
                    new XYChart.Data("U", uCount), new XYChart.Data("V", vCount),
                    new XYChart.Data("W", wCount), new XYChart.Data("X", xCount),
            new XYChart.Data("Y", yCount), new XYChart.Data("Z", zCount));
            xaxis.setCategories(FXCollections.observableArrayList("A","B","C","D","E","F","G","H","I","J","K"
            ,"L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"));
            letters.getData().add(dataSeries);
        });

        VBox vbox = new VBox();
        vbox.getChildren().add(letters);
        BorderPane pane = new BorderPane();
        vbox.getChildren().addAll(text, btnChart);
        pane.setLeft(vbox);
        Scene scene = new Scene(pane, 400, 200);
        primaryStage.setTitle("Calculate");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
