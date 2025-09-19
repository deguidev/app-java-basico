
package miaplicacion;

import java.util.Scanner;

public class MiAplicacion {
    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.println("Bienvenidos a mi Aplicación");
        System.out.println("-------------MENU-----------");
        System.out.println("1. Entrada y salida de satos");
        System.out.println("2. Tipos de Datos");
        System.out.println("3. Operadores en Java");
        System.out.println("4. Estructuras de control");
        System.out.println("5. Manejo de Arreglos y Colecciones");
        System.out.println("6. Piedra, Papel o Tijera");
        System.out.println("7. Sorpendan al Profe");
        System.out.println("-----------------------------");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Porfavor seleccione una opción: ");
        int opcion = scanner.nextInt();
        
        switch(opcion){
            case 1: 
                System.out.println("Bienvenidos a Entrada y salida de datos");
                EntradaSalidaDatos esd = new EntradaSalidaDatos();
                esd.scanner();
                esd.println();
                break;
            case 2:
                System.out.println("Bienvenidos a Tipos de Datos");
                break;
            case 3:
                System.out.println("Bienvenidos a Operadores en Java");
                break;
            case 4:
                System.out.println("Bienvenidos a Estructuras de control");
                EstructuraControl ec = new EstructuraControl();
                ec.bucleFor();
                break;
            case 5:
                System.out.println("Bienvenidos a Estructuras de control");
                ArregloColecciones ac = new ArregloColecciones();
                ac.arreglo();
            
            case 6:
                System.out.println("Bienvenidos Piedra, Papel o Tijera");
                
            default:
                System.out.println("Opción Invalidad");
        }
    }
}
