package login;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class StartUp extends Application {
    @Override
    public void start(Stage stage) {

        //init
        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setScene(scene);

        //Stage config
        stage.setTitle("Online Shopping");
        stage.setHeight(500);
        stage.setWidth(500);
        stage.setResizable(false);

        //change icon
        Image icon = new Image("icon.jpg");
        stage.getIcons().add(icon);

        //logInButton config
        Button logInButton=new Button("Log in");
        logInButton.setMinWidth(100);
        logInButton.setLayoutX(185);
        logInButton.setLayoutY(240);
        root.getChildren().add(logInButton);

        //signInButton config
        Button signInButton =new Button("Sign up");
        signInButton.setMinWidth(100);
        signInButton.setLayoutX(185);
        signInButton.setLayoutY(300);
        root.getChildren().add(signInButton);

        //put logo and config
        ImageView logo = new ImageView("logo.jpg");
        logo.setFitHeight(197);
        logo.setFitWidth(350);
        logo.setX(65);
        logo.setY(0);
        root.getChildren().add(logo);

        //event handling for log in press
        logInButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                LogIn app = new LogIn();
                app.start(stage);
            }
        });

        signInButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                SignUp app = new SignUp();
                app.start(stage);

            }
        });


        stage.show();
    }
}


