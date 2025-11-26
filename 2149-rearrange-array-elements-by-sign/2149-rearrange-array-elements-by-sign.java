class Solution {
    public int[] rearrangeArray(int[] nums) {
        int temp1[] = new int[nums.length/2];
        int temp2[] = new int[nums.length/2];
        int j=0;int k=0;
        for(int i=0;i<nums.length;i++)
        {
        if(nums[i] < 0)
        temp1[j++] = nums[i];
        else
        temp2[k++] = nums[i];
        }
         j=0;
        for(int i=0;i<nums.length/2;i++)
        {
            nums[j++] = temp2[i];
            nums[j++] = temp1[i];
        }
        return nums;
    }
}