package examples;
import java.util.Random;
public class ex34 {

	public static void main(String[] args) {
		//로또 추첨기 프로그램을 작성해 봅니다. 		
		//6개의 번호를 뽑는다.
		//1~45까지 적혀있는 공 셋트에서 하나의 번호를 뽑는다.(랜덤)
		//이 과정을 6번 수행한다.
		//6개의 번호를 출력한다. Random클래스 or Math클래스 사용.
		//중복된 값은 허용~
		//출력결과 예) 12 34 9 7 22 12
	
	Random rand = new Random();
	int num1 = (rand.nextInt(45))+1;
	int num2 = rand.nextInt(45)+1;
	int num3 = rand.nextInt(45)+1;
	int num4 = rand.nextInt(45)+1;
	int num5 = rand.nextInt(45)+1;
	int num6 = rand.nextInt(45)+1;
	String num1Str = String.valueOf(num1);
	String num2Str = String.valueOf(num2);
	String num3Str = String.valueOf(num3);
	String num4Str = String.valueOf(num4);
	String num5Str = String.valueOf(num5);
	String num6Str = String.valueOf(num6);
	System.out.println(num1Str +" "+ num2Str + " "+ num3Str +" "+ num4Str +" "+ num5Str+" "+num6Str);
	
	
	for(int i=1;i<=6;i++) {
		int num = rand.nextInt(45)+1;
		System.out.println(num);
	}
	
	}

}
