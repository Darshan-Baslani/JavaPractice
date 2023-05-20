//leetcode - 4 (hard)
//https://leetcode.com/problems/median-of-two-sorted-arrays/description/
package prac1;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length + nums2.length];
        merge_sort(nums1,nums2,ans);
        int start = 0, end = ans.length-1;
        int mid = (start + end) /2;
        if((end+1) % 2 == 0) {
            double median = (ans[mid] + ans[mid+1]);
            return median/2;
        }else{
            return ans[mid];
        }
    }
    public static void merge_sort(int[] nums1, int[] nums2, int[] ans) {
        int left = 0, right = 0, i = 0;
        while(left < nums1.length && right < nums2.length){
            if(nums1[left] <= nums2[right]) {
                ans[i] = nums1[left];
                left++;
            }else{
                ans[i] = nums2[right];
                right++;
            }
            i++;
        }
        while(left < nums1.length) {
            ans[i] = nums1[left];
            left++;
            i++;
        }
        while(right < nums2.length){
            ans[i] = nums2[right];
            right++;
            i++;
        }
    }
}
