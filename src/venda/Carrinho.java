package venda;
import java.util.ArrayList;
import java.util.List;

import produtos.*;


public class Carrinho {
    private List<Produtos> produtos;
    private double total;

    public Carrinho() {
        this.produtos = new ArrayList<>();
        this.total = 0.0;
    }
    private void calcularVenda(){
        total =0.0;
        for (Produtos p : produtos) {
            total =+ p.getPreco();
        }
    }
    public void vender(List<Produtos>produtos){
        this.produtos.addAll(produtos);
        calcularVenda();
    }
    public void vender(Produtos produto) {
        this.produtos.add(produto);
        total += produto.getPreco();
    }
    @Override
    public String toString() {
        return "Carrinho [produtos=" + produtos + ", total=" + total + "]";
    }
}
