package padroescomportamentais.chainofresponsability;

public class FuncionarioDeAnimacao extends Funcionario {

    public FuncionarioDeAnimacao(Funcionario superior) {
        listaCenas.add(TipoCenaNoPapel.getTipoCenaNoPapel());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Animação";
    }

}
