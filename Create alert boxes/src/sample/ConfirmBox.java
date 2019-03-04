package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.*;

import javafx.scene.control.*;

public class ConfirmBox {

    static boolean answer;

    public static boolean display(String title, String message){
        // creates stage
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        window.setMinHeight(250);


        // creates two button, one label
        Button btnYes = new Button("Yes");
        Button btnNo = new Button("No");
        Label label = new Label(message);

        // assigns handler to buttons
        btnYes.setOnAction(event -> {
            answer = true;
            window.close();
        });

        btnNo.setOnAction(event -> {
            answer = false;
            window.close();
        });

        // creates layout
        VBox layout = new VBox();
        layout.getChildren().setAll(label,btnYes,btnNo);
        layout.setAlignment(Pos.CENTER);

        // creates scene
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();



        return answer;
    }
}
