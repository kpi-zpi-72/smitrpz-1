package com.company;
import java.util.ArrayList;

/**
 * @author  Alexandr
 */

public class Main {

    public static void main(String[] args) {
	// write your code here

    }
    public static int  numberWithMaxQuantityBitIs1(int n) {

        int[] PrimeNumbers = PrimeNumbers(n);
        int MaxQuantityBitIs1 = 0;
        int numberWithMaxQuantityBitIs1 = 0;

        for (int i = PrimeNumbers.length-1; i>=0; i--)
        {
            int QuantityBitIs1 = 0;
            QuantityBitIs1 = QuantityBitIs1(PrimeNumbers[i]);
            if(QuantityBitIs1 > MaxQuantityBitIs1)
            {
                MaxQuantityBitIs1 = QuantityBitIs1;
                numberWithMaxQuantityBitIs1 = PrimeNumbers[i];
            }
        }
        return numberWithMaxQuantityBitIs1;
    }
    public static int[]  PrimeNumbers(int n) {

        boolean[] primeArray = new boolean[n];
        ArrayList<Integer> lstPrimeNumbers = new ArrayList();
        lstPrimeNumbers.add(2);
        for (int i = 3; i < primeArray.length; i+=2) {
            if (!primeArray[i]) {
                lstPrimeNumbers.add(i);
                for (int j = 2 * i; j < primeArray.length; j += i) {
                    primeArray[j] = true;
                }
            }
        }
        int[] PrimeNumbers = new int[lstPrimeNumbers.size()];
        for (int x = 0; x<PrimeNumbers.length; x++)
        {
            PrimeNumbers[x] = lstPrimeNumbers.get(x);
        }
        return PrimeNumbers;
    }

    public static int QuantityBitIs1(int Number) {
        int QuantityBitIs1 = 0;
        while (Number != 0) {
            QuantityBitIs1++;
            Number = Number & (Number - 1);
        }
        return QuantityBitIs1;
    }
}
