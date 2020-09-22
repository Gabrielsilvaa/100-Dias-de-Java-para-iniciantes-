package Polimorfismo;

public class Main {

    public static void main(String[] args) {

        //criamos nosso obj
        Cachorro dog = new Cachorro();

        //usamos a herança pra atribuir o som
        dog.setSomDeAnimal("auau");

        //usamos um metodo sobrecaregado pra printar a msg
        System.out.println(dog.getBarulho(dog.getSomDeAnimal()));

        //usamos polimorfismo pra trocar o som
        dog.setSomDeAnimal("miau");

        //aplicamos o polimorfismo no metodo sobrecarregado
        System.out.println(dog.getBarulho(dog.getSomDeAnimal()));
    }
}
