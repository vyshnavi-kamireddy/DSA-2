class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int sec=-1;
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]!=max)
            {
                sec=arr[i];
                break;
            }
        }
        return sec;
    }
}

/* TC = O(N log N+N), SC = O(logN) */

class Solution2 {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i]) max=arr[i];
        }
        int sec=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(sec<arr[i] && arr[i]!=max)
            {
                sec=arr[i];
            }
        }
        return sec;
    }
}

/* TC = O(2N), SC = O(1) */

class Solution3 {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=arr[0];
        int sec=-1;
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                sec=max;
                max=arr[i];
            }
            if(sec<arr[i] && arr[i]!=max) sec=arr[i];
        }
        return sec;
    }
}

/* TC = O(N), SC = O(1) */