package creational.patterns;

import creational.patterns.abstractFactory.concreteFactories.LgFactory;
import creational.patterns.abstractFactory.concreteFactories.SamsungFactory;
import creational.patterns.abstractFactory.concreteFactories.SonyFactory;
import creational.patterns.abstractFactory.interfaces.AbstractFactoryElectronicDevice;
import creational.patterns.builder.demo.DemoPc;
import creational.patterns.prototype.Producto;
import creational.patterns.prototype.ProductoConcreto;
import java.util.Scanner;

public class CreationalPatterns {

    //Método donde se crea la instancia de un producto concreto (MobilePhone) mediante el factory recibido como parámetro y
    // luego se llama al método paint() del producto concreto generado.
    private static void paintMobile(AbstractFactoryElectronicDevice factory) {
        factory.createMobilePhone().paint();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nPatrones creacionales");
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
                    //Instancias de las fábricas concretas:
                    AbstractFactoryElectronicDevice samsungFactory = new SamsungFactory();
                    AbstractFactoryElectronicDevice sonyFactory = new SonyFactory();
                    AbstractFactoryElectronicDevice lgFactory = new LgFactory();

                    System.out.println("\n=== Llamadas con Samsung Factory ===");
                    paintMobile(samsungFactory);                 //Opción utilizando un método.
                    samsungFactory.createSmartTV().paint();      //Opción sin utilizar un método.

                    System.out.println("\n=== Llamadas con Sony Factory ===");
                    paintMobile(sonyFactory);
                    sonyFactory.createSmartTV().paint();

                    System.out.println("\n=== Llamadas con LG Factory ===");
                    paintMobile(lgFactory);
                    lgFactory.createSmartTV().paint();
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
