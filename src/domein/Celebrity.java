/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;



/**
 *
 * @author Borre
 */
public class Celebrity {
    private String adres, datum, naam;
    
    public Celebrity(String adres, String datum, String naam){
        this.adres = adres;
        this.datum = datum;
        this.naam = naam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
    

    public String toString(){
        return String.format("%s is gespot op %s om %s", this.getNaam(), this.getAdres(), this.getDatum());
    }
    
}
