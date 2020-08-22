package sample;

public class TesteCarro {

    public static void main(String[] args){
        Carro van = new Carro();

        van.consumoCombustivel = 0.2;
        van.capCombustivel = 100;

        double autonomia = van.obterAutonomia();
        System.out.println(autonomia);



    }
}
