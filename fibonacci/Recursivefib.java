package fibonacci;

import java.util.*;
import codeutils.Utils;
public class Recursivefib{
	static long totalOps=0;
	public static void main(String args[]){
		
		int input=Utils.getInputAt(args,0);
		Utils.display("The input is",input);
		int ans=recur(input);
		Utils.display("The answer is",ans);
		Utils.display("Total OPerations performed ",totalOps);
	}
	public static int recur(int num){
		totalOps++;
		Utils.display("Performing operation for " ,num);
		if(num==0)return 0;
		if(num==1)return 1;
		return recur(num-1)+recur(num-2);
	}
}
