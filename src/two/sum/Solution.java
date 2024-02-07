package two.sum;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = nums.length - 1; i > -1; --i) {
            int first = 0;
            int last = i;
            int mid = (first + last + 1) / 2;

            int oneValue = nums[last];

            while (first < last) {
                // found
                if (oneValue + nums[mid] == target) {
                    return new int[] {mid, i};
                }
    
                // go right
                if (oneValue + nums[mid] < target) {
                    first = mid;
                }
    
                // go left
                if (oneValue + nums[mid] > target) {
                    last = mid;
                }
    
                mid = (first + last + 1) / 2;
            }
        }

        return new int[] {};
    }
}