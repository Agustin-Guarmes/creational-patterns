package creational.patterns;

import creational.patterns.builder.demo.DemoPc;
import creational.patterns.prototype.Producto;
import creational.patterns.prototype.ProductoConcreto;
import java.util.Scanner;

public class CreationalPatterns {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("Patrones creacionales");
            System.out.println("1: Factory Method");
            System.out.println("2: Abstract Factory");
            System.out.println("3: Builder");
            System.out.println("4: Prototype");
            System.out.println("5: Singleton");
            System.out.println("0: Salir");
            option = input.nextInt();

            switch (option) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                      DemoPc demo = new DemoPc();
                      demo.run();
                    break;
                case 4:
                    Producto producto1 = new ProductoConcreto("Producto A", 100);
                    Producto producto2 = new ProductoConcreto("Producto B", 200);

                    Producto productoClonado1 = producto1.clonar();
                    Producto productoClonado2 = producto2.clonar();

                    productoClonado1.mostrarInfo();
                    productoClonado2.mostrarInfo();
                    break;
                case 5:

                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion inválida");
            }
        } while (option != 0);

    }

}
