package org.studentmanagementsystem.studentmanagementsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/org/studentmanagementsystem/studentmanagementsystem/view/Home-Page.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("This is JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        launch(args);
    }
}
