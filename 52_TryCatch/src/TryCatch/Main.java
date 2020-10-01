package TryCatch;

public class Main {
    public static void main(String[] args) {

        try {
            ItemVenda camisa = new ItemVenda();

            camisa.setDescricao("Azul");
            camisa.setPreco(15.0);

            Venda venda = new Venda();
            venda.adicionar(camisa);

            System.out.println("total venda " + venda.getTotal());
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("erro " + e.getMessage());
        }


    }
}
