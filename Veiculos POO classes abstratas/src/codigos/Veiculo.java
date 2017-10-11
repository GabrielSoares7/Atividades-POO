package codigos;

public abstract class Veiculo implements Acao{
    int potencia;
    String cor;
    
    public Veiculo(int potencia, String cor) {
        this.potencia = potencia;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Potência: " + potencia + ", Cor: " + cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public abstract void abastecerCombustivel(float quantidade);
}
