 class Solution2 {
     public String countAndSay(int n) {
         if(n==1){
             return "1";
         }
         int i=2;
         StringBuilder helper=new StringBuilder();
         helper.append("1");
         while(i<=n){
             String sb=helper.toString();
             helper=new StringBuilder();
             int j=0;
             while(j<sb.length()){
                 char a=sb.charAt(j);
                 if(j==sb.length()-1){
                     helper.append("1");
                     helper.append(a);
                     break;
                 }
                 for(int s=j+1;s<sb.length();s+=1){
                     if(s==sb.length()-1){
                         if(sb.charAt(s)==a){
                             helper.append(sb.length()-j);
                             helper.append(a);
                             j=sb.length();
                             break;
                         }
                     }
                     if(sb.charAt(s)==a){
                         continue;
                     }
                     helper.append(s-j);
                     helper.append(a);
                     j=s;
                     break;
                 }
             }
             i+=1;
         }
         return helper.toString();
     }
        public static void main(String [] args){
            Solution2 helper=new Solution2();
            System.out.println(helper.countAndSay(3));
        }
    }

