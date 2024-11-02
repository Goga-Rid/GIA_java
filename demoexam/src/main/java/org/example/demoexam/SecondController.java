package org.example.demoexam;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


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
    protected void setData(Partner partner){
        tfType.setText(partner.getType());
        tfRate.setText(String.valueOf(partner.getRate()));
        tfAddress.setText(partner.getAddress());
        tfNameDirector.setText(partner.getNameDirector());
        tfPhone.setText(partner.getPhone());
        tfEmail.setText(partner.getEmail());
    }
}
