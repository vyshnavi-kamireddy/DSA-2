class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        // System.out.print(m);
        Set<Map.Entry<Integer,Integer>> Entries=m.entrySet();
        int maxEle=0;
        int maxTimes=0;
        for(Map.Entry<Integer,Integer> entry:Entries){
            if(maxTimes<entry.getValue() || (maxTimes==entry.getValue() && maxEle<entry.getKey()))
            {
                maxEle=entry.getKey();
                maxTimes=entry.getValue();
            }
        }
        return maxEle;
    }
}



/* TC=O(N) SC=O(N) */
