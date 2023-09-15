package core.chap1;

public class Hotel {

	// 호텔은 레스토랑 객체에 의존적 ! 
	private Restaurant restaurant = new AsianRestaurant();
	
	//헤드
	private Chef headChef = new AsianChef();
	
	//호텔의 정보를 알려주는 기능
	public void inform(	) {
		System.out.printf("우리 호텔의 레스토랑은 %s입니다.HeadChef는 %s입니당 \n"
				,restaurant.getClass().getSimpleName()
				,headChef.getClass().getSimpleName());
		restaurant.order();
		
	}
	
}
