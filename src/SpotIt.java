

import domein.Controller;
import gui.SchermController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author robin
 */
public class SpotIt extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Controller dc = new Controller();
        
        Scene scene = new Scene(new SchermController(dc));
        primaryStage.setScene(scene);
        primaryStage.setTitle("TipCalculator");
        
        primaryStage.show();
    }
}
