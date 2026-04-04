package arrays_and_hashing;

import java.util.Arrays;

public class MajorityElement {

     public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int maxCount = 1;
        int majorityElement = nums[0];

        int count = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                majorityElement = nums[i];
            }
        }

        return majorityElement;
    }

    public int majorityElementBoyerMoore(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
public static void main(String[] args) {

    MajorityElement obj=new MajorityElement();

    int[] nums={2,2,1,1,1,2,2};

    System.out.println(obj.majorityElement(nums));
    
    System.out.println(obj.majorityElementBoyerMoore(nums));

}

}