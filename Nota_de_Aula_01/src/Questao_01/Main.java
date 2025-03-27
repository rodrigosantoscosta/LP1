package Questao_01;

import java.util.Scanner;

public class Main {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();
        System.out.print("Digite o nome do aluno: ");
        a.setNome(sc.nextLine());

        System.out.print("Digite a primeira nota do aluno: ");
        a.setNota1(sc.nextFloat());

        System.out.print("Digite a segunda nota do aluno: ");
        a.setNota2(sc.nextFloat()) ;

        System.out.print("Digite a terceira nota do aluno: ");
        a.setNota3(sc.nextFloat());

        //System.out.println("O aluno " + a.getNome() + " está " + a.statusAcademico(a.getNota1(), a.getNota2(), a.getNota3()));
        System.out.println("O aluno " + a.getNome() + " está " + a.statusAcademico());
        sc.close();
    }
}
