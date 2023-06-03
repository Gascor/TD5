module com.example.td5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.td5 to javafx.fxml;
    exports com.example.td5;
}