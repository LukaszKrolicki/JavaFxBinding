module com.readonly.readyonly {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.readonly.readyonly to javafx.fxml;
    exports com.readonly.readyonly;
}