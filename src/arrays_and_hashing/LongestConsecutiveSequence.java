package arrays_and_hashing;

import java.util.HashSet;

public class LongestConsecutiveSequence {

     public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
            LongestConsecutiveSequence  obj=new LongestConsecutiveSequence();
            int[]   nums = {0,3,7,2,5,8,4,6,0,1};
            System.out.println(obj.longestConsecutive(nums));
    }
}
