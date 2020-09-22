package Polimorfismo;

public class Cachorro extends Animal {

    //criamos nosso atributo
    private String animal = "cahorro";

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getAnimal() {
        return animal;
    }

    //metodo sobrecarregado 
    @Override
    public String getBarulho(String somDeAnimal) {
        return super.getSomDeAnimal() + " o animal é " + this.animal;
    }
}
