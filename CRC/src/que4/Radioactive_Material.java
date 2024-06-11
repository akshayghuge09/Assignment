package que4;

import java.util.Scanner;

public class Radioactive_Material {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mass of material");
		float mass = sc.nextFloat();
		
		System.out.println("Enter years for a half life to elapse.");
		float halfLife = sc.nextFloat();

		System.out.println("Enter number of half lives");
		int halfLives = sc.nextInt();
		
		float remaining_mass=RemainingMass(mass,halfLives);
		float numberOfYearsToDecay=YearsDecay(halfLife,halfLives);
		
		System.out.println("Remaining mass is : "+remaining_mass);
		System.out.println("number Of Years To Decay is : "+numberOfYearsToDecay);
		

	}

	private static float YearsDecay(float halfLife, float halfLives) {
	       float result =halfLife *halfLives;
		return result;
	}

	private static float RemainingMass(float mass, int halfLives) {
		double fact = Math.pow(0.5, halfLives);
		float result = (float) (mass * fact);
		return result;
	}

}
