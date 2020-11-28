
/*
* @author Marcos Costa Oliveira
*/

package entities;

public class Moto extends Veiculo{
    private float valorDesconto;

    public Moto(String modelo, String placa, float valorDiaria, float valorDesconto){
        super(placa, modelo, valorDiaria);
        this.valorDesconto = valorDesconto;
    }
    
    public float valorAluguel(int qtdDias){
        return qtdDias * super.getValorDiaria() - (super.getValorDiaria() *qtdDias *valorDesconto/100f);
    }  
}
