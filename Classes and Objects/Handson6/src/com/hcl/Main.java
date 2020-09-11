package com.hcl;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		String name;
	     long runs;
	     String detail;
	     
	     Scanner input=new Scanner(System.in);
  
	     System.out.println("Enter Extra Type Details");
	     detail=input.nextLine();
	     
	     String[] items=detail.split("#");
	     name=items[0];
	     runs=Long.parseLong(items[1]);
	     
	     ExtraType e=new ExtraType(name,runs);
	     System.out.println("ExtraType Details");
	     System.out.println("ExtraType:"+e.getName());
	     System.out.println("Runs:"+e.getRuns());
	     
	     
	}
}
