class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0) al.add(nums[i]);
        }
        for(int i=0;i<al.size();i++)
        {
            nums[i]=al.get(i);
        }
        for(int i=al.size();i<n;i++) nums[i]=0;
    }
}

/* TC=O(2N) SC=O(N) */

class Solution2 {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0) nums[k++]=nums[i];
        }
        for(int i=k;i<n;i++) nums[i]=0;
    }
}

/* TC=O(2N) SC=O(1) */

class Solution3 {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=-1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n&&j!=-1;i++)
        {
            if(nums[i]!=0)
            {
                nums[j]=nums[i];
                nums[i]=0;
                j++;
            }
        }
    }
}

/* TC=O(N) SC=O(1) */