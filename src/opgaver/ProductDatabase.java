/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaver;

import java.util.ArrayList;

/**
 *
 * @author rodsur
 */
public class ProductDatabase {
    
    //Variabler
    private ArrayList<Product> productDatabase;
    
    //Constructore
    public ProductDatabase() {
        this.productDatabase = new ArrayList<Product>();
    }
    
    //Metoder
    public void addProduct(Product product) {
        //expandDatabase();
        productDatabase.add(product);
        //productDatabase[productDatabase.size()-1] = product;
    }
    
    public void removeProduct(Product p) {
        /*
            if (productDatabase[i] != null && productDatabase[i].getVareNummer() == vareNummer) {
                productDatabase[i] = null;
            }
        }*/
        productDatabase.remove(p);
    }
    
    public void makeList() {
        System.out.println("Vareliste:");
        for(int i = 0; i<productDatabase.size(); i++) {
            System.out.println(productDatabase.get(i).toString());
        }
    }
    
    public void removeExpiredFoods() {
        for (int i = 0; i<productDatabase.size(); i++) {
            try {
                if (productDatabase.get(i).isExpired() == true) {
                    productDatabase.remove(i);
                    i -= 1;
                }    
            } catch(UnsupportedOperationException e) {
                System.out.println("type did not support operation");
            }
            
        }
    }
    public int getSize(){
        return this.productDatabase.size();
    }
    /*
    private void expandDatabase() {
        Product[] newDatabase;
        newDatabase = new Product[this.productDatabase.length+1];
        for (int i = 0; i<productDatabase.length; i++) {
            newDatabase[i] = productDatabase[i];
        }
        productDatabase = newDatabase;
    }
    
    public double returnSum() {
        double sum = 0;
        for (int i = 0; i<productDatabase.length; i++) {
            if (productDatabase[i] != null) {
                sum += productDatabase[i].getPris();
            }
        }
        return sum;
    }
    */
    //Getters Setters
    
}
