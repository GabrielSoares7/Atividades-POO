package codigos;

import javax.swing.JOptionPane;

public class Aviao extends Veiculo {
    private int pesoMax;
    private int codigo;

    public Aviao(int potencia, String cor, int pesoMax) {
        super(potencia, cor);
        this.pesoMax = pesoMax;
    }
    
    public Aviao(int potencia, String cor, int pesoMax, int cod) {
        super(potencia, cor);
        this.pesoMax = pesoMax;
        codigo = cod;
    }
    @Override
    public void abastecerCombustivel(float quantidade) {
        JOptionPane.showMessageDialog(null, "O avião foi abastecido com 30 Kg de combustível");
    }

    @Override
    public String toString() {
        return "Avião código: " + codigo + "\nPeso máximo: " + pesoMax + super.toString() + "\n_______\n" ;
    }

    public int getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
