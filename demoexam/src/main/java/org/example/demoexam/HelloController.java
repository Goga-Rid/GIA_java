package org.example.demoexam;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Date;

public class HelloController {
    @FXML
    private TableView<Partner> vPartner;

    @FXML
    private TableColumn<Partner, String> colType;

    @FXML
    private TableColumn<Partner, String> colName;

    @FXML
    private TableColumn<Partner, Integer> colRate;

    @FXML
    private TableColumn<Partner, String> colAddress;

    @FXML
    private TableColumn<Partner, String> colNameDirector;

    @FXML
    private TableColumn<Partner, String> colPhone;

    @FXML
    private TableColumn<Partner, String> colEmail;


    @FXML
    protected void initialize() {
        vPartner.setStyle("-fx-selection-bar: #67BA80; -fx-selection-bar-non-focused: salmon;");
        colType.setCellValueFactory(new PropertyValueFactory<Partner, String>("Type"));
        colName.setCellValueFactory(new PropertyValueFactory<Partner, String>("Name"));
        colRate.setCellValueFactory(new PropertyValueFactory<Partner, Integer>("Rate"));
        colAddress.setCellValueFactory(new PropertyValueFactory<Partner, String>("Address"));
        colNameDirector.setCellValueFactory(new PropertyValueFactory<Partner, String>("NameDirector"));
        colPhone.setCellValueFactory(new PropertyValueFactory<Partner, String>("Phone"));
        colEmail.setCellValueFactory(new PropertyValueFactory<Partner, String>("Email"));

        vPartner.setRowFactory(tv -> {
            TableRow<Partner> row = new TableRow<>();
            row.setOnMouseClicked(mouseEvent -> {
                if (mouseEvent.getClickCount() == 2) {
                    Partner rowData = row.getItem();
                    Stage stage = new Stage();
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("second.fxml"));
                    try {
                        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
                        SecondController secondController = fxmlLoader.getController();
                        secondController.setData(rowData);
                        stage.setTitle("Добавление/Редактирование данных партнера");
                        stage.setScene(scene);
                        stage.show();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            return row;
        });
    }

    @FXML
    protected void updateData(ObservableList<Partner> partners) {
        vPartner.setItems(partners);
    }
}