/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaver;

/**
 *
 * @author rodsur
 */
public abstract class Product implements Expireable {
    
    //Variabler
    private int vareNummer;
    private String navn;
    private double pris;
    
    //Constructore
    public Product(int vareNummer, String navn, double pris) {
        this.vareNummer = vareNummer;
        this.navn = navn;
        this.pris = pris;
    }
    
    //Metoder
    @Override
    public boolean isExpired() {
        throw new UnsupportedOperationException("Product does not support this operation.");
    }
    
    //Getters Setters
    public int getVareNummer() {
        return vareNummer;
    }
    
    public void setVareNummer(int vareNummer) {
        this.vareNummer = vareNummer;
    }
    
    public String getNavn() {
        return navn;
    }
    
    public void setNavn(String navn) {
        this.navn = navn;
    }
    
    public double getPris() {
        return pris;
    }
    
    public void setPris(double pris) {
        this.pris = pris;
    }
}
