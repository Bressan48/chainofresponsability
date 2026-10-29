package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CenaTest {

    FuncionarioDiretor diretor;
    FuncionarioDeAnimacao animacao;
    FuncionarioDeModelagem modelagem;

    @BeforeEach
    void setUp() {
        diretor = new FuncionarioDiretor(null);
        animacao = new FuncionarioDeAnimacao(diretor);
        modelagem = new FuncionarioDeModelagem(animacao);
    }

    @Test
    void deveRetornarModelagemParaAprovacaoCenaAnimada() {
        assertEquals("Modelagem", modelagem.aprovarCena(new Cena(TipoCenaAnimada.getTipoCenaAnimada())));
    }

    @Test
    void deveRetornarAnimacaoParaAprovacaoCenaNoPapel() {
        assertEquals("Animação", modelagem.aprovarCena(new Cena(TipoCenaNoPapel.getTipoCenaNoPapel())));
    }

    @Test
    void deveRetornarDiretorParaAprovacaoCenaSemModelo() {
        assertEquals("Diretor", modelagem.aprovarCena(new Cena(TipoCenaSemModelo.getTipoCenaSemModelo())));
    }

    @Test
    void deveRetornarSemAprovacaoParaAprovacaoCenaSemMovimento() {
        assertEquals("Sem aprovação", modelagem.aprovarCena(new Cena(TipoCenaSemMovimento.getTipoCenaSemMovimento())));
    }

}
