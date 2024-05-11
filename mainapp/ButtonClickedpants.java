package mainapp;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ButtonClickedpants implements EventHandler<ActionEvent> {
    private Stage primarystage;
    Image pants = new Image("file:\\D:\\Learning\\The college\\Java\\Project media\\pants.jpg");
    ImageView pants_view = new ImageView(pants);
    Button order = new Button("Order");
    Button black = new Button("Black");
    Button white = new Button("White");
    Button small = new Button("S");
    Button medium = new Button("M");
    Button large = new Button("L");
    Text text1 = new Text("Choose color: ");
    Text text2 = new Text("Choose size: ");
    Text text3 = new Text("Price:                                           600LE");
    double price = 600;
    String color;
    String size;

    public ButtonClickedpants(Stage primarystage){
        this.primarystage = primarystage;
    }

    @Override
    public void handle (ActionEvent e){
        createNewScenepants(primarystage);
    }

    private void createNewScenepants(Stage primarystage){
        int sizes_buttonswidth=30;
        int sizes_buttonsheight=30;

        text1.setFont(Font.font("Arial", 20));
        text2.setFont(Font.font("Arial", 20));
        text3.setFont(Font.font("Arial", 20));

        Pane pane = new Pane();
        Scene scene = new Scene(pane);


        pants_view.fitHeightProperty().bind(scene.heightProperty().divide(3));
        pants_view.fitWidthProperty().bind(scene.widthProperty().divide(3));


        small.setPrefSize(sizes_buttonswidth,sizes_buttonsheight);
        medium.setPrefSize(sizes_buttonswidth,sizes_buttonsheight);
        large.setPrefSize(sizes_buttonswidth,sizes_buttonsheight);
        order.setPrefSize(75,25);

        pane.getChildren().addAll(pants_view,order,black,white,small,medium,large,text1,text2,text3);
        setInitialoants(pane,scene);
        scene.widthProperty().addListener((obs, oldWidth, newWidth) -> setInitialoants(pane, scene));
        scene.heightProperty().addListener((obs, oldHeight, newHeight) -> setInitialoants(pane, scene));

        white.setOnAction(event -> {
            color = "White";
        });
        black.setOnAction(event -> {
            color = "Black";
        });
        small.setOnAction(event -> {
            size = "Small";
        });
        medium.setOnAction(event -> {
            size = "Medium";
        });
        large.setOnAction(event -> {
            size = "Large";
        });



        ButtonClickedOrder handle1 = new ButtonClickedOrder(primarystage,color,size,price);
        order.setOnAction(handle1);

        primarystage.setScene(scene);
        primarystage.show();
        primarystage.setFullScreen(true);

    }

    private void setInitialoants(Pane pane,Scene scene){
        double scenewidth = scene.getWidth();
        double sceneheight = scene.getHeight();

        pants_view.setLayoutX(scenewidth*1.4/4);
        pants_view.setLayoutY(sceneheight*0.4/4);

        order.setLayoutX(scenewidth/2);
        order.setLayoutY(sceneheight*7/8);

        text1.setX(scenewidth/4);
        text1.setY(sceneheight/2);

        text2.setX(scenewidth/4);
        text2.setY(sceneheight*2.5/4);

        text3.setX(scenewidth/4);
        text3.setY(sceneheight*3/4);

        black.setLayoutX(scenewidth*1.5/4);
        black.setLayoutY(sceneheight*1.87/4);

        white.setLayoutX(scenewidth*1.8/4);
        white.setLayoutY(sceneheight*1.87/4);

        small.setLayoutX(scenewidth*1.5/4);
        small.setLayoutY(sceneheight*2.35/4);

        medium.setLayoutX(scenewidth*1.7/4);
        medium.setLayoutY(sceneheight*2.35/4);

        large.setLayoutX(scenewidth*1.9/4);
        large.setLayoutY(sceneheight*2.35/4);
    }

}