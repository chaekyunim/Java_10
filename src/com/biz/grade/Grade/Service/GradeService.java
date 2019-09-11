package com.biz.grade.Grade.Service;

import java.util.Scanner;

public class GradeService {

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
    public void input( ) {
      for(int i = 0 ; i < intKor.length ; i++) {
    	  
    	  // 1.변수를 사용하여 3줄로 작성한 코드
    	  // String strKor = scan.nextLine();
    	  // int intKor = Integer.valueOf(strKor)
    	  // this.intKor[i] = intKor;
    	  
    	  // 2. 무나졍ㄹ 변수 사용을 하지 않고
    	  // 2줄로 작성한 코드

    	  
    	  
    	  
    	  
    	  System.out.print((i+1) + "번 국어");
    	  //Stirng strKor = scan.nextLine();
    	  // int intKor = Integer.valueOf(strKor);
    	  int intKor = Integer.valueOf(scan.nextLine());
    	  this.intKor[i] = intKor;
    	  
    	  System.out.print((i+1) + "번 영어");
    	  int intEng = Integer.valueOf(scan.nextLine());
    	  this.intEng[i] = intEng;
    	  
    	  System.out.print((i+1) + "번 수학");
    	  int intMath = Integer.valueOf(scan.nextLine());
    	  this.intMath[i] = intMath;
      }
      private void total(int index) {
    	  int intTotal = this.intKor[index];
    	  intTotal += this.intEng[index];
    	  intTotal += this.intMath[index];
      }
      
    	public void view() {
    		System.out.println("========================")
    		System.out.println("성적 알람표");
    		System.out.println("------------------------")
    		System.out.println("국어|t영어|t수학|t총점");
    		for(int i = 0 ; i < intKor.length ; i++) {
    			System.out.printf("%d|t%d|t%d|t%d|n",
    					this.intKor[i];
    			        this.intEng[i];
    			        this.intMath[i];
    			        this.sum
    		}
    		System.out.println("=========================");
    		//view() end
    		
    	}
    	// 총점 점수를 기준으로 내림차순정렬을 하자
    	public void sort() {
    		for(int i = 0 ; i < sum.length ; i++) {
    			for(int j = 0 ; j < sum.length ; j++) {
    				
    				// 내림차순 정렬
    				if(sum[i]) < sum[j]) {
    				
    				int _temp = sum[i];
    				sum[j] = sum[j];
    				
    				// 국어점수
    				_temp = intKor[i];
    				intKor[i] = intKor[j];
    				intKor[j] = _temp;
    				
    				// 수학점수
    				_temp = intMath[i];
    				intMath[i] = intMath[j];
    				intMath[j] = _temp;
    				
    				// 영어점수
    				_temp = intEng[i];
    				intEng[i] = intEng[j];
    				intEng[j] = _temp;
    			
    			}
    			}
    		}
    	}
    	
    }
}

