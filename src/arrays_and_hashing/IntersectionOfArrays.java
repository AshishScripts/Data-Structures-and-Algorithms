package arrays_and_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*

349. Intersection of Two Arrays

Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.

*/
public class IntersectionOfArrays {

    //brute force   method
    public int[] intersectionBruteForce(int[] nums1, int[] nums2) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {

                    // check duplicate in result
                    if (!result.contains(nums1[i])) {
                        result.add(nums1[i]);
                    }
                    break; // move to next element in nums1 after the value is matched
                }
            }
        }

        // convert list to array
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }

    //using Sorting

    public int[] intersectionSorting(int[] nums1, int[] nums2) {
        ArrayList <Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for (int i = 0; i < nums1.length; i++) {
            if (i + 1 < nums1.length && nums1[i] == nums1[i + 1]) {
                continue;
            }
            for (int j = 0; j < nums2.length; j++) {
                if (j + 1 < nums2.length && nums2[j] == nums2[j + 1]) {
                    continue;
                } else if (nums1[i] == nums2[j]) {
                    result.add(nums1[i]);
                }
            }

        }
        int[] resultArray=new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
                resultArray[i] = result.get(i);
            }
        return resultArray;
}


    //optimized method  using   hashset and arraylist
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
              if(!resultList.contains(num)){
                  resultList.add(num);
              }
            }
        }

        int[] result = new int[resultList.size()];
        for (int i=0;i<resultList.size();i++) {
            result[i] =resultList.get(i);
        }

        return result;
    }


    //Most  optimized   solution    using  two  hashsets
     public int[] intersectionOptimized(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
    public static void main(String[] args) {
        IntersectionOfArrays    obj=new IntersectionOfArrays();
        int[] nums1 = {1,2,2,1};
        int[]   nums2 = {2,2};
        System.out.println(Arrays.toString(obj.intersectionBruteForce(nums1, nums2)));
        System.out.println(Arrays.toString(obj.intersection(nums1, nums2)));
        System.out.println(Arrays.toString(obj.intersectionSorting(nums1, nums2)));
        System.out.println(Arrays.toString(obj.intersectionOptimized(nums1, nums2)));
    }
}
