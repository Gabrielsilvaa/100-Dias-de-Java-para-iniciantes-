package Cast;
//importamos a bliblioteca JOptionPane
import javax.swing.*;

public class Cast {
    public static void main(String[] args) {

        //conversao com o cast
        double num1 = 3.58;
        double num2 = 5.96;
        //aqui realizamos a conversao do double para inteiro
        //para fazer isso temos que espesificar o tipo da variavel premitivo
        //e antes e depois da operação matematica temos que espesificar
        int calc1 = (int) ((int)num1 + num2);
        System.out.println(calc1);


        //conversao wrapper
        //primeiro passamos nosso valor como strint
        String num3 = "123";
        //apos isso realizamos a conversao dela para o tipo inteiro
        //o comando responsavel pra isso e o interger.parseint()
        //ele sempre ira converser a string para um inteiro
        int conversao = Integer.parseInt(num3);

        int calc2 = conversao + 7;
        System.out.println(calc2);
    }
}