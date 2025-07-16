module org.studentmanagementsystem.studentmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.studentmanagementsystem.studentmanagementsystem to javafx.fxml;
    opens org.studentmanagementsystem.studentmanagementsystem.controller to javafx.fxml;

    exports org.studentmanagementsystem.studentmanagementsystem;
    exports org.studentmanagementsystem.studentmanagementsystem.controller;
}
