package calculator;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author rajesh
 */
public class CalcUIController implements Initializable {

    Double sum = 0.0;
    boolean isOperatorPressed = false;
    String operatorPressed = "";
    Double num1 = 0.0;
    Double num2 = 0.0;
    String numValue = "";
    String tempDisplay;

    @FXML
    TextField outputTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        outputTF.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*([\\.]\\d*)?")) {
                    outputTF.setText("0.0");
                }
            }
        });
    }

    //If operator is pressed set outputTF to the button press, else set outputTF to what's in outputTF and button press
    @FXML
    private void onNumberClick(ActionEvent event) {
        Button button = (Button) event.getSource();
        if(isOperatorPressed)//checks if an operator has been pressed
        {
            switch (button.getText()) {
                case "1"://if the button is 1
                {
                    numValue = numValue + "1";
                    outputTF.setText(numValue);
                    break;
                }
                case "2":// if the button is 2, so on
                {
                    numValue = numValue + "2";
                    outputTF.setText(numValue);
                    break;
                }
                case "3": {
                    numValue = numValue + "3";
                    outputTF.setText(numValue);
                    break;
                }
                case "4": {
                    numValue = numValue + "4";
                    outputTF.setText(numValue);
                    break;
                }
                case "5": {
                    numValue = numValue + "5";
                    outputTF.setText(numValue);
                    break;
                }
                case "6": {
                    numValue = numValue + "6";
                    outputTF.setText(numValue);
                    break;
                }
                case "7": {
                    numValue = numValue + "7";
                    outputTF.setText(numValue);
                    break;
                }
                case "8": {
                    numValue = numValue + "8";
                    outputTF.setText(numValue);
                    break;
                }
                case "9":
                {
                    numValue = numValue + "9";
                    outputTF.setText(numValue);
                    break;
                }
                case "."://if the button is . adds a decimal place
                {
                    numValue = numValue + ".";
                    outputTF.setText(numValue);
                    break;
                }
                default://if the button is 0
                {
                    numValue = numValue + "0";
                    outputTF.setText(numValue);
                    break;
                }
            }
            num2 = Double.parseDouble(numValue);
        }
        else
        { //same as last switch except for num1
            switch (button.getText()) {
                case "1":
                {
                    numValue = numValue + "1";
                    outputTF.setText(numValue);
                    break;
                }
                case "2":
                {
                    numValue = numValue + "2";
                    outputTF.setText(numValue);
                    break;
                }
                case "3":
                {
                    numValue = numValue + "3";
                    outputTF.setText(numValue);
                    break;
                }
                case "4":
                {
                    numValue = numValue + "4";
                    outputTF.setText(numValue);
                    break;
                }
                case "5":
                {
                    numValue = numValue + "5";
                    outputTF.setText(numValue);
                    break;
                }
                case "6":
                {
                    numValue = numValue + "6";
                    outputTF.setText(numValue);
                    break;
                }
                case "7":
                {
                    numValue = numValue + "7";
                    outputTF.setText(numValue);
                    break;
                }
                case "8":
                {
                    numValue = numValue + "8";
                    outputTF.setText(numValue);
                    break;
                }
                case "9":
                {
                    numValue = numValue + "9";
                    outputTF.setText(numValue);
                    break;
                }
                case ".":
                {
                    numValue = numValue + ".";
                    outputTF.setText(numValue);
                    break;
                }
                default:
                {
                    numValue = numValue + "0";
                    outputTF.setText(numValue);
                    break;
                }
            }
            num1 = Double.parseDouble(numValue);
        }
    }

    /*
        Checks if outputTF is not empty
        Checks which button was pressed and performs the correct operation on sum
        Checks if button was "=" or "%" if so sets outputTF to the sum & operatorPressed to default
            if not sets outputTF to default and operatorPressed to the button pressed
        flags operator pressed to true
     */
    @FXML
    private void onOperatorClick(ActionEvent event) {
        Button button = (Button) event.getSource();
        switch(button.getText())
        {
            case "+"://if the button pressed is +
            {
                operatorPressed = "+";
                isOperatorPressed = true;
                outputTF.setText(num1.toString());
                numValue = "";
                break;
            }
            case "-"://if the button pressed is -
            {
                operatorPressed = "-";
                isOperatorPressed = true;
                outputTF.setText(num1.toString());
                numValue = "";
                break;
            }
            case "*"://if the button pressed is *
            {
                operatorPressed = "*";
                isOperatorPressed = true;
                outputTF.setText(num1.toString());
                numValue = "";
                break;
            }
            case "/"://if the button pressed is /
            {
                operatorPressed = "/";
                isOperatorPressed = true;
                outputTF.setText(num1.toString());
                numValue = "";
                break;
            }
            case "="://if the button pressed is =, it checks what operator was pressed and does the operation
            {
                switch(operatorPressed)
                {
                    case "+":
                    {
                        sum = num1 + num2;
                        outputTF.setText(sum.toString());
                        isOperatorPressed = false;
                        num1 = sum;
                        sum = 0.0;
                        break;
                    }
                    case "-":
                    {
                        sum = num1 - num2;
                        outputTF.setText(sum.toString());
                        isOperatorPressed = false;
                        num1 = sum;
                        sum = 0.0;
                        break;
                    }
                    case "*":
                    {
                        sum = num1 * num2;
                        outputTF.setText(sum.toString());
                        isOperatorPressed = false;
                        num1 = sum;
                        sum = 0.0;
                        break;
                    }
                    case "/":
                    {
                        sum = num1 / num2;
                        outputTF.setText(sum.toString());
                        isOperatorPressed = false;
                        num1 = sum;
                        sum = 0.0;
                        break;
                    }
                }
                break;
            }
            case "%"://if the button pressed is %, it checks if a value isn't empty and divides them by 100
            {
                if(sum != 0.0)
                {
                    sum = sum / 100;
                    outputTF.setText(sum.toString());
                }
                else if(num2 != 0.0)
                {
                    num2 = num2 / 100;
                    outputTF.setText(num2.toString());
                }
                else
                {
                    num1 = num1 / 100;
                    outputTF.setText(num1.toString());
                }
                break;
            }
            default:
            {
                outputTF.setText(num1.toString());
            }
        }
    }

    //If outputTF is not empty remove 1 char from the outputTF
    @FXML
    private void onDELClick(ActionEvent event)
    {
        if(!outputTF.getText().equals(""))
        {
            tempDisplay = outputTF.getText();
            tempDisplay = tempDisplay.substring(0,tempDisplay.length()-1);
            outputTF.setText(tempDisplay);
            if(num2 == 0.0)
            {
                num1 = Double.parseDouble(tempDisplay);
            }
            else if(sum == 0.0)
            {
                num2 = Double.parseDouble(tempDisplay);
            }
        }
        else
        {
            outputTF.setText("0.0");
        }
    }

    //Reset all values to their default states
    @FXML
    private void onCEClick(ActionEvent event)
    {
        outputTF.setText("0.0");
        num1 = 0.0;
        num2 = 0.0;
        numValue = "";
        isOperatorPressed = false;
        operatorPressed = "";
    }
}
