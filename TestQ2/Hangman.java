package TestQ2;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class Hangman extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane and set its properties
        Pane pane = new Pane();
        Circle head = new Circle(100,100,25);
        Line body = new Line(100,125,100, 175);
        Line leg1 = new Line(100,175,75,200);
        Line leg2 = new Line(100,175,125,200);
        Line arm1 = new Line(100,125,75,160);
        Line arm2 = new Line(100,125,125,160);
        Line Hbar = new Line(100,75,55,75);
        Line Vbar = new Line(55,75,55,200);
        Arc base = new Arc(55,200,20,20,90,90);
        Arc base2 = new Arc(55,200,20,20,90,-90);
        base.setFill(Color.TRANSPARENT);
        base.setStroke(Color.BLACK);
        base2.setFill(Color.TRANSPARENT);
        base2.setStroke(Color.BLACK);
        pane.getChildren().addAll(body,head,leg1,leg2,Hbar,Vbar,arm1,arm2,base,base2);
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Hangman"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    public static void main(String[] args) {
        launch(args);
    }
}
