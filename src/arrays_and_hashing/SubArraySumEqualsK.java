package arrays_and_hashing;

import java.util.HashMap;

public class SubArraySumEqualsK {

    public int subarraySumBruteForce(int[] nums, int k) {
        int subArrayCount=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                if(sum==k){
                    subArrayCount++;
                }
            }
        }
        return subArrayCount;
    }

    public int subarraySumOptimized(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int subArrayCount = 0;
        int prefixSum = 0;

        map.put(0, 1); //important:- to count subarrays that start from index 0 and sum to k

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int required = prefixSum - k;

            if(map.containsKey(required)){
               subArrayCount +=map.get(required);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return subArrayCount;
    }

    public static void main(String[] args) {
        SubArraySumEqualsK  obj=new SubArraySumEqualsK();
        int[] nums={1,2,3};
        System.out.println( obj.subarraySumBruteForce(nums, 3));
        System.out.println( obj.subarraySumOptimized(nums, 3));
}
}