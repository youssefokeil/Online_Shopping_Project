package mainapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javax.swing.*;
import java.awt.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class MainMenu extends Application {
    Button buttontshirts = new Button("T-shirts");
    Button buttonPants = new Button("Pants");
    Button buttonshoes = new Button("Shoes");
    Button buttoncaps = new Button("caps");
    Image t_shirt = new Image("file:\\D:\\Learning\\The college\\Java\\Project media\\shirtttt.jpg");
    Image cap = new Image("file:\\D:\\Learning\\The college\\Java\\Project media\\cap.jpg");
    Image shoes = new Image("file:\\D:\\Learning\\The college\\Java\\Project media\\shoes.jpg");
    Image pants = new Image("file:\\D:\\Learning\\The college\\Java\\Project media\\pants.jpg");
    ImageView tshirt = new ImageView(t_shirt);
    ImageView cap_view = new ImageView(cap);
    ImageView shoes_view = new ImageView(shoes);
    ImageView pants_view = new ImageView(pants);
    Stage primaryStage;
    /*public void MainMenu(Stage primaryStage){
        this.primaryStage=primaryStage;
    }*/
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setResizable(true);
        this.primaryStage = primaryStage;
        int buttonwidth = 75;
        int buttonheight = 50;

        buttontshirts.setPrefSize(buttonwidth,buttonheight);
        buttonPants.setPrefSize(buttonwidth,buttonheight);
        buttonshoes.setPrefSize(buttonwidth,buttonheight);
        buttoncaps.setPrefSize(buttonwidth,buttonheight);


        Pane pane1 = new Pane();
        Scene scene1 = new Scene(pane1, 1200, 600);


        tshirt.fitHeightProperty().bind(scene1.heightProperty().divide(4));
        tshirt.fitWidthProperty().bind(scene1.widthProperty().divide(4));

        cap_view.fitHeightProperty().bind(scene1.heightProperty().divide(4));
        cap_view.fitWidthProperty().bind(scene1.widthProperty().divide(4));

        shoes_view.fitHeightProperty().bind(scene1.heightProperty().divide(4));
        shoes_view.fitWidthProperty().bind(scene1.widthProperty().divide(4));

        pants_view.fitHeightProperty().bind(scene1.heightProperty().divide(4));
        pants_view.fitWidthProperty().bind(scene1.widthProperty().divide(4));


        pane1.getChildren().addAll(buttontshirts, buttonPants, buttonshoes, buttoncaps,  tshirt, cap_view, shoes_view, pants_view);

        setInitialLayout(pane1, scene1);

        scene1.widthProperty().addListener((obs, oldWidth, newWidth) -> setInitialLayout(pane1, scene1));
        scene1.heightProperty().addListener((obs, oldHeight, newHeight) -> setInitialLayout(pane1, scene1));

        primaryStage.setScene(scene1);
        primaryStage.show();
        primaryStage.setFullScreen(true);
        ButtonClickedshirt handler1 = new ButtonClickedshirt(primaryStage);
        buttontshirts.setOnAction(handler1);
        ButtonClickedpants handler2 = new ButtonClickedpants(primaryStage);
        buttonPants.setOnAction(handler2);
        ButtonClickedCaps handler3 = new ButtonClickedCaps(primaryStage);
        buttoncaps.setOnAction(handler3);
        ButtonClickedshoes handler4 = new ButtonClickedshoes(primaryStage);
        buttonshoes.setOnAction(handler4);

    }
        private void setInitialLayout(Pane pane, Scene scene){
            double scenewidth = scene.getWidth();
            double sceneheight = scene.getHeight();

            buttontshirts.setLayoutX(scenewidth / 4);
            buttontshirts.setLayoutY(sceneheight * 3 / 8);

            buttonPants.setLayoutX(scenewidth * 3 / 4);
            buttonPants.setLayoutY(sceneheight * 3 / 8);

            buttoncaps.setLayoutX(scenewidth / 4);
            buttoncaps.setLayoutY(sceneheight * 6.5 / 8);

            buttonshoes.setLayoutX(scenewidth * 3 / 4);
            buttonshoes.setLayoutY(sceneheight * 6.5 / 8);



            tshirt.setLayoutX(scenewidth *1.2/ 8);
            tshirt.setLayoutY(sceneheight * 0.5 / 8);

            cap_view.setLayoutX(scenewidth* 1.2/ 8);
            cap_view.setLayoutY(sceneheight * 4 / 8);

            shoes_view.setLayoutX(scenewidth * 2.6 / 4);
            shoes_view.setLayoutY(sceneheight * 4 / 8);

            pants_view.setLayoutX(scenewidth * 2.6/ 4);
            pants_view.setLayoutY(sceneheight * 0.5 / 8);

        }
    }

