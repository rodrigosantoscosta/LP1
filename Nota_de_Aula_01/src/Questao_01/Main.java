package Questao_01;

import java.util.Scanner;

public class Main {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();
        System.out.print("Digite o nome do aluno: ");
        a.setNome(sc.next());

        System.out.print("Digite a primeira nota do aluno: ");
        a.setNota1(sc.nextFloat());

        System.out.print("Digite a segunda nota do aluno: ");
        a.setNota2(sc.nextFloat()) ;

        System.out.print("Digite a terceira nota do aluno: ");
        a.setNota3(sc.nextFloat());

        float nota1 = a.getNota1(); float nota2  = a.getNota2(); float nota3 = a.getNota3();
        String nome = a.getNome();

        System.out.println("O aluno " + nome + " está " + a.statusAcademico(nota1, nota2, nota3));
    }
}
