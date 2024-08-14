package casosECasos;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		Scanner ler = new Scanner(System.in);
		int a, soma = 0;
		
		System.out.println("Digete um numero para somar, casa não queira, digite 0");
		do {
			a = ler.nextInt();
			num.add(a);
			soma += a;
		}
		 while (a != 0);
		
		System.out.println("A soma é: " + soma);
		
		
		ler.close();
	}

}
