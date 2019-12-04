class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int k = 0;
        int i;
        for(i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if(list.contains(value)) {
                k = list.indexOf(value);
                break;
            } else {
                list.add(nums[i]);
            }
        }
        return new int[] {k , i};
    }
}
