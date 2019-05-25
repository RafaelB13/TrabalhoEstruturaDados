package views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Rafael Borges
 * github.com/RafaelB13
 */
public class Tela1 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
          
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLTelaPrincipal.fxml"));
        
        
        
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        
        
        
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }

}
