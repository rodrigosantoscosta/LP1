package Questao_03;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public void adicionarEstoque(int qtd){
        quantidade = quantidade + qtd;
    }

    public int exibirEstoque(){
        return quantidade;
    }

    public void venderProduto(int qtd){
        quantidade = quantidade - qtd;
    }
}
