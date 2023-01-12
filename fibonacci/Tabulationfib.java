package fibonacci;

import java.util.*;
import codeutils.Utils;
public class Tabulationfib{
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
		for(int i=0;i<=num;i++){
			totalOps++;
			if(i<=1){
				dp[i]=i;
				continue;
			}
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[num];
		
	}
}
