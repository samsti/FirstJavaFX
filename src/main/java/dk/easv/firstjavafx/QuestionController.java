package dk.easv.firstjavafx;

import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;


public class QuestionController {
    @FXML

    private Label nameLabel;
    @FXML
    private ToggleGroup group1;

    public void setName(String name) {
        nameLabel.setText("Name of participant: " + name);
    }

    private void checkSelected(){
        Toggle selectedToggle = group1.getSelectedToggle();

        if (selectedToggle != null) {
            // Cast the selected toggle to RadioButton to get its text
            RadioButton selectedRadioButton = (RadioButton) selectedToggle;
            String selectedText = selectedRadioButton.getText();

            if(selectedText == "Agree"){

                System.out.println("1");
            }
            else if(selectedText == "Disagree"){
                System.out.println("-1");
            }
            else if(selectedText == "Neutral"){
                System.out.println("0");
            }


        } else {
            System.out.println("No selection");
        }

    }
}
