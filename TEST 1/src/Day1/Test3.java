package Day1;


//#1.
//abstract class Apple {								//클래스가 추상함수를 갖고있으면 추상 클래스이다 
//	
//	Apple(){}
//	
//	abstract void func01();							//abstract -> 추상함수) 미완성이라는 의미 (code X) {}를 제거하고 ;로 마무리 <- 반드시 상속과 관련있다 
//		
//	void func02() {
//		System.out.println(2);
//	}
//	
//}
//
//
//class Banana extends Apple{							//부모가 미완성 함수가 있는 클래스는 미완성 함수를 오버라이딩
//
//	//	void func01() {								//오버라이딩- 미완성 함수를 구현해야힌디 
//	//		System.out.println(1);
//	//	}
//	
//	@Override										//@가 들어간 annotation 이라고 한다 = 컨파일 옵션이다 (컨파일전에 문법적으로 선택하라는 옵션)
//	void func01() {									//오타 방지용 override를 주석잡으면 함수명이 달라도 에러가 안난다 
//		System.out.println(1);
//
//	}
//
//	void func03() {
//
//	}
//
//
//}

////#2.
//abstract class A {
//	
//	abstract void f1(); 
//
//}
//
//class B extends A {
//	@Override
//	void f1() {
//		System.out.println(1);
//		
//	}
//}



//		//#3. 함수를 만드는 축약형태 => Ramda

//
//abstract class Apple{
//	
//	abstract void f1();
//	
//	
//}
//
//
//
//class Orange extends Apple{
//	
//	void f1() {
//		System.out.println(1);
//	}
//	
//}

//#4. 추상함수만 있는 추상 클랴스 (일반함수X)-> 클래스로 문법을 나타내는것 보단 interface문법을 구사하게되면 장점이 많아 진다 
//
//abstract class Apple{
//	
//	abstract void f1();								//abstract void f1();가 원래 형식인데 abs가 생략되어있다
//	
//}

////#4-1.
//interface Apple{
//	
//	void f1();										//abstract void f1();가 원래 형식인데 abs가 생략되어있다
//	
//}
//
//class Orange implements Apple{						//interface 의 믈래스에는 추상만 있기떄문에 확장 X, implements 로 상속 받으면 (extends X) -> public이 필수로 생성된다 주의 !! 
//	
//	@Override
//	public void f1() {
//		// TODO Auto-generated method stub
//		
//	}
//}

////#5 extends and implements 의 클래스 구조 
//class A{
//	
//}
//
//interface B{
//	
//}
//
//interface C{
//	
//}
//
//class D extends A implements B, C{						//class상속은 한개 ,사용 못한다 BUT implements 는 다중상속이 가능하기떄문에 ,를 사용하여 상속을 추가할수있다
//	
//}




//#6. Ramda 3단계 - 함수의 코드의 전달이 목적 
interface Apple{
	void f1();
}

interface Banana{
	 void f1(int n);
}

interface Orange{
	void f1(String s, int n);
}

interface Kiwi{
	int f1();
}

interface Mango{
	int f1(int a);
}

interface Grape{
	int f1(int a, int b);
}

interface Apple01{
	void f1();
}

class Apple02{
	void f1(Apple01 app) {
		app.f1();
	}
}

interface Apple03{
	void f1();
}

class Apple04{
	Apple03 app;
	
	Apple04(Apple03 app){
		this.app = app;
	}
	
	void f1() {
		app.f1();
	}
}

public class Test3 {
	
	public static void main(String[] args) {

		//#6.
		Apple t1 = new Apple() {
			@Override
			public void f1() {
				
			}
		};
		
		//ramda -> 작성 법 : 1.new Apple 날리고 2.()-> 3.함수껍데기 벗기고 syso  주의))abstract X , interface 일때만 사용!! 가능 용어에 따라 => 꼴도 가능하다 
		
		Apple t2 = () -> {
			System.out.println("Ramda");
		};
		t2.f1();
		
		
		//함수안의 실행문장이 한 문장일때는 {} 생략이 가능하다 --> 한줄처리 가능 
		Apple t3 = () -> System.out.println("Ramda");
		t3.f1();
		
		Banana t4 = new Banana() {
			@Override
			public void f1(int n) {
				System.out.println(n * n);
				
			}
		};
		t4.f1(10);
		
		Banana t5 = (num) -> System.out.println(num * num);						//변수명은 달라도 상관없다 t4에 n을 num으로 사용해봄
		t5.f1(5);
		
		// 임수전달이 한개 일때는 (괄호)를 생략할 수 있다 
		Banana t6 = num -> System.out.println(num * num);						
		t6.f1(10);
		
		Banana t7 = nnn -> System.out.println(nnn * 10);						//BUT ()를 생략한이유가 인수전달이 하나여서 가능하다는것만 주의 한다 
		t7.f1(5);
		
		// 인수 1개 이상 
		Orange t8 = (tt, aa) -> System.out.printf("%s %d",tt, aa);
		t8.f1("호랑이", 50);
		
		// return 값이 있는 Ramda 
		Kiwi t9 = () -> {
			System.out.println();
			return 100;															//int f1() 의 함수의 리턴값을 불러와준다 
		};
		System.out.println(t9.f1());											//출력코드 안에서 함수 직접적 출력 
		
		// 단문장은 {} 생략 가능, return 형식도 같이 생략
		Kiwi t10 = () -> 100;	
		System.out.println(t10.f1());	
		
		// return + 인수 : {}생략과 동시에 return 껍데기도 생략 + 인수값 1개 () 생략 가능 
		Mango t11 = n -> 100 * n;
		System.out.println(t11.f1(11));
		
		// return + 임수값 1개 이상 
		Grape t12 = (g, r)-> g + r;
		System.out.println(t12.f1(10, 20));
		
		//interface class + class 함수 인수값 (class type)
		Apple02 t13 = new Apple02();											//class를 사용하기 위해선 호출! 
		t13.f1(()->{
			System.out.println(1);												//ramda의 목적 코드를 넘겨주기 위해서 , 이경우에는 출력 코드를 넘겨줌 
			System.out.println(2);
			System.out.println(3);
		});
		t13.f1(()->System.out.println(4));										//단문장의 코드를 넘져주기위한 randa의 줄임 코드
		
		//Runnable class 사용법 - 자바에서는 다중 상속을 하용하지 않기 때문에,
		//Thread 클래스를 확장하는 클래스는 다른 클래스를 상속받을 수 없습니다. 
		//반면에 Runnable 인터페이스를 구현했을 경우에는 다른 인터페이스를 구현할 수 있을 뿐만 아니라, 다른 클래스도 상속받을 수 있습니다.
		Runnable t14 = new Runnable() {
			@Override
			public void run() {
				System.out.println(14);
				
			}
		};
		t14.run();
		
		Runnable t15 = () -> System.out.println(1);
		t15.run();
		
		//interface class + class with 생성자 인수값 (class type) 
		Apple04 t16 = new Apple04(()->System.out.println(16));					//생성과 동시에 인수값 입력
		t16.f1();
		
		Apple04 t17 = new Apple04(()->{											//t16의 코드 3개 이상 버전
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
		});
		t17.f1();
		
		//thread 를 사용을 할떄는 내가 실행하는 프로그램에서 한개더 만들어 동시에 실행되게끔 보이는것 
		//thread안에는 start라는 함수가 있다 그안의 run의 함수(오버라이딩 - 자기꺼 갖고있으면 자기, 없으면 자식)를 콜
		Thread t18 = new Thread() {												
			public void run() {
				System.out.println("여기는 Thread");
			};
		};
		
		t18.start();															
		
		//Tread인수안에 Runnable interface 사용을 간단하게 주는것 - Ramda를 통해
		Thread t19 = new Thread(()->System.out.println("저기는 Thread"));			
		t19.start();
		
		
		
		//#4
//		Orange t1 = new Orange();
//		t1.f1();
//		
//		Apple t2 = new Orange();
//		t2.f1();
//		
//		Apple t3 = new Apple() {
//			@Override
//			public void f1() {
//				System.out.println(2);
//				
//			}
//		};
//		t3.f1();
//		
//		new Apple () {
//			@Override
//			public void f1() {
//				System.out.println(4);
//				
//			}
//		}.f1();
		

		
		
		
		
		
		
		
//		//#3-1
//		Orange t1 = new Orange();
//		t1.f1();
//		
//		//#3-2
//		Apple t2 = new Orange();
//		t2.f1();
//		
//		//#3-3 인스턴스
//		Apple t3 = new Apple() {
//			@Override
//			void f1() {
//				System.out.println(2);
//			}
//		};
//		
//		t3.f1();
//		
//		//#3-4
//		new Apple() {
//			@Override
//			void f1() {
//				System.out.println(3);
//			}
//		}.f1();
		
		
		
		
		
//		//#2 - 1. B라는 이름으로 상속으루 받아 사용
//		B t1 = new B();
//		t1.f1();
//		
//		//#2 - 2.up casting
//		A t2 = new B();
//		t2.f1();
//		
//		//#2 - 3.직접적으로 override
//		A t3 = new A() {
//			@Override
//			void f1() {
//				System.out.println(2);
//				
//			}
//		};
//		
//		t3.f1();							//방금만든 f1이 오버라이딩 
//		//t1은 상속받은 클래스 이름 = B, t3는 상속받은 클래스가 없다 즉석에서 바로 오버라이딩 => 익명클래스를 이용한 객체 생성방법 
//		
//		//#2 - 4. 익명 객체 
//		new A() {								//익명 객체 => 즉석에서 사용하고 치우는것 thread에서 비슷하게 봄
//			@Override
//			void f1() {
//				System.out.println(3);
//			}
//		}.f1();
		
		
		
//#1.
//		Banana b1 = new Banana();
//		b1.func01();								//abstract을 받아서 사용했다 
//		b1.func02();
//		b1.func03();
//		
//		//Apple a1 = new Apple();						//a1객체를 생성시키려고 하는데 미완성 객체가 들어가 있기때문에 사용할 수 없다 상속받아서 사용해야 한다 
		
		
		
	}

}
