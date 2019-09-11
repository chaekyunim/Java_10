package com.biz.grade.Grade.Service;

public class GradeServiceV3 {

	public static void main(String[] args) {
		
		// 총점 점수를 기준으로 내림차순 정렬을 하자
		// 총점 점수를 기준으로 내림차순 정렬을 수행했더니
		// 총점은 잘 정렬이 되었는데,
		// 과목점수와 촘점의 순가 뒤죽박죽이 되었다.
		// 원인은 
		// 총점의 순서를 바꾸면서, 과목의 순서를 바꾸는
		// 코드로 변경을하자
		
        GradeServiceV2 gs = new GradeServiceV2(3); 
		
		gs.input(); // 과목점수 입력
		gs.view();  // 입력된 점수 확인
		gs.sort();  // 총점 기준으로 내림차순 정렬
		gs.view(;)  // 정렬 후 점수 확인
		
		// gs.inputKor() method는
		// private으로 제한되어 있어서
		// 외부에서 method를 직접 호출 할 수 없다.
		// gs.inputKor(0);
		 

	}

}
