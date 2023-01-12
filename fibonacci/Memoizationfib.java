package fibonacci;

import java.util.*;
import codeutils.Utils;
public class Memoizationfib{
	static long totalOps=0;
	public static void main(String args[]){		
		int input=Utils.getInputAt(args,0);
		Utils.display("The input is",input);
		int[] dp=new int[input+1];
		Arrays.fill(dp,0);
		int ans=solve(input,dp);
		Utils.displayArray(dp);
		Utils.display("The answer is",ans);
		Utils.display("Total OPerations performed ",totalOps);
	}
	public static int solve(int num,int[] dp){
		Utils.display("Performing operation for " ,num);		
		totalOps++;
		if(num<=1){
			dp[num]=num;
			return dp[num];
		}	
		if(dp[num]!=0){
			return dp[num];
		}
		int ans=solve(num-1,dp)+solve(num-2,dp);
		dp[num]=ans;
		return dp[num];
		
	}
}
