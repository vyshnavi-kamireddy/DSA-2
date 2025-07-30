class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        Map<Integer,Integer> m=new HashMap<>();
        ArrayList<ArrayList<Integer>> arrl=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            int key=arr[i];
            Integer value=m.getOrDefault(key,0);
            m.put(key,value+1);
        }
        Set<Map.Entry<Integer,Integer>> Entries=m.entrySet();
        for(Map.Entry<Integer,Integer> entry:Entries){
            ArrayList<Integer> al=new ArrayList<>();
            al.add(entry.getKey());
            al.add(entry.getValue());
            arrl.add(al);
        }
        return arrl;
    }
}

/*  TC=O(N)    SC=O(N)   */