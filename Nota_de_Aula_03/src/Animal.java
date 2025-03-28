public class Animal {
    protected double tamanho;
    protected String cor;

    public Animal(double tamanho, String cor){
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void comer(){
        System.out.println("Nham nham comendo~~");
    }

}
