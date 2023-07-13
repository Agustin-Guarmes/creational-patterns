package creational.patterns.prototype;

public class ProductoConcreto implements Producto {

    private String nombre;
    private int precio;

    public ProductoConcreto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public Producto clonar() {
        return new ProductoConcreto(this.nombre, this.precio);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Producto - Nombre: " + nombre + ", Precio: " + precio);
    }
}