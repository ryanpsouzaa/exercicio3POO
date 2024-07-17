package entities;

public class ProdutoEstoque extends Produto{
    private int quantidade;

    public ProdutoEstoque(){
    }
    public ProdutoEstoque(String nome, String marca, double preco, int quantidade){
        super(nome, marca, preco);
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }


    @Override
    public String toString(){
        return super.toString() +  ", Quantidade: " + getQuantidade();
    }
}
