package com.zhuang.javafx.utils;

import com.zhuang.javafx.dialog.FXMLLoaderSupplier;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneUtils {

    public Scene getScene(FXMLLoaderSupplier fxmlLoaderSupplier, double width, double height) {
        try {
            return new Scene(fxmlLoaderSupplier.get().load(), width, height);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void changeScene(Stage stage, FXMLLoaderSupplier fxmlLoaderSupplier, double width, double height, String title) {
        Scene scene = getScene(fxmlLoaderSupplier, width, height);
        changeScene(stage, scene, title);
    }

    public void changeScene(Stage stage, Scene scene, String title) {
        stage.setScene(scene);
        stage.setTitle(title);
    }

}
