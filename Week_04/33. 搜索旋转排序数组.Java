class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return (int)mid;
            if (nums[0] <= nums[mid]) {
                if (target < nums[mid] && nums[0] <= target) right = mid - 1;
                else left = mid + 1;
            }else if (nums[mid] <= nums[nums.length - 1]) {
                if (target > nums[mid] && target <= nums[nums.length - 1]) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
}