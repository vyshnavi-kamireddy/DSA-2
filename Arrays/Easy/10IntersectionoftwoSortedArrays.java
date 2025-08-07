class Solution {
    public ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        int n1=arr1.length;
        int n2=arr2.length;
        int[] visited=new int[n2];
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(arr1[i]==arr2[j] && visited[j]==0)
                {
                    al.add(arr1[i]);
                    visited[j]=1;
                    break;
                }
            }
        }
        return al;
        
    }
}

/*  TC=O(n1*n2)  SC=O(n2+min(n1,n2))*/


class Solution2 {
    public ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0;
        int j=0;
        while(i<n1 && j<n2)
        {
            if(arr1[i]<arr2[j]) i++;
            else if(arr1[i]==arr2[j])
            {
                if(al.size()==0 || arr1[i]!=al.get(al.size()-1)) al.add(arr1[i]);
                i++;
            }
            else j++;
        }
        return al;
    }
}

/*  TC=O(n1+n2)  SC=O(min(n1,n2))*/