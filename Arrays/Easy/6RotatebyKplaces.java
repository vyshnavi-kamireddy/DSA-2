class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int[] temp=new int[k];
        for(int i=n-k;i<n;i++)
        {
            temp[i-(n-k)]=nums[i];
        }
        for(int i=n-1;i>=k;i--)
        {
            nums[i]=nums[i-k];
        }
        for(int i=0;i<k;i++)
        {
            nums[i]=temp[i];
        }
    }
}

/* TC=O(N+K) SC=O(K) */


class Solution2 {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k>n) k=k%n;
        sort(n-k,n-1,nums);
        sort(0,n-k-1,nums);
        sort(0,n-1,nums);
    }
    public void sort(int start,int end,int[] nums)
    {
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}

/* TC=O(2N) SC=O(1) */