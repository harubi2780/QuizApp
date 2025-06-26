module com.nnd.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.nnd.quizapp to javafx.fxml;
    exports com.nnd.quizapp;
}
