
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        for(int num : nums){
            ans.add(num);
        }
        
        if(nums.length != ans.size()){
            return true;
        }

        return false;
    }
}