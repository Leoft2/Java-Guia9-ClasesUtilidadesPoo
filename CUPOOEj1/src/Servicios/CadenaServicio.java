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
        c1.setFrase(leer.nextLine());
        System.out.println("");

        return c1;
    }

    public void MostrarVocales(Cadena c1) {
        String entrada = c1.getFrase();
        int nVocales = 0;

        for (int i = 0; i < entrada.length(); i++) {

            if (entrada.charAt(i) == 'a' || entrada.charAt(i) == 'e' || entrada.charAt(i) == 'i'
                    || entrada.charAt(i) == 'o' || entrada.charAt(i) == 'u') {
                nVocales++;
            }
        }
        System.out.println("***Mostrar vocales***");
        System.out.println("la frase " + entrada + " contiene " + nVocales + " vocales ");
        System.out.println("");

    }

    public void InvertirFrase(Cadena c1) {
        String entrada = c1.getFrase();
        System.out.println("***InvertirFrase***");
        System.out.println("Entrada:" + entrada);
        System.out.print("Salida:");
        for (int i = entrada.length() - 1; i >= 0; i--) {
            System.out.print(entrada.charAt(i));
        }
        System.out.println("");
        System.out.println("");

    }

    public void VecesRepetido(Cadena c1) {
        Scanner leer = new Scanner(System.in);
        String entrada = c1.getFrase();
        System.out.println("***VecesRepetido***");
        System.out.println("ingrese un caracter");
        String letra = leer.next();
        int nRepetido = 0;

        for (int i = 0; i < entrada.length(); i++) {
            String fraseLetra = entrada.substring(i, i + 1);
            if (fraseLetra.equals(letra)) {
                nRepetido++;
            }
        }
        System.out.println("Entrada:" + entrada);
        System.out.println("Salida: el caracter '" + letra + "' se repite " + nRepetido + " veces");
        System.out.println("");
    }

    public void compararLongitud(Cadena c1) {
        Scanner leer = new Scanner(System.in);
        int longitudFrase1 = c1.getFrase().length();
        System.out.println("***CompararLongitud***");
        System.out.println("Ingresar una nueva frase:");
        String frase2 = leer.nextLine();
        int longitudFrase2 = frase2.length();
        
        if (longitudFrase1 == longitudFrase2) {
            System.out.println("La longitud de las dos frases son iguales");
            }
            else {
            System.out.println("La longitud de las dos frases son diferentes");
            }
        System.out.println("");
    }
    
    
    
}
