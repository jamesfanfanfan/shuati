package com.easyversion;
import java.util.*;
//7.25 version 1 :Runtime: 2 ms, faster than 60.93% of Java online submissions for Valid Parentheses.
//Memory Usage: 34.4 MB, less than 99.97% of Java online submissions for Valid Parentheses.
public class validparenthess {
    public boolean isValid(String s) {
        Map<Character,Boolean> containerA=new HashMap<>();
        Map<Character,Character> containerB=new HashMap<>();
        containerA.put('(',true);
        containerA.put('{',true);
        containerA.put('[',true);
        containerB.put(')','(');
        containerB.put('}','{');
        containerB.put(']','[');

        char [] chara=s.toCharArray();
        Stack<Character> helper=new Stack<>();
        if(chara.length<1){
            return true;
        }


        for(int i=0;i<chara.length;i+=1){
            if(containerA.containsKey(chara[i])){
                helper.push(chara[i]);
                continue;
            }
            if(helper.empty()){
                helper.push(chara[i]);
                continue;
            }

            if(containerB.get(chara[i])==helper.peek()){
                helper.pop();
                continue;
            }
            helper.push(chara[i]);

        }
        return helper.empty();

    }

}
