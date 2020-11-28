/*
* @author Marcos Costa Oliveira
*/
package entities;

//classe abstrata implementa a Interface Veiculos
//fazendo um contrato com a interface
//abstração utilizada para ter um tipo generico
public abstract class Veiculo implements IVeiculo{
    private String placa;
    private String modelo;
    private float valorDiaria;
   
    //construtor
    public Veiculo(String placa, String modelo, float valorDiaria ){
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
        
    }

    //Gets e Sets
    public String getPlaca(){
        return placa;
    }

    public String getModelo(){
        return modelo;
    }

    public float getValorDiaria(){
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria){
        this.valorDiaria = valorDiaria;
    }

    //mehtodo calculo valor do aluguel
    @Override
    public abstract float valorAluguel(int qtdDias);
    //metodos abstratos, sao herdados e obrigam aos filhos a porem logicas no metodo
}
