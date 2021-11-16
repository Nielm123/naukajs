package com.demo;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import javax.swing.plaf.ColorUIResource;

public class Zad3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Group root = new Group();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Slider Sample");

        Label lb= new Label();
        lb.setTranslateX(1);
        lb.setTranslateY(1);
        Slider slider = new Slider(0, 100, 1);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setTranslateX(10);
        slider.setTranslateY(20);
        root.getChildren().add(slider);
        Circle circle = new Circle();
        circle.setCenterX(200);
        circle.setCenterY(200);
        lb.setText("Ustaw promień :");

        TextField field = new TextField();

        field.setTranslateX(200);
        field.setTranslateY(20);

        slider.valueProperty().addListener(ov->
                {circle.setRadius(slider.getValue());
                    field.setText(String.valueOf(slider.getValue()));
                }

        );

        root.getChildren().add(circle);
        root.getChildren().add(lb);
        root.getChildren().add(field);
        primaryStage.show();

    }
}