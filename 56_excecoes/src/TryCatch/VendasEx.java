package TryCatch;

public class VendasEx extends RuntimeException{

    //podemos criar nossas exeçoes personalizadas lembrando que sempre sera herdade de runtimeexception pois
    //ela é a classe mae
    public VendasEx(String mesagem){
        super(mesagem);
    }
}
