package com.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.IOException;

public class Zad2 extends Application{
    @Override
    public void start(Stage primaryStage) throws IOException {

        NumberAxis xAxis = new NumberAxis(1f, 24f, 1f);
        xAxis.setLabel("godziny");
        NumberAxis yAxis = new NumberAxis("Zużycie wody", 1f, 100f, 1f);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Wykaz dziennego zużycia wody");

        XYChart.Series<Number, Number> series = new XYChart.Series<Number, Number>();
        series.setName("Dzienne zużycie wody");

        for (int i = 0; i < 24; i++) {
            int random = (int) (Math.random() * 100) + 1;
            series.getData().add(new XYChart.Data<>(i, random));
        }

        lineChart.getData().add(series);
        primaryStage.setTitle("Wykaz dziennego zużycia wody");
        primaryStage.setScene(new Scene(lineChart, 300, 250));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
