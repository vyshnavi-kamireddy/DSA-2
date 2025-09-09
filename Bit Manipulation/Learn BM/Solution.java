
public class Solution {
    public static void DecimaltoBinary(int n) {
        // code here
        String str="";
        while(n!=1)
        {
            if(n%2==0) str=0+str;
            else str=1+str;
            n=n/2;
        }
        str=1+str;
        System.out.print(str);
    }
}

// TC=O(log_2_N) SC=O(log_2_N)


class Solution2 {
    public int binaryToDecimal(String b) {
        // Code here
        int num=0;
        int length=b.length();
        for(int i=length-1;i>=0;i--)
        {
            if(b.charAt(i)=='1') num=num+(int)Math.pow(2,length-1-i);
        }
        return num;
    }
}

// TC=O(N) SC=O(1)