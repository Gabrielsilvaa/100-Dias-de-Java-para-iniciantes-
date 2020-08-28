package icm;
//importamos a bliblioteca JOptionPane
import javax.swing.*;

public class IMC {
    public static void main(String[] args) {

        //setamos nossas variaveis e o que elas vao receber
        String ps = JOptionPane.showInputDialog(null,"Digite Peso");
        String al = JOptionPane.showInputDialog(null,"Digite altura");

        //alteramos nossa variavel de string para double com o metodo parsedouble
        double peso = Double.parseDouble(ps);
        double altura = Double.parseDouble(al);
        double imc = peso / (altura * altura);

        if (imc <= 18.5){
            //exibimos a mensagem em parte grafica
            JOptionPane.showMessageDialog(null, "Magro");
        }else if (imc >= 18.5 && imc <= 24.9){
            JOptionPane.showMessageDialog(null, "NORMAL");
        }else if (imc >= 25.0 && imc <= 29.9){
            JOptionPane.showMessageDialog(null, "SOBREPESO " + imc);
        }else if (imc >= 30.0 && imc <= 39.9){
            JOptionPane.showMessageDialog(null, "OBESIDADE");
        }else {
            JOptionPane.showMessageDialog(null, "OBESIDADE GRAVE");
        }


    }
}
