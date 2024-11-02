package org.example.demoexam;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.collections.ObservableList;
import javafx.stage.Stage;


public class SecondController {
    @FXML
    private TextField tfType;
    @FXML
    private TextField tfRate;
    @FXML
    private TextField tfAddress;
    @FXML
    private TextField tfNameDirector;
    @FXML
    private TextField tfPhone;
    @FXML
    private TextField tfEmail;

    @FXML
    private Button bSubmit;

    private Partner partner;
    private TableView<Partner> vPartner;


    @FXML
    protected void setData(){
        tfType.setText(partner.getType());
        tfRate.setText(String.valueOf(partner.getRate()));
        tfAddress.setText(partner.getAddress());
        tfNameDirector.setText(partner.getNameDirector());
        tfPhone.setText(partner.getPhone());
        tfEmail.setText(partner.getEmail());
    }

    @FXML
    protected void updateData(Partner partner, TableView<Partner> vPartner){
        this.partner = partner; // Сохраняем переданный объект
        this.vPartner = vPartner; // Сохраняем ссылку на TableView
        setData(); // Заполняем текстовые поля данными партнера
    }

    @FXML
    protected void handleUpdateButtonAction() {
        partner.setType(tfType.getText());
        partner.setRate(Integer.parseInt(tfRate.getText()));
        partner.setAddress(tfAddress.getText());
        partner.setNameDirector(tfNameDirector.getText());
        partner.setPhone(tfPhone.getText());
        partner.setEmail(tfEmail.getText());

        vPartner.refresh(); // Обновляем отображение в TableView
        ((Stage) bSubmit.getScene().getWindow()).close(); // Закрываем окно редактирования
    }
}
