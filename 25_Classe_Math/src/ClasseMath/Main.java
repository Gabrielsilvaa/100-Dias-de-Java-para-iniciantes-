package ClasseMath;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    //definimos nosso numero
		
        String enum1 = JOptionPane.showInputDialog(null, "Digite um numero ");
        //realizamos um cast da enum1
        double num1 = Double.parseDouble(enum1);
        //realizamos o operação de potencia
        double pot = Math.pow(num1, 2);
        //realizamos a operação dede raiz quadrade
        double raiz = Math.sqrt(pot);
        
   
        System.out.println(pot);
        System.out.println(raiz);

    }
}
