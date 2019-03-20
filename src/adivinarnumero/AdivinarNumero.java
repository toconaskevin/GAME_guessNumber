/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinarnumero;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AdivinarNumero {
    
    
     //CONSTRUCTOR
    public AdivinarNumero(int valorIntento, int valorAdivinar){
        
    }
    

    public static void main(String[] args) {
         // PRESENTACION DEL JUEGO
        System.out.println("Bienvenidos al juego 'Adivinar Numero'.");
        System.out.println("Este juego necesita de dos usuarios diferentes. "
                 + "El primero debe ingresar, en numeros, la cantidad de"
                 + " intentos posibles para el rival, asi como tambien el"
                 + " numero a adivinar.");
        System.out.println("Que se diviertan!");
         
         // CREAR VARIABLE SCANNER PARA INGRESO DE DATOS
         Scanner entrada = new Scanner(System.in);
         
         //PEDIMOS INGRESO DE DATOS ESTRUCTURA DE CONTROL WHILE
        System.out.println("Ingrese el numero que el rival debera adivinar.");
        int valorAdivinar = entrada.nextInt();
        System.out.println("Ingrese la cantidad de intentos posibles para el "
                 + "rival.");
        int valorIntento = entrada.nextInt();
        
         //INFORMAMOS POR PANTALLA AL USUARIO
        System.out.println("Es hora de que el segundo usuario tenga la posibi"
                + "lidad de adivinar el numero que usted ingreso.");
        System.out.println("POR FAVOR, CEDA EL TECLADO AL SEGUNDO USUARIO.");
        System.out.println("Usted tiene " + valorIntento + " intentos.");
        
         // CREAMOS UN CONTADOR cantIntento COMO VARIABLE DE CORTE PARA WHILE
        int cantIntento = 0;
        while (cantIntento<valorIntento){
            System.out.println("Adivine el numero que su rival ingreso");
            int intentoAdiv = entrada.nextInt();
            
             //COMPARAMOS LOS NUMEROS INGRESADOS POR AMBOS USUARIOS. SI COINCIDE
             //DAMOS UN MENSAJE Y FINALIZA LA EJECUCION DE LA APLICACION.
            if (intentoAdiv==valorAdivinar){
                    System.out.println("ADIVINASTE! El numero que el rival "
                            + "ingreso es el " + valorAdivinar +".");
                    break;
            }
            
                 //SI NO COINCIDEN LOS NUMEROS INGRESADOS POR AMBOS USUARIOS SE
                 //IMPRIME UN MENSAJE POR PANTALLA Y AGREGA +1 A cantIntento.
                else {
                    System.out.println("Numero incorrecto.");
                    
                    cantIntento++;
                }
        }
        
         //ESTO SUCEDE CUANDO LOS INTENTOS SE ACABAN Y EL SEGUNDO USUARIO NO
         //LOGRA ADIVINAR EL NUMERO LUEGO DE HABER AGOTADO LA CANTIDAD DE
         //INTENTOS MAXIMOS.
        if (cantIntento==valorIntento){
            System.out.println("PERDISTE!. Agotaste todos tus intentos. El "
                    + "numero a adivinar era el " + valorAdivinar + "."
                            + "");
        }
                
    }
    
}
