package br.com.vectra;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VectraApp extends Application {
    @Override
    public void start(Stage stage) {
        Label title = new Label("Vectra");
        Label subtitle = new Label("Cotações, gráficos e ações favoritas em um só lugar.");

        VBox layout = new VBox(10, title, subtitle);
        layout.setPadding(new Insets(24));

        Scene scene = new Scene(layout, 800, 500);

        stage.setTitle("Vectra - Painel do Mercado");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}