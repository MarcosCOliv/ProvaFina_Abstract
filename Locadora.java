/*
* @author Marcos Costa Oliveira
*/

package entities;

public class Locadora {
    public static void main(String[] args) {
        Veiculo estoque[];

        estoque = new Veiculo[5];

        estoque[0] = new Carro("Celta", "AAA 2541", 50f);
        estoque[1] = new Moto("Ronda", "BBB 2551", 20f, 5f);
        estoque[2] = new Moto("POP", "HHH 0548", 15f, 3f);
        estoque[3] = new Carro("Savero", "JDK 5896", 60f);
        estoque[4] = new Carro("Palio", "HSZ 5463", 45f);

        for (Veiculo v: estoque){
            System.out.println("Veiculo v = " + v.getModelo() + " / Aluguel = R$ " + v.valorAluguel(5));
        }
    }
}
