module org.xiker {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.xiker to javafx.fxml;

    exports org.xiker;
}
