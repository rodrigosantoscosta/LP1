package Questao_04;

public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double consultaSaldo(){
        return saldo;
    }

    public void depositar(double deposito){
        saldo = saldo + deposito;
    }

    public void sacar(double saque){
        if (saldo > 0 ){
            saldo = saldo - saque;
        }else{
            System.out.println("Saldo zerado");
        }
    }

    public void transferir(double transferencia){
        if (saldo > 0) {
            saldo = saldo - transferencia;
        }else{
            System.out.println("Saldo zerado");
        }
    }
}
