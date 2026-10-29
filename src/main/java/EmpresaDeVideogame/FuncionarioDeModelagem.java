package padroescomportamentais.chainofresponsability;

public class FuncionarioDeModelagem extends Funcionario {
    
    public FuncionarioDeModelagem(Funcionario superior) {
        listaCenas.add(TipoCenaAnimada.getTipoCenaAnimada());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Modelagem";
    }
}
