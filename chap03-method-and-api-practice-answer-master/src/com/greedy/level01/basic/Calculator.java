package com.greedy.level01.basic;

public class Calculator {
	
	public void checkMethod(){
		System.out.println("메소드 호출 확인");
		
		return;
	}
	
	public int sum1to10(){
		int sum = 0;
		
		for(int i = 0; i <= 10; i++){
			sum += i;
		}
		
		return sum;
	}
	
	public void checkMaxNumber(int a, int b){
		int max = a;
		
		if(a > b){
			max = a;
		}
		if(b > a){
			max = b;
		}
		
		System.out.println("두 수 중 큰 수는 " + max + "이다.");
		
		return;
	}
	
	public int sumTwoNumber(int a, int b){
		int sum = a + b;
		
		return sum;
	}
	
	public int minusTwoNumber(int a, int b){
		
		return a - b;
	}
	
}
