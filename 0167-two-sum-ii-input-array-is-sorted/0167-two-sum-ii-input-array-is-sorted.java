class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ind[] = new int[2];
        for(int i=0;i<numbers.length-1;i++)
        {
        for(int j=i+1;j<numbers.length;j++)
        {
           if(numbers[i] + numbers[j] == target)
           {
            System.out.println("***");
            ind[0] = i+1;
            ind[1] = j+1;
            return ind;
           } 
           if(numbers[i] + numbers[j] > target)
           break;
        }
        }
        return ind;
    }
}