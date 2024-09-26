package dk.easv.firstjavafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.TextField;

import java.io.IOException;
public class HelloController{

    @FXML
    private TextField userInput;


    @FXML
    private void clickOpenWindow() throws IOException {
        String inputText = userInput.getText();


        if(!userInput.getText().trim().isEmpty()) {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("QuestionWindow.fxml"));
            Parent root = loader.load();

            QuestionController questionController = loader.getController();


            questionController.setName(inputText);


            Stage stage = new Stage();
            stage.setTitle("Question sheet");
            stage.setScene(new Scene(root));
            stage.show();

        }
        else {
            System.out.println("Enter valid username!");

        }

    }
}

