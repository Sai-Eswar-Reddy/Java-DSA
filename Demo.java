import java.util.*;
public class Demo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your name  ");
        String name = input.nextLine(); 
        System.out.println("Enter i value:");
        int n = input.nextInt();        
        name(name,n);
    }
    public static String name(String name, int n){
        for(int i=0;i<n;i++){
            System.out.println(name);
        }
        return "name";  
    }
}