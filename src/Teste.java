import java.math.BigDecimal;
import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {
    String cliente = "Rodrigo";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GerarPedido gerador = new GerarPedido(cliente, valorOrcamento, quantidadeItens);
        GerarPedidoHandler handler = new GerarPedidoHandler(Arrays.asList(new SalvarPedidoBancoDados(),
                new EnviarEmailPedido()
        ));

        handler.executa(gerador);

    }
}
