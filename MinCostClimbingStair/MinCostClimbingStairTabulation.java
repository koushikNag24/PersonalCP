package MinCostClimbingStair;

import java.util.*;
import codeutils.Utils;
public class MinCostClimbingStairTabulation{
  public static void main(String args[]){
    int n=Utils.getInputAt(args,0);
    int[] cost=Utils.getArray(args,1);
    int ans=dpTabulate(n,cost);
    Utils.display("The ans : ",ans);
  }
  private static int dpTabulate(int n,int[] cost){
    int[] dp=new int[n+1];
    Arrays.fill(dp,-1);
    for(int i=0;i<n+1;i++){
      if(i==0){
        dp[i]=cost[i];
        continue;
      }if(i==1){
        dp[i]=Math.min(cost[i],dp[i-1]);
        continue;
      }
        int min=Math.min(dp[i-1],dp[i-2]);
        int cst=min+cost[i];
        dp[i]=cst;
    }
    Utils.displayArray(dp);
    return dp[n];
  }
}
