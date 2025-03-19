import java.util.ArrayList;
import java.util.Objects;
public class Produto {
    private String codigo, nome, cor;
    private double peso;

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    private double tamanho;
    private double valor;

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    private int quantidadeEstoque;

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

//    public static ArrayList<Produto> listaProdutos = new ArrayList<>();

    public Produto(){

    }

    public Produto(String codigo, String nome, double valor){
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static void exibirListaProdutos(ArrayList<Produto> listaProdutos) {
        if (!listaProdutos.isEmpty()) {
            for (Produto p : listaProdutos) {
                System.out.println("=======================================");
                System.out.println("|  CÓDIGO  |       NOME       | QTD  |");
                System.out.println("=======================================");
                System.out.printf("| %-8s | %-15s | %-4d |\n", p.getCodigo(), p.getNome(), p.getQuantidadeEstoque());
                System.out.println("=======================================");
            }
        }
    }


    public static void adicionarEstoque(int quantidadeAdicionada, String codigoProduto, ArrayList<Produto> listaProdutos){

        Produto produtoAdicionado = null;
        for (Produto p : listaProdutos) {
            if(Objects.equals(p.getCodigo(), codigoProduto)) {
                produtoAdicionado = p;
                break;
            }
        }

        if(produtoAdicionado == null){
            System.out.println("Erro: Código de produto não existe em estoque!");
        }else produtoAdicionado.setQuantidadeEstoque(produtoAdicionado.getQuantidadeEstoque() + quantidadeAdicionada);


    }

}