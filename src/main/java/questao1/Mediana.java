package questao1;

import java.util.Arrays;
import java.util.Scanner;

public class Mediana {
    public static void main(String[] args) {

        int[] arrayDeElementos = insercaoDosElementosNaLista();

        Arrays.sort(arrayDeElementos);

        int indiceDaMediana = calculaIndiceDaMediana(arrayDeElementos);

        System.out.println("A mediana é " + arrayDeElementos[indiceDaMediana]);
    }

    public static int[] insercaoDosElementosNaLista() {
        int quantidadeDeElementos = verificaSeQuantidadeDeElementosEImpar();
        int[] listaDeNumeros = new int[quantidadeDeElementos];

        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < quantidadeDeElementos; i++) {
            System.out.println("Entre com o número que ficará na posição " + (i + 1));
            listaDeNumeros[i] = entrada.nextInt();
        }

        entrada.close();
        return listaDeNumeros;
    }

    public static int verificaSeQuantidadeDeElementosEImpar() {
        int quantidadeDeElementos = 0;

        Scanner entrada = new Scanner(System.in);

        while (quantidadeDeElementos % 2 == 0) {
            System.out.println("Digite a quantidade de posições ímpar que a lista deve ter");
            quantidadeDeElementos = entrada.nextInt();
        }

        return quantidadeDeElementos;
    }

    public static int calculaIndiceDaMediana(int[] elementos) {
        int quantidadeDeElementos = elementos.length;
        int IndiceDaMediana = (quantidadeDeElementos - 1) / 2;
        return IndiceDaMediana;
    }
}
