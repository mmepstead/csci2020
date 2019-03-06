package A1Q3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CircleDrag extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane and set its properties
        Pane pane = new Pane();
        //Initialize circle and triangle
        Circle circle = new Circle(200,200,100);
        Circle point1 = new Circle(100,200,5);
        Text angle1 = new Text();
        Circle point2 = new Circle(200,100,5);
        Text angle2 = new Text();
        Circle point3 = new Circle(300,200,5);
        Text angle3 = new Text();
        circle.setFill(Color.TRANSPARENT);
        circle.setStroke(Color.RED);
        Polygon triangle = new Polygon();
        triangle.setFill(Color.TRANSPARENT);
        triangle.setStroke(Color.BLACK);
        //Show initial angles
        angle3.setText(angle(point3,point2,point1));
        angle2.setText(angle(point2,point1,point3));
        angle1.setText(angle(point1,point2,point3));
        angle1.setX(point1.getCenterX()+10);
        angle1.setY(point1.getCenterY()+10);
        angle2.setX(point2.getCenterX()+10);
        angle2.setY(point2.getCenterY()+10);
        angle3.setX(point3.getCenterX()+10);
        angle3.setY(point3.getCenterY()+10);
        triangle.getPoints().setAll(new Double[]{point1.getCenterX(), point1.getCenterY(), point2.getCenterX(),
                point2.getCenterY(), point3.getCenterX(), point3.getCenterY()});
        pane.getChildren().addAll(point1,point2,point3,triangle, circle,angle1,angle2,angle3);
        point1.setOnMouseDragged(e -> {
            //Only run if dragged around radius of large circle
            double xdiff = e.getX()-circle.getCenterX();
            double ydiff = e.getY()-circle.getCenterY();
            if(Math.sqrt(xdiff*xdiff + ydiff*ydiff) <= circle.getRadius()+5 &&
                    Math.sqrt(xdiff*xdiff + ydiff*ydiff) >= circle.getRadius()-5){
                //Move points and reset Angles using formula
                point1.setCenterX(e.getX());
                point1.setCenterY(e.getY());
                angle3.setText(angle(point3,point2,point1));
                angle2.setText(angle(point2,point1,point3));
                angle1.setText(angle(point1,point2,point3));
                angle1.setX(point1.getCenterX()+10);
                angle1.setY(point1.getCenterY()+10);
                angle2.setX(point2.getCenterX()+10);
                angle2.setY(point2.getCenterY()+10);
                angle3.setX(point3.getCenterX()+10);
                angle3.setY(point3.getCenterY()+10);
                triangle.getPoints().setAll(new Double[]{point1.getCenterX(), point1.getCenterY(), point2.getCenterX(),
                        point2.getCenterY(), point3.getCenterX(), point3.getCenterY()});
            }
        });
        //Same as previous
        point2.setOnMouseDragged(e -> {
            double xdiff = e.getX()-circle.getCenterX();
            double ydiff = e.getY()-circle.getCenterY();
            if(Math.sqrt(xdiff*xdiff + ydiff*ydiff) <= circle.getRadius()+5 &&
                    Math.sqrt(xdiff*xdiff + ydiff*ydiff) >= circle.getRadius()-5){
                point2.setCenterX(e.getX());
                point2.setCenterY(e.getY());
                angle3.setText(angle(point3,point2,point1));
                angle2.setText(angle(point2,point1,point3));
                angle1.setText(angle(point1,point2,point3));
                angle1.setX(point1.getCenterX()+10);
                angle1.setY(point1.getCenterY()+10);
                angle2.setX(point2.getCenterX()+10);
                angle2.setY(point2.getCenterY()+10);
                angle3.setX(point3.getCenterX()+10);
                angle3.setY(point3.getCenterY()+10);
                triangle.getPoints().setAll(new Double[]{point1.getCenterX(), point1.getCenterY(), point2.getCenterX(),
                        point2.getCenterY(), point3.getCenterX(), point3.getCenterY()});
            }
        });
        //Same as previous
        point3.setOnMouseDragged(e -> {
            double xdiff = e.getX()-circle.getCenterX();
            double ydiff = e.getY()-circle.getCenterY();
            if(Math.sqrt(xdiff*xdiff + ydiff*ydiff) <= circle.getRadius()+5 &&
                    Math.sqrt(xdiff*xdiff + ydiff*ydiff) >= circle.getRadius()-5){
                point3.setCenterX(e.getX());
                point3.setCenterY(e.getY());
                angle3.setText(angle(point3,point2,point1));
                angle2.setText(angle(point2,point1,point3));
                angle1.setText(angle(point1,point2,point3));
                angle1.setX(point1.getCenterX()+10);
                angle1.setY(point1.getCenterY()+10);
                angle2.setX(point2.getCenterX()+10);
                angle2.setY(point2.getCenterY()+10);
                angle3.setX(point3.getCenterX()+10);
                angle3.setY(point3.getCenterY()+10);
                triangle.getPoints().setAll(new Double[]{point1.getCenterX(), point1.getCenterY(), point2.getCenterX(),
                        point2.getCenterY(), point3.getCenterX(), point3.getCenterY()});
            }
        });
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 425, 400);
        primaryStage.setTitle("Circle With Triangle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */

    public static String angle(Circle point1, Circle point2, Circle point3)
    {
        //Calculate angle with given point values
        double distance12 = Math.sqrt(
                (point1.getCenterX()-point2.getCenterX())*(point1.getCenterX()-point2.getCenterX()) +
                        (point1.getCenterY()-point2.getCenterY())*(point1.getCenterY()-point2.getCenterY()) );
        double distance13 = Math.sqrt(
                (point1.getCenterX()-point3.getCenterX())*(point1.getCenterX()-point3.getCenterX()) +
                        (point1.getCenterY()-point3.getCenterY())*(point1.getCenterY()-point3.getCenterY()) );
        double distance32 = Math.sqrt(
                (point3.getCenterX()-point2.getCenterX())*(point3.getCenterX()-point2.getCenterX()) +
                        (point3.getCenterY()-point2.getCenterY())*(point3.getCenterY()-point2.getCenterY()) );
        return Double.toString(57.2958*Math.acos((distance32*distance32 - distance12*distance12 - distance13*distance13)/(-2*distance12*distance13)));
    }
    public static void main(String[] args) {
        launch(args);
    }
}