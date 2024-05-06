import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

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
        Text t1= new Text("E-mail:");
        t1.setX(50);
        t1.setY(50);
        root2.getChildren().add(t1);

        //password text config
        Text t2= new Text("Password:");
        t2.setX(50);
        t2.setY(90);
        root2.getChildren().add(t2);

        //Log in button config
        Button loginbutton = new Button("Log In");
        loginbutton.setMinWidth(80);
        loginbutton.setLayoutX(270);
        loginbutton.setLayoutY(120);
        root2.getChildren().add(loginbutton);

        //email text field config
        TextField field1 = new TextField();
        field1.setMinWidth(220);
        field1.setLayoutX(130);
        field1.setLayoutY(32);
        root2.getChildren().add(field1);


        //password text field config
        TextField passwordfield = new TextField();
        passwordfield.setLayoutX(130);
        passwordfield.setLayoutY(72);
        root2.getChildren().add(passwordfield);

        loginbutton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                StartUp app = new StartUp();
                app.start(stage);
                passwordfield.getText();


            }
        });
        stage.show();


    }
}


