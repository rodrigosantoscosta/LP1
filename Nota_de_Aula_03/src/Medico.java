public class Medico {
    protected boolean trabalhaNoHospital;

    public Medico(boolean trabalhaNoHospital) {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }

    public boolean isTrabalhaNoHospital() {
        return trabalhaNoHospital;
    }

    public void setTrabalhaNoHospital(boolean trabalhaNoHospital) {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }


    public void tratarPaciente(){
        System.out.println("Tratando paciente~~");
    }
}
