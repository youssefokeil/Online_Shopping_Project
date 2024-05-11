package mainapp;

import backend.Client;
import backend.Order;
import backend.Products;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
public class ButtonClickedOrder implements EventHandler<ActionEvent> {



    Stage stage;
    String color ;
    String size;

    int num_of_items = 1;
    double price;
    public ButtonClickedOrder(Stage stage,String color,String size,double price){

        this.stage = stage;
        this.color = color;
        this.size = size;
        this.price = price;
    }
    @Override
    public void handle (ActionEvent e){
        Products product = new Products(color, size, num_of_items, price) {
            @Override
            public void addToArray() {

            }

            @Override
            public String toString() {
                return null;
            }
        };
        //Order order = new Order(Client client)

    }
}
