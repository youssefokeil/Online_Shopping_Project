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

public class ButtonClickedshirt implements EventHandler<ActionEvent> {
    private Stage primaryStage;
    Image shirt = new Image("file:\\D:\\Learning\\The college\\Java\\Project media\\shirtttt.jpg");
    ImageView shirt_view = new ImageView(shirt);
    Button order = new Button("Order");
    Button black = new Button("Black");
    Button white = new Button("White");
    Button small = new Button("S");
    Button medium = new Button("M");
    Button large = new Button("L");
    Text text1 = new Text("Choose color: ");
    Text text2 = new Text("Choose size: ");
    Text text3 = new Text("Price:                                           500LE");

    public ButtonClickedshirt(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @Override
    public void handle (ActionEvent e){
        createNewSceneShirts(primaryStage);
    }
    private void createNewSceneShirts(Stage primaryStage){
        int sizes_buttonswidth=30;
        int sizes_buttonsheight=30;

        text1.setFont(Font.font("Arial", 20));
        text2.setFont(Font.font("Arial", 20));
        text3.setFont(Font.font("Arial", 20));

        Pane pane = new Pane();
        Scene scene = new Scene(pane,1200,600);

            /*shirt_view.setFitWidth(100);
            shirt_view.setFitHeight(100);*/


        shirt_view.fitHeightProperty().bind(scene.heightProperty().divide(3));
        shirt_view.fitWidthProperty().bind(scene.widthProperty().divide(3));


        small.setPrefSize(sizes_buttonswidth,sizes_buttonsheight);
        medium.setPrefSize(sizes_buttonswidth,sizes_buttonsheight);
        large.setPrefSize(sizes_buttonswidth,sizes_buttonsheight);
        order.setPrefSize(75,25);

        pane.getChildren().addAll(shirt_view,order,black,white,small,medium,large,text1,text2,text3);
        setInitialshirt(pane,scene);
        scene.widthProperty().addListener((obs, oldWidth, newWidth) -> setInitialshirt(pane, scene));
        scene.heightProperty().addListener((obs, oldHeight, newHeight) -> setInitialshirt(pane, scene));

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void setInitialshirt(Pane pane,Scene scene){
        double scenewidth = scene.getWidth();
        double sceneheight = scene.getHeight();

        shirt_view.setLayoutX(scenewidth*1.4/4);
        shirt_view.setLayoutY(sceneheight*0.4/4);

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
