package core.chap1;

public class AsianRestaurant implements Restaurant {
	//WesternRestaurant은 FrenachChef와 FerenchCourse에 의존!

	private Chef chef;

	//요리 코스
	private Course course;
	
	
	
	
	
	//요리를 주문하는 기능
	public void order() {
		System.out.println("아시안 요리를 주문합니다.");
		course.combineMenu();
		chef.cook();
		
		
		//null 방지 객체 생성! 
	}
	
}
