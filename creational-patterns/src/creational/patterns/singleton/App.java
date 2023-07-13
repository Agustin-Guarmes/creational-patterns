package creational.patterns.singleton;

public class App {
    public static void main(String[] args) {
        ConexionBd conexionBd = ConexionBd.getInstance();
        System.out.println(conexionBd.conectar());
        System.out.println(conexionBd.desconectar());
        ConexionBd conexionBd1 = ConexionBd.getInstance();
        // Si debugueamos la linea 5 y 9, notaremos que ambas conexiones hacen referencia a la misma instancia en memoria.
    }
}
