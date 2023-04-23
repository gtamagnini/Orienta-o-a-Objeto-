
package exercicios_java_lab_1;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author WINDOWS
 */

public class Programa {


    public static void main(String[] args) {
        Programa programa = new Programa();
        programa.executar();
    }

    private final Scanner entrada = new Scanner(System.in);
    private final PrintStream saida = System.out;

    public void executar() {
        int jogadores = 10;
        String[] nomes = new String[jogadores];
        double[] alturas = new double[jogadores];

        for (int i = 0; i < jogadores; i++) {
            nomes[i] = lerNome(i + 1);
            alturas[i] = lerAltura(i + 1);
        }

        for (int i = 0; i < jogadores; i++) {
            saida.println(nomes[i] + " ---- " + alturas[i] + " m");
        }

        double media = media(alturas);
        saida.println("A media das alturas dos jogadores é: " + media + " m");

        double mediana = mediana(alturas);
        saida.println("A mediana das alturas é igual a: " + mediana);

        double desvioPadrao = desvioPadrao(alturas, media);
        saida.println("O desvio padrão das alturas dos jogadores é: " + desvioPadrao);

        int maior = posicaoMaior(alturas);
        saida.println("A maior altura é " + alturas[maior] + " m do jogador " + nomes[maior]);

        int menor = posicaoMenor(alturas);
        saida.println("A menor altura é " + alturas[menor] + " m do jogador " + nomes[menor]);
    }

    private String lerNome(int jogador) {
        saida.println("Insira o nome do " + jogador + "° jogador .");
        return entrada.nextLine();
    }

    private double lerAltura(int jogador) {
        while (true) {
            saida.println("Insira a altura do " + jogador + "° jogador .");
            double altura = Double.parseDouble(entrada.nextLine());
            if (altura > 0) {
                return altura;
            }
            saida.println("Reinsira o valor");
        }
    }

    private double media(double[] valores) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        double quantidade = valores.length;
        return soma / quantidade;
    }

    private double mediana(double[] valores) {
        int quantidade = valores.length;
        double[] valoresOrdenados = new double[quantidade];
        System.arraycopy(valores, 0, valoresOrdenados, 0, quantidade);
        Arrays.sort(valoresOrdenados);
        double mediana;
        if (quantidade % 2 == 0) { // conjunto par
            int esquerda = quantidade / 2;
            int direita = esquerda + 1;
            mediana = (valoresOrdenados[esquerda] + valoresOrdenados[direita]) / 2.0;
        } else { // conjunto ímpar
            int meio = quantidade / 2;
            mediana = valoresOrdenados[meio];
        }
        return mediana;
    }

    private double desvioPadrao(double[] valores, double media) {
        double soma = 0;
        for (double valor : valores) {
            soma += Math.pow(valor - media, 2);
        }
        double quantidade = valores.length;
        return Math.sqrt(soma / quantidade);
    }

    private int posicaoMaior(double[] valores) {
        int maior = 0;
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > valores[maior]) {
                maior = i;
            }
        }
        return maior;
    }

    private int posicaoMenor(double[] valores) {
        int menor = 0;
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] < valores[menor]) {
                menor = i;
            }
        }
        return menor;
    }
}

