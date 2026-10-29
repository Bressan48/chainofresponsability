package padroescomportamentais.chainofresponsability;

public class Cena {

    private TipoCena tipoCena;

    public Cena(TipoCena tipoCena) {
        this.tipoCena = tipoCena;
    }
    
    public TipoCena getTipoCena() {
        return tipoCena;
    }

    public void setTipoCena(TipoCena tipoCena) {
        this.tipoCena = tipoCena;
    }
    
}
