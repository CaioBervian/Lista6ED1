package Lista6;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int aux;
		int tam;
		int i;
		System.out.println("Qual tamanho?");
		tam = entrada.nextInt();
		int numeros[] = new int [tam];
		for (int x=0; x<tam;x++) {
			System.out.println("Valor");
			numeros[x] = entrada.nextInt();
		}
		for (int j=0; j<numeros.length; j++) {
			aux = numeros[j];
			for (i=j-1; (i >=0) && (numeros[i] > aux); i--) {
				numeros[i+1] = numeros[i];
			}
			
			
			numeros[i+1] = aux;
		}
		for (int j=0; j<numeros.length; j++) {
		System.out.print(numeros[j] + " || ");
	
		}
		entrada.close();
	}}

