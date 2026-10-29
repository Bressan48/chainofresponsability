package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listaCenas = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }
    
    public abstract String getDescricaoCargo();
    
    public String aprovarCena(Cena cena) {
        if (listaCenas.contains(cena.getTipoCena())) {
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.aprovarCena(cena);
            }
            else 
            {
                return "Sem aprovação";
            }
        }        
    }
}
