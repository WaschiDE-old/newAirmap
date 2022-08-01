module com.example.newairmap {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.newairmap to javafx.fxml;
    exports com.example.newairmap;
    exports com.example.newairmap.javafx;
    opens com.example.newairmap.javafx to javafx.fxml;
}