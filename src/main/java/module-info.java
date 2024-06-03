module pl.gornik.simplecalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.gornik.simplecalculator to javafx.fxml;
    exports pl.gornik.simplecalculator;
}