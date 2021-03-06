package A1Q2;

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
import java.lang.String;

public class Calculate extends Application {
    //Initialize text fields
    private TextField investment = new TextField();
    private TextField years = new TextField();
    private TextField interest = new TextField();
    private TextField value = new TextField();





    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane pane = new BorderPane();
        pane.setLeft(getVBox());
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Calculate");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private VBox getVBox() {
        //Series of Hboxes within vbox (Could do this cleaner with multiple VBoxes in HBox but was re-using code)
        VBox vbox = new VBox();
        Button btnCalculate = new Button("Calculate");
        btnCalculate.setOnAction(new CalculateHandler());
        vbox.setPadding(new Insets(15, 50, 15, 35));
        HBox investment_box = new HBox();
        investment_box.setSpacing(20);
        investment_box.getChildren().add(new Label("Investment Amount"));
        investment_box.getChildren().add(investment);
        HBox years_box = new HBox();
        years_box.setSpacing(95);
        years_box.getChildren().add(new Label("Years"));
        years_box.getChildren().add(years);
        HBox interest_box = new HBox();
        interest_box.setSpacing(16);
        interest_box.getChildren().add(new Label("Annual Interest Rate"));
        interest_box.getChildren().add(interest);
        HBox value_box = new HBox();
        //Make sure final result can't be edited
        value_box.setSpacing(57);
        value.setEditable(false);
        value_box.getChildren().addAll(new Label("Future Value"), value);
        vbox.getChildren().addAll(investment_box,years_box,interest_box, value_box, btnCalculate);

        return vbox;
    }

    class CalculateHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent e) {
            //Calculate value and place in box
            double investment_value = Double.valueOf(investment.getText());
            double years_value = Double.valueOf(years.getText());
            double interest_value = Double.valueOf(interest.getText());
            value.setText(Double.toString(investment_value * Math.pow((1 + interest_value/12),(years_value*12))));

        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}

