package examples;
import java.util.Random;
public class ex40 {

	public static void main(String[] args) {
		// for문 연습문제
		//1. for문으로 i값을 5부터 10까지 1씩 증가하여 출력하시오.
		Random rand = new Random();
		for(int i = 5;i<=10;i++) {
			System.out.println(i);
		}
		//2.                 10부터 -10까지 1씩 감소하여 출력하시오.
		for(int i=10; i>=-10; i--) {
			System.out.println(i);
		}
		//3.                 1부터 100까지 3씩 증가하여 출력
		for(int i=1; i<=100; i=i+3) {
			System.out.println(i);
		}
		//4.                 1부터 100까지 2의 배수이면서 10의 배수만 출력
		for(int i =1; i<=100; i++) {
			if(i%2==0 && i%10==0) {
				System.out.println(i);
			}
		}
		//5.                 1부터 10까지의 합을 출력
		int result = 0;
		for(int i = 1; i<=10; i++) {
			result=result+i;
		}System.out.println(result);
		//6. 1부터 100까지 소수만을 찾아 출력하시오.
		//   소수: 1과 자신으로만 나눠지는 자연수 
		//        예) 1,3,5,7,11...
		
		for(int i = 2; i <=100; i++) {
			for(int j =2; j<=i; j++) {
				if(i != j && i%j==0)break;
				if(i ==j) {
					System.out.println(i);
				}
			}
		}
		for( int i=1; i<=100; i++ ) {
			int div_count = 0;
			for( int j=1; j<=i; j++) {
				if( i%j==0 ) {
					div_count ++;
				}
			}
			if( div_count == 2 ) {
				System.out.print( i + ",");
			}
		}
		//7. 임의의 수 n을 1부터 10사이에서 발생시켜
		//   팩토리얼 값을 출력하시오. 
		//   예) 5 = 5*4*3*2*1 
		System.out.println();
		int randomnum = rand.nextInt(10)+1;
		int result2 = 1;
		System.out.println(randomnum);
		for(int i=1;i<=randomnum;i++) {
			result2 = result2*i;
		}System.out.println(result2);
		
		
		
	}

}
