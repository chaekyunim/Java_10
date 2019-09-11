package com.biz.grade.Grade.Service;

import java.util.Scanner;

public class GradeServiceV2 {

	private int[] intKor;
    private int[] intEng;
    private int[] intMath;
    
    private int[] sum;
    
    
    private int[]  sum1;
     
    // 생성자(메서드) 만들기
    // public 으로 선언
    // 메서드 이름은 클래스 이름과 같게
    // (void,int,String 등등 키워드 붙이지 못함)
    public GradeService(int length) {
    
    	// 여기에서 4의 맴버 배열변수들을 사용할수 있도록
    	// 생성하는 일(연산)을 수행
    	intKor = new int[length];
    	intEng = new int[length];
    	intMath = new int[length];
    	
    	
    	sum = new int[length];
    	
    	scan = new Scanner(System.in);
    	
	} // GradeService() end
    
    // 배열의 갯수만큼 각 과목의 점수를 입력
    public void inputKor(int index ) {
      for(int i = 0 ; i < intKor.length ; i++) 
    	  this.intKor[i];
          this.intEng[i];
          this.intMath[i];
    
      }
    	public void view() {
    		System.out.println("========================")
    		System.out.println("성적 알람표");
    		System.out.println("------------------------")
    		System.out.println("국어|t영어|t수학");
    		for(int i = 0 ; i < intKor.length ; i++) {
    			System.out.print("%d|");
    			
    }// input() end
    

      	  System.out.print((i+1) + "번 국어>> ");     
      	  int intKor = Integer.valueOf(scan.nextLine());
      	  this.intKor[i] = intKor;
    		
      	 System.out.print((i+1) + "번 영어>> ");
   	     int intEng = Integer.valueOf(scan.nextLine());
   	     this.intEng[i] = intEng;
   	     
   	     System.out.print((i+1) + "번 수학>> ");
	     int intMath = Integer.valueOf(scan.nextLine());
	     this.intMath[i] = intMath;
}
    }	