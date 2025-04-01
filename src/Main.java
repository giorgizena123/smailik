import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 1
        task1(primaryStage);

        // 2
        task2(primaryStage);

        // 3
        task3(primaryStage);
    }

    private void task1(Stage primaryStage) {

        Label label = new Label("გამარჯობა ეს არის აპლიკაცია");
        label.setFont(new Font(20));
        label.setTextFill(Color.WHITE);


        StackPane root = new StackPane(label);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: black;");


        Scene scene = new Scene(root, 400, 200);


        primaryStage.setTitle("დავალება 1");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private void task2(Stage primaryStage) {
        Pane root = new Pane();
        Canvas canvas = new Canvas(600, 400);
        root.getChildren().add(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();


        gc.setFill(Color.GREEN);
        gc.fillRect(50, 50, 100, 100);


        gc.setStroke(Color.YELLOW);
        gc.strokeLine(50, 50, 150, 150);
        gc.strokeLine(50, 150, 150, 50);


        gc.setStroke(Color.BLUE);
        gc.strokeRect(250, 100, 200, 300);

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("დავალება 2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void task3(Stage primaryStage) {
        Pane root = new Pane();
        Canvas canvas = new Canvas(300, 300);
        root.getChildren().add(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();


        gc.setFill(Color.YELLOW);
        gc.fillOval(50, 50, 200, 200);


        gc.setFill(Color.BLACK);
        gc.fillOval(100, 100, 20, 20);
        gc.fillOval(180, 100, 20, 20);

     
        gc.setStroke(Color.BLACK);
        gc.strokeArc(80, 120, 140, 100, 0, -180, ArcType.OPEN);

        Scene scene = new Scene(root, 300, 300);
        primaryStage.setTitle("დავალება 3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
