package Calc;

import javax.swing.*;

public class Calcinteira {
    public static void main(String[] args) {

        //setamos
        int numfix[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String num1 = JOptionPane.showInputDialog(null, "digite um numero");
        double num2 = Double.parseDouble(num1);

        for(int cont = 0; cont < 9; cont++){

            int soma = (int)((int) numfix[cont] + num2);
            int sub = (int)((int) numfix[cont] - num2);
            int mult = (int)((int) numfix[cont] * num2);
            int div = (int)((int) numfix[cont] / num2);
            System.out.println(soma + " " + sub + " " + mult + " " + div);
        }

    }

}
