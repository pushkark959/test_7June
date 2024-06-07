package javaProgram;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewJavaProgram {

	public static void main(String[] args) throws IOException {
		
		/*
		// 1.Find the Factorial of the given number
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		
		*/
		
		/*
		//2. Find the reverse of the number
		int n = 12345;
		int rev;
		while(n>0) {
			rev=n%10;
			System.out.print(rev);
			n=n/10;
		}
		*/
		/*
		//3. Check whether the number is palindrome or not
		
		int n=121;
		int s;
		int r=0;
		int p=n;
		while(n>0) {
			s=n%10;
			r=(r*10)+s;
			n=n/10;
		}
		if(p==r) {
			System.out.println("It is a palindrome number : "+r);
		}
		else{
			System.out.println("It is NOT a palindrome number : "+r);
		}
		*/
		
		/*
		//4. Check whether the number is amstrong or not
		
		int n=153;
		int r;
		int s=0;
		int p=n;
		while(n>0) {
			r=n%10;
			s=(r*r*r)+s;
			n=n/10;
		}
		if(p==s) {
			System.out.println("It is a Armstrong number : "+s);
		}
		else{
			System.out.println("It is NOT a Armstrong number : "+s);
		}
		*/
		
		/*
		//5. Print the amstrong number available between 0 to 1000
		
		int s;
		for(int i=0;i<=1000;i++){
			int n=i;
			int r=0;
			while(n>0) {
				s=n%10;
				r=(s*s*s)+r;
				n=n/10;
			}
			if(i==r) {
				System.out.println(r);
			}
		}
		*/
		/*
		//6. To print the palindrome available between 0 to 100
		
		int r;
		for(int i=1;i<=100;i++) {
			int s=0;
			int n=i;
			while(n>0) {
				r=n%10;
				s=(s*10)+r;
				n=n/10;
			}
			if(i==s) {
				System.out.println(s);
			}
		}
		*/
		/*
		//7. Print the count of the given number
		
		int n=123456;
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
		*/
		
		/*
		//8. Find the Sum of the digit
		
		int n=123456;
		int r;
		int sum=0;
		while(n>0) {
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("Sum of digit : "+sum);
		*/
		/*
		//9.Swap of two number using third variable
		int a=10;
		int b=20;
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		*/
		
		/*
		//10.Swap of two variable without using third variable
		
		int a=10;
		int b=20;
		b=a+b;
	    a=b-a;
	    b=b-a;
	    System.out.println(a);
	    System.out.println(b);
	    */
		/*
		//11. To find even/odd number:
		
		int a=10;
		if(a%2==0) {
			System.out.println("It is even number : "+a);
		}
		else {
			System.out.println("It is Odd number : "+a);
		}
		*/
		/*
		//12. Count of even and odd count between 1 to 100
		
		int count_even=0;
		int count_odd=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				count_even++;
			}
			else {
				count_odd++;
			}
		}
		System.out.println(count_even);
		System.out.println(count_odd);
		*/
		/*
		//13. Fibonacci series:
		int a=0;
		int b=1;
		int c;
		for(int i=0;i<=10;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
      */
		/*
		 //14. Print the value in Fibonacci series up to 100

		 */
		/*
		 //14. Print the value in Fibonacci series up to 100

		int a=0;
		int b=1;
		int c;
		for(int i=0;i<=100;i++) {
			c=a+b;
			a=b;
			b=c;
			if(c>100) {
				break;
			}
			System.out.println(c);
		}
		*/
		
		/*
		//15. Reverse the String
		
		String s="pushkar";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse of number : "+rev);
         */
		/*
		//16.To Check the String is palindrome or not.
		String s="lol";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s)) {
			System.out.println("It is a palindrome String : "+rev);
		}
		else {
			System.out.println("It is NOT a palindrome String : "+rev);
		}
		*/
		
		//17.Count of each Character in the String
		String s="I love my india";
		String s2=s.toLowerCase();
		String s3= s2.replace(" ", "");
		System.out.println(s2);
		
		Map<Character, Integer> charMapCount = new HashMap<Character,Integer>();
		for(Character c :s3.toCharArray()) {
			if(!charMapCount.containsKey(c)) {
				charMapCount.put(c,1);
			}
			else {
				charMapCount.put(c,charMapCount.get(c)+1);
			}
		} ////String= "Abc vfdghddg"
		System.out.println(charMapCount);
		
		
		//18.Count of each Word
		/*
		String s = "I Love My India";
		int count =1;
		for(int i=0;i<=s.length()-1;i++) {
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println(count);
		*/
		
		//19. Print the numbers in ascending order
		/*
		int a[]= {3,2,24,22,232};
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		int t=0;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]>a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("After ascending order : ");
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		*/
		
		/*
		//20.Print the numbers in descending order
		int a[]= {2,223,12,23,6544};
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		int t=0;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]<a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("After Descending Order : ");
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		*/
		/*
		//21.Print Triangle with Stars
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		/*
		//22. Assume the string is he,xa,wa,re and give the output as
		String s="he,xa,wa,re";
		String t=s.replace(",", "");
		System.out.println(t);
		*/
		
		//23.Find the special character, uppercase, lowercase, Number of digits in the given string
		/*
		String s="I love My India";
		int count_uppercase=0;
		int count_lowercase=0;
		int count_number=0;
		int count_specialcharacter=0;
		for(int i=0;i<=s.length()-1;i++) {
			if((s.charAt(i)>='A')&&(s.charAt(i)<='Z')) {
				count_uppercase++;
			}
			else if((s.charAt(i)>='a')&&(s.charAt(i)<='z')) {
				count_lowercase++;
			}
			else if((s.charAt(i)>='0')&&(s.charAt(i)<='9')) {
				count_number++;
			}
			else {
				count_specialcharacter++;
			}	
		}
		System.out.println("Count of uppercase : "+count_uppercase);
		System.out.println("Count of uppercase : "+count_lowercase);
		System.out.println("Count of uppercase : "+count_number);
		System.out.println("Count of uppercase : "+count_specialcharacter);
		*/
		/*
		//24. Print Reverse triangle without Space
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		/*
		//25 . Check Whether the given number is prime or not
		
		int n=25;
		int fact_count=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				fact_count++;
			}
		}
		if(fact_count>1) {
			System.out.println("It is a prime number : "+n);
		}
		else{
			System.out.println("It NOT a prime number : "+n);
		}
		*/
		
		//26. Print the prime numbers counts available between 1 to 100
		/*
		int count_prime=0;
		for(int i=1;i<=100;i++) {
			{
				int count_fact=0;
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						count_fact++;
					}
				}
				if(count_fact==0) {
					count_prime++;
					System.out.println(i+" ");
				}
			}
		}
		System.out.println("count of prime  "+count_prime);
		*/
		
		/*
		//27. Multiplication of the given number
		int n=5;
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
		}
		*/
		/*
		//28. Biggest of 4 number
		int a[]= {43,12,422,94};
		int max=a[0];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Largest Number : "+max);
		*/
		
		//29. Find the 3rd maximum Number in an given array
		/*
		int a[]={-12,45,-23,64,-100,24};
		int max=0;
		for(int i=1;i<a.length-1;i++) {
			{
				for(int j=i+1;j<a.length-1;j++) {
					if(a[i]<a[j]) {
						max=a[i];
						a[i]=a[j];
						a[j]=max;
					}
				}
			}
		}
		System.out.println("3rd highest score : "+a[2]);
		*/
		/*
		//30. Separate reverse of each word in the string
		String s="Green Apple";
		 String word[]=s.split(" ");
		 String reverse_string ="";
		 for(String w:word) {
			 String reverse_word="";
			 for(int i=w.length()-1;i>=0;i--) {
				 reverse_word=reverse_word+w.charAt(i);
				 }
			 reverse_string=reverse_string+reverse_word+" ";
		 }
		System.out.println("Reverse of the string : "+reverse_string);
		*/
		/*
		//31. Number triangle
		for(int i=1;i<=5;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		*/
		/*
		//32. Find the duplicate count in an array
		String a [] = {"java","java"};
		HashSet <String> s1 = new HashSet<>();
		boolean flag = false;
		for(String l:a) {
			if(s1.add(l)==false) {
				System.out.println("Duplicate Array : "+l);
				flag=true;
			}
		}
		if(flag=false) {
			System.out.println("No Duplicate Array");
		}
		*/
		/*
		//33.Find the duplicate count in the string
		
		String a [] = {"java","java","java","java"};
		int count_array=1;
		HashSet <String> s1 = new HashSet<>();
		boolean flag = false;
		for(String l:a) {
			if(s1.add(l)==false) {
				count_array++;
				flag=true;
			}
		}
		System.out.println("Count an array : "+count_array+"("+a[0]+")");
        */
		
		//34.Count of the palindrome number between 1 to 1000
		/*
		int count=0;
		for(int i=1;i<=1000;i++) {
			int s=0;
			int n=i;
			int r;
			while(n>0) {
				r=n%10;
				s=(s*10)+r;
				n=n/10;
			}
			if(s==i) {
				count++;
		}
		}
		System.out.println(count);
		*/
		/*
		//35. Count of the amstrong number
		int count =0;
		for(int i=1;i<=1000;i++) {
			int n=i;
			int r;
			int s=0;
			while(n>0) {
				r=n%10;
				s=(r*r*r)+s;
				n=n/10;
			}
			if(s==i) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Count of armstrng : "+count);
        */
		/*
		//36.Construct the triangle pyramid
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		*/
		
		//37. Count of vowels and non vowels
		/*
		String s2 = "WelCome";
		 s2 = s2.toLowerCase();
		System.out.println(s2);
		int count=0;
		for(int i=0;i<s2.length();i++) {
			if(s2.charAt(i)=='a'||s2.charAt(i)=='e'||s2.charAt(i)=='i'||s2.charAt(i)=='o'||s2.charAt(i)=='u');
			//if(s2.charAt(i)=='o')
			{
				count++;
			}
		}
		System.out.println(count);
		*/
		
		//38.Sum of the odd and even number
		
		/*
		int count_even=0;
		int count_odd=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				count_even++;
			}
			else if(i%2==1) {
				count_odd++;
			}
		}
		System.out.println("Count of even : "+count_even);
		System.out.println("Count of odd : "+count_odd);
		*/

         /*
		//Find the odd and even number from an array.
		
		int a[]= {2,4,5,34,67};
		int count_even=0;
		int count_odd=0;
		System.out.println("Even Numbers are : ");
		
		for (int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0) {
				count_even++;
				
				System.out.println(a[i]);
			}
		}
		System.out.println("Count of even Number : "+count_even);
		
		System.out.println("Odd Numbers are : ");
		for (int i=0;i<=a.length-1;i++) {
		if(a[i]%2==1) {
			System.out.println(a[i]);
			count_odd++;
		}
		}
		System.out.println("Count of Odd Number : "+count_odd);
        */
		
		/*
		//How to capture screenshot from web page.
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://testautomationpractice.blogspot.com/");
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		
		
		//capture full screenshot
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File target = new File("D:\\selnium workspace\\.metadata\\Demo_qa\\screenshot\\page.png");
//		FileUtils.copyFile(source, target);
//		
		//capture selected area screenshot
		WebElement map = driver.findElement(By.xpath("//div[@id='divDetailL1']"));
		File source = map.getScreenshotAs(OutputType.FILE);
		File target = new File("D:\\selnium workspace\\.metadata\\Demo_qa\\screenshot\\map.png");
		FileUtils.copyFile(source, target);
			*/
		
		
		//To find the broken link.
		


     






	}

}
