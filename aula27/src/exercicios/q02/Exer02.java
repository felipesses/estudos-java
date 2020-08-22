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
            System.out.println("Saque efetuado com sucesso, novo valor: " + conta.saldo);
        else
            System.out.println("Saldo insuficiente");

        conta.depositar(20);
        System.out.println("Depósito realizado com sucesso, novo valor: " + conta.saldo);


    }
}
