package examples;
import java.util.Random;
public class ex37 {

	public static void main(String[] args) {
		//연습문제
		//봄 여름 가을 겨울을 출력하는 프로그램을 작성하시오.
		// 봄 3,4,5  
		// 여름 6,7,8  
		// 가을 9,10,11 
		// 겨울 12,1,2
		// 임의의 정수를 발생시켜, 1~12까지의 달을 입력받고,
		// 거기에 따른 계절을 출력하시오.
		// switch case문을 사용.
		Random rand = new Random();
		
		int season = rand.nextInt(12)+1;
		switch(season){
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 1:
		case 2:
		case 12:
			System.out.println("겨울");
			break;
		}

	}

}
