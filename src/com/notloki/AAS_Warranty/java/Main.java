package com.notloki.AAS_Warranty.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.getIcons().add(new Image(Ref.ICON));
        primaryStage.setTitle("AAS Steel Warranty " + Ref.VERSION + " " + Ref.COMPILE_DATE);
        primaryStage.setScene(new Scene(root,800, 250));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
