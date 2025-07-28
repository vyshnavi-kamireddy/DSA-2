class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int n=str.length();
        if(n==0) return true;
        return palin(0,n-1,str);
    }
    public boolean palin(int i,int n,String s){
        if(i>=n) return true;
        if(s.charAt(i)!=s.charAt(n)) return false;
        return palin(i+1,n-1,s);
    }
}

/* TC=O(N) SC=O(N) */