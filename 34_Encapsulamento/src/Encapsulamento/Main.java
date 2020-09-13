package Encapsulamento;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //criamos nosso obj
        Encapsulamento valid = new Encapsulamento();

        //Colocamos valor na nossa variavel
        String cargo1 = JOptionPane.showInputDialog(null, "informe seu cargo");
        //passamos esse valor para o nosso metodo set
        valid.setCargo(cargo1);

        //Colocamos valor na nossa variavel
        String user = JOptionPane.showInputDialog(null, "informe seu user");
        //passamos esse valor para o nosso metodo set
        valid.setUsuario(user);

        //Apresentamos os nossos dados 
        JOptionPane.showMessageDialog(null, valid.getCargo());
        JOptionPane.showMessageDialog(null, valid.getUsuario());


    }
}
