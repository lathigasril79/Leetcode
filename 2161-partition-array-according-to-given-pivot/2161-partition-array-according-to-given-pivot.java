class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int res[] = new int[nums.length];
        int j = 0;
        for (int num : nums)
        { 
         if (num < pivot) 
            res[j++] = num;
        }
        for (int num : nums) 
        {
        if (num == pivot) 
            res[j++] = num;
        }    
        for (int num : nums) 
        {
        if (num > pivot) 
            res[j++] = num;
        }    
        return res;

    }
}