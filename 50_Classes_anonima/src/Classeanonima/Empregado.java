package Classeanonima;
//class pai
public class Empregado {
    //metodo que sera herdado
    public void mandachuva(){
        System.out.println("Mandar no funcionario");
    }
}
class Funcionario{
    //chamamos a class pai
    Empregado funcionario = new Empregado(){
        //realizamos a sobrecarga de metodo
        @Override
        public void mandachuva() {
            System.out.println("Faz o que o mandachuva pede");
        }
    };
    //print
    public void print(){
        funcionario.mandachuva();
    }
}

//criamos uma interface
interface Teste{
    public abstract void biscoito();
}
