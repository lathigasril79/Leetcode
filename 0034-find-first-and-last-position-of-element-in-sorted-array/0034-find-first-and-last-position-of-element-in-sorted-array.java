class Solution {
    public int[] searchRange(int[] nums, int target) {
      int res [] = new int[2];
      res[0] = res[1] = -1;
      int i=0,j=0;
      for(i=0;i<nums.length;i++)
      {
        if(nums[i] == target)
        {res[0] = i;
        break;}
      }
      if(res[0] == -1)
      return res;
        for( j=i;j<nums.length;j++)
      {
        if(nums[j] == target)
        res[1] = j;
      }
      return res;
    }
}