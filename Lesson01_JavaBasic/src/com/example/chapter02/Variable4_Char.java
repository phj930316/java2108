package com.example.chapter02;

public class Variable4_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char myChar = 'A';      //��������ǥ�� ���� ���� ����
		String yourstr = "Apple";  //ū����ǥ�� ���� ���� ���ڿ�

		System.out.println(myChar);
		System.out.println(yourstr);
		
		//char Ÿ�� ������ ascii �� ����� �� �ִ�.
		System.out.println((int)myChar);  // 65
		
		int newChar = 66;
		//ascii �ڵ尪�� ���ڷ� ����� �� �ִ�.
		System.out.println((char)newChar); //B
		
		
		for(int ch = 65; ch < 91;ch++) {
		    System.out.println((char)ch);
		}
		
		char ch1 = '��';
		char ch2 = '\uD55C';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		
		
	
		
}

}
