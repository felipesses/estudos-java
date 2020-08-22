package exercicios.q01;

public class Lampada {

    boolean ligada;

    void ligar() {
        System.out.println("A lâmpada foi ligada");
        ligada = true;
    }

    void desligar() {
        System.out.println("A lâmpada foi desligada");
        ligada = false;
    }

    void mostrarEstado() {
        if (ligada)
            System.out.println("A lâmpada está ligada");
        else
            System.out.println("A lâmpada está desligada");
    }

    void mudarEstado() {
        if (ligada)
            desligar();
        else
            ligar();
    }


}
