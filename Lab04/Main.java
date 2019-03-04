package Lab04;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Main extends Application {
    private TextField fullname_text = new TextField();
    private TextField password_text = new TextField();
    private TextField username_text = new TextField();
    private TextField email_text = new TextField();
    private TextField phone_text = new TextField();
    private DatePicker date_text = new DatePicker();



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
        Button btnRegister = new Button("Register");
        btnRegister.setOnAction(new RegisterHandler());
        vbox.setPadding(new Insets(15, 50, 15, 35));
        HBox username = new HBox();
        username.getChildren().add(new Label("Username"));
        username.getChildren().add(username_text);
        HBox password = new HBox();
        password.getChildren().add(new Label("Password"));
        password.getChildren().add(password_text);
        HBox fullname = new HBox();
        fullname.getChildren().add(new Label("Full Name"));
        fullname.getChildren().add(fullname_text);
        HBox email = new HBox();
        email.getChildren().add(new Label("Email"));
        email.getChildren().add(email_text);
        HBox phone = new HBox();
        phone.getChildren().add(new Label("Phone Number"));
        phone.getChildren().add(phone_text);
        HBox date = new HBox();
        date.getChildren().add(new Label("Date"));
        date.getChildren().add(date_text);
        username.setSpacing(43);
        password.setSpacing(47);
        fullname.setSpacing(42);
        email.setSpacing(68);
        phone.setSpacing(15);
        date.setSpacing(71);
        phone_text.setPromptText("###-###-#####");
        vbox.getChildren().add(username);
        vbox.getChildren().add(password);
        vbox.getChildren().add(fullname);
        vbox.getChildren().add(email);
        vbox.getChildren().add(phone);
        vbox.getChildren().add(date);
        vbox.getChildren().add(btnRegister);
        return vbox;
    }

    class RegisterHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent e) {
            System.out.println(username_text.getText());
            System.out.println(password_text.getText());
            System.out.println(email_text.getText());
            System.out.println(phone_text.getText());
            System.out.println(date_text.getValue());
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}

