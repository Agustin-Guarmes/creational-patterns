package Entidad;

public class Computadora {
    private String tipo;
    private Procesador cpu;
    private Ram ram;
    private PlacaVideo placaVideo;
    private Psu psu;
    private PlacaMadre placaMadre;

    public Computadora(String tipo, Procesador cpu, Ram ram, PlacaVideo placaVideo, Psu psu, PlacaMadre placaMadre) {
        this.tipo = tipo;
        this.cpu = cpu;
        this.ram = ram;
        this.placaVideo = placaVideo;
        this.psu = psu;
        this.placaMadre = placaMadre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Procesador getCpu() {
        return cpu;
    }

    public void setCpu(Procesador cpu) {
        this.cpu = cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public PlacaVideo getPlacaVideo() {
        return placaVideo;
    }

    public void setPlacaVideo(PlacaVideo placaVideo) {
        this.placaVideo = placaVideo;
    }

    public Psu getPsu() {
        return psu;
    }

    public void setPsu(Psu psu) {
        this.psu = psu;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public void setPlacaMadre(PlacaMadre placaMadre) {
        this.placaMadre = placaMadre;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "tipo='" + tipo + '\'' +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", placaVideo=" + placaVideo +
                ", psu=" + psu +
                ", placaMadre=" + placaMadre +
                '}';
    }
}
