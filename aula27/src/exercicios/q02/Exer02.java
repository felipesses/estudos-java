package exercicios.q02;

public class Exer02 {
    public static void main(String[] args){
        ContaCorrente conta = new ContaCorrente();

        conta.agencia = 0073;
        conta.numeroConta = 240824;
        conta.saldo = 200;
        conta.especial = true;
        conta.limiteEspecial = 500;

        boolean saqueEfetuado = conta.sacar(30);

        if (saqueEfetuado)
            conta.consultarSaldo();
        else
            System.out.println("Saldo insuficiente");

        conta.depositar(20);
        conta.consultarSaldo();

        if (conta.verificarChequeEspecial())
            System.out.println("Está usando cheque especial");
        else
            System.out.println("Não está usando cheque especial");
    }
}
