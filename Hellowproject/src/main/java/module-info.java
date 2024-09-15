module com.example.hellowproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hellowproject to javafx.fxml;
    exports com.example.hellowproject;
}