package com.demo;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.stage.Stage;

import java.io.IOException;

public class Zad1 extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Line line = new Line();
        line.setStartX(0.0f);
        line.setStartY(0.0f);
        line.setEndX(100.0f);
        line.setEndY(20.0f);

        Line blueLine = new Line(100f, 100f, 200f, 50f);
        blueLine.setStroke(Color.BLUE);
        blueLine.setStrokeWidth(10);
        blueLine.setStrokeLineCap(StrokeLineCap.ROUND);

        VBox root = new VBox();

        ObservableList<Node> nodes = root.getChildren();
        nodes.add(line);
        nodes.add(blueLine);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}

