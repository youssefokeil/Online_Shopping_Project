package login;
import mainapp.*;
import backend.Client;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static java.lang.Long.parseLong;

public class SignUp extends Application {
    @Override
    public void start(Stage stage) {

        //init
        //Stage signup = new Stage();
        GridPane root3 = new GridPane();
        Scene scene3 = new Scene(root3);


        //stage config
        stage.setTitle("Online shopping");
        stage.setHeight(500);
        stage.setWidth(500);
        stage.setResizable(false);
        stage.setScene(scene3);

        //scene config
        root3.setVgap(30);
        root3.setHgap(10);

        //change icon
        Image icon3 = new Image("icon.jpg");
        stage.getIcons().add(icon3);


        //details text config
        Text t8=new Text("Please Enter your details :");
        t8.setFont(Font.font("ARIAL",12));
        t8.setX(40);
        t8.setY(40);
        root3.add(t8,3,2);


        //text init
        Text userN_text = new Text("Username :");
        Text eMail_text = new Text("E-mail :");
        Text passW_text = new Text("Password :");
        Text address_text = new Text("Address :");
        Text phone_text = new Text("Phone number :");
        //text config
        root3.add(userN_text,3,3);
        root3.add(eMail_text,3,4);
        root3.add(passW_text,3,5);
        root3.add(address_text,3,6);
        root3.add(phone_text,3,7);

        //textfield init
        TextField userN_field = new TextField();
        TextField eMail_field = new TextField();
        TextField passW_field = new TextField();
        TextField address_field = new TextField();
        TextField phone_field = new TextField();

        //textfield config
        root3.add(userN_field,4,3);
        root3.add(eMail_field,4,4);
        root3.add(passW_field,4,5);
        root3.add(address_field,4,6);
        root3.add(phone_field,4,7);

        //button congfig
        Button signupbutton = new Button("Sign up");
        signupbutton.setMinWidth(200);
        root3.add(signupbutton,4,8);

        Text errorMessage = new Text("");

        //event handling for log in press
        signupbutton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                    if(root3.getChildren().contains(errorMessage))
                        {
                        root3.getChildren().remove(errorMessage);
                        }

                try {
                    Client c = new Client(phone_field.getText(), userN_field.getText(), address_field.getText(), passW_field.getText(), eMail_field.getText());
                }
                catch(IllegalArgumentException s){
                    errorMessage.setFill(Color.RED);
                    errorMessage.setText(s.getMessage());
                    root3.add(errorMessage,3,8);
                }

                if(!root3.getChildren().contains(errorMessage))
                {
                    LogIn app = new LogIn();
                app.start(stage);
                }
            }
        });


        stage.show();

    }
}


//if(s.getMessage()=="Please enter a valid User Name"){

                    /*}
                    if(s.getMessage()=="Please enter a valid Address"){
                    }
                    if(s.getMessage()=="Password is too short"){

                    }
                    if(s.getMessage()=="Please enter a valid Email"){

                    }
                    if(s.getMessage()=="Please enter valid a Phone Number"){

                    }*/

