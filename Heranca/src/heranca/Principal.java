package heranca;


import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        String m = "Escolha uma opção:\n" 
                + "1. Adicionar um produto\n" 
                + "2. Ver produtos cadastrados\n" 
                + "3. Alugar\n" 
                + "4. Ver aluguéis\n"
                + "5. Ver Caixa\n"
                + "Digite outra opção para sair\n";
        String op;
        while (true) {
            op = JOptionPane.showInputDialog(null, m);
            switch(op) {
                case "1" :
                    empresa.addProduto();
                    break;
                case "2" :
                    empresa.verProdutos();
                    break;
                case "3" :
                    empresa.alugar();
                    break;
                case "4" :
                    empresa.verAlugueis();
                    break;
                case "5" :
                    empresa.verCaixa();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Volte Sempre!");
                    System.exit(0);
                    break;
            }
        }
    }
    
}
