package examples;

public class ex45 {

	public static void main(String[] args) {

		//연습문제 1
				//
				// 2중 for문을 이용하여
				// 2단부터 9단까지 구구단을 출력하시오.
				// 2단 2*1=2   ... 9단 9*1=9
				//     2*2=4           9*2=18
				//    
				//     2*9=18          9*9=81
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j +"="+ i*j);
			}
		}
				//2
				// print() : 줄바꿈없음
				// pirntln() : 줄바꿈있음
				//출력결과1
				//*****
				//*****
				//*****
				//*****
				//*****
		for(int i = 1; i<=5; i++) {
			System.out.println("");
			for(int j=1; j<=5; j++) {
				System.out.printf("+");
				
			}
		}
		System.out.println();
				//3
				//출력결과2
				//*       i:0  j:0
				//**        1    1
				//***       2    2
				//****      3
				//*****     4
		for(int i = 1; i<=5; i++) {
			
			for (int j = 1; j<=i; j++) {
				System.out.print("*");
				
			}System.out.println();
		}
				//4
				//출력결과3
				//    *
				//   **
				//  ***
				// ****
				//*****
		for(int i = 1; i<=5; i++) {
			
			for (int j = 5; j>0; j--) {
				if(j>i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
		}System.out.println();
		

	}
	}
}



