package com.zhuang.javafx;

import com.zhuang.javafx.common.Window;
import com.zhuang.javafx.module.login.Login;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FxApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Window.primaryStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(FxApplication.class.getResource("fx-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        new Login().show();
    }

    public static void main(String[] args) {
        launch();
    }

}
