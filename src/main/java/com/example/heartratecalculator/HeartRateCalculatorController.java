package com.example.heartratecalculator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.crypto.AEADBadTagException;
import java.text.NumberFormat;

public class HeartRateCalculatorController {

    @FXML
    private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
    @FXML
    private TextField AgeTextField;

    @FXML
    private Button CheckButton;

    @FXML
    private TextField MaxHeartTextField;

    @FXML
    private TextField TargetHeartTextField;

    @FXML
    void CheckButtonPressed(ActionEvent event) {
        try{
            int age = Integer.parseInt(AgeTextField.getAccessibleText());
            int maxHeartRate = 220-age;
            MaxHeartTextField.setText(currency.format(maxHeartRate));
            float targetHeartRate_from = Math.round(maxHeartRate*0.64);
            float targetHeartRate_to = Math.round(maxHeartRate*0.76);
            TargetHeartTextField.setText("from " + targetHeartRate_from + " to " + targetHeartRate_to);
        }catch(NumberFormatException e){
            AgeTextField.setText("Enter your age please");
            AgeTextField.selectAll();
            AgeTextField.requestFocus();

        }


    }

}
