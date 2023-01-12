package NumPower;

import java.util.*;
import codeutils.Utils;

public class TabulationPower{
	public static void main(String args[]){
	 int num=Utils.getInputAt(args,0);
         int  power=Utils.getInputAt(args,1);
	 int ans=memoize(num,power);
	 Utils.display("The ans is",ans);	
	}
	public static int memoize(int num,int power){		
		HashMap<String,Integer> map=new HashMap();
		int limit=(int)Math.pow(num,power);
		for(int i=1;i<=power;i++){			
			if(i==1){
				String key=num+"#"+i;
				if(!map.containsKey(key)){
					map.put(key,num);
					continue;
				}
			}	
			String key=num+"#"+i;
			String keyToSearch=num+"#"+i/2;
			 Utils.display("keyToSearch" ,keyToSearch);
			if(!map.containsKey(key)){
				int left=map.getOrDefault(keyToSearch,1);
				 Utils.display("left" ,left);
				int ans=left*left;
				ans=i%2==0? ans: ans*num;
				map.put(key,ans);
				continue;
			}
		}
		String key=num+"#"+power;
		String keyToSearch=num+"#"+power/2;
		if(!map.containsKey(key)){
				int left=map.getOrDefault(keyToSearch,1);
				 Utils.display("left" ,left);
				int ans=left*left;
				ans=power%2==0? ans: ans*num;
				map.put(key,ans);
			}
		 Utils.displayMap(map);		 	
		return map.get(key);
	}
}
