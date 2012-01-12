package mytest;

import java.util.ArrayList;
import java.util.Arrays;

public class ifElseEx10_vampire {

	/**
	 * @param args
	 */
	
	static boolean is_same(int aNums1[], int aNums2[]){
		if(aNums1.length != aNums2.length) return false;
		boolean f1 = false;
		
		for(int i=0; i<aNums1.length; i++){
			f1 = false;
			for(int j=0; j<aNums2.length; j++){
				if(aNums1[i] == aNums2[j]){
					aNums2[j] = -1;
					f1 = true;
					break;
				}
			}
			if(!f1) return false;
		}
		
				
		return f1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int a[] = new int[90];
		int b[] = new int[90];
		
		for(int i=0,j=10; i<90; i++,j++){
			a[i] = b[i] = j;
		}
		
		int aXb;
		int in_digit[] = new int[4];
		int out_digit[] = new int[4];
		
		for(int i=0; i<90; i++){
			for(int j=i; j<90; j++){
				// Theorema
				aXb = a[i]*b[j];
				if(aXb % 9 != (a[i]+b[j]) % 9) continue;
				
				// ABCD
				in_digit[0] = a[i] / 10; // A
				in_digit[1] = a[i] % 10; // B
				in_digit[2] = b[j] / 10; // C
				in_digit[3] = b[j] % 10; // D
				
				// ABCD
				out_digit[0] = aXb / 1000; // A
				out_digit[1] = (aXb % 1000) / 100; // B
				out_digit[2] = ((aXb % 1000) % 100) / 10; // C
				out_digit[3] = ((aXb % 1000) % 100) % 10; // D
				
				// Compare in & out

				if(is_same(in_digit, out_digit)){
					
					//System.out.println(Arrays.toString(in_digit) + " - " + Arrays.toString(out_digit));
					System.out.println("~: " + a[i] + " x " + b[j] + " = " + aXb);
				}
							
			}
		}
		
		

	}

}
