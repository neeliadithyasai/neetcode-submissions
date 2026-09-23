class Solution {
    public int search(int[] nums, int target) {

        if (nums != null && nums.length > 0 && target == nums[0]) {
            return 0;
        }
        int i = 0;
        int n = nums.length;
        int mid = n/2;
        return BS(i,n-1,target,nums);
    }

    public static int BS(int i , int n, int target,int[] nums){
        
        if (i > n) {
            return -1; 
        }

        int mid = i + (n - i) / 2;
        if (nums[mid] == target) return mid;
if (nums[mid] < target) {
       
            i = mid + 1;
            return BS(i, n, target, nums); 
        } else {
        
            n = mid - 1;
            return BS(i, n, target, nums); 
        }



    }
}
