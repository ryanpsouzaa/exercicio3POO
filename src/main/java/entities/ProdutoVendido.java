package entities;

import java.time.LocalDate;

public class ProdutoVendido extends Produto{
    private LocalDate dataVenda;
    private String enderecoEntrega;
    private String nomeCliente;

    public ProdutoVendido(String nome, String marca, double preco, LocalDate dataVenda,
                          String enderecoEntrega, String nomeCliente){
        super(nome,marca,preco);
        this.dataVenda = dataVenda;
        this.enderecoEntrega = enderecoEntrega;
        this.nomeCliente = nomeCliente;

    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    @Override
    public String toString() {
        return super.toString() +  ", Cliente: " + getNomeCliente() +
                ", Data da venda: " + getDataVenda() +
                ", Endereço de entrega: " + getEnderecoEntrega();
    }

}
