
public class word_search {
    class Solution {//此题的精妙之处在于一个记录是否用过的ak就能一次性用完，不用重复
        public boolean exist(char[][] board, String word) {
            Boolean bool=false;
            //Set<Integer> set;
            Boolean[][] ak=new Boolean[board.length][board[0].length];
            for(int sb=0;sb<board.length;sb+=1){
                for(int ssb=0;ssb<board[0].length;ssb+=1){
                    ak[sb][ssb]=false;
                }
            }
            for(int i=0;i<board.length;i+=1){
                for(int j=0;j<board[0].length;j+=1){
                    //set=new HashSet();
                    if(bool){
                        return bool;
                    }
                    bool=helper(board,ak,word,i,j);
                }
            }
            return bool;
        }
        public Boolean helper(char[][] b,Boolean[][] ak,String w,int i,int j){
            //int p=i*10+j;
            if(ak[i][j]){
                return false;
            }
            if(w.length()==1){
                if(w.charAt(0)==b[i][j]){
                    return true;
                }
                return false;
            }
            Boolean now=(w.charAt(0)==b[i][j])? true:false;
            if(!now){
                return now;
            }
            ak[i][j]=true;
            Boolean right=(j<b[0].length-1)?helper(b,ak,w.substring(1),i,j+1):false;
            if(right){
                return right;
            }
            Boolean down=(i<b.length-1)?helper(b,ak,w.substring(1),i+1,j):false;
            if(down){
                return down;
            }
            Boolean left=(j>0)?helper(b,ak,w.substring(1),i,j-1):false;
            if(left){
                return left;
            }
            Boolean up=(i>0)?helper(b,ak,w.substring(1),i-1,j):false;
            if(up){
                return up;
            }
            if(left||right||up||down){
                return true;
            }
            ak[i][j]=false;//点睛之笔，首尾呼应
            return false;
        }
    }
}
