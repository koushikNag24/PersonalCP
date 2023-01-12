package fibonacci;

import java.util.*;
import codeutils.Utils;
public class TabulationfibConstSpace{
	static long totalOps=0;
	public static void main(String args[]){		
		int input=Utils.getInputAt(args,0);
		Utils.display("The input is",input);
		int ans=solve(input);
		Utils.display("The answer is",ans);
		Utils.display("Total OPerations performed ",totalOps);
	}
	public static int solve(int num){
		int a=0,b=1,c =a+b;
		for(int i=1;i<=num;i++){
			a=b;
			b=c;
			c=a+b;
			totalOps++;
		}
		return a;
		
	}
}
