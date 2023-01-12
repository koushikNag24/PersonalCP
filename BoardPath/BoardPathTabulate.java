package BoardPath;

import java.util.*;
import codeutils.Utils;

public class BoardPathTabulate{
  public static void main(String args[]){
    int n=Utils.getInputAt(args,0);
    int[] dice={3,2,1,4,6,5};
    Arrays.sort(dice);
    int ans=tabulate(n,dice);
    Utils.display("BoardPathTabulate :" ,ans);

  }
  private static int tabulate(int n,int[] dice){
    int[] dp=new int[n+1];
    for(int i=0;i<=n;i++){
      if(i<=1){
        dp[i]=1;
        continue;
      }
      if(i>1 && i<=6){
        dp[i]=2*dp[i-1];
        continue;
      }
      int sub=dp[i-7];
      int ans=2*dp[i-1]-sub;
      dp[i]=ans;
    }
    Utils.displayArray(dp);
    return dp[n];
  }
}
