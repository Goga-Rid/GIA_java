module org.example.demoexam {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;

    opens org.example.demoexam to javafx.fxml;
    exports org.example.demoexam;
}