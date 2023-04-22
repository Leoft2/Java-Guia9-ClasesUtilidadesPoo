/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Leonel
 */
public class CadenaServicio {

    public Cadena IngresarFrase() {

        Scanner leer = new Scanner(System.in);

        //instanciar un objeto tipo cadena
        Cadena c1 = new Cadena();

        System.out.println("Ingresar una palabra o frase");
        c1.setFrase(leer.next());
        return c1;
    }

    public void MostrasVocales(Cadena c1) {
        int contadorA= 0;
        for (int i = 0; i < c1.getLongitudFrase(); i++) {
            String frase = c1.getFrase();
            String letra = frase.substring(i, i);
            
            switch (frase) {
                case "a":
                contadorA = contadorA++;
            }
           
        }
    }

}
