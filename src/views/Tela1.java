package views;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Rafael Borges
 * github.com/RafaelB13
 */
public class Tela1 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
          
        AnchorPane pane = new AnchorPane();
        pane.setPrefSize(300, 300);
        
        Button btn = new Button("Teste");
        pane.getChildren().add(btn);
        
        
        primaryStage.setScene(new Scene(pane));
        primaryStage.show();
        
        btn.setLayoutX((pane.getWidth() - btn.getWidth()) / 2);
        btn.setLayoutY(120);
        
        
        
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }

}
