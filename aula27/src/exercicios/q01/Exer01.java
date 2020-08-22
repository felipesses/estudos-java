package exercicios.q01;

public class Exer01 {
    public static void main(String[] args){
        Lampada lampada = new Lampada();

        lampada.ligar();
        lampada.desligar();

        lampada.mostrarEstado();

        lampada.mudarEstado();
    }
}
