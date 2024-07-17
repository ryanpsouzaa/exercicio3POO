package entities;

import java.util.Objects;

public class Produto {
    private String nome;
    private String marca;
    private double preco;
    private boolean statusVenda;

    public Produto(){
        this("","",0.0);
    }
    public Produto(String nome, String marca, double preco){
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean getStatusVenda(){
        return this.statusVenda;
    }

    public void setStatusVenda(boolean statusVenda){
        this.statusVenda = statusVenda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(nome, produto.nome) && Objects.equals(marca, produto.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, marca);
    }
    @Override
    public String toString(){
        return "Nome: " + getNome() +
                ", Marca: " + getMarca() +
                ", Preço: " + String.format("%.2f", getPreco());
    }
}
