package sample;

public class TesteCarro {
    public static void main(String[] args){
        Carro van = new Carro();

        van.consumoCombustivel = 0.2;
        van.capCombustivel = 100;

        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel15 = van.calcularCombustivel(15);

        System.out.println("QTD COMBUSTIVEL 10 -> " + qtdCombustivel10);
        System.out.println("QTD COMBUSTIVEL 15 -> " + qtdCombustivel15);

    }
}
