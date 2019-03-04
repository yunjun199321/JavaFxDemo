package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Button btn;

    public static void main(String[] args) {
        launch(args); // javaFX starting method
    }

    /**
     * JavaFx will call launch -> application -> start
     * window is stage; content of the window is scene
     *
     * @param primaryStage
     */

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("First JavaFx");
        btn = new Button(); // initialize a button object
        btn.setText("Click me");

        StackPane layout = new StackPane(); // create a layout for the scene
        layout.getChildren().add(btn); // add button object into layout

        Scene scene = new Scene(layout, 300, 250); // initialize a scene object with layout, width and height
        primaryStage.setScene(scene); // put the scene into the stage
        primaryStage.show(); // show the stage

    }
}
