package heranca;

import javax.swing.JOptionPane;

public class Projetor extends Equipamento {
    
    private boolean hdmi;
    
    public Projetor(String cod, String descricao, float valorDiaria) {
        super(cod, descricao, valorDiaria);
        addInfo();
    }
    
    private void addInfo() {
        int op = JOptionPane.showConfirmDialog(null, "O projetor possui saída HDMI?");
        if(op == 0)
            hdmi = true;
        else
            hdmi = false;
    }
    
    public float calcularPreco(int nDias) {
        int op = JOptionPane.showConfirmDialog(null, "O projetor está sendo alugado com um computador?");
        if(op == 0)
            return (getValorDiaria() / 2) * nDias;
        else
            return getValorDiaria() * nDias;
    }

    @Override
    public String toString() {
        if(hdmi == true) {
            return "Projetor HDMI" + "\n_______\n";
        }
        else
            return "Projetor sem HDMI" + "\n________\n";
    }
    
    public boolean isHdmi() {
        return hdmi;
    }

    public void setHdmi(boolean hdmi) {
        this.hdmi = hdmi;
    }
    
}