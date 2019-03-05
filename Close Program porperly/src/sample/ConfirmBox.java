package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox {
    static boolean answer;
    public static boolean Display(String Title, String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        Button btnYes = new Button("Yes");
        Button btnNo = new Button("No");

        btnYes.setOnAction(event -> {
            answer = true;
            window.close();
        });

        btnNo.setOnAction(event -> {
            answer = false;
            window.close();
        });

        Label label = new Label();
        label.setText(message);
        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(label, btnYes, btnNo);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        return answer;
    }
}
