package com.zhuang.javafx;

import com.zhuang.javafx.dialog.login.LoginController;
import com.zhuang.javafx.utils.SceneUtils;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FxApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FxApplication.class.getResource("fx-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        //SceneUtils.changeScene(stage, new LoginController(),320,320,"login");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}