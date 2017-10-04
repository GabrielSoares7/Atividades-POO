/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

import javax.swing.JOptionPane;

public class Computador extends Equipamento {
    
    private String processador;
    private String ram;
    private String hd;
    
    public Computador( String cod, String descricao, float valorDiaria) {
        super(cod, descricao, valorDiaria);
        
        addInfo();
    }

    @Override
    public String toString() {
        return "Computador:\n" 
                + "Valor da diaria: " + super.getValorDiaria()
                + "\nProcessador: " + processador 
                + "\nRam: " + ram 
                + "\nHD: " + hd 
                + "\n__________\n";
    }
    
    
    private void addInfo() {
        processador = JOptionPane.showInputDialog("Digite as informações sobre o processador");
        ram = JOptionPane.showInputDialog("Digite as informações sobre a memória ram");
        hd = JOptionPane.showInputDialog("Digite as informaçeõs sobre o HD");
    }
    
    public float calcularPreco(float nDias) {
        return nDias * getValorDiaria();
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }
    
}
