package leetCode;

import java.util.Arrays;

/*
 * 
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class LeetCode16_3SumClosest {
	
    public static int threeSumClosest(int[] nums, int target) {
    	int result = 0;
    	int min = Integer.MAX_VALUE;
    	
    	Arrays.sort(nums);
    	
    	for (int i = 0; i < nums.length; i ++) {
    		int j = i + 1;
    		int k = nums.length -1;
    		
    		while(j<k) {
    			int sum = nums[i] + nums[j] + nums[k];
    			int diff = Math.abs(sum - target);
    			
    			if (diff == 0) return sum;
    			if (diff < min) {
    				min = diff;
    				result = sum;
    			}
    			if(sum <= target) {
    				j++;
    			}else{
    				k --;
    			}
    		}
    	}
    	return result;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] abc = {1,1,1,0};

		System.out.println(LeetCode16_3SumClosest.threeSumClosest(abc, 100));
	}

}
