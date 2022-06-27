import java.math.BigDecimal;

public class CalculadoreDeDesconto {
    public BigDecimal calcular(Orcamento orcamento) {

        Desconto cadeiaDeDescontos = new DescontoMaisItens(new DescontoMaiorValor(new SemDesconto()));

        return cadeiaDeDescontos.calcular(orcamento);
    }
}
