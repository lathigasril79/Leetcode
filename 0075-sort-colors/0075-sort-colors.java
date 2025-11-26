class Solution {
    public void sortColors(int[] nums) {
     int n = nums.length;
     int cz=0,co=0,ct=0;
     for(int i=0;i<n;i++)
     {
        if(nums[i] == 0)
        cz++;
        else if(nums[i] == 1)
        co++;
        else
        ct++;
     } 
     int j=0;  
     for(j=0;j<cz;j++)
     nums[j] = 0;
     for(j=j;j<cz+co;j++)
     nums[j] = 1;
     for(j=j;j<cz+co+ct;j++)
     nums[j] = 2;
    }
}