package que3;

import java.util.Random;
import java.util.Scanner;

public class Tile_Tactics {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int player1;
		int player2;
		int ch;
		do {
			System.out.println("do you want to play");
			System.out.println("enter your choice\n 1.yes \n2.no");
			ch = sc.nextInt();
			switch (ch) {
			case 1: {
				player1 = random.nextInt(6) + 1;
				player2 = random.nextInt(6) + 1;

				System.out.println(canEarnBonus(player1, player2));
				break;

			}
			default:
				System.out.println("invalid choice");
			}
		} while (ch != 2);
		
		sc.close();

	}

	public static boolean canEarnBonus(int yourTile, int friendTile) {

		for (int i = 1; i <= 6; i++) {
			if (yourTile + i == friendTile) {
				return true;
			}
		}
		return false;
	}

}
