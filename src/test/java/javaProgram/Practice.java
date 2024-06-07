package javaProgram;

import java.util.HashMap;
import java.util.Map;

public class Practice {

	public static void main(String[] args) {
		
		int a[]= {3,2,24,22,232};
		System.out.print("Before Ascending order : ");
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
		int temp=0;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				
				if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.print("After Ascending order : ");
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
