package padroescomportamentais.chainofresponsability;

public class TipoCenaAnimada implements TipoCena {

    private static TipoCenaAnimada tipoCenaAnimada = new TipoCenaAnimada();

    private TipoCenaAnimada() {};
    
    public static TipoCenaAnimada getTipoCenaAnimada() {
        return tipoCenaAnimada;
    }

}
