
package mascotas;

import java.util.Scanner;


public class Perros {
    
    
    String nombre,raza,color;
    int edad,peso;
    
    Scanner Datos = new Scanner(System.in);
    
    public void Datos () {
            System.out.println("Ingrese los datos de su perro");
            System.out.print("Nombre: ");
            nombre = Datos.next();
            System.out.print("Raza: ");
            raza = Datos.next();
            System.out.print("Color: ");
            color = Datos.next();
            System.out.print("Peso: ");
            peso = Datos.nextInt();
            System.out.print("Edad: ");
            edad = Datos.nextInt();
}
    public void Ficha() {
    System.out.println("----------Veterinaria Bichitos-----------");
    System.out.println("Nombre del perro: " + nombre);
    System.out.println("Raza: " + raza);
    System.out.println("color: " + color);
    System.out.println("Peso: " + peso);
    System.out.println("Edad: " + edad);
    System.out.println("------------------------------------------");
    System.out.println("------------------------------------------");
                    
}
    
    public void Ladridos(){
    
        System.out.print("GUAU GUAU GUAU");
}
            
    
    
    

    
}


