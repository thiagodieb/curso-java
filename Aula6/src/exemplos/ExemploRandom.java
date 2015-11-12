package exemplos;
public class ExemploRandom {

    public static void main(String[] args) {
        int limiteInferior = 1;
        int limiteSuperior = 100;
        int alcance = limiteSuperior - limiteInferior;
        double nrRandomico = Math.random();
        System.out.println(nrRandomico);
        System.out.println("O número randômico escolhido entre 5 e 10 foi "
           + Math.round(limiteInferior + nrRandomico * alcance));

    }
}