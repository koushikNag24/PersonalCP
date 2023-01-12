package MinCostClimbingStair;

import codeutils.Utils;
import java.util.*;

public class MinCostClimbingStairMemoization{
  public static void main(String args[]){
    int n=Utils.getInputAt(args,0);
    int[] input=Utils.getArray(args,1);
    int dp[]=new int[n+1];
    Arrays.fill(dp,-1);
    memoize(n,input,dp);
    int ans=Math.min(dp[n],dp[n-1]);
    Utils.display("THe ans is ",ans);
    Utils.displayArray(dp);
  }
  private static int memoize(int n,int[] cost,int[] dp){
      if(n==0){
        dp[n]=cost[n];
        return dp[n];
      }if(n==1){
        dp[n]=cost[n];
        return dp[n];
      }
      if(dp[n]!=-1){
        return dp[n];
      }
      int min=Math.min(memoize(n-1,cost,dp),memoize(n-2,cost,dp));
      int cst=cost[n]+min;
      dp[n]=cst;
      return dp[n];
  }
}
