package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    TextField username;
    @FXML
    PasswordField password;
    @FXML
    Hyperlink register;
    @FXML
    Button login;
    @FXML
    Label alert;
    public void onHandleLogin(){
        if (username.getText().equals("") || password.getText().equals("")){
            alert.setVisible(true);
        }
        else{

        }

    }

    public void onHandleRegister(ActionEvent actionEvent){
        register = (Hyperlink) actionEvent.getSource();
        Stage stage =(Stage)register.getScene().getWindow();
        FXMLLoader fxmlLoader =new FXMLLoader(getClass().getResource("/register.fxml"));
        try{
            stage.setScene(new Scene((Parent) fxmlLoader.load(),800,600));
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void initialize(){
        alert.setVisible(false);

    }
}
