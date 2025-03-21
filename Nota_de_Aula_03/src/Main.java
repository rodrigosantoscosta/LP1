public class Main {
    public static void main(String[] args) {
        Cavalo c = new Cavalo(1.5f, "branco", "árabe");
        System.out.println("Meu cavalo Rodolfo é " + c.getCor() + " é da raça "
                + c.getRaca() + " e tem " + String.format("%.2f",c.getTamanho()) + " metros de altura.");
        System.out.println("Agora ele vai comer: ");
        c.comer();
        System.out.println("Agora ele está fugindo de um predador: ");
        c.fugir();

        Leao l = new Leao(2.1f, "alaranjado",true);
        System.out.println("\nO leão da selva tem " + String.format("%.2f",l.getTamanho())
                + " de comprimento, " +"é " + c.getCor() + (l.isJuba() ? " e tem juba." : " e não tem juba."));

        System.out.println("O leão agora está caçando um antilope: ");
        l.cacar();
        System.out.println("\nO leão está comendo: ");
        l.comer();

        Cirurgiao cirugiaoCardio = new Cirurgiao(true);
        System.out.println("\n\nPaulo é um cirurgião cardiovascular e " +
                ((cirugiaoCardio.isTrabalhaNoHospital()) ? "atende no hospital." : "não atende no hospital."));
        System.out.println("Ele vai tratar um paciente: ");
        cirugiaoCardio.tratarPaciente();
        System.out.println("Agora vai ter que iniciar uma cirurgia: ");
        cirugiaoCardio.fazerIncisao();

        ClinicoGeral cg = new ClinicoGeral(false, true);
        System.out.println("Roberto é um clinico geral " +
                (cg.isTrabalhaNoHospital() ? "trabalha no hospital" : "não trabalha no hospital") + " e "
                + (cg.isAtendeEmCasa() ? "atende em casa." : "não atende em casa."));

        System.out.println("Um paciente precisa de um remedio com urgencia ");
        cg.receitar();
    }

}