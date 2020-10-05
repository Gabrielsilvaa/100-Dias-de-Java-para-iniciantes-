package TryCatch;

public class Main {
    public static void main(String[] args) {

        //usamos o try quando queremos que ele tente executar alguma coisa
        try {
            //codigo normal para chamar nossa classe e atribuit valores
            ItemVenda camisa = new ItemVenda();

            camisa.setDescricao("Azul");
            camisa.setPreco(12.0);

            Venda venda = new Venda();
            venda.adicionar(camisa);

            System.out.println("total venda " + venda.getTotal());

        }
        //usamos o cath quando para capturar as exceções do
        catch (VendasEx | IllegalAccessException e){
            //mostramos a onde esta acontecendo o erro
            e.printStackTrace();
            //falamos o erro
            System.out.println(e.getMessage());

        }
        //usamos o finally para mostrar uma mensagem, ele sempre sera executado mesmo quando der erro
        finally {
            System.out.println("Program finalizado");
        }
    }
}
