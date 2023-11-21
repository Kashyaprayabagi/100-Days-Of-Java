import java.util.Scanner;

public class twosum {
    public static int[] main(String args[]) {
        int target = 8;
        int[] nums = new int[5];
        for(int i = 0; i < 5; i++) {
            nums[i] = i;
        }

        for(int i = 0; i < nums.length; i++) {
            for(int j =1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                   return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    




    
    }
}
