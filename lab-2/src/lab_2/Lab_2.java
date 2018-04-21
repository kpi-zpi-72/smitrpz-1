/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2;
import java.util.ArrayList;

/**
 *
 * @author anastasiya
 */
public class Lab_2 {
    public static boolean isPrime(int n) {
    for(int i=2;i<n;i++) {
        if(n%i==0)
            return false;
    }
    return true;
    }
    
    public static int[] convertToBinary(int no){
    int container[] = new int[100];
    int i = 0;
    while (no > 0){
        container[i] = no%2;
        i++;
        no = no/2;
    }

    return container;
    }
    
    public static int todo(int n) {
        
        ArrayList<Integer> numbers = new ArrayList(n);
               
        for (int i = 0; i < n; i++) {
            if(isPrime(i)) {
            numbers.add(i);
            }
            
        }
        int currentMax = 0;
        int maxItemIndex = 0;
        
        for(int j = 0; j < numbers.size(); j++) {
            int[] next = convertToBinary(numbers.get(j));
            int count =0;
            for(int k = 0; k < next.length; k++) {
                if (next[k] == 1) {
                    count++;
                }
            }
            if(count > currentMax) {
                currentMax = count;
                maxItemIndex = j;
            }
        }
   
    return numbers.get(maxItemIndex);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println( todo(20) );
    }
    
}
