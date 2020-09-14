package Metodos_construtores;

public class MetodoConstrutor {

    //definimos nosso atributo
    int num;

    //passamos um valor statico para o nosso metodo construtor
    public MetodoConstrutor(){
        num = 10;
    }

    //passamos um valor mutavel para nosso metodo construtor
    public MetodoConstrutor(int n1){
        num = n1;
    }

}
