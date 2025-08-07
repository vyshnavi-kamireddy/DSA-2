class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int con1=0;
        int con2=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1) con1++;
            else{
                if(con2<con1) con2=con1;
                con1=0;
            }
        }
        if(con2<con1) con2=con1;
        return con2;
    }
}

/* TC=O(n) SC=O(1) */