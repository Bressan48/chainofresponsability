package padroescomportamentais.chainofresponsability;

public class FuncionarioDiretor extends Funcionario {

    public FuncionarioDiretor(Funcionario superior) {
        listaCenas.add(TipoCenaSemModelo.getTipoCenaSemModelo());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Diretor";
    }

}
