package produtos;

public class Mouse extends Produtos{
    private String tipo;
    private String descricao;
    public Mouse(String nome, float preco, String tipo, String descricao){
        super(nome, preco);
        this.tipo = tipo;
        this.descricao = descricao;
    }

    @Override
    
    public String descrever() {
        return descricao;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString() {
        return "Mouse [Nome: " + nome + ", Preço: R$" + preco + ", Tipo: " + tipo + ", Descrição: " + descricao + "]";  
    }
    
}
