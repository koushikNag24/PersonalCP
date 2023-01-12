package Nth_Tribonic;

import java.util.*;
import codeutils.Utils;

public class N_TribonicTabulate{
  public static void main(String args[]){
    int n=Utils.getInputAt(args,0);
    int ans=tabulate(n);
    Utils.display("N_Tribonic Tabulate : ",ans);
  }
  private static int tabulate(int n){
    int[] dp=new int[n+1];
    Arrays.fill(dp,-1);
    for(int i=0;i<=n;i++){
      if(i<=1){
        dp[i]=i;
        continue;
      }
      if(i==2){
        dp[i]=1;
        continue;
      }
      int ans=dp[i-1]+dp[i-2]+dp[i-3];
      dp[i]=ans;
    }
    Utils.displayArray(dp);
    return dp[n];
  }
}
