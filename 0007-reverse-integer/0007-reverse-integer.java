class Solution {
    public int reverse(int n) {
        
        long s=0;
        while(n!=0)
        {
         int r=n%10;
        
         s=s*10+r;
         n=n/10; 
        }
        if(s <= Math.pow(-2,31) || s >= Math.pow(2,31)-1)
        return 0;
        return (int)s;
    }
}