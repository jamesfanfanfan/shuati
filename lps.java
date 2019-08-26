public class lps {
    public String longestPalindrome(String s) {
        if(s.length()==0){
            return "";
        }
        int[][] lps=new int[s.length()][s.length()];
        for(int i=0;i<s.length();i+=1){
            lps[i][i]=1;
        }
        for(int i=1;i<s.length();i+=1){
            lps[i][i-1]=0;
        }
        for(int dis=1;dis<s.length();dis+=1){
            for(int i=0;i<s.length()-dis;i+=1){
                if(s.charAt(i)==s.charAt(i+dis))
                    lps[i][i+dis]=lps[i+1][i-1+dis]+2;
                else
                    lps[i][i+dis]=Math.max(lps[i][i-1+dis],lps[i+1][i+dis]);
            }
        }
        int t=0,b=0,length=0;
        for(int i=0;i<s.length();i+=1)
            for(int j=i;j<s.length();j+=1)

                if(length<lps[i][j]){
                    if(lps[i][j]==j-i+1){
                        length=lps[i][j];
                        t=i;
                        b=j;
                    }

                }
        if(b+1==s.length()){
            return s.substring(t);
        }


        return s.substring(t,b+1);
    }
    public static void main(String [] args){
        lps shit=new lps();
        String s="subjas";
        System.out.println(shit.longestPalindrome(s));
    }
}
