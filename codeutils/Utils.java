package codeutils;

import java.util.*;
import java.io.*;
public class Utils{
	public static void main(String args[]){
		//int args1=getInputAt(args,0);
		//System.out.println("The input value is : "+args1);
	}
	public static int getInputAt(String[] args,int idxOfInput){
		String input=args[idxOfInput];
		return Integer.parseInt(input);
	}
	public static int[] getArray(String[] args,int idx){
		String value=args[idx];
		String[] array=value.split(",");
		int[] result=Arrays.stream(array).
								mapToInt(Integer::parseInt)
								.toArray();
		return result;
	}
	public static <T> void display(String heading,T displayValue){
			System.out.println(heading + " :"+displayValue);
	}
	public static <T> void displayArray(int[] displayValue){
			System.out.println(Arrays.toString(displayValue));
	}
	public static <T> void displayMap(HashMap<String,Integer> displayValue){
			System.out.println(displayValue.toString());
	}
}
