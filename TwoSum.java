import java.util.*;
public class TwoSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size");
         int n = sc.nextInt();
        int[] nums = new int[n];
                System.out.println("Elements");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
            
        }
        System.out.println(nums);

        System.out.println("Target");
            int target = sc.nextInt();
            TwoSum sol = new TwoSum();
            int[] result = sol.twosum(nums,target);
            if(result.length == 2)
                System.out.println(Arrays.toString(result));
            else
                System.out.println("No Result");
            
        }
    
    int[] twosum(int[] nums, int target){
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
      return new int[0];  
    }
}
