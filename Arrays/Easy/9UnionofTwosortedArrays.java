class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        Set<Integer> s=new TreeSet<>();
        int n1=a.length;
        int n2=b.length;
        for(int i=0;i<n1;i++) s.add(a[i]);
        for(int i=0;i<n2;i++) s.add(b[i]);
        ArrayList<Integer> al=new ArrayList<>();
        for(Integer ele:s)
        {
            al.add(ele);
        }
        return al;
    }
}

/* TC=O((n1+n2)logn) SC=O(2(n1+n2)) */

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        int n1=a.length;
        int n2=b.length;
        int i=0;
        int j=0;
        while(i<n1 && j<n2)
        {
            if(a[i]<=b[j])
            {
                if((al.size()==0 || a[i]!=al.get(al.size()-1)))
                {
                    al.add(a[i]);
                }
                i++;
            }
            else{
                if((al.size()==0 || b[j]!=al.get(al.size()-1)))
                {
                    al.add(b[j]);
                }
                j++;
            }
        }
        while(i<n1)
        {
            if(a[i]!=al.get(al.size()-1)) al.add(a[i]);
            i++;
        }
        while(j<n2)
        {
            if(b[j]!=al.get(al.size()-1)) al.add(b[j]);
            j++;
        }
        return al;
    }
}

/* TC=O(n1+n2) SC=O(n1+n2) */