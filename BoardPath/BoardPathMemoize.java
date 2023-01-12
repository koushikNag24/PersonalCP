package BoardPath;

import java.util.*;
import codeutils.Utils;

public class BoardPathMemoize{
  public static void main(String args[]){
    int n=Utils.getInputAt(args,0);
    int[] dice={3,2,1,4,6,5};
    Arrays.sort(dice);
    int[] dp=new int[n+1];
    int ans=memoize(n,dice,dp);
    Utils.display("BoardPathMemoize :" ,ans);
    Utils.displayArray(dp);
  }
  private static int memoize(int n,int[] dice,int[] dp){
    if(n<0){
      dp[n]=0;
      return dp[n];
    }
    if(n==0){
      dp[n]=1;
      return dp[n];
    }
    int ans=0;
    for(int i=0;i<dice.length;i++){
      int move=dice[i];
      int position=n-move;
      if(position<0){
        break;
      }
      ans+=memoize(position,dice,dp);
    }
    dp[n]=ans;
    return dp[n];
  }
}
