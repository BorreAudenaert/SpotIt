package gui;


import domein.Celebrity;
import domein.Controller;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author robin
 */
public class SchermController extends GridPane
{
    
    @FXML
    private TextField txfAdres;
    @FXML
    private TextField txfNaam;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnRefresh;
    
    private Controller dc;
    
    

    

    public SchermController(Controller dc)
    {
        this.dc = dc;
                
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scherm.fxml"));
        
        loader.setRoot(this);
        loader.setController(this);
        
        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
        
    }
    
    @FXML
    private void btnAddOnAction(ActionEvent event)
    {
        //System.out.print("add");
            String adres = txfAdres.getText();
            String naam = txfNaam.getText();
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            Celebrity celeb = new Celebrity(adres,dateFormat.format(date), naam);
            this.dc.addCeleb(celeb);
    }
    
    @FXML
    private void btnRefreshOnAction(ActionEvent event)
    {
        
        this.dc.geefCeleb();
        
    }
    
    
    
}
