package ClimbingStair;
import java.util.*;
import codeutils.Utils;
public class ClimbingStairTabulation{
  public static void main(String args[]){
    int n=Utils.getInputAt(args,0);
    int ans=dpTabulate(n);
    Utils.display("The ans is ",ans);
  }
  private static int dpTabulate(int n){
    int[] dp=new int[n+1];
    Arrays.fill(dp,-1);
    for(int i=0;i<=n;i++){
      if(i==0){
        dp[i]=1;
        continue;
      }if(i==1){
        dp[i]=dp[i-1];
        continue;
      }if(i==2){
        dp[i]=dp[i-2];
        continue;
      }
      int ans=dp[i-1]+dp[i-2];
      dp[i]=ans;
    }
    Utils.displayArray(dp);
    return dp[n];
  }
}
