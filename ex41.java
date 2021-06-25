package examples;

public class ex41 {

	public static void main(String[] args) {
		//연습문제
		//1.
		//1부터 100 사이에 2의 배수이면서 3의 배수가
		//몇개있는지 카운트하여 출력하시오.
		//for문과 if문을 사용하여,
		//예) 6, 12, 18, 24, ...
		int num=0;
		for(int i = 1; i<=100; i++) {
			if (i%2==0&&i%3==0) {
				num++;
			}
		}System.out.println(num);
		//2.
		//영희가 징검다리 놀이를 하고 있다.
		// 1번부터 100번까지 일렬로 번호가 쓰인 벽돌이 있다.
		// 끝번호가 3, 5, 7로 된 번호만 건너뛴다.
		//  그러면, 영희는 몇개의 벽돌(징검다리)를
		//밟게 되는가?
		// 예) 3번벽돌 - 건너뜀, 15번 - 건너뜀, 27번 - 건너뜀

		int younghee = 0;
		for(int i=1; i<=100; i++) {
			if(i%10==3||i%10==5||i%10==7) {
				continue;
			}younghee++;
		}System.out.println(younghee);
	}

}
