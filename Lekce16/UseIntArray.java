package Lekce16;
import IntArray;
import StupidIntArray;

public class UseIntArray {
    public static void main(String[] args) {
        // Prom�nn� je typu interface
        // Vlo��m do n� implementaci
        IntArray arr = new StupidIntArray(10);
 
        arr.add(5);
        arr.add(7);
 
        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("%d\n", arr.get(i));
        }
    }
}