package MinCostClimbingStair;

import java.util.*;
import codeutils.Utils;

public class MinCostClimbingStair_2Pointer{
  public static void main(String args[]){
    int n=Utils.getInputAt(args,0);
    int[] cost=Utils.getArray(args,1);
    int ans=minCostClimbing_2_Pointer(n,cost);
    Utils.display("Min Cost Climbing Stair 2 Pointer :",ans);
  }
  private static int minCostClimbing_2_Pointer(int n,int[] cost){
    int a=cost[0];
    int b=cost[1];
    int[] dp=new int[cost.length];
    dp[0]=a;
    dp[1]=b;
    int cst=0;
    for(int i=2;i<cost.length;i++){
      int min=Math.min(a,b);
      cst=min+cost[i];
      a=b;
      b=cst;
      //dp[i-1]=b;
      //dp[i-2]=a;
      dp[i]=cst;
    }
    Utils.displayArray(dp);
    return cst;
  }
}
