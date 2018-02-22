package Lekce18;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class OtoceniIV {
	public static void main(String args[]) {
		List<Integer> pole = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			pole.add(sc.nextInt());
		}
		for (int pozice = pole.size();pozice > 0; pozice--) {
			System.out.printf(" %d" , pole.get(pozice - 1));
		}
	sc.close();
	}
}
