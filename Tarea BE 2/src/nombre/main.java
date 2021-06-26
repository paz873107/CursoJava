package nombre;
import java.util.Scanner;
public class main {
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    String nombre,apellido,edad,hobby,editor,so;
    System.out.println("Ingrese su nombre:");
    nombre=teclado.nextLine();
    System.out.println("Ingrese su apellido:");
    apellido=teclado.nextLine();
    System.out.println("Ingrese su edad:");
    edad=teclado.nextLine();
    System.out.println("Ingrese su hobby:");
    hobby=teclado.nextLine();
    System.out.println("Ingrese su editor de texto preferido:");
    editor=teclado.nextLine();
    System.out.println("Ingrese su Sistema Operativo:");
    so=teclado.nextLine();
    System.out.println("Tu nombre completo es: "+nombre+apellido+", tu edad es: "+edad+", tu hobby es: "+hobby+
            ", tu editor de texto preferido es: "+editor+", el sistema operativo que utilizas es: "+so);
    }
}
