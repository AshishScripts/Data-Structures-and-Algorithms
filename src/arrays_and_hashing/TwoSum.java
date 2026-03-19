package arrays_and_hashing;

import java.util.Arrays;
import  java.util.HashMap;

public class TwoSum {
    //brute force   first   approach    complexity:-    O(n^2)
    public static int[] twoSum1(int[] nums, int target) {
        int len=nums.length;
        int[] indices={-1,-1};
        for(int i=0;i<len;i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
        return indices;
    }

    //brute force second  approach
    public static int[] twoSum2(int[] nums, int target) {
        int len=nums.length;
        int[] indices={-1,-1};
        for(int i=0;i<len;i++) {
            int complement= target-nums[i];
            for (int j = i + 1; j < len; j++) {
                if (nums[j] == complement) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
        return indices;
    }

    //optimized method:-    using   hashing for lookup  or  hashmap(complexity :    o(n) )
     public static int[] optimizedTwoSum(int[] nums, int target) {
        HashMap<Integer,Integer>    map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if (map.containsKey(complement) &&  map.get(complement)!=i) {
                return  new int[]{i,map.get(complement)};
            }
        }
        return  new int[]{};
     }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(TwoSum.twoSum1(nums,target)));
        System.out.println(Arrays.toString(TwoSum.twoSum2(nums,target)));
        System.out.println(Arrays.toString(TwoSum.optimizedTwoSum(nums,target)));
    }
}
