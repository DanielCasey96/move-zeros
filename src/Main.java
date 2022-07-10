import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.moveZeroes(new int[]{0});
    }

    public void moveZeroes(int[] nums) {

        int x = 1;
        int temp;

        for(int i = 1; i<nums.length; i++) {
            if(nums[i] != 0) {
                while(nums[i-x] == 0) {
                    if(x == i){
                        break;
                    }
                    x++;
                }
                if(nums[0] != 0) {
                    x = x - 1;
                }
                temp = nums[i-x];
                nums[i-x] = nums[i];
                nums[i] = temp;
                x = 1;
            }
        }
    }
}
