package com.demo;


import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;



public class Zad6 extends Application {

    public static void main(String[] args) {
        launch(args);

        Stage primaryStage;
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 480, 450, Color.WHITE);
        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(5));
        gridpane.setHgap(5);
        gridpane.setVgap(5);
        ColumnConstraints column1 = new ColumnConstraints(100);
        ColumnConstraints column2 = new ColumnConstraints(50, 150, 300);
        column2.setHgrow(Priority.ALWAYS);
        gridpane.getColumnConstraints().addAll(column1, column2);
        Label imielb = new Label("Imie");
        TextField imie = new TextField();
        Label nazwiskolb = new Label("Nazwisko");
        TextField nazwisko  = new TextField();
        ComboBox myComboBox = new ComboBox();
        myComboBox.getItems().addAll(
                "mechanik",
                "stolarz",
                "piekarz",
                "ślusarz",
                "kierowca"
        );
        myComboBox.setEditable(false);
        Label zawodlb= new Label("Zawod");
        Label datalb= new Label("Data urodzenia");


        DatePicker Picker = new DatePicker();

        TextField doswiadczenie = new TextField();
        Label doswlb= new Label("Doswiadczenie");
        Button zapisz= new Button();
        zapisz.setText("Zapisz");
        GridPane.setHalignment(zapisz, HPos.CENTER);
        gridpane.add(zapisz, 1, 5);

        GridPane.setHalignment(doswlb, HPos.CENTER);
        gridpane.add(doswlb, 0, 4);

        GridPane.setHalignment(doswiadczenie, HPos.CENTER);
        gridpane.add(doswiadczenie, 1, 4);

        GridPane.setHalignment(datalb, HPos.CENTER);
        gridpane.add(datalb, 0, 3);

        GridPane.setHalignment(Picker, HPos.LEFT);
        gridpane.add(Picker, 1, 3);

        GridPane.setHalignment(zawodlb, HPos.CENTER);
        gridpane.add(zawodlb, 0, 2);


        GridPane.setHalignment(myComboBox, HPos.LEFT);
        gridpane.add(myComboBox, 1, 2);

        GridPane.setHalignment(imielb, HPos.CENTER);
        gridpane.add(imielb, 0, 0);

        GridPane.setHalignment(nazwiskolb, HPos.CENTER);
        gridpane.add(nazwiskolb, 0, 1);

        GridPane.setHalignment(imie, HPos.CENTER);
        gridpane.add(imie, 1, 0);

        GridPane.setHalignment(nazwisko, HPos.CENTER);
        gridpane.add(nazwisko, 1, 1);
        doswiadczenie.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    doswiadczenie.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        imie.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("[a-zA-Z]+")) {
                    imie.setText(newValue.replaceAll("[^a-zA-Z]+", ""));
                }
            }
        });
        nazwisko.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("[a-zA-Z]+")) {
                    nazwisko.setText(newValue.replaceAll("[^a-zA-Z]+", ""));
                }
            }
        });



        zapisz.setOnAction(e -> {
            Pracownik pracownik = new Pracownik(imie.getText(), nazwisko.getText(), myComboBox.getSelectionModel().getSelectedItem().toString(), Picker.getValue(), Integer.parseInt(doswiadczenie.getText()));
            System.out.println("Zapisano");
            Label show= new Label();
            show.setFont(new Font("Courier New", 10));
            show.setText(pracownik.toString());

            GridPane.setHalignment(show, HPos.CENTER);
            gridpane.add(show, 1, 7);
            imie.clear();
            nazwisko.clear();
            doswiadczenie.clear();
        });



        root.setCenter(gridpane);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}