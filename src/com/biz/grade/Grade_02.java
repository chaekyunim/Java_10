package com.biz.grade;

import java.util.Scanner;

public class Grade_02 {

	
	 
	 private static int[] intKor;
	 
	
	 private static Scanner scan;
	 
	 public static void main(String[] args) {
	
	 int[] Kor = new int[5];
	 for(int i = 0 ; i < intKor.length; i++) { 
	     intput(i);                    
	 } 
	 System.out.print("국어점수 >> ");
	 String strKor = scan.nextLine();
	  
	 
	 
	  intKor[0] = Integer.valueOf(strKor);
	  
	  // main()에서 배열으 개수만큼 반복적으로
	  // view() 메서드에게 국어점수를 표시하라고 지시
	  
	 for(int i = 0 ; i <intKor.length ; i++) {
		 view(i);
	 }
	  view(intKor);
	  
	 // main end
	  
	  
	  
	  
	  
	  for(int i = 0 ; i < intKor.length; i++) { 
          
		  //index번째 배열의 국어점수를 표시
		  
		  System.out.print("(index+1)+ "번의 국어 >> ");
		  String strKor1 = scan.nextLine();
		intKor[index] = Integer.valueOf(strKor1);
	  }  
	  
	 // intKor
	 
	  public static void view(int index) {
		  System.out.println(intdex+1)
		          + "번 국어 : "
		          + intKor[index]);
		    }
	  
	  public static void view(int[] intKor) {
		  for(int i ; 0 ; i < intKor.length ;i++) {
			  System.out.println();
		  }
	  }
	  
	}

}
