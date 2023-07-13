package Entidad;

public class Psu {
    private String Marca;
    private String modelo;

    public Psu(String marca, String modelo) {
        Marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
