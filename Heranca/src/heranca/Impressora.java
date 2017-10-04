package heranca;

import javax.swing.JOptionPane;

public class Impressora extends Equipamento{
    private boolean jato;
    
    public Impressora(String cod, String descricao, float valorDiaria) {
        super(cod, descricao, valorDiaria);
        addInfo();
    }

    @Override
    public String toString() {
        if(jato == true) 
            return "Impressora jato de tinta\n"+ getDescricao() + "Valor da diaria: " + getValorDiaria() +"\n________\n";
        else
            return "Impressora a Laser\n________\n";
    }
    
    private void addInfo() {
        int op = JOptionPane.showConfirmDialog(null, "A impressora possui jato de tinta?");
        if(op == 0) {
            jato = true;
        }
        else
            jato = false;
    }
    
    public float calcularPreco(int nDias) {
        int op = JOptionPane.showConfirmDialog(null, "O cartucho está vazio?");
        if(op == 0)
            return nDias * getValorDiaria() + 20;
        else
            return nDias * getValorDiaria();
    }
    
    public boolean isJato() {
        return jato;
    }

    public void setJato(boolean jato) {
        this.jato = jato;
    }
    
}
