import java.util.Scanner;

public class InfiniteUntilUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int[] arr=new int[10];
        int i=0;
        while(true){
                if(n!='x'){
                    arr[i]=sc.nextInt();
                    sum+=arr[i];
                    i++;
                }
            }
            System.out.println(sum);
           
        }

}
