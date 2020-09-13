package Encapsulamento;

public class Encapsulamento {

    //Passamos nossos atributos
    private String cargo;
    private String usuario;
    private String permicao = "ADM";

    //Realizamos nossos metodos GET
    public String getCargo(){
        return cargo;
    }
    public String getUsuario(){
        return usuario;
    }

    //Criamos Nosso metodo set que ira definir nosso cargo
    public void setCargo(String cargo1){
        this.cargo = cargo1;
    }

    //realizamos uma validação a onde aapenas os ADM possa realizar icremento de usuario
    public void setUsuario(String user){
        if(permicao.equals(cargo)){
            this.usuario = user;
        }else {
            this.usuario = "Sem permição de usuario";
        }
    }

}
