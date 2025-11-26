class result
{
int low;
int high;
int sum;
}
class Solution 
{
    public int maxSubArray(int[] a) 
    {   int low =0;
        int high =a.length-1;
        result ans = findMaxSubArray(a,low,high);
        return ans.sum;
    }
result findMaxSubArray(int a[],int low,int high)
{
    if(low==high)
    {
        result temp = new result();
        temp.low = low;
        temp.high = high;
        temp.sum = a[low];
        return temp;
    }
    else
    {
    int mid=(low+high)/2;
    result left=findMaxSubArray(a,low,mid);
    result right=findMaxSubArray(a,mid+1,high);
    result cross=find_max_cross_subarray(a,low,mid,high);
    if(left.sum>=right.sum && left.sum>=cross.sum)
    return left;
    else if(right.sum>=left.sum && right.sum>=cross.sum)
    return right;
    else
    return cross;
    }
}    
result find_max_cross_subarray(int a[],int low,int mid,int high)
{
result r = new result();    
int left_sum=Integer.MIN_VALUE;
int sum=0,max_left=0,max_right=0;
for(int i=mid;i>=low;i--)
{
sum+=a[i];
if(sum>left_sum)
{
left_sum=sum;
max_left=i;
}
}
int right_sum=Integer.MIN_VALUE;
sum=0;
for(int j=mid+1;j<=high;j++)
{

sum+=a[j];
if(sum>right_sum)
{
right_sum=sum;
max_right=j;
}
}
r.low = max_left;
r.high = max_right;
r.sum = left_sum+right_sum;
return r;
}
}