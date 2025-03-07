package Questao_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();

        p.setNome("batata");
        System.out.println("O nome do produto é " + p.getNome());

        System.out.println("O estoque atual de " + p.getNome() + " é de " + p.exibirEstoque());
        p.adicionarEstoque(5);

        System.out.println("Agora depois de adicionar unidades de " + p.getNome() + " o estoque atual é de " + p.exibirEstoque());

        p.venderProduto(3);
        System.out.println("Após a venda o estoque atual é " + p.exibirEstoque());
    }
}
