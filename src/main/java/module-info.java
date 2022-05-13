module com.zhuang.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.zhuang.javafx to javafx.fxml;
    exports com.zhuang.javafx;
}