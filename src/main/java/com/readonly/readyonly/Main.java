package com.readonly.readyonly;

import javafx.application.Application;
import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        Label label = new Label("Welcome");
        Button button = new Button("Bind Label to Field");
        TextField field = new TextField();
        field.setMaxWidth(200);
        button.setOnAction(e->label.textProperty().bind(field.textProperty()));
        //TextField field2 = new TextField();
        //field2.textProperty().bindBidirectional(field.textProperty());
        //field.textProperty().addListener((obs,oldVal,newVal)-> label.setText(newVal));
        root.getChildren().addAll(label,field,button);
        Scene scene= new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws Exception {
        launch();
    }
}
