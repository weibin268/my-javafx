package com.zhuang.javafx.dialog.login;

import com.zhuang.javafx.FxApplication;
import com.zhuang.javafx.dialog.FXMLLoaderSupplier;
import javafx.fxml.FXMLLoader;

public class LoginController implements FXMLLoaderSupplier {
    @Override
    public FXMLLoader get() {
        return new FXMLLoader(LoginController.class.getResource("login-view.fxml"));
    }
}
