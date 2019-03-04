package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.*;

public class Main extends Application {

    Stage window; // rename the stage to window
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        // Button 1
        Label label1 = new Label("Welcome to the first scene!");
        Button btn = new Button("Go to scene 2");

        btn.setOnAction(event -> window.setScene(scene2)); // Changes scene when button click

        //Layout 1 - VBox
        VBox layout1 = new VBox(20); // VBox layout with 20px???
        layout1.getChildren().addAll(label1, btn);
        scene1 = new Scene(layout1, 200, 200);

        // Button 2
        Button btn2 = new Button("Go to scene 1");
        btn2.setOnAction(event -> window.setScene(scene1));

        // Layout 2 - StackPane
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(btn2);
        scene2 = new Scene(layout2, 600, 300);

        window.setScene(scene1); // set the first scene to display
        window.setTitle("Switching scene");
        window.show();


    }
}
