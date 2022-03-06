package questao2;

import java.util.Scanner;

public class ParesDaDiferenca {
    public static void main(String[] args) {

        int quantidadeDePares = calculoDaQuantidadeDePares();

        System.out.println("O número de pares é " + quantidadeDePares);
    }

    public static int calculoDaQuantidadeDePares() {
        int quantidadeDeElementos = entradaDaQuantidadeDeElementos();
        int diferencaEntreOsNumeros = entradaDaDiferencaEntreOsNumeros();
        int[] arrayDosElementos = entradaDosElementos(quantidadeDeElementos);
        int[] arrayDoResultado = new int[2];
        int quantidadeDePares = 0;

        for (int i = 0; i < quantidadeDeElementos; i++) {
            for (int j = 0; j < quantidadeDeElementos; j++) {
                if (arrayDosElementos[i] - arrayDosElementos[j] == diferencaEntreOsNumeros) {
                    arrayDoResultado[0] = arrayDosElementos[i];
                    arrayDoResultado[1] = arrayDosElementos[j];
                    quantidadeDePares++;
                }
            }
        }
        return quantidadeDePares;
    }

    private static int entradaDaQuantidadeDeElementos() {
        System.out.println("Entre com a quantidade de elementos da lista");
        Scanner entrada = new Scanner(System.in);
        int quantidadeDeElementos = entrada.nextInt();
        return quantidadeDeElementos;
    }

    private static int entradaDaDiferencaEntreOsNumeros() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com a diferença que você quer os pares");
        int diferencaEntreOsPares = entrada.nextInt();
        return diferencaEntreOsPares;
    }

    private static int[] entradaDosElementos(int quantidadeDeElementos) {
        int[] arrayDosElementos = new int[quantidadeDeElementos];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < quantidadeDeElementos; i++) {
            System.out.println("Qual digite o número da posição " + (i + 1));
            arrayDosElementos[i] = entrada.nextInt();
        }
        entrada.close();
        return arrayDosElementos;
    }
}
