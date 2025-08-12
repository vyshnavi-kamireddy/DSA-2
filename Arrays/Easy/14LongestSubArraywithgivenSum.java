// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum=0;
                for(int m=i;m<=j;m++)
                {
                    sum+=arr[m];
                }
                if(sum==k)
                {
                    int len=j-i+1;
                    if(max<len) max=len;
                }
            }
        }
        return max;
    }
}

/* TC=O(N^3)  SC=O(1) */


class Solution2 {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum==k)
                {
                    int len=j-i+1;
                    if(max<len) max=len;
                }
            }
        }
        return max;
    }
}

/* TC=O(N^2)  SC=O(1) */


class Solution3 {
    public int longestSubarray(int[] arr, int k) {
        // code here
        Map<Integer,Integer> m=new HashMap<>();
        int sum=0;
        int maxLen=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum==k){
                maxLen=i+1;
            }
            int rem=sum-k;
            if(m.containsKey(rem)){
                int len=i-m.get(rem);
                maxLen=Math.max(len,maxLen);
            }
            if(!m.containsKey(sum)) m.put(sum,i);
        }
        return maxLen;
    }
}

/* TC=O(N)  SC=O(N) */

class Solution4 {
    public int longestSubarray(int[] arr, int k) {
        // code here
        Map<Integer,Integer> m=new HashMap<>();
        int sum=arr[0];
        int maxLen=0;
        int n=arr.length;
        int i=0;
        int j=0;
        while(j<n)
        {
            while(i<=j && sum>k)
            {
                sum-=arr[i];
                i++;
            }
            if(sum==k)
            {
                maxLen=Math.max(maxLen,j-i+1);
            }
            j++;
            if(j<n) sum+=arr[j];
        }
        return maxLen;
    }
}

/* TC=O(2N)  SC=O(1) */