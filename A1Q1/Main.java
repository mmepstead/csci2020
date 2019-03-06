package A1Q1;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {


    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

        // Create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        double randomDouble = Math.random();
        randomDouble = randomDouble * 54 + 1;
        int randomInt1 = (int) randomDouble;
        int randomInt2 = -1;
        int randomInt3 = -1;
        Image card1 = new Image("A1Q1/Cards/" + randomInt1 + ".png");
        while(randomInt2 == -1)
        {
            double randomDouble2 = Math.random();
            randomDouble = randomDouble2 * 50 + 1;
            randomInt2 = (int) randomDouble;
            if(randomInt2 == randomInt1)
            {
                randomInt2 = -1;
            }
        }
        while(randomInt3 == -1)
        {
            double randomDouble3 = Math.random();
            randomDouble = randomDouble3 * 50 + 1;
            randomInt3 = (int) randomDouble;
            if(randomInt3 == randomInt1 || randomInt3 == randomInt2)
            {
                randomInt3 = -1;
            }
        }
        Image card2 = new Image("A1Q1/Cards/" + randomInt2 + ".png");
        Image card3 = new Image("A1Q1/Cards/" + randomInt3 + ".png");
        // Place nodes in the pane
        pane.add(new ImageView(card1), 0, 0);
        pane.add(new ImageView(card2), 1, 0);
        pane.add(new ImageView(card3), 2, 0);

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

