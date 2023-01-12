package NumDecoding;

import java.util.*;
import codeutils.Utils;

public class NumDecodingTabulation{
  public static void main(String[] args) {
    String s=args[0];
    int ans=tabulate(s);
    Utils.display("NumDecodingTabulation :",ans);
  }
  private static int tabulate(String s){
    int[] dp=new int[s.length()];
    for(int i=0;i<s.length();i++){
      if(i==0){
        dp[i]=1;
        continue;
      }
      if(s.charAt(i-1)=='0' && s.charAt(i)=='0'){
          dp[i]=0;
      }else if(s.charAt(i-1)=='0' && s.charAt(i)!='0'){
          dp[i]=dp[i-1];
      }else if(s.charAt(i-1)!='0' && s.charAt(i)=='0'){
        int value=Integer.parseInt(s.substring(i-1,i+1));
        if(value>=10 && value<=26){
          dp[i]=i>=2?dp[i-2]:1;
        }else{
          dp[i]=0;
        }
      }else{
        int value=Integer.parseInt(s.substring(i-1,i+1));
        if(value>=10 && value<=26){
            dp[i]=dp[i-1]+(i>=2?dp[i-2]:1);
        }else{
            dp[i]=dp[i-1];
        }
      }
    }
    Utils.displayArray(dp);
    return dp[s.length()-1];
  }
}
