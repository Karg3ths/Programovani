package Lekce15;

public class NaObrazovku implements KreslicGrafu {
	private static void opakujZnak(char znak, long kolikrat) {
		while (kolikrat > 0) {
			System.out.printf("%c",znak);
			kolikrat--;
		}
	}
	@Override
	public void polozka(int velikost, double prepocet) {
		opakujZnak("X",Math.round(velikost * prepocet));
		System.out.println();
	}

}
