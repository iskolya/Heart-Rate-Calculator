module com.example.heartratecalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.heartratecalculator to javafx.fxml;
    exports com.example.heartratecalculator;
}