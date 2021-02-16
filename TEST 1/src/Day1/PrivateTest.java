package Day1;

	//this - getter, setter class  
//class Apple{
//private																	// 외부로 노출 X 정보은닉
//	String name = "홍길동";
//	int money = 1000;
//	public Apple(String name, int money) {
//		this.name = name;
//		this.money = money;
//	}
//	public Apple() {
//		
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getMoney() {
//		return money;
//	}
//	public void setMoney(int money) {
//		this.money = money;
//	}
//
//	
//	
//	
//}



	// this 의 활용 1 - 너에게 나를 보낸다 
//class Apple {
//
//	Apple(){
//
//	}
//	void f1() {
//		System.out.println(1);
//		Orange orange = new Orange();
//		orange.f2(this);										//class type으로 Apple을 보낸다  - Orange에게 Apple을 보낸다 - 너에게 나를 보낸다 
//
//	}
//	void f3() {
//		System.out.println(3);
//	}
//}
//
//
//class Orange{
//
//	Orange(){
//
//	}
//	void f2(Apple aa) {
//		System.out.println(2);
//		aa.f3();
//	}
//}




public class PrivateTest {

	public static void main(String[] args) {
		
		// 너에게 나를 보낸다 객체 호출
//		Apple apple = new Apple();
//		apple.f1();													//호출을 먼저 시키고 위로 올라가서 함수만들어도됌







		//this - getter, setter 객체 호출 
//		Apple apple = new Apple();
////		System.out.println(apple.name());									//외부 클래스에 private 가 걸리면 사용을 할수 없다
////		System.out.println(apple.money);
//		System.out.println(apple.getName());									//외부 클래스에 private 가 걸리면 사용을 할수 없다
//		System.out.println(apple.getMoney());
//
//		apple.setName("이순신");													//setter
//		apple.setMoney(2000);
//		System.out.println(apple.getName());									//set 밑에 출력 
//		System.out.println(apple.getMoney());
		
		
		
		
		
		
		
		
	}

}


//힘수를 이용하여 private의 필드 값을 reading