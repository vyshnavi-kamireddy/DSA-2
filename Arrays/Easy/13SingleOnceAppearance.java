class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int ele=nums[i];
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(ele==nums[j]) count++;
            }
            if(count==1) return ele;
        }
        return -1;
    }
}

/*  TC=O(N^2)    SC=O(1)   */

class Solution2 {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        Set<Map.Entry<Integer,Integer>> e=m.entrySet();
        for(Map.Entry<Integer,Integer> entry:e)
        {
            Integer key=entry.getKey();
            Integer value=entry.getValue();
            if(value==1) return key;
        }
        return -1;
    }
}


/*  TC=O(N)    SC=O(N)   */

class Solution3 {
    public int singleNumber(int[] nums) {
        int xor1=0;
        int n=nums.length;
        for(int i=0;i<n;i++) xor1^=nums[i];
        return xor1;
    }
}


/*  TC=O(N)    SC=O(1)   */