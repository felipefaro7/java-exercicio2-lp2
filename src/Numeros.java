/* Faça um programa que leia 15 números inteiros e exiba na tela qual é o maior
dos números lidos. */

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); 
        }
        System.out.println("Números digitados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }
        int menor = numeros[0]; // Inicializa com o primeiro número

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i]; // Atualiza o menor número
            }
        }

        
        System.out.println("O menor número é: " + menor);

       
        scanner.close();
    }
}
