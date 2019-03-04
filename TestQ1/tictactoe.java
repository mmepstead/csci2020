package TestQ1;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class tictactoe extends Application {


        @Override // Override the start method in the Application class
        public void start(Stage primaryStage) {

            // Create a pane and set its properties
            GridPane pane = new GridPane();
            pane.setAlignment(Pos.CENTER);
            pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
            pane.setHgap(5.5);
            pane.setVgap(5.5);
            Image x = new Image("file:///C:/Users/Matthew/Documents/UI Codes/image/image/x.gif");
            Image o = new Image("file:///C:/Users/Matthew/Documents/UI Codes/image/image/o.gif");


            // Place nodes in the pane
            pane.add(new ImageView(x), 0, 0);
            pane.add(new ImageView(o), 0, 1);
            pane.add(new ImageView(x), 0, 2);
            pane.add(new ImageView(x), 1, 0);
            pane.add(new ImageView(o), 1, 1);
            pane.add(new ImageView(x), 1, 2);
            pane.add(new ImageView(o), 2, 0);
            pane.add(new ImageView(x), 2, 1);
            pane.add(new ImageView(x), 2, 2);

            // Create a scene and place it in the stage
            Scene scene = new Scene(pane);
            primaryStage.setTitle("ShowGridPane"); // Set the stage title
            primaryStage.setScene(scene); // Place the scene in the stage
            primaryStage.show(); // Display the stage
        }

        public static void main(String[] args) {
            launch(args);
        }
    }
