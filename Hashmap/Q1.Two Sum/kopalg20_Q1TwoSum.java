public class kopalg20_Q1TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                result = new int[]{map.get(diff),i};
                return result;
            }else{
                map.put(nums[i],i);
            }
        }
        return result;
    }   
}
