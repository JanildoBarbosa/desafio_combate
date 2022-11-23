package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Combat;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();

		Combat combat = new Combat(name, life, attack, armor);

		System.out.println("\nDigite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();

		Combat combat2 = new Combat(name, life, attack, armor);

		System.out.print("\nQuantos turnos você deseja executar? ");
		int round = sc.nextInt();

		for (int i = 1; i <= round; i++) {
			System.out.printf("\nResultado do turno %d:\n", i);
			combat.takeDamage(combat2);
			System.out.println(combat + "\n" + combat2);
			if (combat.getLife() <= 0 || combat2.getLife() <= 0) {
				i = round;
			}
		}

		System.out.println("\nFIM DO COMBATE.");

		sc.close();

	}

}
