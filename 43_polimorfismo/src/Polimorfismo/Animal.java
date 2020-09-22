package Polimorfismo;

public abstract class Animal {
    //criamos nosso atributo
    private String somDeAnimal;

    public String getSomDeAnimal() {
        return somDeAnimal;
    }

    public void setSomDeAnimal(String som) {
        this.somDeAnimal = som;
    }

    //criamos um metodo pra receber o som de animal
    public String getBarulho(String somDeAnimal){
        return somDeAnimal;
    }

}
