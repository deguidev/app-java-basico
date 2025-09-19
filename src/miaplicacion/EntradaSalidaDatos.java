
package miaplicacion;

import java.util.Scanner;

public class EntradaSalidaDatos {
    
    Scanner scanner = new Scanner(System.in);
    
    public void scanner(){
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("tu nombre es: "+ nombre);
        System.out.println("----------------------------------");
    }
    
    public void println(){
        System.out.println("aqui se esta usando println");
        System.out.println("----------------------------------");

    }
}
