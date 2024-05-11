package mainapp;

import backend.Order;
import backend.Products;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ButtonClikedCart implements EventHandler<ActionEvent>{
    private Stage primaryStage;
    Order order;
    private static ArrayList<Order> all_orders ;
    public ButtonClikedCart(Stage primaryStage, Order order) {
        this.primaryStage = primaryStage;
        this.order = order;
        all_orders.add(order);
    }

    @Override
    public void handle(ActionEvent e){
        createNewScenecart(primaryStage);
    }
    public void createNewScenecart(Stage primaryStage){
        Pane pane = new Pane();

        double y_position = 0;
        for(int i=0;i<all_orders.size();i++){
            Order s = all_orders.get(i);
            Label orderlabel = new Label(" " + s.getProduct(i)+ " ");
            orderlabel.setLocation(0,y_position);
            pane.getChildren().add(orderlabel);
            y_position+=20;
        }
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
