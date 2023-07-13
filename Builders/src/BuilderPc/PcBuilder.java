package BuilderPc;

import Entidad.*;



public class PcBuilder implements Builder{
    private String tipo;
    private Procesador cpu;
    private Ram ram;
    private PlacaVideo placaVideo;
    private Psu psu;
    private PlacaMadre placaMadre;
    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setProcesador(Procesador cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setRam(Ram ram) {
        this.ram = ram;
    }

    @Override
    public void SetPlacaVideo(PlacaVideo placaVideo) {
        this.placaVideo = placaVideo;
    }

    @Override
    public void setPsu(Psu psu) {
        this.psu = psu;
    }

    @Override
    public void setPlacaMadre(PlacaMadre placaMadre) {
        this.placaMadre = placaMadre;
    }
    public Computadora getResult(){
        return new Computadora(tipo,cpu,ram,placaVideo,psu,placaMadre);
    }
}
