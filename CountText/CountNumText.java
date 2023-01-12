package CountText;
import java.util.*;
import codeutils.Utils;

public class CountNumText{
  public static void main(String args[]){
    String s=args[0];
    int val=tabulate(s);
    Utils.display("Count ",val);
  }


private static int tabulate(String keyPressed){
  int[] dp =new int[keyPressed.length()+1];
  dp[0]=1;
  for(int i=1;i<=keyPressed.length();i++){

    char currentChar=keyPressed.charAt(i-1);

    if(i==1){
      dp[i]=1;
      continue;
    }
    dp[i]=dp[i-1];
    if(i>=2 && keyPressed.charAt(i-2)==currentChar){
      dp[i]+=dp[i-2];
    }else{
      continue;
    }
    if(i>=3 && keyPressed.charAt(i-3)==currentChar){
      dp[i]+=dp[i-3];
    }else{
      continue;
    }
    if(currentChar=='7' || currentChar=='9' && (i-4)>=0 && keyPressed.charAt(i-4)==currentChar){
      dp[i]+=dp[i-4];
    }

  }

  return dp[dp.length-1];

}
}
