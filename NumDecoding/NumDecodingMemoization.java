package NumDecoding;
import java.util.*;
import codeutils.Utils;

public class NumDecodingMemoization{
  public static void main(String[] args) {
      String input=args[0];
      int[] dp=new int[input.length()+1];
      Arrays.fill(dp,-1);
      int ans=numDecodingMemoize(input,input.length(),dp);
      Utils.display("NumDecodingMemoization : " ,ans);
          Utils.displayArray(dp);
  }
  private static int numDecodingMemoize(String input,int n,int[] dp){
    if(n==0){
      dp[n]=1;
      return dp[n];
    }
    if(dp[n]!=-1){
      return dp[n];
    }
    int count=0;
    if(input.charAt(0)!='0'){
      count+=numDecodingMemoize(input.substring(1,n),n-1,dp);
    }
    if(n>1 && Integer.parseInt(input.substring(0,2))>=10 && Integer.parseInt(input.substring(0,2))<=26){
      count+=numDecodingMemoize(input.substring(2,n),n-2,dp);
    }
    dp[n]=count;
    return dp[n];
  }
}
