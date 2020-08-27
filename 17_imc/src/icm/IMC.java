package icm;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        /*
        MENOR QUE 18,5	MAGREZA
        ENTRE 18,5 E 24,9	NORMAL
        ENTRE 25,0 E 29,9	SOBREPESO
        ENTRE 30,0 E 39,9	OBESIDADE
        MAIOR QUE 40,0	OBESIDADE GRAVE
        */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu Peso:");
        double peso = entrada.nextDouble();

        System.out.println("Digite sua Altura");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("seu imc e:" + imc);

        if (imc <= 18.5){
            System.out.println("MAGREZA");
        }else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("NORMAL");
        }else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("SOBREPESO");
        }else if (imc >= 30.0 && imc <= 39.9){
            System.out.println("OBESIDADE");
        }else {
            System.out.println("OBESIDADE GRAVE");
        }


    }
}
