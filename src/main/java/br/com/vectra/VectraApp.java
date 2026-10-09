package br.com.vectra;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VectraApp extends Application {
    @Override
    public void start(Stage stage) {
        Label title = new Label("Vectra");
        Label subtitle = new Label("Cotações, gráficos e ações favoritas em um só lugar.");

        VBox petr4Card = createQuoteCard(
                "PETR4", "Petrobras PN", "R$ 38,42", "+1,24% hoje"
        );

        VBox vale3Card = createQuoteCard(
                "VALE3", "Vale ON", "R$ 62,15", "-0,38% hoje"
        );

        HBox cards = new HBox(16, petr4Card, vale3Card);

        VBox layout = new VBox(18, title, subtitle, cards);
        layout.setPadding(new Insets(24));

        Scene scene = new Scene(layout, 800, 500);

        stage.setTitle("Vectra - Painel do Mercado");
        stage.setScene(scene);
        stage.show();
    }

    private VBox createQuoteCard(
            String symbolText,
            String companyText,
            String priceText,
            String changeText
    ) {
        Label symbol = new Label(symbolText);
        Label company = new Label(companyText);
        Label price = new Label(priceText);
        Label change = new Label(changeText);

        VBox card = new VBox(8, symbol, company, price, change);
        card.setPadding(new Insets(16));
        card.setStyle(
                "-fx-background-color: white; " +
                        "-fx-border-color: #cbd5e1; " +
                        "-fx-border-radius: 8; " +
                        "-fx-background-radius: 8;"
        );

        return card;
    }

    public static void main(String[] args) {
        launch(args);
    }
}