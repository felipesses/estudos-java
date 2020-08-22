package exercicios.q02;

public class ContaCorrente {
    int numeroConta;
    int agencia;
    double saldo;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;

    boolean sacar (double valorRetirado) {

        //possui saldo na conta
        if (saldo >= valorRetirado) {
            saldo -= valorRetirado;
            return true;
        } else { //não possui saldo
            if (especial) {
                //verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= valorRetirado) {
                    saldo -= valorRetirado;
                    return true;
                } else
                    return false;
            } else
                return false;
        }

    }

    void depositar (double valorInserido) {
        saldo += valorInserido;
    }


}
