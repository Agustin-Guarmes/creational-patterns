package BuilderPc;

import Entidad.*;

public interface Builder {
    void setTipo(String tipo);
    void setProcesador(Procesador cpu);
    void setRam(Ram ram);
    void SetPlacaVideo(PlacaVideo placaVideo);
    void setPsu(Psu psu);
    void setPlacaMadre(PlacaMadre placaMadre);
}
