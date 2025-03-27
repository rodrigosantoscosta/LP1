package Questao_01;

public class Aluno {
    private String nome;

    private float nota1,nota2,nota3;

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }



    public float calculaMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String statusAcademico() {
        float media = calculaMedia();
        if (media >= 70.0) {
            return "aprovado";
        } else if (media < 40.0) {
            return "reprovado";
        } else {
            return "na final";
        }
    }

    /*Não sei aonde estava com a cabeça fazendo isso*/

//    public float calculaMedia(float nota1, float nota2, float nota3){
//        float media;
//        media = (nota1 + nota2 + nota3) / 3;
//        return media;
//    }
//
//    public String statusAcademico(float nota1, float nota2, float nota3){
//        float media = calculaMedia(nota1, nota2, nota3);
//        if (media >= 70.0){
//            return ("aprovado");
//        }else if (media < 40.0){
//            return ("reprovado");
//        }else{
//            return ("na final");
//        }
//    }
}
