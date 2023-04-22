/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Leonel
 */
public class Cadena {
    
    // Defino los atributos del objeto 
    private String frase;
    
    private int longitudFrase;

    
    // Agrego un constructor por defecto
    public Cadena() {
    }
    
    //Agrego un constructor con paramatros

    public Cadena(String frase) {
        this.frase = frase;
        setLongitudFrase(frase.length());
    }
    
    // Getters & setters

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitudFrase() {
        return longitudFrase;
    }

    public void setLongitudFrase(int longitudFrase) {
        this.longitudFrase = longitudFrase;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitudFrase=" + longitudFrase + '}';
    }

  
    
    
    
}
