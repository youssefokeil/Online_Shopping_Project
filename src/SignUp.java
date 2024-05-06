import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

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
        Text t3 = new Text("Username :");
        Text t4 = new Text("E-mail :");
        Text t5 = new Text("Password :");
        Text t6 = new Text("Address :");
        Text t7 = new Text("Phone number :");
        //text config
        root3.add(t3,3,3);
        root3.add(t4,3,4);
        root3.add(t5,3,5);
        root3.add(t6,3,6);
        root3.add(t7,3,7);

        //textfield init
        TextField field3 = new TextField();
        TextField field4 = new TextField();
        TextField field5 = new TextField();
        TextField field6 = new TextField();
        TextField field7 = new TextField();

        //textfield config
        root3.add(field3,4,3);
        root3.add(field4,4,4);
        root3.add(field5,4,5);
        root3.add(field6,4,6);
        root3.add(field7,4,7);

        //button congfig
        Button signupbutton = new Button("Sign up");
        signupbutton.setMinWidth(200);
        root3.add(signupbutton,4,8);

        //event handling for log in press
        signupbutton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                StartUp app = new StartUp();
                app.start(stage);
            }
        });


        stage.show();

    }
}


