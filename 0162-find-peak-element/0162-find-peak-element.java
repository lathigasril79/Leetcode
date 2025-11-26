class Solution {
    public int findPeakElement(int[] nums) {
        int ele = Arrays.stream(nums).max().getAsInt();
        for(int i=0;i<nums.length;i++)
        {
            if(nums [i] == ele)
            {
                return i;
            }
        }
        return -1;
    }
}