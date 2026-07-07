package controlflow;

/**
 * Author : sirin
 * Date : Jul 6, 2026
 * Time : 12:22:54 PM
 * Email : sirinandini.a@gmail.com
 */

public class NestedLoopDemo1 {


	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("*"+"\t");
			}
			System.out.println();
		}

	}

}

