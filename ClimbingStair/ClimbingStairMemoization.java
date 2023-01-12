package ClimbingStair;

import java.util.*;
import java.io.*;
import codeutils.Utils;

public class ClimbingStairMemoization{
  public static void main(String args[]){
    int stairs=Utils.getInputAt(args,0);
    int dp[]=new int[stairs+1];
    Arrays.fill(dp,-1);
    int noOfWays=memoize(stairs,dp);
    Utils.display("The ans is ",noOfWays);
    Utils.displayArray(dp);
  }
  private static int memoize(int stairs,int[] dp){
    if(stairs<0)return 0;
    if(stairs==0){
      dp[stairs]=1;
      return dp[stairs];
    }
    if(dp[stairs]!=-1){
      return dp[stairs];
    }
    int ans=memoize(stairs-1,dp)+memoize(stairs-2,dp);
    dp[stairs]=ans;
    return dp[stairs];
  }

}
