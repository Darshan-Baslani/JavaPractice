package prac1;

public class SearchInRoatedArrayWithSameElements {
    public static void main(String[] args) {
        int[] nums = {6,7,8,8,9,1,1,2,4,4,5};
        int target = 2;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int peak = peak_element(nums);
        if(nums[peak] == target) {
            return peak;
        }
        if(nums[0] <= target) {
            return find(nums,target,0,peak);
        }else{
            return find(nums,target,peak+1,nums.length-1);
        }
    }
    public static int peak_element(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end) {
            int mid = start + (end-start) / 2;
            if(mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }else if(mid > start && nums[mid] < nums[mid-1]) {
                return mid-1;
            }else if(nums[start] == nums[mid] && nums[mid] == nums[end]) {
                //check if start or end aren't the peak elements
                if(nums[start] > nums[start+1]) {
                    return start;
                } else if (nums[end] < nums[end-1]) {
                    return nums[end-1];
                }
                start++;
                end--;
            }else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return nums.length-1;
    }
    public static int find(int[] nums, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] > target) {
                end = mid-1;
            } else if (nums[mid] < target) {
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
