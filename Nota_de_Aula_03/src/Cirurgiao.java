public class Cirurgiao extends Medico {
    public Cirurgiao(boolean trabalhaNoHospital){
        super(trabalhaNoHospital);
    }

    public void tratarPaciente() {
        System.out.println("O cirurgião está tratando um paciente~~");
    }

    public void fazerIncisao() {
        System.out.println("Fazendo uma incisão~~");
    }


}
