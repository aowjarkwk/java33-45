package examples;
import java.util.Date;
import java.util.Random;
public class ex38 {

	//조카를 기쁘게 해줄 애완용 로봇을 프로그램 해보자.
	// 음악을 틀어준다  코드 1
	// 간식을 준다      코드 2
	// 주인의 영상을 틀어준다. 코드 3
	// 산책을 시켜준다.  코드 4
	//임의의 수를 발생시켜(0~3 코드) 애완용 로봇을 구동
	//시킨다. 
	// 구동 간격은 3초간격이다. 2번만 수행.
	// if else문과 switch case문을 이용하여 별도로
	// 작성하시오.
	//Time Delay
//			System.out.println(new Date());
//			Thread.sleep(3000); //3000ms => 3초 sleep(진행을 멈춤)
//			System.out.println(new Date());

	public static void main(String[] args) throws InterruptedException {
	Random rand = new Random();
	int robot = rand.nextInt(4)+1;
	if(robot==1) {
		System.out.println("음악을 틀어준다");
	}else if(robot==2) {
		System.out.println("간식을 준다");
	}else if(robot==3) {
		System.out.println("주인의 영상을 틀어준다");
	}else if(robot==4) {
		System.out.println("산책을 시켜준다");
	}
	Thread.sleep(3000);
	int robot2 = rand.nextInt(4)+1;
	switch(robot2) {
	case 1:
		System.out.println("음악을 틀어준다");
		break;
	case 2:
		System.out.println("간식을 준다");
		break;
	case 3:
		System.out.println("주인의 영상을 틀어준다");
		break;
	case 4:
		System.out.println("산책을 시켜준다");
		break;
	}
	}

}
