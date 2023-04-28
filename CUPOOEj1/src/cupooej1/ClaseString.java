/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cupooej1;

import Entidades.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;

public class ClaseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CadenaServicio cs = new CadenaServicio();
        Cadena c1 = cs.IngresarFrase();

        System.out.println("");
        System.out.println("---BIENVENIDO AL MENU DE METODOS DE LA CLASE STRING---");
        System.out.println("1.Mostrar vocales");
        System.out.println("2.Invertir frase");
        System.out.println("3.Contar cuantas veces un x caracter se repite");
        System.out.println("4.Comparar longitud con frase nueva");
        System.out.println("X.Salir");
        System.out.println("");
        
        System.out.println("Ingrese el numero de la opcion");
        int opcion = leer.nextInt();
        System.out.println("");
        
        switch (opcion) {
            case 1:
                cs.MostrarVocales(c1);
                break;
            case 2:
                cs.InvertirFrase(c1);
                break;
            case 3:
                cs.VecesRepetido(c1);
                break;
            case 4:
                cs.compararLongitud(c1);
                break;

            default:
                System.out.println("Opcion invalida -> SALIDA");

        }
        
        
        
    }

}
