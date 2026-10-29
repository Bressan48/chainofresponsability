package padroescomportamentais.chainofresponsability;

public class TipoCenaSemModelo implements TipoCena {

    private static TipoCenaSemModelo tipoCenaSemModelo = new TipoCenaSemModelo();

    private TipoCenaSemModelo() {};

    public static TipoCenaSemModelo getTipoCenaSemModelo() {
        return tipoCenaSemModelo;
    }
}
