import java.util.*;
public class perfect_square {
    //PriorityQueue<Integer> aka;
    int k=Integer.MAX_VALUE;//bear this shit in mind
    public int numSquares(int n) {
        long p=Math.round(Math.floor(Math.pow(n,0.5)));
        int a=Math.toIntExact(p);
        // aka=new PriorityQueue();

        helper(0,a,n);
        return k;
    }
    public void helper(int counter,int a,int n){
        if(n==0){
            //aka.add(counter);
            k=Math.min(k,counter);
            return ;
        }
        if(n<0){
            return ;
        }
        for(int i=a;i>=1;i-=1){
            if(counter+1>k){
                continue;
            }
            helper(counter+1,i,n-i*i);


        }
        return ;
    }
}

