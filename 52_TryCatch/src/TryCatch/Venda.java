package TryCatch;

import java.util.List;

public class Venda {

    //criamos uma lista
    List<ItemVenda> itens;

    //criamos um metodo para add itens
    public void adicionar(ItemVenda itemVenda) {
        itens.add(itemVenda);
    }

    //criamos um metodo para retornar o valor
    public double getTotal() {
        double total = 0;

        //um for caso tenha mais de um produto
        for (ItemVenda item : itens) {
            total += item.getPreco();
        }

        return total;
    }

}
