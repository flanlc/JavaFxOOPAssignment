package com.example.javafxoop;

import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class MainMenuController {
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField deptField;
    @FXML
    private TextField majorField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField imgURLField;
    @FXML
    private Button clearButton;
    @FXML
    private Button addButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button editButton;
    @FXML
    private TableView tableView;
    @FXML
    private TableColumn firstNameCol;
    @FXML
    private TableColumn lastNameCol;
    @FXML
    private TableColumn deptCol;
    @FXML
    private TableColumn majorCol;
    @FXML
    private TableColumn emailCol;
    @FXML
    private TableColumn idCol;
    @FXML
    private MenuBar menuBar;
    @FXML
    private Menu menuFile;
    @FXML
    private Menu menuEdit;
    @FXML
    private Menu menuTheme;
    @FXML
    private Menu menuHelp;
    @FXML
    private MenuItem menuItemClose;
    @FXML
    private MenuItem menuItemDelete;
    @FXML
    private MenuItem menuItemEdit;
    @FXML
    private MenuItem menuItemAbout;
    @FXML
    private ImageView imageView;
    @FXML
    private VBox vbox;

}