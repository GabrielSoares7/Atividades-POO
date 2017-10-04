package heranca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Empresa {
    
    private float caixa = 0;
    
    ArrayList <Computador> pc = new ArrayList<>();
    ArrayList <Impressora> impressora = new ArrayList<>();
    ArrayList <Projetor> projetor = new ArrayList<>();
    ArrayList <Aluguel> aluguel = new ArrayList<>();
    
    public void alugar() {
        String nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        String cpf = JOptionPane.showInputDialog("Digite o cpf do cliente: ");
        
        aluguel.add(new Aluguel(nome, cpf));
        float pF = 0;
        int op = 0;
        while(op != 2) {
            op = JOptionPane.showConfirmDialog(null, "Deseja adicionar um produto ao aluguel?");
            if(op == 0) {
                int dias;
                String str = JOptionPane.showInputDialog("Digite a quantidade de dias: ");
                dias = Integer.parseInt(str);
                str = JOptionPane.showInputDialog("Digite o produto desejado:\n"
                + "1. Computador\n"
                + "2. Impressora\n"
                + "3. Projetor\n");
                switch(str) {
                    case "1" :
                        str = JOptionPane.showInputDialog("Digite o cod do computador desejado: "
                                + exibirComputadores());
                        caixa += pc.get(Integer.parseInt(str)).calcularPreco(dias);
                        aluguel.get(aluguel.size() - 1).addComputador(pc.get(Integer.parseInt(str)).calcularPreco(dias), pc.get(Integer.parseInt(str)));
                        break;
                    case "2" :
                        str = JOptionPane.showInputDialog("Digite o cod da impressora desejada: "
                                + exibirImpressoras());
                        caixa += impressora.get(Integer.parseInt(str)).calcularPreco(dias);
                        aluguel.get(aluguel.size() - 1).addImpressora(impressora.get(Integer.parseInt(str)).calcularPreco(dias), impressora.get(Integer.parseInt(str)));
                        break;
                    case "3" :
                        str = JOptionPane.showInputDialog("Digite o cod do projetor desejado: "
                                + exibirProjetores());
                        caixa += projetor.get(Integer.parseInt(str)).calcularPreco(dias);
                        aluguel.get(aluguel.size() - 1).addProjetor(projetor.get(Integer.parseInt(str)).calcularPreco(dias), projetor.get(Integer.parseInt(str)));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "ERRO!\nProduto não existe!!!");
                        break;
                }
            }
        }
        
    }
    
    public void verCaixa() {
        JOptionPane.showMessageDialog(null, "R$" + caixa);
    }

    public void addProduto() {
        String op = JOptionPane.showInputDialog("Digite o produto desejado:\n"
                + "1. Computador\n"
                + "2. Impressora\n"
                + "3. Projetor\n");
        String cod = JOptionPane.showInputDialog("Digite o código do produto:");
        String descricao = JOptionPane.showInputDialog("Digite a descrição do produto:");
        String valorDiaria = JOptionPane.showInputDialog("Digite o valor da diaria: ");
        float vd = Float.parseFloat(valorDiaria);
        
        if("1".equals(op)) {
            pc.add(new Computador(cod, descricao, vd));
        }
        else if("2".equals(op)){
            impressora.add(new Impressora(cod, descricao, vd));
        }
        else if("3".equals(op))
            projetor.add(new Projetor(cod, descricao, vd));
        else 
            JOptionPane.showMessageDialog(null, "ERRO!");
    }
    
    public String exibirComputadores() {
        String str = "Computadores: \n";
        
        for(int i = 0; i < pc.size(); i++) {
            str += i + ". " + pc.get(i).toString();
        }
        
        return str;
    }
    
    public String exibirImpressoras() {
        String str = "Impressoras: \n";
        
        for(int i = 0; i < impressora.size(); i++) {
            str += i + ". " + impressora.get(i).toString();
        }
        
        return str;
    }
    
    public String exibirProjetores() {
        String str = "Projetores: \n";
        
        for(int i = 0; i < projetor.size(); i++) {
            str += i + ". " + projetor.get(i).toString();
        }
        
        return str;
    }
    
    public void verProdutos () {
        JOptionPane.showMessageDialog(null, exibirComputadores());
        JOptionPane.showMessageDialog(null, exibirImpressoras());
        JOptionPane.showMessageDialog(null, exibirProjetores());
    }
    
    public void verAlugueis() {
        int i;
        String str = "";
        for(i = 0; i < aluguel.size(); i++) {
            str += aluguel.get(i).getCliente().getNome() + "\n"
                    + "Computadores: " + aluguel.get(i).getPc().size() 
                    + "\nImpressoras: " + aluguel.get(i).getImpressora().size() 
                    + "\nProjetor: " + aluguel.get(i).getProjetor().size() 
                    + "\n________\n";
        }
        JOptionPane.showMessageDialog(null, "Aluguéis: \n" + str);
    }
}
