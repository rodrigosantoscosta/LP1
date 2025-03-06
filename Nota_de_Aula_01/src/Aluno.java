public class Aluno {
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }
    float nota1,nota2,nota3;
    public float calculaMedia(float nota1, float nota2, float nota3){
        float media;
        media = (nota1 + nota2) / 2;
        return media;
    }

    public void statusAcademico(Aluno a){
        float media = a.calculaMedia(nota1, nota2, nota3);
        if (media >= 70.0){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}
