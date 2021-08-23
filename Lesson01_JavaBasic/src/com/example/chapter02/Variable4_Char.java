package com.example.chapter02;

public class Variable4_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char myChar = 'A';      //작은따옴표로 묶인 것은 문자
		String yourstr = "Apple";  //큰따옴표로 묶인 것은 문자열

		System.out.println(myChar);
		System.out.println(yourstr);
		
		//char 타입 변수는 ascii 로 출력할 수 있다.
		System.out.println((int)myChar);  // 65
		
		int newChar = 66;
		//ascii 코드값을 문자로 출력할 수 있다.
		System.out.println((char)newChar); //B
		
		
		for(int ch = 65; ch < 91;ch++) {
		    System.out.println((char)ch);
		}
		
		char ch1 = '한';
		char ch2 = '\uD55C';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		
		
	
		
}

}
