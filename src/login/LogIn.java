package login;

import backend.Client;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import mainapp.MainMenu;

public class LogIn extends Application {
    @Override
    public void start(Stage stage) {

        //init
        //Stage login = new Stage();
        Group root2 = new Group();
        Scene scene2 = new Scene(root2);

        //stage config
        stage.setScene(scene2);
        stage.setTitle("Online Shopping");
        stage.setHeight(300);
        stage.setWidth(500);
        stage.setResizable(false);

        //change icon
        Image icon2 = new Image("icon.jpg");
        stage.getIcons().add(icon2);


        //email text config
        Text eMail_text= new Text("E-mail:");
        eMail_text.setX(50);
        eMail_text.setY(50);
        root2.getChildren().add(eMail_text);


        //password text config
        Text passW_text= new Text("Password:");
        passW_text.setX(50);
        passW_text.setY(90);
        root2.getChildren().add(passW_text);


        //Log in button config
        Button loginbutton = new Button("Log In");
        loginbutton.setMinWidth(80);
        loginbutton.setLayoutX(270);
        loginbutton.setLayoutY(120);
        root2.getChildren().add(loginbutton);

        //email text field config
        TextField eMail_field = new TextField();
        eMail_field.setMinWidth(220);
        eMail_field.setLayoutX(130);
        eMail_field.setLayoutY(32);
        root2.getChildren().add(eMail_field);


        //password text field config
        TextField passW_field = new TextField();
        passW_field.setLayoutX(130);
        passW_field.setLayoutY(72);
        root2.getChildren().add(passW_field);

        Text errorMessage = new Text("Invalid E-mail or Password");
        loginbutton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if(root2.getChildren().contains(errorMessage))
                {
                    root2.getChildren().remove(errorMessage);
                }

                for(int i=0 ; i<Client.getNumOfClients() ; i++){
                    Client testClient = Client.getClients().get(i);

                    if(testClient.getEmail().equals(eMail_field.getText()) && testClient.getPassword().equals(passW_field.getText())){
                       stage.setResizable(true);
                        MainMenu app = new MainMenu();
                        app.start(stage);
                    }
                }
                errorMessage.setFill(Color.RED);
                errorMessage.setX(50);
                errorMessage.setY(137);
                root2.getChildren().add(errorMessage);



            }
        });
        stage.show();


    }
}
/*
if(c.getPassword() == passW_field.getText() && c.getEmail() == eMail_field.getText()){
StartUp app = new StartUp();
                    app.start(stage);
                }
                        else {

Text errorMessage = new Text("Incorrect username or password.");

                    root2.getChildren().add(errorMessage);
                    errorMessage.setX(130);
                    errorMessage.setY(72);
                }

*/