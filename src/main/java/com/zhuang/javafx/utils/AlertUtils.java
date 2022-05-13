package com.zhuang.javafx.utils;

import javafx.scene.control.Alert;

public class AlertUtils {

    public static void info(String message) {
        info(null, message);
    }

    public static void info(String title, String message) {
        show(Alert.AlertType.INFORMATION, title, message);
    }

    public static void warn(String message) {
        warn(null, message);
    }

    public static void warn(String title, String message) {
        show(Alert.AlertType.WARNING, title, message);
    }

    public static void error(String message) {
        error(null, message);
    }

    public static void error(String title, String message) {
        show(Alert.AlertType.ERROR, title, message);
    }

    public static boolean confirm(String message) {
        return confirm(null, message);
    }

    public static boolean confirm(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, message);
        if (title != null) {
            alert.setTitle(title);
        }
        alert.showAndWait();
        return alert.getResult().getButtonData().getTypeCode().equals("O");
    }

    private static void show(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType, message);
        if (title != null) {
            alert.setTitle(title);
        }
        alert.show();
    }

}
