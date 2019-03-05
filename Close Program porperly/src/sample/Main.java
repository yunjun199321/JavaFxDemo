package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    boolean ans;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        Button button = new Button("Close window");
        button.setOnAction(event -> {

            CloseWindow();
        });

        window.setOnCloseRequest(event -> {
            event.consume();// important!! Without this line of code, the window will still close because closeRequest method call exit() automatically.


            CloseWindow();
        }); // forces the close button on the top right corner to call closeWindow function.


        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        layout.setMinSize(250, 150);

        Scene scene = new Scene(layout);
        window.setScene(scene);

        window.show();
    }

    private void CloseWindow() {

        ans = ConfirmBox.Display("Confirm", "Do you want to exit");
        if (ans) {
            System.out.println("All data are saved.");
            window.close();
        }
    }
}
