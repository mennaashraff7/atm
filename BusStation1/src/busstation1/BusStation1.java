/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author scs
 */
public class BusStation1 extends Application {
    //Scene scene;
    
    @Override
    public void start(Stage primaryStage) {
        FirstLogin firstpage=new FirstLogin(primaryStage);
        pick pick1 = new pick(primaryStage);
        firstpage.preparescene();
        pick1.preparescene();
        
        
        firstpage.setPick1(pick1);
        
        primaryStage.setTitle("bus station");
        primaryStage.setScene(firstpage.getscene());
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
