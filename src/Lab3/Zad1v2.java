package com.demo;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Zad1v2 extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Text t = new Text("Przycisk");
        t.setX(10);
        t.setY(10);
        t.setCache(true);
        t.setFill(Color.GREEN);
        t.setFont(Font.font(null, FontWeight.BOLD, 12));

        Reflection r = new Reflection();
        r.setFraction(0.9);

        t.setEffect(r);

        Button btn = new Button();
        btn.setMinWidth(150);
        btn.setMinHeight(50);
        btn.setGraphic(t);

        VBox root = new VBox();

        ObservableList<Node> nodes = root.getChildren();
        nodes.add(btn);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
