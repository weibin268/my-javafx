package com.zhuang.javafx.common;

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
        this.title = title;
        this.width = width;
        this.height = height;
    }

    public Scene getScene() {
        return getScene(null, null);
    }

    public Scene getScene(Double width, Double height) {
        if (width != null || height != null) {
            return newScene(width != null ? width : this.width, height != null ? height : this.height);
        }
        if (scene == null) {
            try {
                scene = new Scene(getFXMLLoader().load(), this.width, this.height);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return scene;
    }

    public Scene newScene(double width, double height) {
        try {
            return new Scene(getFXMLLoader().load(), width, height);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
        open(null, null, null, Modality.APPLICATION_MODAL);
    }

    public void open(String title) {
        open(title, null, null, Modality.APPLICATION_MODAL);
    }

    public void open(Double width, Double height) {
        open(null, width, height, Modality.APPLICATION_MODAL);
    }

    public void open(String title, Double width, Double height) {
        open(title, width, height, Modality.APPLICATION_MODAL);
    }

    public void open(String title, Double width, Double height, Modality modality) {
        Stage stage = new Stage();
        if (modality != null) {
            stage.initModality(modality);
        }
        stage.setScene(getScene(width, height));
        if (title != null) {
            stage.setTitle(title);
        } else {
            stage.setTitle(this.title);
        }
        stage.show();
    }

    public void show() {
        show(title);
    }

    public void show(String title) {
        primaryStage.setScene(getScene());
        primaryStage.setTitle(title);
    }

    public void show(Double width, Double height) {
        show(primaryStage, title, width, height);
    }

    public void show(String title, Double width, Double height) {
        show(primaryStage, title, width, height);
    }

    public void show(Stage stage, String title, Double width, Double height) {
        stage.setScene(getScene(width, height));
        stage.setTitle(title);
    }


}
