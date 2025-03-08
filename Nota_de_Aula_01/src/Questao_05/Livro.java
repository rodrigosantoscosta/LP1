package Questao_05;
import java.util.ArrayList;
import java.util.Scanner;

public class Livro {
    private String titulo, autor;
    boolean emprestado;
    Usuario quemEstaComOlivro;
    private static ArrayList<Livro> listaDelivros = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
        this.quemEstaComOlivro = null;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public Usuario getQuemEstaComOlivro(){
        return quemEstaComOlivro;
    }

}
