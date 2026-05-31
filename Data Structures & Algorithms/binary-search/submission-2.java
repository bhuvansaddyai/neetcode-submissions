class Solution {
    public int search(int[] nums, int target) {
        int lo=0 , hi=nums.length-1 , mid =0;

        while(lo<=hi){
            mid = lo + (hi-lo)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid] < target){ 
                lo = mid +1; // right half
            }
            else{ 
                hi = mid-1; // left half
            }
        }
        return -1;
    }
 
}
