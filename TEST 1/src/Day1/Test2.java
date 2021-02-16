package Day1;


	// 1. 상속 기본 
//class Apple{
//	
//	
//	Apple(){
//		System.out.println("나는 부모");
//		
//	}
//}
//
//
//class Banana extends Apple{
//	
//	
//	Banana(){
//		System.out.println("나는 자식");
//		
//		
//	}
//}

	// 2. super 논리
//class A {
//	A(){
//		System.out.println("부모");
//		
//	}
//	
//}
//
//
//class B extends A {
//	B(){
////		super();					
//		//super은 생성자의 첫줄에 들어가야한다! 만약 super() default생성자 가 생략되어있다고 생각하기 때문에 자동 생성 -> super는 부모이다 
//		System.out.println("자식 생성자");
//		
//	}
//	
//}

	// 3. 
//class Apple{
//	
//	Apple(){
//	
//		
//	}
//	
//	void func01() {
//		System.out.println("부모1");
//		
//	}
//	
//	void func03() {
//		System.out.println("부모3");
//	}
//	
//	void func05() {
//		func03();						// 자식함수 호출 -> 함수 오버라이딩 -자식의 함수때문에 부모의 함수가 가려졌다 
//	}
//	
//	void func06() {
//		this.func03();					// this. -> 자식 
//	}
//	
//	
//}
//
//
//class Orange extends Apple{
//	
//	Orange(){
//		
//	}
//	
//	void func02() {
//		System.out.println("자식2");
//	}
//	
//	void func03() {
//		System.out.println("자식3");
//	}
//	
//	void func04() {
//		func03();
//		super.func03();					//super.은 부모것을 호출 , this는 자신의 객체를 말한다 
//		
//	}
//}

	//up casting
//class Apple{
//	
//	Apple(){
//		
//	}
//	
//	void func01() {
//		System.out.println("func01");
//	}
//	
//	void func03() {
//		System.out.println("부모");
//		
//	}
//}
//
//
//
//class Orange extends Apple{
//	
//	Orange(){
//		
//	}
//	
//	void func02() {
//		System.out.println("func02");
//	}
//	
//	void func03() {
//		System.out.println("자식");
//		
//	}
//}

	//looping 상속
//class Animal {
//	
//	Animal(){
//		
//	}
//	
//	void Cry() {
//		System.out.println("울지못해요");
//	}
//	
//}
//
//
//
//class Dog extends Animal{
//	
//	Dog(){
//		
//	}
//	
//	void Cry() {
//		System.out.println("멍멍");
//	}
//	
//}
//
//
//class Cat extends Animal{
//	
//	Cat(){
//		
//	}
//	
//	void Cry() {
//		System.out.println("야옹");
//	}
//	
//}
//
//
//class Snake extends Animal{
//	
//	Snake(){
//		
//	}
//	
//}


//class Zoo{
//	
//	Zoo(){
//		
//	}
//	
//	Zoo(int a){
//		
//	}
//	
//	Zoo(String s){
//		
//	}
	
//	Zoo(Dog dog){
//		System.out.println("ㅁ");
//	}
//	
//	Zoo(Cat cat){
//		System.out.println("야옹");
//	}
//	
//	Zoo(Snake snake){
//		System.out.println('ㅅ');
//	}
	
	
	
	
	
//	Animal animal;
//	
//	Zoo(Animal animal){
//		this.animal = animal;
//	}
//	
//	void cry() {
//		animal.cry();
//	}
//}
//
//class Animal{										// class대입 연산 up casting 
//	void cry() {
//		
//	}
//}
//
//class Dog extends Animal{
//	
//	Dog(){
//		
//	}
//	
//	void cry() {
//		System.out.println("멍멍");
//	}
//}
//
//class Cat extends Animal{
//	
//	Cat(){
//		
//	}
//	
//	void cry() {
//		System.out.println("야옹");
//	}
//}
//
//class Snake extends Animal{
//	
//	Snake(){
//	
//	}
//	void cry() {
//		System.out.println("싓"
//				+ "");
//	}
//	
//}

////바둑
//class Baduck{
//	AI ai;
//	
//	Baduck(AI ai){
//		System.out.println("바둑을 시작합니다.");
//		this.ai = ai;
//		
//	}
//
//	
//	void play(){
//		ai.play();
//		
//	}
//	
//	
//}
//
//abstract class AI{
//	AI(){
//		
//	}
//	
//	abstract void play();
//}
//
//
//class Alpago extends AI{
//	Alpago(){
//		
//	}
//	
//	void play(){
//		System.out.println("인공지능은 알파고 입니다.");
//	}
//}
//
//
//class Betago extends AI{
//	Betago(){
//		
//	}
//	
//	void play(){
//		System.out.println("인공지능은 베타고 입니다.");
//	}
//}
//
//
//class Gabmago extends AI{
//	Gabmago(){
//		
//	}
//	
//	void play(){
//		System.out.println("인공지능은 갑마고 입니다.");
//	}
//}



public class Test2 {

	public static void main(String[] args) {
		
		
		
		
		
		
		

//		//바둑
//Baduck b1 = new Baduck(new Alpago());
//b1.play();
//
//Baduck b2 = new Baduck(new Betago());
//b2.play();
//		
//Baduck b3 = new Baduck(new Gabmago());
//b3.play();
//		
		
		
				// 1.
//		Apple a1 = new Apple();
//		Banana b1 = new Banana();			
//		//결과는 부머 생성자가 먼저 호출이 되고 자식 생성자가 호출이 
//		//되기는 개뿔...
//		//자식 생성자한테 먼저 간뒤 부모 생성자로 이동하게 된다 
//		
		// 2.
//		B b = new B();
//		//b의 생성자로 먼저 간다 super(10); 호출을 하니까 함수호출로 부모생성자 값을 받아서 다시 돌아와서 자식 출력 
		
		//3.
		
//		Orange o1 = new Orange();
//		o1.func01();					//자식에 없으니까 부모의 func01을 호출
//		o1.func02();					//자식의 자식껄 쓴다
//		o1.func03();					//자신것을 먼저 뒤지고 있으면 자신껄 사용 둘다 3을 가질경우, 부모의 3번은 사용할 수 없다 (iN JAVA)
//		o1.func04();
//		o1.func05();
//		o1.func06();					//
		
		// up casting 
//		Apple t1 = new Apple();			// 부모 = 부모
//		Orange t2 = new Orange();		//자식 = 자식
////		Orange t3 = new Apple();		// 자식 = 부모 (사용 불가)
//		Apple t4 = new Orange();		// 부모 = 자식 -> up casting 
//		t4.func01(); 					
////		t4.func02();					//부자관계의 경우 부모가 가지고 있는 문법만 사용이 가능하다 BUT 자식 메모리는 사용이 가능하다 (BUT 접근X) 
//		t4.func03();					//메모리는 존재하기때문에 오버라이딩을 통해 자식 함수가 콜이 된다 
//		
//		t2.func01();
//		t2.func03();
//		t2.func02();					//
		
//		Animal a1 = new Dog();
//		a1.Cry();
//		
//		Animal a2 = new Cat();
//		a2.Cry();
//		
//		Animal a3 = new Snake();
//		a3.Cry();
//		
//		Dog a4 = new Dog();
//		a4.Cry();
//		
//		Cat a5 = new Cat();
//		a5.Cry();
//		
//		Snake a6 = new Snake();
//		a6.Cry();						//up casting 하는 이유? -> 동물을 울릴려고 할때 쓸고 있다 but자식을오 만 사용하면 for문 사용 못함 
//		
//		String s1 = "호랑이";
//		String s2 = new String("강아지");
//		String [] s3 = {"호랑이1", "호랑이2", "호랑이3"};
//		String [] s4 = {new String("코끼리1"), new String("코끼리2"), new String("코끼리3")};
//		System.out.println(s4[0]);
//		
//		Animal [] a7 = {new Dog(), new Cat(), new Snake(), new Dog(), new Cat()};     //up casting의 논리가 성립이 되어야지 가능 하다
//		a7[0].Cry();
//		a7[1].Cry();
//		a7[2].Cry();
//		
//		for (int i = 0; i < a7.length; i++) {
//			a7[i].Cry();
//		}
		
//		// 4.
//		Dog d1 = new Dog();
//		Zoo z1 = new Zoo(d1);
//		Zoo z2 = new Zoo(new Dog());
//		Zoo z3 = new Zoo(new Cat());
//		Zoo z4 = new Zoo(new Snake());
//		z2.cry();
//		z3.cry();
//		z4.cry();	
		
//		//문자열을 받을수 있는 배열 3 개 
//		String [] str = new String [3];
//		str[0] = "호랑이";
//		str[1] = new String ("코끼리");
//		str[2] = new String ("독수리");
//		
//		//실수 -> 배열 3개를 선언했다고 객체가 만들어진게 아니라 변수를 만든것이기 때문에 대입을 해줘야한다 EX) a2[0] = new Apple(); 혹은 br[0] = new String("호랑이");
//		class Apple{
//			
//			Apple(){
//				
//			}
//			
//			void f1() {
//				System.out.println(1);
//			}
//		}
//		
//		Apple a1 = new Apple();
//		Apple [] a2 = new Apple[3];								
//		a1.f1();
//		//a2[0].f1();											//Apple을 사용할수 있는 배열을 만들어낸거지 객체가 3개 만들어진게 아니다 변수를 사용할수 있는 변수가 3개 만들어진것이다 
//		a2[0] = new Apple();
//		a2[1] = new Apple();
//		a2[2] = new Apple();
//		a2[0].f1();
//		
//		
//		int a, b, c;
//		//배열은 변수이름이 의미를 가지지 않을때 변수를 일괄적으로 선언해서 사용하는것이 문법 방법이다 
//		int [] ar = new int [3];								// 변수 abc를 한개씩 만들어 사용하는거나 한꺼번에 선언하는거나 변수를 요구하는 양은 똑같다 
//		a = 10;
//		ar[0] = 10;
//		b = 20;
//		ar[1] = 20;
//		c = 30;
//		ar[2] = 30;
//		//이렇게 이름이 중요하지 않고 
//		
//		String s1, s2, s3;
//		//System.out.println(s1); <- 변수만 3개 선언되었지 갖고있는 값은 없다
//		String [] br = new String[3];
//		br[0] = new String("호랑이");								//a2[0] = new Apple();과 같은 문법, 이렇게 대입해 주고 사용해야한다 
//		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
