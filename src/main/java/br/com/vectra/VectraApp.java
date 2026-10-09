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

        Label symbol = new Label("PETR4");
        Label company = new Label("Petrobras PN");
        Label price = new Label("R$ 38,42");
        Label change = new Label("+1,24% hoje");

        VBox quoteCard = new VBox(8, symbol, company, price, change);
        quoteCard.setPadding(new Insets(16));
        quoteCard.setStyle(
                "-fx-background-color: white; " +
                        "-fx-border-color: #cbd5e1; " +
                        "-fx-border-radius: 8; " +
                        "-fx-background-radius: 8;"
        );

        VBox layout = new VBox(18, title, subtitle, quoteCard);
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