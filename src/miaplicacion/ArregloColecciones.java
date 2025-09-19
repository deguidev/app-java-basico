package miaplicacion;

import java.util.Random;

public class ArregloColecciones {
    
    
    Random random = new Random();
    
    public void arreglo(){
        int[] numeros = {1,2,3,5,4,5,7,8,2};
        String[] frutas = {"Manzana", "Pera", "Naranja"};
        Object[] datosPersona = {"Diego Lipa", 30, true };
        
        System.out.println("--------------------------------------");
        String[] opciones = {"Piedra","Papel","Tijera"};
        int numeroRandom = random.nextInt(3) + 1;
        System.out.println("Sistema: " + opciones[numeroRandom -1]);
        System.out.println("--------------------------------------");
        
        for(int i = 0;i <= frutas.length-1; i++ ){
            System.out.println(frutas[i]);
        }
        System.out.println("--------------------------------------");
    }
}
