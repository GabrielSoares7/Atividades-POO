package codigos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Transporte {

    ArrayList <Veiculo> lista = new ArrayList<>();
    public void addAviao() {
        String str = JOptionPane.showInputDialog("Digite o peso maximo do aviao");
        int peso = Integer.parseInt(str);
        String cor = JOptionPane.showInputDialog("Digite a cor do avião");
        str = JOptionPane.showInputDialog("Digite a potencia do aviao");
        int potencia = Integer.parseInt(str);
        str = JOptionPane.showInputDialog("Digite o código do avião");
        int cod = Integer.parseInt(str);
        lista.add(new Aviao(potencia, cor, peso, cod));
        JOptionPane.showMessageDialog(null, "Avião cadastrado");
    }
    
    public void addAutomovel() {
        String str = JOptionPane.showInputDialog("Digite a potencia do automóvel");
        int potencia = Integer.parseInt(str);
        String combustivel = JOptionPane.showInputDialog("Digite a potencia do veiculo");
        String cor = JOptionPane.showInputDialog("Digite a cor do automóvel");
        String placa = JOptionPane.showInputDialog("Digite a placa do automóvel");
        lista.add(new Automovel(combustivel, potencia, cor, placa));
    }
    
    public void exibirVeiculos() {
        JOptionPane.showMessageDialog(null, lista.toString());
    }
}
