import  java.util.*;
public class phone_number {

        Map<Character,String> helpers=new HashMap<Character,String>(){{
            put('2',"abc");
            put('3',"def");
            put('4',"ghi");
            put('5',"jkl");
            put('6',"mno");
            put('7',"pqrs");
            put('8',"tuv");
            put('9',"wxyz");
        }};
        List<String> helpee=new ArrayList<>();
        List<String> finalk;
        public void helper(String digits,int i){
            if(i==digits.length()){

                return;
            }
            List<String> ee=helpee;
            helpee=new ArrayList<>();
            String z=helpers.get(digits.charAt(i));
            for(String sb:ee){
                for(int x=0;x<z.length();x+=1) {
                    String emmm=sb + z.substring(x, x + 1);
                    helpee.add(emmm);
                    System.out.print(emmm+" ");
                }
            }
            helper(digits,++i);
            return;
        }
        public List<String> letterCombinations(String digits){
            if(digits.length()==0){
                return helpee;
            }
            String l=helpers.get(digits.charAt(0));
            for(int i=0;i<l.length();){
                String j=l.substring(i,++i);
                helpee.add(j);
            }
            helper(digits.substring(1),0);
            return helpee;
        }



    public static void main(String [] args){
        phone_number shit=new phone_number();
        shit.letterCombinations("23");

    }


}
