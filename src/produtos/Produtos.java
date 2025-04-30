package produtos;

public abstract class Produtos {
    protected String nome;
    protected float preco;
    public Produtos(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public String descrever(){
    return "produto de informatica";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    @Override
    public abstract String toString();

    
}
