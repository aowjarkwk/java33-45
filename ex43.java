package examples;

public class ex43 {

	public static void main(String[] args) {
		//연습문제
		// i값이 1부터 20까지의 수를 출력하되,
		// i값이 15이상이면 break 출력을 중단하고,
		// i값이 3의 배수이면 출력하지 않도록 하시오. continue 문
		// break문,continue문을 이용
		for(int i=1; i<=20; i++) {
			if(i%3==0) {
				continue;
			}System.out.println(i);
			if(i>=15) {
				break;
			}
		}

	}

}
