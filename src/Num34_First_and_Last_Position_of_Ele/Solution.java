package Num34_First_and_Last_Position_of_Ele;

class Solution {
    public int findindex(int[] nums, int target, float bound) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] < bound && nums[mid + 1] > bound) {
                System.out.println("index = " + mid);
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else if(nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] range = new int[2];
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                range[0] = mid;
                range[1] = mid + 1;

                float dev = 0.1f;
                float lower_bound = (float)(target + dev);
                float upper_bound = (float)(target - dev);

                range[0] = findindex(nums, target, lower_bound);
                range[1] = findindex(nums, target, upper_bound);
                return range;

            } else if(nums[mid] < target) {
                left = mid + 1;
            } else if(nums[mid] > target) {
                right = mid - 1;
            } else {
                return new int[]{-1, -1};
            }
        }
        return new int[]{-1, -1};
    }
}
