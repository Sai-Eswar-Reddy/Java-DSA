import java.util.*;
public class Multiplication {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter Number: ");
      int num = input.nextInt(); 
      System.out.println("Multiplication table for "+" "+num+" "+"is: "); 
      for(int i=1;i<=10;i++){
        System.out.println(num + "*" + i + "=" + num*i);
      }
    }
}
