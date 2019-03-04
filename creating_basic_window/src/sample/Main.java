package sample;

import java.util.EventListener;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * extends Application class to launch the JavaFX
 * implements EventHandler to handle component event
 */
public class Main extends Application implements EventHandler<ActionEvent> {

    Button btn;
    Button btn2;

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
        btn.setOnAction(this); // pass to handle method in this class to handle button click

        btn2 = new Button("Click me too");
        btn2.setOnAction(this);

        VBox layout = new VBox(); // create a layout for the scene
        layout.getChildren().add(btn); // add button object into layout
        layout.getChildren().add(btn2);

//        layout.getChildren().addAll(btn,btn2); // add all components into layout

        Scene scene = new Scene(layout, 300, 250); // initialize a scene object with layout, width and height
        primaryStage.setScene(scene); // put the scene into the stage
        primaryStage.show(); // show the stage

    }

    @Override
    public void handle(ActionEvent event) {
        // when the button click, this method will invoke
        // you can find a source in this class so that you can perform correct action to the correct button
        if(event.getSource() == btn){
            System.out.println("You clicked on me!!");
        }

        if(event.getSource() == btn2){
            System.out.println("You clicked on button 2");
        }
    }
}
