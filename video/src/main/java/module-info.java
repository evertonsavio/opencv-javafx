module com.example.video {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires opencv;

    opens com.example.video to javafx.fxml;
    exports com.example.video;
}