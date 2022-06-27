
import java.time.LocalDateTime;

public class Pedido {
    private String Cliente;
    LocalDateTime data;
    private Orcamento orcamento;

    public Pedido(String cliente, LocalDateTime data, Orcamento orcamento) {
        Cliente = cliente;
        this.data = data;
        this.orcamento = orcamento;
    }

    public String getCliente() {
        return Cliente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }
}
