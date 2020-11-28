
package entities;

public interface IVeiculo {
    float valorAluguel(int qtdDias);

    String getPlaca();

    String getModelo();

    float getValorDiaria();
    
}
