package codigos;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Transporte t = new Transporte();
        while(true) {
            String op = JOptionPane.showInputDialog("Selecione uma opçao: \n" 
                    + "1 - Adicionar Avião\n" 
                    + "2 - Adicionar Automóvel\n"
                    + "3 - Visualizar dados");
            
            switch(op) {
                case "1":
                    t.addAviao();
                    break;
                case "2":
                    t.addAutomovel();
                    break;
                case "3":
                    t.exibirVeiculos();
                    break;
            }
            
        }
    }
}
