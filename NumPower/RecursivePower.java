package NumPower;

import java.util.*;
import codeutils.Utils;

public class RecursivePower{
	public static void main(String args[]){
	 int num=Utils.getInputAt(args,0);
         int  power=Utils.getInputAt(args,1);
	 long ans=recur(num,power);
	 Utils.display("The ans is",ans);	
	}
	public static long recur(int num,int power){
		
		if(power==0)return 1;
		if(power==1)return num;
		Utils.display("invoking for : "+num ,power );
		long left=recur(num,power/2);
		long right=recur(num,power/2);
		long ans=left*right;
		ans=power%2==0? ans: ans*num;
		return ans;
	}
}
