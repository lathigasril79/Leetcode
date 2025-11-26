class Solution {
    public int countDistinctIntegers(int[] nums) {
        int arr[] = new int[nums.length*2];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            int temp = nums[i];
            int s=0;
            while(temp != 0)
            {
                int r=temp%10;
                s=s*10+r;
                temp=temp/10;
            }
            arr[j++]=nums[i];
            arr[j++]=s;
        }
        long c = Arrays.stream(arr).distinct().count();
        return (int)c;
    }
}