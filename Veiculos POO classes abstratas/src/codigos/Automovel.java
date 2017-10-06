package codigos;

import javax.swing.JOptionPane;

public class Automovel extends Veiculo{
    private String placa;
    private String combustivel;
    
    public Automovel(String combustivel, int potencia, String cor, String placa) {
        super(potencia, placa);
        this.placa = placa;
        this.combustivel = combustivel;
    }

    @Override
    public void abastecerCombustivel(float quantidade) {
        JOptionPane.showMessageDialog(null, "abastecendo com" + combustivel);
    }

    @Override
    public String toString() {
        return  "Placa: " + placa + ", Combustvíel: " + combustivel + super.toString() + "\n_______\n";
    }

    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}
