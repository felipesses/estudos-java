package exercicios.q05;

public class Exer05 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();


        conta.agencia = 0073;
        conta.numeroConta = 1234;
        conta.especial = true;
        conta.saldo = 100.00;

        System.out.println("Saldo da conta: " + conta.saldo);

    }
}
