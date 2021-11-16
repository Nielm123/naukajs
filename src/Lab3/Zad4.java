package com.demo;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Zad4 extends Application{
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 300, 250, Color.WHITE);

        MenuBar menuBar = new MenuBar();
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        root.setTop(menuBar);

        Menu fileMenu = new Menu("File");
        MenuItem newMenuItem = new MenuItem("Nowy");
        newMenuItem.setOnAction(e -> System.out.println("Nowy plik ..."));
        MenuItem openMenuItem = new MenuItem("Otwórz");
        openMenuItem.setOnAction(e -> System.out.println("Otwieranie pliku..."));
        MenuItem saveMenuItem = new MenuItem("Zapisz");
        saveMenuItem.setOnAction(e -> System.out.println("Zapisz plik..."));
        MenuItem exitMenuItem = new MenuItem("Wyjdź z programu");
        exitMenuItem.setOnAction(actionEvent -> Platform.exit());

        fileMenu.getItems().addAll(newMenuItem, saveMenuItem, openMenuItem,
                new SeparatorMenuItem(), exitMenuItem);

        menuBar.getMenus().addAll(fileMenu);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
