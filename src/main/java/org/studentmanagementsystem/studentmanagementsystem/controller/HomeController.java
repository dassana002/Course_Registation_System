package org.studentmanagementsystem.studentmanagementsystem.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HomeController {

    @FXML
    private Label welcomeLabel;

    @FXML
    private Label dateTimeLabel;

    @FXML
    private Label systemStatusLabel;

    @FXML
    private Label lastUpdateLabel;

    @FXML
    private Label registrationPeriodLabel;

    @FXML
    private Label daysRemainingLabel;

    @FXML
    private Label totalCoursesLabel;

    @FXML
    private Label totalStudentsLabel;

    @FXML
    private Label announcementLabel;

    @FXML
    private Label connectionStatusLabel;

    @FXML
    private MenuItem loginMenuItem;

    @FXML
    private MenuItem logoutMenuItem;

    @FXML
    private Button studentPortalBtn;

    @FXML
    private Button facultyPortalBtn;

    @FXML
    private Button adminPortalBtn;

    // Initialize method to set up the UI when the controller is loaded
    @FXML
    public void initialize() {
        // Set initial values for labels
        welcomeLabel.setText("Welcome to Student Management System");
        updateDateTime();
        systemStatusLabel.setText("System Status: Online");
        lastUpdateLabel.setText("Last Update: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        registrationPeriodLabel.setText("Registration Period: Spring 2025");
        daysRemainingLabel.setText("Days Remaining: 15");
        totalCoursesLabel.setText("Total Courses: 50");
        totalStudentsLabel.setText("Total Students: 1200");
        announcementLabel.setText("Announcement: Registration opens tomorrow!");
        connectionStatusLabel.setText("Connection: Stable");

        // Disable logout menu item initially (assuming user is not logged in)
        logoutMenuItem.setDisable(true);
    }

    // Helper method to update date and time dynamically
    private void updateDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        dateTimeLabel.setText("Date & Time: " + now.format(formatter));
    }

    // Helper method to show alerts
    private void showAlert(String title, String content, Alert.AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    @FXML
    public void handleLogin() {
        try {
            // Simulate login logic
            welcomeLabel.setText("Welcome, User!");
            loginMenuItem.setDisable(true);
            logoutMenuItem.setDisable(false);
            showAlert("Login", "Login successful!", Alert.AlertType.INFORMATION);
        } catch (Exception e) {
            showAlert("Login Error", "Failed to log in: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    @FXML
    public void handleLogout() {
        try {
            // Simulate logout logic
            welcomeLabel.setText("Welcome to Student Management System");
            loginMenuItem.setDisable(false);
            logoutMenuItem.setDisable(true);
            showAlert("Logout", "Logout successful!", Alert.AlertType.INFORMATION);
        } catch (Exception e) {
            showAlert("Logout Error", "Failed to log out: " + e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    @FXML
    public void handleExit() {
        // Confirm before exiting
        Alert confirmExit = new Alert(Alert.AlertType.CONFIRMATION);
        confirmExit.setTitle("Exit");
        confirmExit.setHeaderText("Confirm Exit");
        confirmExit.setContentText("Are you sure you want to exit?");
        confirmExit.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                System.exit(0);
            }
        });
    }

    @FXML
    public void handleStudentRegistration() {
        showAlert("Student Registration", "Opening student registration form...", Alert.AlertType.INFORMATION);
        announcementLabel.setText("Announcement: Student registration initiated!");
    }

    @FXML
    public void handleCourseRegistration() {
        showAlert("Course Registration", "Opening course registration form...", Alert.AlertType.INFORMATION);
        announcementLabel.setText("Announcement: Course registration initiated!");
    }

    @FXML
    public void handleViewSchedule() {
        showAlert("View Schedule", "Displaying schedule...", Alert.AlertType.INFORMATION);
        announcementLabel.setText("Announcement: Schedule viewed!");
    }

    @FXML
    public void handleDropCourses() {
        showAlert("Drop Courses", "Opening course drop form...", Alert.AlertType.INFORMATION);
        announcementLabel.setText("Announcement: Course drop initiated!");
    }

    @FXML
    public void handleManageCourses() {
        showAlert("Manage Courses", "Opening course management panel...", Alert.AlertType.INFORMATION);
        announcementLabel.setText("Announcement: Course management accessed!");
    }

    @FXML
    public void handleViewEnrollments() {
        showAlert("View Enrollments", "Displaying enrollments...", Alert.AlertType.INFORMATION);
        announcementLabel.setText("Announcement: Enrollments viewed!");
    }

    @FXML
    public void handleGradeManagement() {
        showAlert("Grade Management", "Opening grade management panel...", Alert.AlertType.INFORMATION);
        announcementLabel.setText("Announcement: Grade management accessed!");
    }

    @FXML
    public void handleUserManagement() {
        showAlert("User Management", "Opening user management panel...", Alert.AlertType.INFORMATION);
        announcementLabel.setText("Announcement: User management accessed!");
    }

    @FXML
    public void handleSystemReports() {
        showAlert("System Reports", "Generating system reports...", Alert.AlertType.INFORMATION);
        announcementLabel.setText("Announcement: System reports generated!");
    }

    @FXML
    public void handleDatabaseManagement() {
        showAlert("Database Management", "Opening database management panel...", Alert.AlertType.INFORMATION);
        announcementLabel.setText("Announcement: Database management accessed!");
    }

    @FXML
    public void handleUserGuide() {
        showAlert("User Guide", "Opening user guide...", Alert.AlertType.INFORMATION);
        announcementLabel.setText("Announcement: User guide accessed!");
    }

    @FXML
    public void handleAbout() {
        showAlert("About", "Student Management System v1.0\nDeveloped by xAI Team", Alert.AlertType.INFORMATION);
        announcementLabel.setText("Announcement: About information viewed!");
    }

    @FXML
    public void handleStudentPortal() {
        showAlert("Student Portal", "Redirecting to Student Portal...", Alert.AlertType.INFORMATION);
        announcementLabel.setText("Announcement: Student Portal accessed!");
    }

    @FXML
    public void handleFacultyPortal() {
        showAlert("Faculty Portal", "Redirecting to Faculty Portal...", Alert.AlertType.INFORMATION);
        announcementLabel.setText("Announcement: Faculty Portal accessed!");
    }

    @FXML
    public void handleAdminPortal() {
        showAlert("Admin Portal", "Redirecting to Admin Portal...", Alert.AlertType.INFORMATION);
        announcementLabel.setText("Announcement: Admin Portal accessed!");
    }
}