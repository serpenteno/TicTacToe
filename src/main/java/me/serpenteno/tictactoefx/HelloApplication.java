package me.serpenteno.tictactoefx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 650);
        stage.setTitle("Tic Tac Toe");
        stage.setScene(scene);
        stage.show();
        HelloController helloController = fxmlLoader.getController();
        helloController.GameStart();
    }

    public static void main(String[] args) {
        launch();
    }
}