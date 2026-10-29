package padroescomportamentais.chainofresponsability;

public class TipoCenaNoPapel implements TipoCena {

    private static TipoCenaNoPapel tipoCenaNoPapel = new TipoCenaNoPapel();

    private TipoCenaNoPapel() {};

    public static TipoCenaNoPapel getTipoCenaNoPapel() {
        return tipoCenaNoPapel;
    }
}
