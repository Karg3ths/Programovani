package Lekce15;

public class Graf {
	public static void main(String args[]) {
		int[] hodnoty = new int[100];
		int pocetHodnot = 0;
		nactiPole(hodnoty, pocetHodnot);
		KreslicGrafu kreslic = null;
		if ((args.length > 0) && (args[0].equals("svg"))) {
			kreslic = new DoSvg();
		} else {
			KreslicGrafu kreslic = new NaObrazovku();

		}
		kreslic.kresli(hodnoty, pocet);
	}

	private static void nactiPole(int[] hodnoty, int pocetHodnot) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		while (sc.hasNextInt()) {
			int cislo = sc.nextInt();
			if (cislo < 0) {
				continue;
			}
			hodnoty[pocetHodnot] = cislo;
			if (cislo > max) {
				max = cislo;
			}

			pocetHodnot++;
			if (pocetHodnot == hodnoty.length) {
				break;
			}
		}
	}
}