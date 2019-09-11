package com.biz.grade.Grade.Service;

import java.util.Random;

public class GradeVoService {

	private GradeVoService[] gradeVO;
	
	public void GradeVOService (int length) {
	Random rnd;
		
		gradeVO = new GradeVoService [length];
		for(int i = 0 ; i < gradeVO.length ; i++) {
			gradeVO[i] = new GradeVoService();
			
			
		}
		rnd = new Random();
		// GradeVoservie() end
	}
	//Ramdom을 이용해 점수 생서
	public void input() {
		
		//gradeVO 객체 배열의 개수만큼 반복하겠다.
		for(int i = 0 ; i < gradeVO.length ; i++) {
			
			// 학번을 00001 ~ 00???
			String strNum = String.format("%05d",(i+1));
			gradeVO[i].strNum = strNum;
			
			// 51부터 100까지의 읨의 숫자를 생성
			int intKor = rnd.nextInt(50) + 51;
			gradeVO[i].intKor = intKor;
			
			gradeVO[i].intEng = rnd.nextInt(50) + 51;
			gradeVO[i].intMath = rnd.nextInt(50) + 51;
		}
		// input() end
		
		// 총점과 평균 계산
		public void total( ) {
			
			// 평균을 계산이여 gradeVO의 intAng 변수에 저장
			
			for(int i = 0 ; i < gradeVO.length ; i++) {
				int intSum = gardeVO[i].intKor;
				intSum += gardeVO[i].intEng;
				intSum += gardeVO[i].intMath;
				gradeVO[i].intSum = intSum;
			}  
		}
		public void view() {
			
			System.out.println("====================================================");
			System.out.println("성적 일람표");
		    System.out.println("학번|t국어|영어|t수학|t총점|t평점");
		    System.out.println("-----------------------------------------------------);"
		    for(int i = 0 ; i < gradeVO.length; i++) {
		    	System.out.printf("%s|");
		        System.out.printf("")
		        System.out.printf()
		        System.out.printf() 
		        System.out.printf() 
		        System.out.printf() 
		        System.out.printf() 
		        System.out.printf()
		        
		    } // view() end
		    
		    // 총정을 기준으로 내림차순 정렬을 수행하고
		    // 1 ~ 배열개수 만큼 각각 값을 intRank 변수에 저장하여
		    // 석차를 부여
		    // 단, 동점자 처리는 하지 않는다.
		    public void rand() {
		    	
		    	for(int i = 0; i < gradeVO.length; i++) {
		    		if(gradeVO[i].intSum > gradeVO[j].intSum) {
		    			
		    			// GradeVO 클래스를 이용하여
		    			// _temp 임시 객체를 선언하고
		    			// gradeVO[i] fmf _temp 객체에 복사
		    			// gradeVO[i]에 포함된 맴버변수들이
		    			// 통째로 _temp 변수에 복사 된다
		    			GradeVO _temp = gradeVO[i];
		    			gradeVO[i] = gradeVO[j];
		    			gradeVO[j] = _temp;
		    			
		    		    
		    			
		    	 			
		    			intKorTotal += gradeVO[i].intKor;
		    			intEngTotal += gradeVO[i].intEng;
		    		    intMathTotal += gradeVO[i].intMath;
		    		    intSumTotal += gradeVO[i].intSum;
		    		    intAvgTotal += gradeVO[i].intAvg;
		    			
				
		    			
		    				
		    				
		    			}
		    			
		    			
		    			 
		    			
		    			
		    			
		    		}
		    	}
		    }// for i end
		    
		    for(int i = 0 ; i < gradeVO.length; i++) {
		    	gradeVO[i]intRank = i + 1;
		    
		    } // rank() end
		    
		    // 학번순으로 다시 재 정렬 
		    // 학번순번대로 오름차순 정렬
		    public void sort() {
		    	for(int j = 0 ; j , gradeVO.length i++);
		    			if(Integer.valueOf(gradeVO[i].strNum)
		    					> Integer.valueOf(gradeVO[j])
		    					
		    }
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		}
	}
	private void view() {
		// TODO Auto-generated method stub
		
	}
}
