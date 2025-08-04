class Solution {
    public static int largest(int[] arr) {
        // code here
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}

/* TC = O(N log N), SC = O(logN) */

class Solution2 {
    public static int largest(int[] arr) {
        // code here
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i]) max=arr[i];
        }
        return max;
    }
}

/* TC = O(N), SC = O(1) */