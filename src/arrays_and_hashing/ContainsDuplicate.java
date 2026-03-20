package arrays_and_hashing;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

    //brute force   appraoch    not suitable    for large   inputs ,    complexity  O(n^2)
    //Not   acceptable
    public boolean containsDuplicateBruteForce(int[] nums) {
        for(int i=0;i<nums.length;i++){
          for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                return  true;
            }
          }
        }
    return false;
    }

    //Using Sorting complexity  O(nlogn)
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1]){
                return  true;
            }
        }
    return false;
    }


    //Using HashSet complexity :    O(n)
    public boolean containsDuplicateOptimized(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
           if(!set.add(nums[i]))
           {
            return true;
           }
        }
    return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        ContainsDuplicate   obj=new ContainsDuplicate();
        System.out.println("containsDuplicate(nums1):"   +   obj.containsDuplicate(nums1));
        System.out.println("containsDuplicateBruteForce(nums1):" +   obj.containsDuplicateBruteForce(nums1));
        System.out.println("containsDuplicateOptimized(nums1):"  +   obj.containsDuplicateOptimized(nums1));
    }
}
