package BoardPath;

import java.util.*;
import codeutils.Utils;

public class BoardPathArray{
  public static void main(String args[]){
    int n=Utils.getInputAt(args,0);
    int[] dice={3,2,1,4,6,5};
    Arrays.sort(dice);
    int ans=tabulateArray(n,dice);
    Utils.display("BoardPathArray :" ,ans);
  }
  private static int tabulateArray(int n,int[] dice){
    int len=7;
    int ans=0;
    int[] dp=new int[len];
    for(int idx=0;idx<=n;idx++){
      if(idx<=1 ){
        dp[idx]=1;
          ans=dp[idx];
        continue;
      }
      if(idx>=2 && idx<=6){
        dp[idx]=2*dp[idx-1];
          ans=dp[idx];
        continue;
      }
      int index=(idx)%len;
      dp[index]=2*dp[(idx-1)%len]-dp[index];
      ans=dp[index];
    }
    Utils.displayArray(dp);
    return ans;

  }
}
