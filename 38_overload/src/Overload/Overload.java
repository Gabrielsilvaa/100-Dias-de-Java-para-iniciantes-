package Overload;

public class Overload {

    //Criamos nosso atribustos
    int n1;
    int n2;
    double num1;
    double num2;

    //começamos a criar nossos metodos construtores com sobrecarga
    public Overload(){    }

    public Overload(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public Overload(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    //criamos nossos metodos sobrecarreagdos
    //poderiamos criar varios outros metodos sobrecarregados
    //com parametros distintos claro
    public String operacao(){
        return String.valueOf(this.n1 + this.n2);
    }
    public String operacao(double num1, double num2){
        return String.valueOf(this.num1 + this.num2);
    }
}
