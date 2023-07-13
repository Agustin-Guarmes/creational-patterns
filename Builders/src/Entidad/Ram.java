package Entidad;

public class Ram {
    private String marca;
    private String modelo;
    private String memoria;

    public Ram(String marca, String modelo, String memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }
}
