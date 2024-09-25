package dk.easv.firstjavafx;

import javafx.fxml.FXML;

import javafx.scene.control.Label;

public class QuestionController {

    @FXML

    private Label nameLabel;

    public void setName(String name) {
        nameLabel.setText("Name of participant: " + name);
    }
}
