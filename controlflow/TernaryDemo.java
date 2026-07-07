package controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* Author : sirin
* Date : Jul 6, 2026
* Time : 9:19:41 AM
* Email : sirinandini.a@gmail.com
*/

public class TernaryDemo {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int num1,num2,result;
		
		System.out.println("Enter 2 Numbers : ");
		num1=Integer.parseInt(br.readLine());
		num2=Integer.parseInt(br.readLine());
		
		//Ternary Operator to check Simple Conditions
		
		String msg = (num1 > num2) ? "Num1 is Greatest" : "Num2 is Greatest";
		System.out.println(msg);
		
		result = (num1 > num2)? num1 : num2;
		System.out.println("The Maximum of 2 Numbers is : "+result);
		
	}

}
