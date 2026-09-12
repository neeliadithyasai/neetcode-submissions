class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> group = new HashMap<>();

      for(int i=0; i < nums.length; i++){
            int ans = target-nums[i];
            if(group.containsKey(ans)){
                return new int[] { group.get(ans),i};
            }

        group.put(nums[i],i);
      }

        return new int[]{};
    }

   
}
