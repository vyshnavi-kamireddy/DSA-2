class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int flag=0;
            for(int j=0;j<n;j++)
            {
                if(i==nums[j]) flag=1;
            }
            if(flag==0) return i;
        }
        return n;
    }
}

/* TC=O(n^2) SC=O(1) */

class Solution2 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=i) return i;
        }
        return n;
    }
}

/* TC=O(nlogn+n) SC=O(logn) */

class Solution3 {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int[] hash=new int[n+1];
        for(int i=0;i<n;i++) hash[nums[i]]=1;
        for(int i=0;i<n;i++)
        {
            if(hash[i]==0) return i;
        }
        return n;
    }
}

/* TC=O(2n) SC=O(n) */

class Solution4 {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum1=(n*(n+1))/2;
        int sum2=0;
        for(int i=0;i<n;i++) sum2+=nums[i];
        return sum1-sum2;
    }
}

/* TC=O(n) SC=O(1) */

class Solution5 {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int xor1=0,xor2=0;
        for(int i=0;i<n;i++)
        {
            xor1=xor1^i;
            xor2=xor2^nums[i];
        }
        xor1^=n;
        return xor1^xor2;
    }
}

/* TC=O(n) SC=O(1) */