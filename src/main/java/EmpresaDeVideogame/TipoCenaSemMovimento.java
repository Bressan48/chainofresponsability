package padroescomportamentais.chainofresponsability;

public class TipoCenaSemMovimento implements TipoCena {

    private static TipoCenaSemMovimento tipoCenaSemMovimento = new TipoCenaSemMovimento();

    private TipoCenaSemMovimento() {};
    
    public static TipoCenaSemMovimento getTipoCenaSemMovimento() {
        return tipoCenaSemMovimento;
    }

}
