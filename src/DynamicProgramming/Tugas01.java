package DynamicProgramming;
import java.util.*;
public class Tugas01 {
    private static int Input()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Jumlah: ");
        int a = scan.nextInt();
        return a;
    }
    private static void c (int i, int [] o)
    {
        for (int j = 0; j < o.length; j++) 
        {
            int k = 0;
            while(i >= o[j])
            {
                i = i - o[j];
                k++;
            }
            System.out.println("Uang yang Dibutuhkan");
            System.out.println(o[j] + " Sebanyak " + k);
            
        }
    }
    public static void main(String[] args) 
    {
        int c = Input();
        int o [] = new int [] {5000, 2000, 1000, 500, 100};
        
        c(c,o);
    }
}
