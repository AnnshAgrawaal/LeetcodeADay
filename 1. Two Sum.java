class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int res[] = new int[2];
        for(int i=0; i<nums.length;i++){
            
            int diff = target - nums[i];
            if(hmap.containsKey(diff)){
                res[0]=hmap.get(diff);
                res[1]=i;
                return res;
            }
            
            hmap.put(nums[i],i);
        }
        
        return null;
        
    }
}