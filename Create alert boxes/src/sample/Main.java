package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.*;

public class Main extends Application {

    Button btn;
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        btn = new Button("Open new window");
        btn.setOnAction(e -> {
            boolean ans = ConfirmBox.display("ConfirmBox", "Do you want to send back result?");
            System.out.println(ans);
        });

        window.setTitle("Alert boxes demo");

        StackPane layout = new StackPane();
        layout.getChildren().add(btn);
        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();
    }
}
