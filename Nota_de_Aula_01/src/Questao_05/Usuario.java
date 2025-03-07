package Questao_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    String nome; int id;
    private static ArrayList<Usuario> listaDeUsuarios = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

}
