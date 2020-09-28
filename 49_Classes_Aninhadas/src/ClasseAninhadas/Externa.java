package ClasseAninhadas;

public class Externa {

    //Criamos nosso atributo
    String ext = "Class externa";

    //criamos um metodo teste
    public void biscoito(){
        System.out.println(this.ext + " Biscoito" );
    }

    //criamos nossa class interna
    public class Interna{

        //criamos um metodo
        public void viewText(){
            System.out.println("Class interna");
        }
        //criamos um metodo que chama o metodo da classe externa
        public void viewText2(){
            Externa.this.biscoito();
        }

    }


    public static void main(String[] args) {

        //chamamos nossa classe externa
        Externa chocolate = new Externa();

        //chamamos nossa classe interna
        Interna caramelo = chocolate.new Interna();

        //chamamos os metodos das classes criadas
        chocolate.biscoito();
        caramelo.viewText();
        caramelo.viewText2();

    }
}
