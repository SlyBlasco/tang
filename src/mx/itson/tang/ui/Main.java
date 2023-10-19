package mx.itson.tang.ui;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Inicia el programa y determina el punto de partida de su ejecucion.
 * @author Luis Blasco
 */
public class Main {
    
    public static void main(String[] args) {
        
        // Inicio de programa y scanner
        System.out.println("Ingrese el texto a evaluar");
        Scanner entrada = new Scanner(System.in);
        String numeros = entrada.nextLine();
        
        
        // Remplazamiento de caracteres como " ", "-", "(", ")"
        String nuevosNumeros = numeros.replace("-","");
        nuevosNumeros = nuevosNumeros.replace("(", "");
        nuevosNumeros = nuevosNumeros.replace(")", "");
        nuevosNumeros = nuevosNumeros.replace(" ", "");
        
        // Separamiento de los numeros, separados por ,
        String[] numerosSeparados = nuevosNumeros.split(",");
        
        /* Solo con fines de testeo
        
        // Visualizacion de los numeros ya separados y ordenados
        System.out.println(Arrays.toString(numerosSeparados));  
        
        
        */
        
        // Variables (contadores para cada tipo de numeros, 1 = Hermosillo, 2 = Guaymas, 3 = Tijuana, 4 = Otros)
        
        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int x4 = 0;
        
        // Loop para comprobar cada numero
        for(int i = 0; i < numerosSeparados.length; i++){
            String posicion = numerosSeparados[i];

            boolean numHMO = posicion.startsWith("662");
            boolean numGMAS = posicion.startsWith("622");
            boolean numTJN = posicion.startsWith("664");
            
            if(numHMO == true){
                x1++;
            } else if(numGMAS == true){
                x2++;
            } else if (numTJN == true){
                x3++;
            } else {
                x4++;
            }
            
        }
        
        System.out.println("Existen "+x1+" numeros de Hermosillo");
        System.out.println("Existen "+x2+" numeros de Guaymas");
        System.out.println("Existen "+x3+" numeros de Tijuana");
        System.out.println("Existen "+x4+" numeros con codigos de areas desconocidas");
        
        // Codigo hecho en clase (ignorar)
        
        /*String nuevaOracion = oracion.replace("o", "x");
        System.out.println(nuevaOracion);
        */
        
        /*boolean resultado = oracion.startsWith("a");
        
        if(resultado){
            System.out.println("Si Inicia con a");
        } else{
            System.out.println("No inicia con a");
        }
        
        ////// 
        //System.out.println(oracion.startsWith("a") ? "Si inicia con a" : "No inicia con a");
        */
        
        
    }
}
