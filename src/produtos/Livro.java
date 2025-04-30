package produtos;

public class Livro extends Produtos{
    private String autor, titulo;

    public Livro(String nome, float preco, String autor, String titulo){
        super(nome, preco);
        this.titulo = titulo;
        this.autor = autor;
    }
    @Override
    
    public String descrever() {
        return "autor: "+autor+ "\n"+"titulo: "+titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String toString() {
        return "livro [Nome: " + nome + ", Preço: R$" + preco + ", autor: " + autor + ", titulo: " + titulo + "]";  
    }
    
}
