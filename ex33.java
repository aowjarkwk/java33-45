package examples;
import java.util.Random;
public class ex33 {

	public static void main(String[] args) {
		//난수 발생 (Random 수 발생, 임의의 수)
		//방법1
		//Random클래스 이용
		Random rand = new Random();
		int randomNumber = rand.nextInt(100); //0~99까지의 임의의 수 발생
		System.out.println("임의의 수: "+randomNumber);
		//방법2
		//Math클래스 이용
		//Math.random()함수 0.0~0.99999999... 임의의 수를 반환
		int randomNumber2 = (int)(Math.random() * 100 ); //0~99까지의 임의의 수
		System.out.println("임의의 수: "+randomNumber2);
	}

}
