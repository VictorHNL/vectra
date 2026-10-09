package br.com.vectra;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class VectraApp extends Application {
    @Override
    public void start(Stage stage) {
        Label message = new Label("Vectra está funcionando!");

        Scene scene = new Scene(message, 600, 400);

        stage.setTitle("Vectra");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}