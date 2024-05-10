package mainapp;

import backend.Client;
import backend.Order;
import backend.Products;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
public class ButtonClickedOrder implements EventHandler<ActionEvent> {



    Stage stage;
    public ButtonClickedOrder(Stage stage){
        this.stage = stage;
    }
    @Override
    public void handle (ActionEvent e){
        MainMenu app = new MainMenu();
        app.start(stage);
    }
}
