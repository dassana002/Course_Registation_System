module org.studentmanagementsystem.studentmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.studentmanagementsystem.studentmanagementsystem to javafx.fxml;
    exports org.studentmanagementsystem.studentmanagementsystem;
}