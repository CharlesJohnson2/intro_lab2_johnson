import java.util.Scanner;

public class LabProgram {
   
   public static int fibonacci(int n) {
      int placeholder;
      int zero = 0;
      int one = 1;
      if (n < 0) {
         return -1;
      }
      else {
         for (int i = 0; i < n; ++i) {
            placeholder = zero + one;
            zero = one;
            one = placeholder;
         }
         return zero;  
         }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}