import java.util.ArrayList;
import java.util.Arrays;


class Main
    {
        // Método para dividir um array em duas partes em Java
        public static void main(String[] args)
        {
            int[] inp = { 1, 2, 3, 4, 5 };
            int n = inp.length;

            int[] a = new int[(n + 1)/2];
            int[] b = new int[n - a.length];

            for (int i = 0; i < n; i++)
            {
                if (i < a.length) {
                    a[i] = inp[i];
                }
                else {
                    b[i - a.length] = inp[i];
                }
            }

            for (int[] ints : Arrays.asList(a, b)) {
                //System.out.println(ArrayList.toString(ints));
            }
        }
    }











