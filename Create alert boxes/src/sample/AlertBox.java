package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.*;
import javafx.scene.control.*;

public class AlertBox {
    /**
     * Open a new window
     *
     * @param title   New window title
     * @param message Display received message
     */
    public static void display(String title, String message) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);// initials new window. Creating connection between two windows (stages).
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label(message);
        Button btnClose = new Button();
        btnClose.setText("Close it");
        btnClose.setOnAction(e -> window.close());

        VBox layout = new VBox();
        layout.getChildren().addAll(label, btnClose);
        layout.setAlignment(Pos.CENTER); // set the components alignment to center

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.setMinWidth(200);
        window.setMinHeight(150);
        window.showAndWait(); // waits for this window (stage) close, after then return to main window (stage)

    }
}
