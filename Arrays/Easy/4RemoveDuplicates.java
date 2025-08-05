class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        Set<Integer> s=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            s.add(nums[i]);
        }
        int k=0;
        for(Integer ele:s)
        {
            nums[k++]=ele;
        }
        return k;
    }
}

/* TC=O(2N) SC=O(N) */

class Solution2 {
    public int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}

/* TC=O(N) SC=O(1) */

class Solution3 {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}

/* TC=O(N) SC=O(1) */