package com.zhuang.javafx.module.login;

import com.zhuang.javafx.common.Window;
import com.zhuang.javafx.utils.AlertUtils;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Login extends Window {

    public TextField username;
    public TextField password;

    public Login() {
        super("Login", 300, 200);
    }

    public void onLogin(ActionEvent actionEvent) {
        AlertUtils.info(username.getText() + "-" + password.getText());
    }
}
