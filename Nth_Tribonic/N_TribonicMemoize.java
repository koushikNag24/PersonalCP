package Nth_Tribonic;

import java.util.*;
import codeutils.Utils;

public class N_TribonicMemoize{
  public static void main(String args[]){
    int n=Utils.getInputAt(args,0);
    int[] dp=new int[n+1];
    Arrays.fill(dp,-1);
    int ans=memoize(n,dp);
    Utils.display("N_Tribonic : ",ans);
    Utils.displayArray(dp);
  }
  private static int memoize(int n,int[] dp){
    if(n<=1 && n>=0){
      dp[n]=n;
      return dp[n];
    }
    if(n==2){
      dp[n]=1;
      return dp[n];
    }
    if(dp[n]!=-1){
      return dp[n];
    }
    int ans=memoize(n-1,dp)+memoize(n-2,dp)+memoize(n-3,dp);
    dp[n]=ans;
    return dp[n];
  }
}
