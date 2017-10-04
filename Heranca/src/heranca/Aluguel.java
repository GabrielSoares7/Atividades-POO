package heranca;

import java.util.ArrayList;

public class Aluguel {
    
    private Cliente cliente;
    private float preco = 0;
        
    private ArrayList <Computador> pc = new ArrayList<>();
    private ArrayList <Impressora> impressora = new ArrayList<>();
    private ArrayList <Projetor> projetor = new ArrayList<>();
    
    public Aluguel(String nome, String cpf) {
        cliente = new Cliente(nome, cpf);
    }

    public void addComputador(float precoTotal, Computador computador) {
        pc.add(computador);
        preco += precoTotal;
    }
    
    public void addImpressora(float precoTotal, Impressora impressora) {
        this.impressora.add(impressora);
        preco += precoTotal;
    }
    
    public void addProjetor(float precoTotal, Projetor projetor) {
        this.projetor.add(projetor);
        preco += precoTotal;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public ArrayList <Computador> getPc() {
        return pc;
    }

    public void setPc(ArrayList <Computador> pc) {
        this.pc = pc;
    }

    public ArrayList <Impressora> getImpressora() {
        return impressora;
    }

    public void setImpressora(ArrayList <Impressora> impressora) {
        this.impressora = impressora;
    }

    public ArrayList <Projetor> getProjetor() {
        return projetor;
    }

    public void setProjetor(ArrayList <Projetor> projetor) {
        this.projetor = projetor;
    }
    
    
}
