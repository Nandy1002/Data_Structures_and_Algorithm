/*
 * Given an array of integers nums and an integer target, return indices of the two numbers 
 * such that they add up to target. You may assume that each input would have exactly one 
 * solution, and you may not use the same element twice. You can return the answer in any 
 * order.
 * 
 * Example - 
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Constrains - 
 * 2 <= nums.length <= 10^4
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 * Only one valid answer exists.
 * come up with an algorithm that is less than O(n^2) time complexity
 * 
 * link - https://leetcode.com/problems/two-sum/
 */
class testcase {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}