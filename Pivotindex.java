import java.util.Scanner;

public class Pivotindex {
    public static void main(String[] args) {
        int [] nums = new int [6];
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        for(int i=0;i<6;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(search(nums,target));
    }
    public static  void pivot(int [] nums,int k){
        for(int i=0;i<6;i++){
            nums[k]=nums[i];

        }

    }
    public static int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] <= nums[left]) {
                if (target >= nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (target <= nums[mid] && target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}

