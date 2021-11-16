package example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController{
    @FXML
    private Button cancelButton;
    @FXML
    private TextField txtUserName;
    @FXML
    private PasswordField txtPassword;

    public void login(){
        String UserName = txtUserName.getText();
        String PassWord = txtPassword.getText();

        if(UserName.equals("admin") && PassWord.equals("1234")){
            System.out.println("Jesteś zalogowany!");
        }else{
            System.out.println("Podałeś złe dane");
        }
    }
    public void cancelButtonOnAction(ActionEvent event){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}