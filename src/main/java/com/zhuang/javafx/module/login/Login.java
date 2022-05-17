package com.zhuang.javafx.module.login;

import com.zhuang.javafx.module.FXMLLoaderSupplier;
import javafx.fxml.FXMLLoader;

public class Login implements FXMLLoaderSupplier {
    @Override
    public FXMLLoader get() {
        return new FXMLLoader(Login.class.getResource("login.fxml"));
    }
}
