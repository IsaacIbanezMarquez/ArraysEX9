


import java.util.Arrays;

// Repeat Array:

public class Solution
{


        public static void main (String [] args) {
            int[] ar = {1, 2, 2, 1, 1, 3, 5,1, 2};
            Arrays.sort(ar);
            int contador=0;
            int aux=ar[0];
            for (int i = 0; i < ar.length; i++) {
                if(aux == ar[i]){
                    contador++;
                } else {
                    System.out.print(contador + ",");
                    contador=1;
                    aux=ar[i];
                }
            }
            System.out.print(contador );
        }

}
