module com.example.iteamdarkstudiesescape2d {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.iteamdarkstudiesescape2d to javafx.fxml;
    exports com.example.iteamdarkstudiesescape2d;
}