package examples;
public class ex42 {
	public static void main(String[] args) {
		//break문, continue문
		//break문 : 반복문(루프)을 종료한다.
		//continue문 : 해당 회차의 루프를 종료하고, 증감문(윗쪽)으로 갑니다.
		//Runtime Debugging, Breakpoint 잡는 법
		//1.줄번호 더블클릭
		//2.실행 -> 디버그(벌레)모드로 실행
		//3.F6 : Step Over(함수안으로 안들어감)
		//  F5 : Step Into(함수안으로 들아감)
		//  Terminate : 디버깅모드 종료
		//  F8 : 다음 Breakpoint까지 수행
		for(int i=0; i<10; i++) {
			System.out.println( i );
		}
		for(int i=0; i<10; i++) {
			if( i%2 == 0 ) { //2의 배수이면
				continue;
			}
			System.out.println( i );
			if( i > 6 ) { //6보다 크면
				break;
			}
		}
		System.out.println(  );
		//이중 반복문에서의 break
		I_LOOP: //레이블
		for( int i=0; i<3; i++ ) {
			System.out.println( "i:" + i );
			J_LOOP: //레이블
			for( int j=0; j<3; j++ ) {
				System.out.println( "j:" + j );
				System.out.println("break;");
				break I_LOOP;
			}
		}
	}
}