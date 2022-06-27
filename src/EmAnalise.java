import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento{

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    public void aprovar(Orcamento orcamento){
        orcamento.setSitucao(new Aprovado());
    }

    public void reprovar(Orcamento orcamento){
        orcamento.setSitucao(new Reprovado());
    }

}
