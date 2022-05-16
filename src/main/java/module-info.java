module com.zhuang.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.zhuang.javafx to javafx.fxml;
    opens com.zhuang.javafx.dialog.login to javafx.fxml;
    exports com.zhuang.javafx;
}