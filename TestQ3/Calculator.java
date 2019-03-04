package TestQ3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {
    private TextField number_2 = new TextField();
    private TextField number_1 = new TextField();
    private TextField Value = new TextField();




    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane pane = new BorderPane();
        pane.setLeft(getVBox());
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Lab 04 Solution");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private VBox getVBox() {
        VBox vbox = new VBox();
        Button btnRegister = new Button("Add");
        vbox.setPadding(new Insets(15, 50, 15, 35));
        HBox number1 = new HBox();
        number1.getChildren().add(new Label("Number 1"));
        number1.getChildren().add(number_1);
        HBox number2 = new HBox();
        number2.getChildren().add(new Label("Number 2"));
        number2.getChildren().add(number_2);
        HBox value = new HBox();
        value.getChildren().add(new Label("Number 2"));
        value.getChildren().add(Value);
        vbox.getChildren().addAll(number1,number2);

        return vbox;
    }

    class RegisterHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent e) {
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
