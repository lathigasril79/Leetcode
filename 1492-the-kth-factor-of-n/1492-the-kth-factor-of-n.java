class Solution {
    public int kthFactor(int n, int k) {
        int arr[] = new int[n/2+1];
        int j=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i == 0)
            arr[j++] = i;
        }
        arr[j] = n;
        if(k <= j+1)
        return arr[k-1];
        return -1;
    }
}