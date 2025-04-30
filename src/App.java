import java.util.ArrayList;
import java.util.List;

import produtos.*;
import venda.*;

public class App {
    public static void main(String[] args) throws Exception {
        Mouse mouse1 = new Mouse("mouse simples", 50, "optico", "mouse basico do dia");
        Mouse mouse2 = new Mouse("Mouse gamer", 70, "Óptico", "Mouse básico para uso noturno");

        Livro livro1 = new Livro("Java", 80, "Silva", "Programação");
        Livro livro2 = new Livro("Dados", 120, "Maria", "Computação");

        Carrinho carrinho = new Carrinho();

        List<Produtos> listaProdutos = new ArrayList<>();
        listaProdutos.add(mouse1);
        listaProdutos.add(livro1);
        carrinho.vender(listaProdutos);

        System.out.println("Venda com lista de produtos:");
        System.out.println(carrinho);

        Carrinho carrinho2 = new Carrinho();

        carrinho2.vender(livro2);

        System.out.println(carrinho2);
    }
}
