package entities;

import exception.ProdutoNaoEncontradoException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DepositoProduto {
    private List<Produto> listaProduto;

    public DepositoProduto(){
        this.listaProduto = new ArrayList<>();
    }

    public List<Produto> getListaProduto(){
        return this.listaProduto;
    }
    public void adicionarProduto(Produto produtoElemento){
        this.listaProduto.add(produtoElemento);
    }
    public void removerProduto(Produto produtoElemento){
        this.listaProduto.remove(produtoElemento);
    }
    public List<Produto> listarProdutosVendidos(){
        List<Produto> listaVendidos = new ArrayList<>();
        for(Produto p : this.listaProduto){
            if(p.getStatusVenda()){
                listaVendidos.add(p);
            }
        }
        return listaVendidos;
    }

    public List<Produto> listarProdutosEstoque(){
        List<Produto> listaEstoque = new ArrayList<>();
        for(Produto p : this.listaProduto){
            if(!p.getStatusVenda()){
                listaEstoque.add(p);
            }
        }
        return listaEstoque;
    }
    public Produto consultarProduto(String nome){
        for(Produto p : this.listaProduto){
            if(p.getNome().equalsIgnoreCase(nome)){
                return p;
            }
        }
        throw new ProdutoNaoEncontradoException("Produto não encontrado");

    }
    public void vendaDeProduto(String nome, String entrega, String cliente){
        for(Produto p : this.listaProduto){
            if(p.getNome().equalsIgnoreCase(nome)){
                LocalDate data = LocalDate.now();
                String nomeProduto = p.getNome();
                String marca = p.getMarca();
                double preco = p.getPreco();

                removerProduto(p); // removendo produto antigo para add o novo
                Produto produtoVendido = new ProdutoVendido(nomeProduto, marca, preco, LocalDate.now(),entrega,cliente);

            }
        }
    }

}
