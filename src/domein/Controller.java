/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Borre
 */
public class Controller {
    private List<Celebrity> lijst;
    
    public Controller(){
        lijst = new ArrayList<>();
    }
    
    public void addCeleb(Celebrity celeb){
        lijst.add(celeb);
    }
    
    public void getLijst(List<Celebrity> list){
        this.lijst = list;
    }
    
    public void geefCeleb(){
        
        for(Celebrity cel : this.lijst){
            System.out.print(cel.toString());
            System.out.print("\n");
        }
    }
    
}
