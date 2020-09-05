package Baskara;

public class Baskara {

    //declaramos nossa variavel a, b, c elas vao ser as responsavel por realizar o calc
    double letras[] = {0, 0, 0};

    // a = 0
    // b = 1
    // c = 2

    public Double baskara(double letras[]){

        //realizamos o calculo do delta
        double delta = Math.pow(letras[1], 2) - 4 * (letras[0] * letras[2]);
        //realizamos o calc do x linha
        double xlinha1 = letras[1] + (Math.sqrt(delta) / (2 * letras[0]));
        double xlinha2 = letras[1] - (Math.sqrt(delta) / (2 * letras[0]));

        return xlinha1;
    }
}
