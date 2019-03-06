package A1Q4;

import javafx.application.Application;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class HandMadeChart extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField text = new TextField();
        HBox hbox = new HBox();
        HBox hbox2 = new HBox(8.4);
        hbox.setMinHeight(250);
        Button btnChart = new Button("Chart");
        int count[] = new int [26];
        btnChart.setOnAction(e -> {
            //Clear old chart
            hbox.getChildren().clear();
            hbox2.getChildren().clear();
            for(int i=0; i<26; i+=1)
            {
                count[i] = 0;
            }
            //Read file name
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
            double total = 0;
            //Count the characters
            for(char character : fulltext.toCharArray())
            {
                total += 1;
                switch(character)
                {
                    case('A'):
                    {
                        count[0] += 1;
                        break;
                    }
                    case('a'):
                    {
                        count[0] += 1;
                        break;
                    }
                    case('B'):
                    {
                        count[1] += 1;
                        break;
                    }
                    case('b'):
                    {
                        count[1] += 1;
                        break;
                    }
                    case('C'):
                    {
                        count[2] += 1;
                        break;
                    }
                    case('c'):
                    {
                        count[2] += 1;
                        break;
                    }
                    case('D'):
                    {
                        count[3] += 1;
                        break;
                    }
                    case('d'):
                    {
                        count[3] += 1;
                        break;
                    }
                    case('E'):
                    {
                        count[4] += 1;
                        break;
                    }
                    case('e'):
                    {
                        count[4] += 1;
                        break;
                    }
                    case('F'):
                    {
                        count[5] += 1;
                        break;
                    }
                    case('f'):
                    {
                        count[5] += 1;
                        break;
                    }
                    case('G'):
                    {
                        count[6] += 1;
                        break;
                    }
                    case('g'):
                    {
                        count[6] += 1;
                        break;
                    }
                    case('H'):
                    {
                        count[7] += 1;
                        break;
                    }
                    case('h'):
                    {
                        count[7] += 1;
                        break;
                    }
                    case('I'):
                    {
                        count[8] += 1;
                        break;
                    }
                    case('i'):
                    {
                        count[8] += 1;
                        break;
                    }
                    case('J'):
                    {
                        count[9] += 1;
                        break;
                    }
                    case('j'):
                    {
                        count[9] += 1;
                        break;
                    }
                    case('K'):
                    {
                        count[10] += 1;
                        break;
                    }
                    case('k'):
                    {
                        count[10] += 1;
                        break;
                    }
                    case('L'):
                    {
                        count[11] += 1;
                        break;
                    }
                    case('l'):
                    {
                        count[11] += 1;
                        break;
                    }
                    case('M'):
                    {
                        count[12] += 1;
                        break;
                    }
                    case('m'):
                    {
                        count[12] += 1;
                        break;
                    }
                    case('N'):
                    {
                        count[13] += 1;
                        break;
                    }
                    case('n'):
                    {
                        count[13] += 1;
                        break;
                    }
                    case('O'):
                    {
                        count[14] += 1;
                        break;
                    }
                    case('o'):
                    {
                        count[14] += 1;
                        break;
                    }
                    case('P'):
                    {
                        count[15] += 1;
                        break;
                    }
                    case('p'):
                    {
                        count[15] += 1;
                        break;
                    }
                    case('Q'):
                    {
                        count[16] += 1;
                        break;
                    }
                    case('q'):
                    {
                        count[16] += 1;
                        break;
                    }
                    case('R'):
                    {
                        count[17] += 1;
                        break;
                    }
                    case('r'):
                    {
                        count[17] += 1;
                        break;
                    }
                    case('S'):
                    {
                        count[18] += 1;
                        break;
                    }
                    case('s'):
                    {
                        count[18] += 1;
                        break;
                    }
                    case('T'):
                    {
                        count[19] += 1;
                        break;
                    }
                    case('t'):
                    {
                        count[19] += 1;
                        break;
                    }
                    case('U'):
                    {
                        count[20] += 1;
                        break;
                    }
                    case('u'):
                    {
                        count[20] += 1;
                        break;
                    }
                    case('V'):
                    {
                        count[21] += 1;
                        break;
                    }
                    case('v'):
                    {
                        count[21] += 1;
                        break;
                    }
                    case('W'):
                    {
                        count[22] += 1;
                        break;
                    }
                    case('w'):
                    {
                        count[22] += 1;
                        break;
                    }
                    case('X'):
                    {
                        count[23] += 1;
                        break;
                    }
                    case('x'):
                    {
                        count[23] += 1;
                        break;
                    }
                    case('Y'):
                    {
                        count[24] += 1;
                        break;
                    }
                    case('y'):
                    {
                        count[24] += 1;
                        break;
                    }
                    case('Z'):
                    {
                        count[25] += 1;
                        break;
                    }
                    case('z'):
                    {
                        count[25] += 1;
                        break;
                    }
                }
            }
            String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T"
            ,"U","V","W","X","Y","Z"};
            for(int i=1; i<=26; i+=1)
            {
                //For each letter make a rectangle
                Rectangle rectangle = new Rectangle();
                Text letter = new Text();
                //Add letter label in hbox2 below bar
                letter.setText(letters[i-1]);
                rectangle.setFill(Color.WHITE);
                rectangle.setStroke(Color.BLACK);
                rectangle.setX(10*i);
                rectangle.setY(10);
                rectangle.setHeight(190*(count[i-1]/total));
                rectangle.setWidth(15);
                //Need to translate height so rectangle isn't upside down
                rectangle.setTranslateY(190-rectangle.getHeight());
                hbox.getChildren().add(rectangle);
                hbox2.getChildren().add(letter);
            }

        });
        //Add Everything to pane with proper spacing and sizes
        VBox vbox = new VBox();
        vbox.setMinWidth(400);
        vbox.getChildren().add(hbox);
        hbox2.setTranslateY(-50);
        vbox.getChildren().add(hbox2);
        vbox.setPadding(new Insets(15,15,15,15));
        BorderPane pane = new BorderPane();
        vbox.getChildren().addAll(text, btnChart);
        pane.setLeft(vbox);
        Scene scene = new Scene(pane, 800, 600);
        primaryStage.setTitle("Calculate");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
