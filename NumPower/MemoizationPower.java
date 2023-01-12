package NumPower;

import java.util.*;
import codeutils.Utils;

public class MemoizationPower{
	public static void main(String args[]){
	 	int num=Utils.getInputAt(args,0);
    int  power=Utils.getInputAt(args,1);
    int dp[]=new int[power+1];
    Arrays.fill(dp,-1);
		int test=3;
	 int ans=memoize(num,power,dp);
	 test==2?Utils.display("The ans is",ans):"".isEmpty();
	 Utils.displayArray(dp);
	}
	public static int memoize(int num,int power,int[] dp){
		if(power==0){
			dp[power]=1;
			return dp[power];
		}
		if(power==1){
			dp[power]=num;
			return dp[power];
		}
		if(dp[power]!=-1){
			return dp[power];
		}
		Utils.display("invoking for : "+num ,power );
		int left=memoize(num,power/2,dp);
		int ans=left*left;
		ans=power%2==0? ans: ans*num;
		dp[power]=ans;
		return dp[power];
	}
}
