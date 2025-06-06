package Marcos_20200209;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Producto demo = new Producto();

        System.out.println("Bienvenido al negocio, Elgige una de las opciones: ");
        System.out.println("1. Agregar un producto");
        System.out.println("2. Mostrar los productos");
        System.out.println("3. Eliminar un producto");
        System.out.println("4. Salir del sistema");

        Scanner sc = new Scanner(System.in);
         int eleccion = sc.nextInt();

        switch (eleccion) {
             case 1:
                 System.out.println("ingrese el nombre del producto que desea agregar");
                 Scanner sc2 = new Scanner(System.in);
                 String nameProducto = sc2.nextLine();
                 System.out.println("El producto se agregó correctamente");
                 break;
             case 2:
                 System.out.println("Estos Son los productos disponibles: ");
                 System.out.println("");
                 break;
             case 3:
                 System.out.println("Ingrese el ID del producto que desea eliminar");
                 Scanner sc3 = new Scanner(System.in);
                 int idProducto = sc3.nextInt();
                 break;
             case 4:
                System.out.println("Tenga un buen día :)");
                System.exit(0);
                break;
             default:
                 System.out.println("Porfavor ingrese una opción valida");
                 break;


         }


    }
}