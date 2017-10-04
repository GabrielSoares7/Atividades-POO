package heranca;

public class Equipamento {
    private String cod;
    private String descricao;
    private float valorDiaria;
    public Equipamento(String cod, String descricao, float valorDiaria) {
        this.cod = cod;
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
    }
    
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }    
}
