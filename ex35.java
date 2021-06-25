package examples;
import java.util.Random;
public class ex35 {

	public static void main(String[] args) {
	Random rand = new Random();
	//연습문제
	//기상청 날씨 프로그램을 작성합니다
	//날씨좋음은 0
	//흐림은 1
	//비가 옴 2
	//눈이 옴 3
	//소나기가 옴 4 라고 할때,
	//임의의 수 0부터 4까지를 발생하고,
	//거기에 따른 날씨를 출력하시오.
	//if else if문 사용
	
	int weather = rand.nextInt(5);
	if(weather == 0) {
		System.out.println("날씨좋음");
	}else if(weather == 1) {
		System.out.println("흐림");
	}else if(weather == 2) {
		System.out.println("비가 옴");
	}else if(weather == 3) {
		System.out.println("눈이 옴");
	}else if(weather == 4) {
		System.out.println("소나기가 옴");
	}

	}

}
