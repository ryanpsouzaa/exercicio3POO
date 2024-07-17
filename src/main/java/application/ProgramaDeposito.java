package application;

import entities.DepositoProduto;
import entities.Produto;
import entities.ProdutoEstoque;
import entities.ProdutoVendido;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaDeposito {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner resp = new Scanner(System.in);

        DepositoProduto listaProdutos = new DepositoProduto();
        Produto teste = new ProdutoEstoque("a","a",120.00,2);
        System.out.println(teste);
        System.out.println("////////////////////////");
    }
}