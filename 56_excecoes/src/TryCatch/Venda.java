package TryCatch;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    //criamos uma lista
    List<ItemVenda> itens = new ArrayList<>() ;

    //criamos um metodo para add itens
    public void adicionar(ItemVenda itemVenda) throws IllegalAccessException {

        if (itemVenda == null){
            throw new VendasEx("Erro o valor esta null");
        }

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
