package Lab05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    private TableView<StudentRecord> marks;

    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage ps)
    {
        ps.setTitle("Lab 05 Student Records");
        BorderPane bp = new BorderPane();

        TableColumn<StudentRecord, String> id = new TableColumn<>("StudentID");
        id.setPrefWidth(100);
        id.setCellValueFactory(new PropertyValueFactory<>("studentid"));

        TableColumn<StudentRecord, String> am = new TableColumn<>("Assignments");
        am.setPrefWidth(100);
        am.setCellValueFactory(new PropertyValueFactory<>("assignments"));

        TableColumn<StudentRecord, String> mt = new TableColumn<>("Midterm");
        mt.setPrefWidth(100);
        mt.setCellValueFactory(new PropertyValueFactory<>("midterm"));

        TableColumn<StudentRecord, String> fe = new TableColumn<>("Final Exam");
        fe.setPrefWidth(100);
        fe.setCellValueFactory(new PropertyValueFactory<>("finalexam"));

        TableColumn<StudentRecord, String> fm = new TableColumn<>("Final Grade");
        fm.setPrefWidth(100);
        fm.setCellValueFactory(new PropertyValueFactory<>("finalmark"));

        TableColumn<StudentRecord, String> lg = new TableColumn<>("Letter");
        lg.setPrefWidth(100);
        lg.setCellValueFactory(new PropertyValueFactory<>("lettergrade"));

        this.marks = new TableView<>();
        this.marks.getColumns().add(id);
        this.marks.getColumns().add(am);
        this.marks.getColumns().add(mt);
        this.marks.getColumns().add(fe);
        this.marks.getColumns().add(fm);
        this.marks.getColumns().add(lg);

        bp.setCenter(this.marks);

        Scene scene = new Scene(bp, 600, 500);
        ps.setScene(scene);
        ps.show();
        this.marks.setItems(DataSource.getAllMarks());
    }
}
