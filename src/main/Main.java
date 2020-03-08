package Main;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int size = 10;
  int[] n = new int[size];
  Scanner sc = new Scanner(System.in);
  float sum = 0;
  int min = Integer.MAX_VALUE, max = 0;
  for (int i = 0; i < size; i++)
  {
   System.out.print("Number " + i +" : ");
   n[i] = sc.nextInt();

   if (n[i] > max)
   {
    max = n[i];
   }

   if (n[i] < min)
   {
    min = n[i];
   }
  }

  for (int i = 0; i < size; i++)
  {
   System.out.print(n[i] + ", ");
   sum += n[i];
  }
  System.out.println();
  System.out.println("Sum : " + sum);
  System.out.println("AVG : " + sum/size);
  System.out.println("Min : " + min);
  System.out.println("Max : " + max);
    }
    
}
