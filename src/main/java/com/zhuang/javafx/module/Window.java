package com.zhuang.javafx.module;

import com.zhuang.javafx.module.login.Login;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public abstract class Window {

    public static Stage primaryStage;

    protected FXMLLoader fxmlLoader;
    protected Scene scene;
    protected String title;
    protected double width;
    protected double height;

    public Window() {
        this(null, 500, 500);
    }

    public Window(String title, double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Scene getScene() {
        if (scene == null) {
            try {
                scene = new Scene(getFXMLLoader().load(), width, height);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return scene;
    }

    public FXMLLoader getFXMLLoader() {
        if (fxmlLoader == null) {
            fxmlLoader = newFXMLLoader();
        }
        return fxmlLoader;
    }

    public FXMLLoader newFXMLLoader() {
        return new FXMLLoader(Login.class.getResource(getViewFileName()));
    }

    public String getViewFileName() {
        return getClass().getSimpleName() + ".fxml";
    }

    public void open() {
        open(null, Modality.APPLICATION_MODAL);
    }

    public void open(String title, Modality modality) {
        Stage stage = new Stage();
        if (modality != null) {
            stage.initModality(modality);
        }
        Scene scene = getScene();
        stage.setScene(scene);
        if (title != null) {
            stage.setTitle(title);
        } else {
            stage.setTitle(this.title);
        }
        stage.show();
    }


    public void show(String title) {
        primaryStage.setScene(scene);
        primaryStage.setTitle(title);
    }
}
