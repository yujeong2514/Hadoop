package Day1;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;








//class Apple {
//	Apple() {
//		
//	}
//	void f1() {
//		System.out.println(1);
//	}
//	static void f2() {								//static은 class안에 못넣는다 
//		System.out.println(2);
//	}
//}


/*class Apple {
	void f1() {
		System.out.println(10);
	}
}*/



public class day_test1 {

	public static void main(String[] args) throws Exception{


		
		//EX0)  //class 사용법 

		//		//1. 객채이름을 만들어 사용
		//		Apple apple = new Apple ();
		//		apple.f1();
		//		
		//		//2.객채이름을 만들지 않고 .를 사용하여 익명객채방법으로 사용
		//		(new Apple()).f1();     //있어도되고 없어도된다 Apple의 () 기호
		//		new Apple().f1();
		//		//printscaner에 사용되는 nextInt의미

		//EX1)      //주요 단축키

		//		System.out.println(10);
		//		//syso ctrl space  입력 단축키
		//		//ctrl + F11--실행

		//EX2)	    //8개의 표준 타입

		//		byte    1
		//		short   2   +-
		//		char    2   + 만 사용
		//		int     4
		//		long    8
		//		float   4   부동소수
		//		double  8   부동소수
		//		boolean 1
		//		
		//control Alt  복재
		//Alt 방향키 이동

		//EX3)	     //int와 Integer의 차이(타입과 클래스)

		//	int a = 10;       //자바의 표준 타입
		//	Integer b = 20;   //Integer 클래스 (대문자)
		//	b.byteValue();    //클래스라는 의미
		//	//int를 Integer로 사용하는 것이 잘 이용하는것
		//	//box=int-->Integer  unboxing=Integer-->int

		//EX4)       //3가지 for문의 정석

		//	//1.                             10번 반복
		//	for (int i = 0; i < 10; i++) {
		//		System.out.println(i);
		//	}
		//	//2.                             10번 반복
		//	for (int i = 1; i <= 10; i++) {
		//		System.out.println(i);
		//	}
		//	//3.                             11번 반복 --> 음수가 필요할떄 주로 사용
		//	for (int i = -5; i <= 5; i++) {
		//		System.out.println(i);
		//	}
		//	//3가지 방법을 벗어나는 경우는 없다 --> a는 0 or1로 시작 , a가 0으로 출발하면 < 이고, a가 1출발하면 <= 사용
		//	//for + crtl space for문 단축키

		//EX5)       //5단을 출력하는 

//				for (int i = 0; i < 10; i++) {		
//					//int a = 5*i;
//					System.out.println( 5 + " * " + i +" = "+ (5*i) );
//				}	
//			

		//		for (int i = 0; i < 10; i++) {
		//			System.out.printf("5 * %d = %d %n", i, i*5);
		//		}
		//		//println은 자동 줄바꿈이 되지만 printf는 연달아 나온다 그렇기 때문에 \n을 사용하면 줄바꿈이 된다
		//		//%d자리에 뒤에들어오는 값을 대치
		//		//printf사용하는 습관 들이기! %d;콤마뒤의 숫자값대입  %n;줄바꿈

		//EX6)       //1-10까지 더하는

		//		int sum =0;
		//		for (int i = 1; i <= 10; i++) {
		//			sum = sum + i;
		//			System.out.println(sum);
		//		}
		//		//누적되고 있는 for문의 단계값을 계속 출력
		//		//1-10까지 더해지는 모든 단계값을 도출하는 프로그램
		//		
		//		int sum1 =0;
		//		for (int i = 1; i <= 10; i++) {
		//			sum1 = sum1 + i;
		//		}
		//		
		//		System.out.println(sum1);
		//		//최종적으로 누적된 for문 최종 결과값을 출력
		//		//1-10까지 더하는 프로그램

		//EX7)       //Scanner scanner 사용법

		//ctrl + i 줄맞춤 코드
		//대문자에 에러가 뜬다 = import가 필요하다

		//1.
		//		Scanner scanner = new Scanner( System.in );      //Systme.in  는 입력을 받기위한 대기함수
		//		System.out.println(1);
		//		int num = scanner.nextInt();
		//		System.out.println(2);               //2의 경우 출력이 되지않는다 -->blocking상태 
		//		                                     //2출력 위에 nextInt가 입력되기를 기다리기떄문에 입력이 되어야 2의 blocking이 풀린다
		//		System.out.println(num);
		//		
		//2. 숫자입력 받겠습니다 정의 (이것으로 사용해라)
		//		 int num = (new Scanner( System.in )).nextInt();
		//		 //보통 숫자를 입력하세요를 써준다
		//		 System.out.println(num);

		//		//3.
		//		 System.out.println((new Scanner( System.in )).nextInt());    //출력함수 속에 입력 함수를 넣을 경우, 입력을 받으려는게 먼저

		//EX7-1)		 //입력받은 값의 구구단
		//		System.out.println("구구단 단계 입력 =");
		//		int num = (new Scanner( System.in )).nextInt();
		//		for (int i = 1; i <10; i++) {
		//			System.out.println (num +" * "+i+" = "+num*i);
		//		}	 

		//EX8)			//키보드로부터 숫자를 입력받아 받은값까지의 합 EX)10은 입력 10 결과 55

		//		System.out.println("숫자합의 끝값을 입력하시오: ");
		//		int sum = 0; 
		//		int num = (new Scanner(System.in)).nextInt();
		//		System.out.println(num);                                        //확인차로 num의 입력값을 출력 자주확인해주면 좋음 
		//		for (int i = 1; i <= num; i++) {
		//			sum += i;                                                   //(sum =) sum += i 생략가능 컴파일속도가 빠르다
		//		}
		//		System.out.println(sum);
		//		
		//		//i++ or ++i 는 같은 말이지만 i++이 더욱 빠르게 출력
		//		//i = i + 1 or i+=1 도 같은 코드이다 

		//EX9)			//
		//		int a = 3, b ; 
		//		b = a++;           //a++대입증가 (무조건 대입이 먼저 일어난 후 1증가)
		//		System.out.println(a+" "+b);
		//		
		//		int c = 3, d;
		//		d = ++c;           //++c증가대입 (자기자신을 먼저 증가시키고 난뒤 증가시킨다)
		//		System.out.println(c+" "+d);

		//EX10)			//1부터 20까지 i가 짝수일때는 호랑이 홀수일때는 코끼리
		//		for (int i = 1; i <= 20; i++) {
		//			if ( i % 2 == 0 ) {                              //코드입력할때 스페이스로 연산자가 눈에 들어오게끔 입력
		//				System.out.println("호랑이");
		//			}else {
		//				System.out.println("코끼리");
		//			}
		//			System.out.println(i);
		//		}

		//EX10-1)			//if else문장은 반드시 삼항연산이 되는지 확인하자 
		//		for (int i = 1; i <= 20; i++) {
		//			System.out.println(( i % 2 == 0 ) ? "호랑이" : "독수리");  //조건에 만족하면 물음표 답 아니면 콜론 답
		//			System.out.println(i);
		//		}
		//		
		//EX10-2)			//삼항연산
		//		int a = 10;
		//		if ( 3 > 2 ) {
		//			a = a + 1;
		//		}else {
		//			a = a - 1;
		//		}
		//		a = ( 3 > 2 ) ? a + 1 : a - 1;    //실전코드번호에서는 바뀔수만 있으면 삼항연산을 사용한다 

		//EX11)			//3의 6승을 구하는 프로그램
		//		int sum = 1;
		//		for (int i = 0; i < 6; i++) {
		//			sum = sum * 3; 
		//			System.out.printf("%d ** %d = %d\n", 3, i+1, sum);       //6번을 돌리고 결과값을 맞춰준다 
		//		}

		//				//6!계
		//		int sum = 1;
		//		for (int i = 1; i <= 6; i++) {
		//			sum = sum * i; 
		//			System.out.println(sum);       //6번을 돌리고 결과값을 맞춰준다 
		//		}
		//		System.out.println("-------------------------------");
		//		
		//		int sum1 = 1;                          //시작값을 정해주는것 0값으로 시작이 아닐경우 무조건 1부터 
		//		for (int i = 0; i < 6; i++) {          //0값이 나오는결과가 아니면 1부터 시작 (돌리는 횟수의 범위를 입력하는거지 값의 범위가 아님)
		//			sum1 = sum1 * (i+1); 
		//			System.out.println(sum1);       //6번을 돌리고 결과값을 맞춰준다 
		//		}

		//EX12)			//데이터 교환 swap프로그램 
		//		int a = 10, b = 20;
		//		int temp;
		//		System.out.println(a + " " + b);
		//		temp = a;         //temp는 10이다
		//		a = b;            //a는 20
		//		b = temp;         //b는 10
		//		System.out.println(a + " " + b);

		//EX13)			//랜덤 출력
		//1.
		//		Random rnd = new Random();     
		//		 int r = rnd.nextInt(100);      //0-99까지가 랜덤하게 나온다
		//		System.out.println(r);       
		//		
		//		System.out.println(rnd.nextInt(100));       //
		//		
		//		System.out.println("-------------------------------");
		//		for (int i = 0; i < 10; i++) {
		//			r = rnd.nextInt(100);
		//			System.out.println(r);
		//		}
		//		System.out.println("-------------------------------");     //separate구분하여 사용하는 출력 코드 
		//		for (int i = 0; i < 10; i++) {
		//			System.out.println(rnd.nextInt(100));      //변수를 받지 않고 바로 출력
		//		}


		//EX14)			//줄바꿈 또는 띄어쓰기 3가지 방법		
		//		for (int i = 0; i < 10; i++) {
		//			System.out.print(i + " ");				//1. println은 줄바꿈, print는 줄바꿈없이 한줄 출력 혹은 i + " "로 띄어쓰기 
		//		} System.out.println();						//2.  이 경우, 줄바꿈만 일어난다 ->println을 이용한 줄바꿈 
		//													//    ||
		//		System.out.println("호랑이");					//	위의 줄바꿈 출력이 없을 경우 숫자뒤에 바로 붙어 출력된다 
		//		
		//		for (int i = 0; i < 10; i++) {
		//			System.out.printf("%03d ",i);			//3. printf를 이용한 띄어쓰기 -> 3자리를 유지하고 자리 맞춤 ex)%02d, %3d(3칸이 공백) 
		//		} System.out.println();						//줄바꿈 출력코드

		//EX15)			//피보나치 수열
//				int a = 0, b =1, c;
//				for (int i = 0; i < 10; i++) {
//					c = a + b;
//					a = b;
//					b = c;
//					System.out.print(c + " ");
//				}

		//EX16)			//랜덤 5개를 출력하여, 값 >> 결과 일자릿수와 십자릿수의 합을 구하시오 
		//		Random rnd = new Random();
		//		for (int i = 0; i < 5; i++) {
		//			int r = rnd.nextInt(100);
		//			System.out.printf("%d >> 결과 %02d %n", r, r/10 + r%10);
		//		}

		//EX16-1)			//십의자릿수의 합과 일의 자릿수 합을 나타내시오 
		//		Random rnd = new Random();
		//		int sum = 0;
		//		int sum1 = 0;
		//		for (int i = 0; i < 5; i++) {
		//			int r = rnd.nextInt(100);
		//			sum += r/10;
		//			sum1 += r%10;
		//			System.out.printf("%d %n", r);
		//		}
		//		System.out.println("-----");
		//		System.out.printf("%d %d", sum, sum1);

		//EX17)			//5개가 랜덤하게 나온다 (100-999) 조건 1. 중복되는 숫자 X 2. 반드시 5개가 출력되어야 한다 3. 배열을 사용하지 않는다 
		//for문을 사용한 조건 필터링 
		//		Random rnd = new Random();
		//		
		//		for (int i = 0; i < 10; i++) {
		//			int r = rnd.nextInt(900) + 100;//100부터 999까지 출력되는 코드 
		//			//r = 333;//test용으로 강제 대입을 시켜준다 그다음 가장 마지막에 주석  
		//			//System.out.println(r);
		//			
		//			int a = r/100;			//100자리 숫자값
		//			int b = (r%100)/10;  	//증간숫자값
		//			int c = ((r%100)%10);	//나머지의 나머지이기때문에 1의 자릿수 
		//			//System.out.println(a + " " + b + " " + c);	//확인
		//			
		//			if (a == b || b == c || a == c) {
		//				//System.out.println("호랑이");//test용으로 강제 대입을 시켜준다 그다음 가장 마지막에 주석
		//				i--;      //5개 까지는 다 출력이 된다 성립은 되지만 위험하다
		//				continue;
		//				
		//			}
		//			System.out.println(r);
		//			
		//		}
		//while문을 사용한 조건 필터링
		//		Random rnd = new Random();
		//		int count = 0;   										//count대신city라고 적기도한다
		//		while(true) {											//반복의 수를 모를경우 while문을 사용하는것이 좋다 
		//			int r = rnd.nextInt(900) + 100;						//100부터 999까지 출력되는 코드 
		//			//r = 333;//test용으로 강제 대입을 시켜준다 그다음 가장 마지막에 주석  
		//			//System.out.println(r);
		//			
		//			int a = r/100;										//100자리 숫자값
		//			int t = r%100;										//t의 값을 정해주면서 다음 연산의 빠르기를 높일수 있다 
		//			int b = t/10;  										//증간숫자값
		//			int c = t%10;										//나머지의 나머지이기때문에 1의 자릿수 
		//			//System.out.println(a + " " + b + " " + c);		//확인
		//			
		//			if (a == b || b == c || a == c) {
		//				//System.out.println("호랑이");					//test용으로 강제 대입을 시켜준다 그다음 가장 마지막에 주석
		//				continue;
		//				
		//			}
		//			System.out.println(r);
		//			//count++ --> 증가를 시켜주고 if조건문을 걸어주는것 보다는 조건절안에 ++count로 증가시켜주는것이 더 편하다 
		//			if(++count == 5) {									//++count 자기자신을 먼저 올리고 조건을 걸어주는 제어문 
		//				break;
		//			}
		//		}

		//EX18)			//Integer.MAX_VALUE
		//	Random rnd = new Random();
		//		System.out.println(Integer.MAX_VALUE);
		//        //대문자로 되어이쓴건 고정값 (양수의 최댓값0x7fffffff, 약 20억)   //max에 커서를 주고 F3을 누르면 integer class  
		//		//Class File Editor로 연결될 경우; attach source선택, external location을 선택, external file버튼 선택 cdrive>java>jdk>src선택 ok
		//		System.out.println(Short.MAX_VALUE);   //F3으로 찾아가보면 값을 알수 있다 
		//		System.out.println(Double.MAX_VALUE);   
		//		for (int i = 0; i < 10; i++) {
		//		System.out.println(rnd.nextInt(Integer.MAX_VALUE));
		//		}

		//final -> 1.맴버 변수 앞 field앞 2.class이름 앞 final class 3. 맴버 함수 메소드 앞 에 붙일 수 있다 
		//1.//int(type)a(변수)=(대입연산자)10(리터럴); 대입연산자가 있을때 리터럴을 집어넣는다 상수는 무조건 값을 못받을 경우 
		//final int b=20(상수); final은 그 변수를 상수화시키며 값을 대입받지 못한다 
		//2.//final class tiger; class는 더이상 상속을 받을수 없다 (부모클래스가 될수가 없다 extends사용X)
		//	final class Tiger {}
		//	class Lion extends Tiger {}  			 //상속 금지 
		//3.//override 불가 	
		//	class Tiger {
		//		final void f1() {	
		//		}
		//	}
		//	
		//	class Lion extends Tiger {
		//		void f1() {       					//override금지 
		//		}
		//	}


		//EX18-1)			//int num = R(IMV) 나온결과값의 숫자의 합 
//			Random rnd = new Random();
//			int sum = 0;
//			int num = rnd.nextInt(Integer.MAX_VALUE);     
//			System.out.println(num);
//			while (true) {
//				int a = num%10;
//				num = num/10;
//				sum+=a;
//				
//				System.out.println(a);
//				
//				if(num ==0) {
//					break;
//				}
//			}
//			
//			System.out.printf("각자리수의 합은: %d", sum);



		//EX19)			//1. OX횟수 출력하기     2.O/X가 연속해서 가장 많이 나온 횟수    
		/*1	int sum = 0;
	int sum1 = 0;
	for (int i = 0; i < 10; i++) {
		int num = rnd.nextInt(2);
		if(num == 0) {
			System.out.print("O ");
			sum++;

		}else {
			System.out.print("X ");
			sum1++;
		}
	}
	System.out.printf("\nO: %d\nX: %d\n",sum, sum1);  */

//				Random rnd = new Random();
//		
//				int oContinue max = 0;
//				int oContinue count = 0;
//				int xContinue1 = 0;
//				int xContinue2 = 0;
//		
//				for (int i = 0; i < 10; i++) {
//					int num = rnd.nextInt(2);
//		
//					if (num == 0) {
//						System.out.println('O');
//		
//						oContinue2++;
//		
//						xContinue2 = 0;      // max값을 위해서 x가 제거 
//		
//						if (oContinue2 > oContinue1) {
//							oContinue1 = oContinue2;
//						}
//					} else {
//						System.out.println('X');
//		
//						xContinue2++;
//						
//						
//						oContinue2 = 0;
//		
//						if (xContinue2 > xContinue1) {
//							xContinue1 = xContinue2;
//						}
//					}
//		
//				}
//		
//				System.out.printf("\n'O'연속 최대: %d\n'X'연속 최대: %d",oContinue1, xContinue1);
//		
				


		//EX20)			//pretty 문법		
		//		class Apple {
		//			void f1() {
		//				System.out.println("호랑이");
		//			}
		//			void f2() {
		//				System.out.println(this);
		//			}
		//			int f3() {
		//				return 100;
		//			}
		//			String f4() {
		//				return "호랑이";
		//			}
		//			Apple f5() {
		//				return this;
		//			}
		//			void pretty() {
		//				System.out.println("프리티");
		//			}
		//		}
		//
		//		Apple a1 = new Apple(); 
		//		Apple a2 = new Apple();    //new ctrl
		//
		//		System.out.println(a1);		//@뒤의 숫자 = a1객채의 고유 번호 16진수
		//		System.out.println(a2);
		//
		//		System.out.println(a2.hashCode());   //hash code의 결과값은 10진수로 나타내서 달리보이는
		//		System.out.println( Integer.toHexString(a2.hashCode())  );  // Integer.toHexString(a2.hashCode());//10진수를 16진수로 바꾸어 주는 코드 
		//		//민증 번호 확인 
		//		
		//		System.out.println("----------");
		//		a1.f1();
		//		a1.f2();    //여기서 this 는 a1이라는 객체 민증번호가 같다 SO 생성된 객체를 뜻한다 
		//		a2.f2();	//생성된 a2의 객체를 뜻한다 
		//		
		//		System.out.println("----------");
		//		Apple a3 = new Apple();
		//		a3.f2();
		//		a3.f1();
		//		
		//		System.out.println("----------");
		//		a3.f5().f1();
		//		a3.f5().f5().f1();			//함수 안에 함수를 넣는것을 chaining한다 
		//		
		//		System.out.println("----------");
		//		a3.f5().pretty();

		//EX21)			//class 문법 !!class 는 항상 대문자!!
//		class Tiger {
//			//1. 생성자 함수
//			//-1*생성자의 이름은 틀래스 이름과 동일해야한다 (인수전달 X)
//			Tiger(){
//				System.out.println(1);
//				//return 10;<--void가 없기 때문에 생성자는 리턴값을 가질 수 없다 
//			}
//			//-2*함수 오버로딩을 할 수 있다 (인수전달이 1개 있는) 조건>> 인수의 갯수가 다르거나 타입(int a , float a와 같이)이 달라야한다
//			Tiger(int a){
//				System.out.println(2);
//			}
//			//생성자가 3개인 경우 (인수가 2개)
//			Tiger(int a , int b){	
//				System.out.println(3);										//Tiger(int a, b<--각각의 변수는 타입을 입력해 주어야 한다){}
//			}
//			Tiger (int a , String b, Tiger c){		
//				System.out.println(4);										//(인수 3개이상도 사용은 가능하지만 비추)
//			}
//			Tiger(float a) {	
//				System.out.println(5);
//			}
//			Tiger(short a){
//				System.out.println(6);
//			}
//			//-3*생성자 함수는 프로그래머가 임의로 호출할 수 업다 / 생성자 함수는 객체가 생성될떄 자동 호출
//			//2. 맴버 변수 (field)
//
//
//			//3. 맴버 함수 (메소드)
//		}
//
//		Tiger t1 = new Tiger();												//함수는 호출할떄 무조건 ();으로 불러야 한다 
//		//에러))))))  t1.Tiger();//생성자 함수는 new와 동반되어 자동호출이 되어야 한다 
//		//-4*생성자 함수는 리턴 키워드를 사용할 수 없고 가질 수도 없다 
//		Tiger t2 = new Tiger((int)10);
//		Tiger t3 = new Tiger(10, 20);	
//		Tiger t4 = new Tiger(10,"호랑이", null);								//객체가 존재하지않으면 null로 인수전달을해준다
//		Tiger t5 = new Tiger(3.14f);										//type주의 f -> 3.14f   cf -> 3.14
//		Tiger t6 = new Tiger((short)100);									//type casting => Tiger(100)의 경우 int short의 구분이 어려울때는 숫자 앞에 ()를 사용하여 가고싶은 곳을 지시
//
//		System.out.println(7);
//		Tiger t7 = new Tiger();   //7실행 new생성자 함수 콜되고 8실행
//		System.out.println(8);
//
//		int x = 10, y = 20;
//		Tiger t8 = new Tiger(x, y);   //변수로도 전달 가능 =직접값 입력과 같다 
//		
//		String s1 = new String("코끼리");
//		Tiger t9 = new Tiger(x*y, s1, t7);  
//		Tiger t10 = new Tiger(x*y, s1, new Tiger());    //대입연산은 생략, 함수의 인수전달 식으로 사용이 가능 
//		
//		System.out.println("------------------------");
//		class Lion {
//			Lion(){
//				System.out.println(1);
//			}
//			Lion(int a){	
//				System.out.println(2);
//			}
//			Lion(int a, int b){
//				System.out.println(3);
//			}
//			Lion(int a, String b, Lion c){
//				System.out.println(4);
//			}
//			Lion(float a){
//				System.out.println(5);
//			}
//			Lion(short a){
//				System.out.println(6);
//			}
//		}
//		
//		Lion l1 = new Lion();
//		Lion l2 = new Lion((int)100);
//		Lion l3 = new Lion(300,1);
//		Lion l4 = new Lion(100,"사자",null);
//		Lion l5 = new Lion(3.14f);
//		Lion l6 = new Lion((short)1);
//		String st = new String("스트링");
//		Lion l7 = new Lion (1,st, new Lion(5.0f));

//EX22)						//class 생성자 문법
//		class Tiger {
//			int a;				
//			String b;
//			int c = 20;
//			String d = "호랑이";
//			String e = new String("코끼리");
//
//			Tiger() {
//					a = 100;											//인수 전달이 없는 생성자 default 생성자
//					b = "독수리";
//					c = 200;
//					d = "앵무새";
//					e = "날파리";
//			}
//		}
//		
//		Tiger t1 = new Tiger();
//		System.out.println(t1.a);		//객채는 초기화를 시켜주지 않기떄문에 default 값
//		System.out.println(t1.b);
//		System.out.println(t1.c);
//		System.out.println(t1.d);
//		System.out.println(t1.e);
////셍성자의 역할 =  필드 초기화를 목적
////필드에서 초기화 유무 상관없이 생성자에서 값이 갱신 = new로 불러온 생성자의 값이 출력 
		
//EX23)							//
//		class Tiger {//설계도
//			int x = 100, y = 100;//연료
//			
//			Tiger(){
//				
//			}
//			Tiger(int a, int b){
//				x = a;		//x는 필드 a생성자에서 전달받은 인수(연료)
//				y = b;		
//			}
//			Tiger(int a){
//				x = a;
//				y = a;
//			}
//		}
//		
//		Tiger t1 = new Tiger();		//default생성자가 콜 -> 연료를 받아온다
//		System.out.println(t1.x + " " + t1.y);
//		
//		Tiger t2 = new Tiger();
//		System.out.println(t2.x + " " + t2.y);
//		//t1과 t2는 아무런 관계X -> 서로 다른 객체이다 
//		
//		Tiger t3 = new Tiger(200, 300);//연료를 만들때부터 스펙을 집어넣을 수 있디
//		System.out.println(t3.x + " " + t3.y);
//		
//		Tiger t4 = new Tiger(500,600);
//		System.out.println(t4.x + " " + t4.y);
//
//		Tiger t5 = new Tiger(700);
//		System.out.println(t5.x + " " + t5.y);

//EX24)							//default생성자
//		class Apple {
//			
//			Apple () {
//			}
//			Apple(int a){
//				
//			}
//		}
//		
//		Apple a1 = new Apple();		//생성자를 만든뒤라 default생성자는 존재 X --> default생성자를 직접 만들어주는 이유 
//		Apple a2 = new Apple(10);
		
//EX25)							//
//		class Apple {
//			//필드
//			
//			//생성자
//			Apple() {
//				
//			}
//			//함수
//			//void부터~(인수) 까지를 함수 원형이라고 한다
//			void func01() {
//				System.out.println(1);
//			}
//			void func02(int a) {
//				System.out.println(a);
//			}
//		
//			int func03() { //호출 한 척 func03에 return값을 넣어주는것 --> return값이 필수로 필요하다 
//				return 200;
//			}
//			int func04(int a) {
//				return a * 7;//입력값의 *7
//			}
//		}
//			//객체
//		Apple a1 = new Apple ();
//		a1.func01();		
//		a1.func02(100);   //a에 원하는 입력한 값을 출력
//		//함수3번의 사용법 3가지
//		//1.
//		int num = a1.func03();
//		System.out.println(num);
//		//2.
//		int count;
//		count = a1.func03();
//		System.out.println(count);
//		//3.
//		System.out.println(a1.func03());
//		//4.다른방식(return 값과 연산 가능)
//		System.out.println(a1.func03() * 100);
//		System.out.println(a1.func03() * a1.func03());
//		//에러나는 경우
//		//System.out.println(a1.func01());//return값이 필요하지 함수번호 1번을 호출하는것은 성립하지 않는다 
//		//함수4번 사용 방법
//		//1.
//		int x = a1.func04(7);
//		System.out.println(x);
//		//2.
//		int y;
//		y = a1.func04(8);
//		System.out.println(y);
//		//3.
//		System.out.println(a1.func04(9));
//		

//EX26)							//
//		class Apple {
//			Apple () {
//				
//			}
//			void func01() {
//				System.out.println(1);
//			}
//			void func02(int a) {
//				System.out.println(a);
//			}
//			int func03() {
//				return 10;
//			}
//			int func04(int a) {
//				return a;
//			}
//			//func1-4기본형
//			void func05(int a, int b) {
//				System.out.println(5);
//			}
//			void func06(int a, int b, int c) {
//				System.out.println(a*b*c);
//			}
//			void func07(int count, String s) {
//				for (int i = 0; i < count; i++) {
//					System.out.println(s);      //숫자를 count에 입력한 만큼의 s를 출려하겠다
//				}
//			}
//			void func08() {
//				System.out.println(8);
//				func01();//맴버 함수 호출 
//				func09();//순서 상관없이 맴버이면 호출이 가능하다 
//			}
//			void func09() {
//				System.out.println(9);
//				//func08();
//				//func08을 호출 할 수 있지만 무한루프로 빠져 다운됨
//			}
//			void func10() {
//				System.out.println(88);
//			}
//			void func10(int a) {
//				System.out.println(99);
//			}
//			void func10(int a, int b) {
//				System.out.println(a + b);
//			}
//			int func11(int a, int b) {
//				int c = a * a + b * b;
//				return c;
//			}
//			void func12(int num) {
//				if (num > 0) {
//					if(num % 2 == 0) {
//						System.out.println("짝수");
//					}else {
//						System.out.println("홀수");
//					} 
//				}else {
//					System.out.println("양수를 입력해주시오");
//				}
//
//			}
//			void func13(int num) {
//				if (num < 0) {
//					System.out.println("음수는 입력할 수 없어욧");
//					return;//void함수에서 return을 사용하면 ,프로그램이 이 함수가 여기서 중단되고 탈출 = break
//				}
//				if(num % 2 == 0) {
//					System.out.println("짝수");
//				}else {
//					System.out.println("홀수");
//				} 
//			}
//			void func14(int num) {
//				if(num % 2 == 0) {
//					System.out.println("짝수");
//					return;//짝수라고 하고 프로그램 종료
//				}else {
//					System.out.println("홀수");
//				}
//				System.out.println("호랑이");//홀수일경우 홀수 입력을하고 호랑이 까지 출력
//			}
//			void func15(int num) {
//				if(num != 1234) {
//					System.out.println("passward가 맞지 않습니다");
//					return;
//				}
//				System.out.println("접속을 시도합니다");//if else를 사용할떄 if 조건과 else조건의 수가 같아야 좋은 프로그램 
//			}
//			int func16(int num) {
//				if(num % 2 == 0) {
//					return num * 2;
//				}else {
//					return num / 2;			//int 함수는 return으로 받아야하기때문에 if else둘다 return 을 만날 수 있도록 해줘야한다
//				}
//			}
//			
//	}
//		
//		Apple a1 = new Apple();
//		a1.func05(10, 20);
//		a1.func06(1, 2, 3);
//		a1.func07(14, "코끼리");
//		a1.func08();//8번과 함수안 맴버 호출
//		a1.func10();//88
//		a1.func10(0);//99
//		a1.func10(10, 20);//함수도 오버로딩 가능한것을 보여주는 것 
//		
//		//1.
//		int x = a1.func11(2, 3);
//		System.out.println(x);
//		//2.
//		int y;
//		y = a1.func11(4, 5);
//		System.out.println(y);
//		//3.
//		System.out.println(a1.func11(5, 5));
//		
//		a1.func12(0);
//		a1.func13(-2);
//		a1.func14(3);
//		a1.func14(2);
//		a1.func15(1234);
//		a1.func16(6);
//		System.out.println(a1.func16(7));

//EX27)								//문자열과 숫자 치환
//		int num = 100;
//		String s = Integer.toString(num);
//		System.out.println(s);
//		
//		System.out.println(s + 100); //숫자와 문자열이 만나면 둘다 문자열 취급 이라 연산언됨 
//		
//		String t = "777";
//		int a = Integer.parseInt(t);
//		System.out.println(a + 100);  //문장열을 숫자로 치환 
//		 
//		String s1 = num + "";        //정석은 아니고 이런식으로도 치환시킬수 있다 = sugar code
//		System.out.println(s1);
//		
//		//정규편식 = 암호인것처럼보이는 코드 
		
//EX28)

//		int a = 10;   	//10진수
//		int b = 0x10;	//16진수
//		System.out.println(a +"   "+ b);
//		
//		int c = 00010;
//		System.out.println(c);
//		
//		int d = 0376;
//		System.out.println(d);
//		
//		//int e = 0386;
//		//자바에서는 맨 앞의 숫자가 0으로 시작하면 뒤의 값이 8진수로 시작한다 
		
		
//EX29)					//부동소수
//		float sum = 0.0f;
//		for (int i = 0; i < 100; i++) {
//			sum += 0.1f;
//		}
//		System.out.println(sum);
//		//결과값이 미새하게 바뀐다 
//		
//		if (sum == 10.0f) {
//			System.err.println("호랑이"); //호랑이 출력이 안되는 이유가 부동소수 때문
//		}
//		//부동소수는 등가연산에 사용하지 않는다 BUT 대소관계는 상관 없다 
//EX30)
//		//둘중에 더 큰 숫자를 출력
//		System.out.println(Math.max(10, 20));      
//		 /*public static int max(int a, int b) {
//		        return (a >= b) ? a : b;
//		    }*/
//
//		//class 안에 class는 사용이 불가 하기때문에 제일 위로 올려야 한다 
//		Apple a1 = new Apple();      
//		a1.f1();
//		Apple.f2(); 			//객체를 생성시키지 않아도 메모리가 존재하기 떄문에 바로 사용 가능 			
//		a1.f2();				//static은 new를 사용하지 않아도 바로 사용할 수 있지만, 메모리를 많이 차치하는 단점 (처음부터 만들어 놓고 사용하기떄문) 
//		
//		
//		//Integer 함수뒤는 static
		
//EX31)
//		System.out.println("------------");
//		
//		System.out.println(Math.max(10, 20));
//		System.out.println(Math.min(10, 20));
//		System.out.println(Math.abs(-7));		//절댓값
//		System.out.println(Math.pow(3, 4));		//2의 8승
//		System.out.println(Math.sqrt(8));		//루트 8
//		
//		double s = Math.sqrt(8);
//		System.out.println(s * s);				//소수점 연산은 정확한 값이 나오지 않는다 
		
// EX32)			%d %s를 사용한 query문 작성
		
//		String s1 = String.format("무궁화 꽃이%d 피었습니다%s", 10, "많이");  // Python 과는 다르게 , 로 나타낸다 
//		System.out.println(s1);
//		
//		// format 함수: java에서 query문 "insert into ---values(a,b,c)", ---- 자바에서 데이터베이스를 할떄 커리문 완성 용도로 사용하기도 한다 
//			
// EX33)	
//		String s;
/*String F3 -->  public final class String
    implements java.io.Serializable, Comparable<String>, CharSequence {         extends는 일반 클래스와 abstract클래스 상속에 사용되고, implement는 interface상속에 사용*/
		
// EX34)
//		System.out.println("점수를 입력하시오 : ");
//		int num = (new Scanner( System.in )).nextInt();
//
//		if (num >= 90) {
//			System.out.println("A");
//		}else if(num >= 80){
//			System.out.println("B");
//		}else if(num >= 70) {
//			System.out.println("C");
//		}else if(num >= 60){
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}
//		
//	// 반드시 else로 끝나는 문장으로 프로그램 짜기 	
//		중첩 제어문
//		if (3 > 2) {//짝 홀
//			if (3>2) {//홍-> 0e제어
//
//			}else {
//
//			}
//		} else {
//			if (3>2) {
//
//			}else {
//
//			}
//		}

//		Random rnd = new Random();     
//		int r = rnd.nextInt(100);
//		System.out.println(r);
//		
//		int num1 = r/10;
//		int num2 = r % 10;
//				
//		if(num1 % 2 == 0 && num2 % 2 == 0) {
//			System.out.println("탕수육");
//		} else if (num1 % 2 == 0 && num2 % 2 != 0){
//			System.out.println("냉면");
//		} else if (num1 % 2 != 0 && num2 % 2 == 0) {
//			System.out.println("짜장");
//		}
//		else {
//			System.out.println("우동");
//		}
//		//Better than above
//		Random rnd1 = new Random();
//		int r1 = rnd.nextInt(99);
//		System.out.println(r1);
//		
//		int a = r1 / 10;
//		int b = r1 % 10;
//		
//		if (a % 2 == 0) {
//			if (b % 2 == 0) {
//				System.out.println("탕수육");
//			}else {
//				System.out.println("냉면");
//			}
//		}else {
//			if (a % 2 == 0) {
//				System.out.println("짜장");
//			}else {
//				System.out.println("우동");
//			}
//		}
		
// EX36)
//		int a1 = 0;
//		while (a1 < 10) {
//			a1 += 1;
//			System.out.println(a1);
//		}
//		System.out.println("호랑이");
//
//		int a = 0;
//		while (a < 10) {
//			a += 1; 				//Java는 a++ 0+1값으로 시작하기때문에 0은 출력되지 않는다 
//			if (a == 3) {
//				continue;			//3일때 if절로 나가서 다시 회전하기때문에 3이 출력되지 않는다  
//			}
//			if (a == 6) {
//				break;				//6일떄 break로 종료되기때문에 6-9까지는 출력이 되지 않는다 
//			}
//			System.out.println(a);
//		}
//		System.out.println("호랑이");
		
// EX37)		
//		int a = 0;
//		
//		while(true) {
//			a ++;
//			if (a ==5) {
//				System.out.println("프로그램을 중단합니다");
//				break;	
//				//System.out.println("콖리리"); Unreachable -> break를 만나면 종료되기때문에 에러
//			}
//			System.out.println("looping");
//		}
//		System.out.println("종료");
		
		
		//반복횟수를 모를 경우 while으로 제어 

//		int num = 23;										//우박수; 숫자가 업다운되는 수 
//		while (true) {
//			System.out.println(num);
//			if(num % 2 == 0) {
//				num = num / 2;
//			}else{
//				num = (num * 3) + 1;
//			}
//			if (num == 1) {
//				System.out.println(num);
//				System.out.println("프로그램을 중단합니다");
//				break;
//			}
//		}

		
//EX 38)
//		int num = 23;										//우박수; 숫자가 업다운되는 수 
//		while (true) {
//			System.out.println(num);
//			num = ( num % 2 == 0) ? num / 2 : ( num * 3 ) + 1;
//			if (num == 1) {
//				System.out.println(num);
//				System.out.println("프로그램을 중단합니다");
//				break;
//			}
//		}

//EX39)					중첨 for 문 -> 결과값이 어떻게 출력되는지를 잘알자
		// 1. i 와 j의 값이 어떤 논리로 출력값의 결과를 보여주는지 -> i 가 0일떄 j가 0-3 돌고 다음 1일떄 2일떄 까지 출력 4 * 3 = 12개 출력 
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.println(i + " " + j);
//			}
//		}
		
//		System.out.println("-------------------------");
		
		// 2.중첩 for문의 경계가 어떻게 되는지 -> println을 이용한 줄바꿈 
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.print("[" + i + " " + j + "]");
//			}
//			System.out.println();								//{}바로뒤에 입력하는것이 줄줄이기 좋다 
//		}
		// 3. println의 줄력 vs print의 출력은 줄바꿈 없이 연속으로 출력 구분 
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.println("[" + i + " " + j + "]");				 
//			}System.out.println("--중첩 for 문의 구분--");
//		}
		
//컴포팅 -> 자바의 코드를 파이썬으로 그대로 옯기는것 (변환)
		
//EX40)					/	
//		int k = 0;
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.printf("%02d ", k);	
//				k++;
//			}System.out.println();
//		}
		
		//밖에있는 for문은 항상 세로에 대한 반복 , 안의 for문은 가로에 대한 반복이다 
		
//		for (int i = 0, k = 0; i < 3; i++, k++) {				//결과는 똑같다 BUT int k의 값을 바로 입력해 줄수 있다 
//			for (int j = 0; j < 4; j++) {
//				System.out.printf("%02d ", k);	
//			}System.out.println();
//		}
		
//EX40 - 1)					0-9까지의 랜덤 숫자를 받고, 4*3배열, 한줄당 합한 수의 결과를 나타내는 것 
//		8 1 3 8  20
//		1 5 4 4  한줄
//		2 5 0 7  합
		
//		Random rnd = new Random();
//	
//
//		for (int i = 0; i < 3; i++) {
//			int sum = 0;													//for문안에서 다시 반복하도록 해야 한다 밖에있으면 모든것의 누적합
//			for (int j = 0; j < 4; j++) {
//				int r = rnd.nextInt(9);
//				System.out.printf("%d ", r);
//				sum += r;
//			}
//			
//			System.out.printf(" %d", sum);
//			System.out.println();
//		}
//

		
//EX41)					숫자와 문자의 아스키코드
		
//		System.out.println(65);
//		
//		System.out.println((char)65);
//		
//		System.out.println((int)'A');
		
//		for (int i = 0; i < 26; i++) {
//		//	System.out.println((char)(65 + i));								//원하는 숫자를 묶어서, 문자로 캐스팅후 출력
//			System.out.println((char)('A' + i));							//코드의 가독성이 높다 ''으로 문자를 묶어 준다음 캐스팅 출력 
//		}
		
		
//EX41-1)	//A-Z까지의 알파벳을 랜덤하기 3*4으로 나타내기 	
//	Random rnd = new Random();
//	
//	for (int i = 0; i < 3; i++) {
//		for (int j = 0; j < 4; j++) {
//			int r = rnd.nextInt(26);										//알바벳의 순서를 A-Z까지 나타내기위한 랜덤 숫자 범위 
//			System.out.printf("%c ", (char)('A' + r));						//랜덤으로 뽑은 숫자에 A를 더하는것 -> 랜덤 A-Z까지 뽑기 //char의 표현은 ''Sting의 표현은 ""으로 나타낸다 
//			}System.out.println();
//		}
		
//EX42)					collection - 1
//		// < > <-container라고한다 container안에는 일반타입이 들어올수 없고 ex_ <int>객체 타입만 들어올수 있다 class <Integer>//관리주체li(관리자)
//		
//		LinkedList<Integer> li = new LinkedList<Integer>();		
//		System.out.println(li.size()); 										//container안에 들어있는 갯수 현: 0개
//		
////CRUD -> Create 
//		
////	li.add(10);
//		li.add(20);
//		System.out.println(li.size());										//2개
//		
//		for (int i = 0; i < 10; i++) {
//			li.add(i);
//		}
//		System.out.println(li.size());										//10개
//		
//		System.out.println("----------Create--------------");
//		
//		
////CRUD -> Reading
//		
//		for (int i = 0; i < li.size(); i++) {								//li.size 는 우리가 끝값을 모르기 때문에 사용하는 함수 이다 
//			Integer data = li.get(i);										//객체 생성후 data사용 
//			System.out.print(data + " ");
//		}
//		System.out.println();
//
//		
//		for (int i = 0; i < li.size(); i++) {
////		System.out.print(li.get(i) + " ");								//출력코드에 바로 대입 
//		}System.out.println();
//		
//		System.out.println("-----------Reading-------------");
//		
//		li.add(0, 77);														//넣고자하는 곳의 위치와 함께 숫자를 대입
//		li.add(3, 88);
//		
//		for (int i = 0; i < li.size(); i++) {								//출력 코드
//			System.out.print(li.get(i) + " ");								
//		}System.out.println();
//
////CRUD -> Update
//		System.out.println("------------Update------------");
//		
////	li.set(3, 99);														//88 -> 99로 생성 
//		
//		for (int i = 0; i < li.size(); i++) {
//			System.out.print(li.get(i) + " ");								
//		}System.out.println();
//		
//		
//		
////CRUD -> Delete
//		System.out.println("-----------Delete-------------");
//		
////	li.remove(7);														//7째의 번호 삭제
//		
//		for (int i = 0; i < li.size(); i++) {								//출력 코드 1
//			System.out.print(li.get(i) + " ");								
//		}System.out.println();
//		
//		System.out.println("-----------foreach-------------");
//		
//		for (Integer data : li) {											//li안에드러있는 data를 for문을 돌면서 모두 출력해주는 출력 코드 2
//			System.out.print(data + " ");
//		}
//		
//EX43)					collection - 2
//		
//		class Apple {
//			int x, y ;
//			Apple(){
//																			//default 생성자 값이라 바로 함수출력된다 
//			}
//			Apple(int a, int b){
//				x = a;														//함수값을 지정해 준다 
//				y = b;
//			}
//			void show () {
//				System.out.println(x + " " + y);	
//			}
//		}
//
//		Apple a1 = new Apple();
//		a1.show();
//
//		a1.x = 100;														//함수값을 객체를 통해 대입해준다 
//		a1.y = 200;
//		a1.show();
//
//		Apple a2 = new Apple(77, 88);									//생성자의 인수값으로 전달된 값이 바로 들어간다
//		a2.show();
//		
//		System.out.println("------------Create----------------");
//		
//		LinkedList<Apple> oli = new LinkedList<Apple>();
//		
//		oli.add(a1);
//		oli.add(a2);
//		
//		System.out.println(oli.size());									//2개
//		
//		for (int i = 0; i < 5; i++) {
//			Apple ta = new Apple();
//			ta.x = i * 10;
//			ta.y = i * 20;
//			oli.add(ta);												//oli 함수를 직업 만들어서 add해주기 
//		}
//		System.out.println(oli.size());									//7개
//		
//		for (int i = 0; i < 5; i++) {
//			Apple ta = new Apple(i * 30, i * 40);
//			oli.add(ta);												//생성자의 인수값을 통해 바로 add해주기 
//		}
//		System.out.println(oli.size());									//12개
//		
//		for (int i = 0; i < 5; i++) {
//			oli.add(new Apple (i * 50, i * 60));						//생성자에 인수값을 넣는 동시에 add해주기 
//		}
//		System.out.println(oli.size());									//17개
//		
//		System.out.println("------------Reading1-get----------------");
//		
//		for (int i = 0; i < oli.size(); i++) {
//			System.out.println(oli.get(i).x + " " + oli.get(i).y);		//각 객체를 바로 get하여 x와 y값을 보여달라 직접말하기 
//		}
//		System.out.println("------------Reading2-show----------------");
//		
//		for (int i = 0; i < oli.size(); i++) {
//			oli.get(i).show();											//get(i)한 함수를 보여달라.show()
//		}
//		System.out.println("------------Reading3-foreach----------------");
//		
//		for (Apple data : oli) {
//			data.show();												//data.show();주의 !! oli.show();XXXX
//		}
//		
//		System.out.println("------------Delete1----------------");
//		
//		oli.remove(3);
//		
//		for (Apple data : oli) {
//			data.show();
//		}
//		
//		System.out.println("------------Update----------------");
//		
//		oli.set(2, new Apple (888, 999));								//Apple 인수의 값에 맞게 바로 대입 Apple(int a, int b) type으로 
//		
//		for (Apple data : oli) {
//			data.show();
//		}
		
		
//EX44)					/radian을 넣어줘야 정상적인 값을 얻게된다 sin,csin,tan
		
//		System.out.println(Math.sin((3.14*30.0)/180.0f));
//		
//		for (int i = 0; i <= 36; i++) {
//			System.out.println(Math.sin((Math.PI*(i*10))/180.0f));	
//		}
		
//EX44)			배열 with swap(자리교환엔 swap) (랜덤숫자를 낮은 순으로 출력; 오름차순 순차정렬) 선택 정렬
//			
//		int [] ar = {5, 4, 8, 7, 1, 2, 9, 6};
//
//		for (int i = 0; i < ar.length; i++) {								//갯수는 배열갯수만큼 
//			System.out.print(ar[i] + " ");
//		}System.out.println();
//		System.out.println("-----------------------");						//변경되기전 data
//
//		for (int i = 0; i < (ar.length - 1); i++) {							//배열갯수 -1 마지막은 비교대상이 X
//
//			for (int j = i + 1; j < ar.length; j++) {						//i 와 비교가 되어야 할 i 다음 숫자 +1 부터 시작 
//				// System.out.println(i + " " + j);
//				if (ar[i] > ar[j]) {										//바꾸어야 된다면 
//					int temp = ar[i];
//					ar[i] = ar[j];
//					ar[j] = temp;
//
//				}
//			}
//			for (int k = 0; k < ar.length; k++) {							//디버깅 과정을 볼 수 있다 
//				System.out.print(ar[k] + " ");
//			}System.out.println();
//		}
		
		
//		
//		
//		System.out.println("----------------------");
//		
//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i] + " ");
//		}System.out.println();												//변경된 후 data
//
//		System.out.println(ar.length);										//배열의 갯수 
//		
//		
// 역순행으로 짜는 법 	
//		int [] ar = {5, 4, 8, 7, 1, 2, 9, 6};
//		for (int i = 0; i < ar.length/2; i++) {								
//			int temp = ar[i];
//			ar[i] = ar[ar.length - i -1];									
//			ar[ar.length - i -1] = temp;
//		}
//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i] + " ");									//뽑아준 배열 확인하기 i가아니라 ar[i] 이다 
//		}
//		System.out.println();
//
//		
////역순행으로 짜는 논리 분석 
//		for (int i = 0; i < ar.length/2; i++) {								//배열의 길이 -> 0 5, 1 4, 2 3 총 6개를 3개로 뽑아내야하니까 5/2의 몫 이용
//			System.out.println(i + " " + (ar.length - i - 1));
//		}
//
//		for (int i = 0; i < ar.length/2; i++) {
//			int temp = ar[i];
//			ar[i] = ar[ar.length - 1 - i];									//배열의 인덱스 5를 기준
//			ar[ar.length - 1 - i] = temp;
//		}
//		for (int i : ar) {														//for each 문장으로 전체 출력 
//			System.out.print(i + " ");
//		}System.out.println();

		//결과가 밑에처럼 나오게끔 출력 
		//[01][12][23][34][45]
		//[01][12][23][34]
		//[01][12][23]
		//[01][12]
		//[01]
			
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5 - i; j++) {
//				System.out.printf("[%d %d]", j, j + 1);
//			}System.out.println();
//		}
//		

		
//	//버블 정렬
//		int [] ar = {5, 4, 8, 7, 1, 2, -6, -15};
//		
//		for (int i = 0; i < ar.length -1; i++) {
//			for (int j = 0; j < (ar.length - 1) - i; j++) {
//				if(ar[j] > ar[j + 1]) {
//					int t = ar[j];
//					ar[j] = ar[j + 1];
//					ar[j + 1] = t;
//				}
//			}
//		}
//		for (int i : ar) {
//			System.out.print(i + " ");
//		}System.out.println();
//		
//		System.out.println("--------------------");
//		

//		
//		//버블 정렬
		
//		int c = 4;
//		int r = 3;
//		//00 01 02 03 
//		//04 05 06 07 
//		//08 09 10 11 
//		
//
//	
//		for (int i = 0; i < r; i++) {
//			for (int j = 0; j < c; j++) {
//				System.out.printf("%02d ", i);
//				//System.out.printf("%02d ", i * m + j);
//			}System.out.println();
//		}
//		
//		System.out.println("------------------------");
		

//		
//		//08 09 10 11
//		//04 05 06 07
//		//00 01 02 03
//		int r = 3;
//		int c = 4;
//		for (int i = 0; i < r; i++) {
//			for (int j = 0; j < c; j++) {
//				System.out.printf("%02d ", ());
//			}System.out.println();
//		}
//		
//		for (int i = 0; i < n; i++) {
//			
//			for (int j = 0; j < m ; j++) {
//				System.out.printf("%02d ", (n - i - 1)*m + j);
//			}System.out.println();
//		}
//		
//		System.out.println("------------------------");
		
		

//		
//		//11 10 09 08
//		//07 06 05 04
//		//03 02 01 00
//		//오름차순은 낮은수에 근접해서 + vs 낮은차순은 높은수에서 근접하여 -
//		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//				System.out.printf("%02d ", (n - i) * m - j -1);
//			}System.out.println();
//		}
//		
//		System.out.println("------------------------");
		
//
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.printf("%02d ", (n - i -1) * m + j);
//			}System.out.println();
//		}
//
//		System.out.println("행과 열값을 입력하시오");
//		int n = (new Scanner( System.in )).nextInt();
//1. 밑과 같이 출력하시오 
//4를 입력받아
//*
//**
//***
//****
//		System.out.println("배열값을 입력하시오");
//		int m = (new Scanner( System.in )).nextInt();
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < (i + m)-3; j++) {
//				System.out.printf("%c", '*');
//			}System.out.println();
//		}
		
//2. 밑과 같이 출력하시오 
//5를 입려받아
//*****
//****
//***
//**		
//*	
//		System.out.println("배열값을 입력하시오");
//		int m = (new Scanner( System.in )).nextInt();	//끝값은 정사각형 배열 고정 
//		for (int i = 0; i < m; i++) {					//시작값이 i여야 줄어든다
//			for (int j = i; j < m; j++) {
//				System.out.printf("%c" , '*');
//			}System.out.println();
//		}	
		
//3. 밑고 같이 출력하시오 
//홀수만 출력받아
//  *
// ***
//*****
// ***
//	*
//		System.out.println("홀수값을 입력하시오");
//		int m = (new Scanner( System.in )).nextInt();
		

//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				int ii = -2 + i;
//				int jj = -2 + j;
//				ii = Math.abs(ii);
//				jj = Math.abs(jj);
//				System.out.printf("[%+d %+d]",ii, jj);
//			}System.out.println();
//		}System.out.println();
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				int ii = -2 + i;
//				int jj = -2 + j;
//				ii = Math.abs(ii);
//				jj = Math.abs(jj);
//				if (ii + jj <= 2) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}System.out.println();
//		}System.out.println();
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				int ii = Math.abs(-2 + i);
//				int jj = Math.abs(-2 + j);
//				if (ii + jj <= 2) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}System.out.println();
//		}System.out.println();
//		for (int i = -2; i <= 2; i++) {
//			for (int j = -2; j <= 2; j++) {
//				int ii = Math.abs(i);
//				int jj = Math.abs(j);
//				if (ii + jj <= 2) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}System.out.println();
//		}System.out.println();
////		int num = 9;
////		int hn = num/2;
////		for (int i = -hn; i <= hn; i++) {
////			for (int j = -hn; j <= hn; j++) {
////				int ii = Math.abs(i);
////				int jj = Math.abs(j);
////				if (ii + jj <= hn) {
////					System.out.print("* ");
////				}else {
////					System.out.print("  ");
////				}
////				
////				
////			}System.out.println();
////		}System.out.println();
//		int num = 9;
//		int hn = num/2;
//		for (int i = -hn; i <= hn; i++) {
//			for (int j = -hn; j <= hn; j++) {
//				int ii = Math.abs(i);
//				int jj = Math.abs(j);
//				System.out.print(ii + jj <= hn? "* " : "  ");
//			}System.out.println();
//		}System.out.println();
		
		//가장좋은 다이아 출력문 
//		System.out.println("홀수값을 입력하시오");
//		int m = (new Scanner( System.in )).nextInt();	
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				int ii = Math.abs(-2 + i);
//				int jj = Math.abs(-2 + j);
//				if(ii + jj <= 2) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}System.out.println();
//		}
		
		
		
		
		
//		int a = 10, b = 20, c =30;
//		int a = 10, b = 30, c =20;
//		int a = 20, b = 10, c =30;
//		int a = 20, b = 30, c =10;
//		int a = 30, b = 10, c =20;
//		int a = 30, b = 20, c =10;
		
		//3 개의 변수가 가지고 있는 중간값을 출력하시오 
//		Random rnd = new Random();
//
//		//1차 버전
//		for (int i = 0; i < 3; i++) {
//			int a = rnd.nextInt(100);
//			int b = rnd.nextInt(100);
//			int c = rnd.nextInt(100);
//			int m;
//			
//			if (a > b) {
//				if(a > c) {
//					m = Math.max(b, c);
//				}else {
//					m = a;
//				}
//			}else {
//				if(a < c) {
//					m = Math.min(b, c);
//				}else {
//					m = a;
//				}
//			}
//			System.out.printf("%2d %2d %2d : %2d\n", a, b, c, m);
//		}
		
//		//2차 버전
//		Random rnd = new Random();
//		
//		for (int i = 0; i < 10; i++) {
//			int a = rnd.nextInt(100);
//			int b = rnd.nextInt(100);
//			int c = rnd.nextInt(100);
//			int m;
//			
//			if (a > b) {
//				m = (a > c)? (Math.max(b, c)) : a;
//			} else {
//				m = (a < c)? (Math.min(b, c)) : a;
//			}
//			System.out.printf("%02d %02d %02d: %02d\n", a, b, c, m);
//		}
		
//		//3차 버전
//		Random rnd = new Random ();
//		
//		for (int i = 0; i < 10; i++) {
//			int a = rnd.nextInt(100);
//			int b = rnd.nextInt(100);
//			int c = rnd.nextInt(100);
//			int m;
//			
//			m = (a > b)
//					? (a > c) ? (Math.max(b, c)) : a
//					: (a < c) ? (Math.min(b, c)) : a;
//			System.out.printf("%02d %02d %02d: %0"
//					+ "2d\n", a, b, c, m);
//		}
		
		
		
		//함수의 모양 꼴 (Python)
//		class Apple {
//			int a = 10;									//필드
//			
//			Apple(int a){								//default 생성자
//				this.a = a;
//			}
//			void func01 () {							//기본 메소드
//				System.out.println("a를 출력해라" + a);
//				System.out.println("--------");
//			}
//			
//			void func02(int a){							//인수
//				System.out.print("Apple 02\n" + a +"\n");
//				System.out.println("--------");
//			}
//			int fun03() {								//return
//				System.out.println("Apple 03");
//				return 20;
//			}
//			int fun04(int a, int b) {					//인수 + return
//				System.out.println("Apple 04");
//				return a + b;							//일반적으로 return값에는 ()를 안붙인다
//				
//			}
//			void func05(int a, int b, int c) {
//				int sum = a * b + c;
//				System.out.println(sum);
//				System.out.println(a*a + b*b + c*c);
//			}
//			void func06() {
//				System.out.println("1");
//				return;
//				//System.out.println("2");
//			}
//			void func07(int a, String b) {
//				System.out.println(a +" "+ b); 
//			}
////			//void func08(int a, int b, int c, int d) {//JAVA에서는 인수 초기값 전달이 안된다 
////				c = 10; d = 20;
////				System.out.println();
////			}
//			void func09(String ...a) {///... <- 가변인수
//				for (String data : a) {
//					System.out.println(data);
//				}
//			}
//			void func10(int a , int b, int ... c) {
//				System.out.println(a +" "+ b);
//				for (int data : c) {
//					System.out.println(data);
//				}
//			}
////			
//		}
//		
//		Apple a1 = new Apple(20);
//		
//		a1.func01();
//		
//		a1.func02(2);
//
//		int x = a1.fun03();
//		System.out.println(x);
//		
//		System.out.println(a1.fun03());
//		
//		a1.fun03();
//		
//		System.out.println("--------");
//		
//		int y = a1.fun04(3, 4);
//		System.out.println(y);
//		
//		a1.fun04(1, 2);
//		System.out.println(a1.fun04(5, 6));
//		System.out.println("--------");
//		
//		a1.func05(2, 3, 4);
//		
//		System.out.println("--------");
//		a1.func06();
//		
//		System.out.println("--------");
//		a1.func07(1, "호랑이");
//		
//		System.out.println("--------");
//		a1.func09("호랑이");
//		
//		System.out.println("--------");
//		a1.func10(10, 20, 30);
//		
		
		// 1. 총 몇초인지 출력하시오, 결과를 result 받았을떄 다시 result를 가지고 역으로 프로그램 뽑기
//		int h = 2, m = 43, s = 27;
//		
//		int result = s + (m*60) + (h*3600);
//		System.out.println(result + "초");
//		int cho = result % 60; 
//		int bun = (result / 60) % 60; 
//		int si = (result / 60) / 60; 
//		System.out.println(si + "시 " + bun + "분 " + cho + "초");

		
		// 0-100 까지 5개 출력, 결과 값이 입력한 수보다 크고 제일 가까운 4의 배수로 만들어라
		
//		Random rnd = new Random();
//		
//		
//		for (int i = 0; i < 5; i++) {
//			int a = rnd.nextInt(100);
//			if (a % 4 == 0) {
//				int b = a;
//				System.out.println(a + ">>" + b);
//			}else {
//				int b = ((a/4)+1) * 4;
//				System.out.println(a + ">>" + b);
//			}
//	
//		} 
//		
//		
//		for (int i = 0; i < 5; i++) {
//			int c = rnd.nextInt(100);
//			int d = (c % 4 == 0) ?  c : ((c/4)+1) * 4;
//			System.out.printf("%d >> %d\n", c, d);
//		}
//		
		
		//this를 이용한 사례 1. 필드명 전달 인수명이 같은 
//		class Apple{
//
//			Apple(){								//Apple(Apple this) = Apple(Apple self)의 Python 과 같다 
//				System.out.println("생성자");
//				System.out.println(this);
//
//			}
//		}
//
//
//		Apple a = new Apple();								
//		System.out.println(a);
//
//		Apple b = new Apple();								//this는 만들어져 있는 객체를 (a,b)를 불러 BUT a,d의 this는 다르다 
//		System.out.println(b);
//
//		Apple c = new Apple();								// 생성된 객체가 다 다르기 떄문에 this도 다르다 								
//		System.out.println(c);

//		class Apple{										//this는 class 맵버를 받는다 필드와 클래스 구분 
//			int a, b;
//			
//			Apple(int a, int b){							// 필드안의 변수와 인수안의 변수는 같게 사용한다 구분을 위한 가독성 
//				this.a = a;									//필드안에 들어있는 a를 인수안에 들어있는 값이 초기값을 시키기 위해 this
//				this.b = b;
//				
//
//			}
//		}
//
//		
//		
//		Apple a = new Apple(30, 40);
//		System.out.println(a.a + " " + a.b);

//
//		//this를 사용하는 첫번째 용도 (기본)
//		class Apple{
//			int money;
//			String name;
//			Apple(int money, String name) {					//source >> generate constructor using field
//				this.money = money;
//				this.name = name;
//			}
//			
//		
//		}
//		
		//this를 이용한 사례 2.  return을 이용해서 chaining 을 이용
//		class Apple {
//			
//			Apple(){
//				
//			}
//			String func01() {
//				return null;								//나중에 작성 null값 사용 
//			}
//			Integer func02() {
//				return 0;									// class가 return 되고 있다 -> Apple 
//			}
//			Apple func03() {								//class도 리턴 가능
//				return null;
//			}
//			Apple func04() {
//				return this;								// 아직 누군지는 모르지만 함수 호출 -> 주로 재호출할떄 사용 chaining 
//			}
//			void func05() {
//				System.out.println("호출");
//			}
//			
//		}
//
//
//		Apple apple = new Apple();
//		//chaining 3가지
//		apple.func05();
//		apple.func04().func05();							
//		apple.func04().func04().func05();

		
		//호출 this.변수에 this는 생략 가능 하지만 적어주는것이 좋다 
//		class Apple{
//			int num = 10;
//			
//			Apple(){
//				
//			}
//			void func01(){
//				System.out.println(num);
//				System.out.println(this.num); 		//원래 this.num 이지만 생략 가능 
//			}
//		}
		
		//1차원 배열
//		//배열 - 인덱스값
//		int [] ar = new int [7];
//		ar[0] = 10;
//		ar[6] = 20;
//		//ar[7] = 30;								//ArrayIndexOutOfBoundsException: index 7 out of bounds for length 7
//		//ar[-1] = 40;								//out of bounds
//		ar[3*2-1] = 30;								//유효범위안에서 나오기만하면되기때문에 산술연산도 가능 but 위험 주의 
//		
//		//지금까지의 결과만 바로 보고 싶다 
//		for (int i : ar) {
//			System.out.print(i + " ");
//		}System.out.println();
//		
//		int num = 3;
//		ar[num] = 40;								//변수를 넣어서 사용 가능
//		ar[num * 2 - 1] = 100;
//		
//		for (int i : ar) {
//			System.out.print(i + " ");
//		}System.out.println();
//		
//		//베열 안속 배열 산솔연산 
//		ar[0] = 3;
//		ar[6] = ar[ar[0] * 2 - 1];					//ar[6] = ar[5]
//		
//		for (int i : ar) {
//			System.out.print(i + " ");
//		}System.out.println();
//		
		
//		//2차원배열 - 인덱스를 이용한 배열 
//		//5 는 가로길이에 해당, 3은 세로 길이에 해당된다 
//		int[][]br = new int[4][6];					//뒤에서부터 해셕한다 5개 짜리를 3개
//		br[0][0] = 10;
//		br[0][4] = 40;								//
//		br[2][4] = 80;
//		
//		//프로그램논리를 생각할수 있도록 만들어주는 코드 
//		for (int i = 0; i < br.length; i++) {
//			for (int j = 0; j < br[0].length; j++) {		//br[인덱스].length를 사용해도되지만 i를사용하는것이 정석 
//				System.out.printf("[%d %d] ", i, j);
//			}System.out.println();
//		}System.out.println();
//		
//		//결과를 출력하기 위한 코드
//		for (int i = 0; i < br.length; i++) {
//			for (int j = 0; j < br[i].length; j++) { 		//br[i].length이 정석 
//				System.out.printf("%3d ", br[i][j]);
//			}System.out.println();
//		}System.out.println();
//		
//		System.out.println(br.length);			//br.length 세로반복 횟수를 얻는것 
//		System.out.println(br[0].length);		
//		System.out.println(br[1].length);		//br[index].length 가로횟수 
//		
		
//		//3*4배열 
//		Random rnd = new Random();
//		int[][] ar = new int[3][4];
//		
//		for (int i = 0; i < ar.length; i++) {
//			for (int j = 0; j < ar[i].length; j++) {
//				System.out.printf("%02d ", ar[i][j]);
//			}System.out.println();
//		}System.out.println();
//		
//		for (int i = 0; i < ar.length; i++) {
//			for (int j = 0; j < ar[i].length; j++) {
//				ar[i][j] = rnd.nextInt(100);
//				System.out.printf("%02d ", ar[i][j]);
//			}System.out.println();
//		}System.out.println();
		
		
//		
//		//(3*4)ar							(4*3)br
//		//3 2 7 9							6 2 3 
//		//2 3 5 4 			=>				9 3 2
//		//6 9 1 5							1 5 1
//		//                                  5 4 9
//		int[][]br = new int[4][3];
//		
//		for (int i = 0; i < br.length; i++) {
//			for (int j = 0; j < br[i].length; j++) {
//				//br[i][j] = ar[2-j][i]
//				System.out.printf("%02d ", ar[2-j][i]);
//			}System.out.println();
//		}System.out.println();
//		
//		//ar => cr 
//		//9 7 2 3
//		//4 5 3 2
//		//5 1 9 6
//		int[][]cr = new int[3][4];
//		for (int i = 0; i < cr.length; i++) {
//			for (int j = 0; j < cr[i].length; j++) {
//				System.out.printf("%02d ", ar[i][3-j]);
//			}System.out.println();
//		}System.out.println();
//		
//		//ar => dr
//		//9 4 5
//		//7 5 1
//		//2 3 9
//		//3 2 6
//		int[][]dr = new int[4][3];
//		for (int i = 0; i < dr.length; i++) {
//			for (int j = 0; j < dr[i].length; j++) {
//				System.out.printf("%02d ", ar[j][3-i]);
//			}System.out.println();
//		}System.out.println();
		
		
	// 예외 Exception
//		// #1. ArrayIndexOutOfBoundsException
//		int []ar = new int[3];
//		//ar[5] =10;							
//		
//		//#2. ArithmeticException
//		//int a = 100/0;						
//		
//		//#3. NullPointerException
//		String s = null;
//		//s.hashCode();							
//		
//		//#4. ClassCastException <- 의도적으로 프로그램을 짤떄가 있다 
//		class A {
//		}
//		
//		class B extends A{
//			void func01() {
//				
//			}
//		}
//		
//		A a = new A();
//		B b = (B)a;		//억지로 class type 을 맞추는 것 type casting <- class type = a객체
//		
		
	//예외 처리 try catch - exception이 발생을 하던지 안하던지 
//		try {
//			int a = 100/0;
//			
//		} catch (Exception e) {
//			System.out.println("익셉션 발생");
//			e.printStackTrace();					//중간에 exception 내용을 출력해준다 - 프로그램은 정상 처리가 된다 
//		}
//		System.out.println("호랑이");
//		System.out.println();
//		
//		
//		try {
//			int b = 100/0;
//		} catch (Exception e) {
//			// TODO: handle exception
//		} finally {									//무조건 출력해야하는 코드 
//			System.out.println("여기는 파이너리");
//		}
		
		
		// Unhandled exception type InterruptedException 이함수는 익셉션을 발생시킬수있다 try catch 로 받아야한다 
//		for (int i = 0; i < 6; i++) {
//			System.out.println(i);
//			try {Thread.sleep(1000);} catch (Exception e) {}  //thread.sleep 은 한줄처리해준다 굳이 5줄 작성할필요X
//			
//		}
		
		//위의 문법적 구초 근본 - 함수가 try catch를 요구하는 문장이 있을때는 이러한 문법때문에 써야한다는것만 알면 된다 
//		class Apple{
//			
//			void f1() throws Exception {					//이 함수 내부에서는 무조건 exception 라고한느것이 리턴값
//				System.out.println(1);
//				
//				throw new Exception();
//			}
//			
//			void f2() {
//				try {
//					throw new Exception();
//				} catch (Exception e) {
//					System.out.println(2);
//				}
//				
//			}
//			
//			void f3() throws Exception {
//				System.out.println(3);
//				throw new Exception();
//				
//			}
//			
//			void f4() {
//				
//				try {
//					f3();								//호출한 놈이 책임져야 한다 
//				} catch (Exception e) {
//					System.out.println(4);
//				}
//				
//			}
//			
//		}
//		
//		Apple a = new Apple();
//		//a.f1();										//Unhandled exception type Exception
//		try {
//			a.f1();										//exception이 발생한 함수를 호출한 애가 책임을 지라는 의미 
//		} catch (Exception e) {
//			
//		}
//		
//		a.f2();											//이미 함수에서 책임지고 exception을 처리했으니 그냥 사용 O
//		
		
		
		//public class day_test1 {

		//	public static void main(String[] args) throws Exception{
//		a.f1();								// exception 떠넘기기 -> main 운영체재 자체에 책임전가 							
//		Thread.sleep(3000);					// 함수자채가 운영체재에 넘겨져 있기떄문에 에러가 안뜬다 BUT 단발적이 아니면 사용 자채 

		
		
//				//401호 402호 403호
//				//301호 302호 303호
//				//201호 202호 203호
//				//101호 102호 103호
//				
//				for (int i = 0; i < 4; i++) {
//					for (int j = 0; j < 3; j++) {
//						System.out.printf("%2d0%d호", 4 - i, j + 1);
//					}System.out.println();
//				}
//				
//				
//				//* * * * *
//				//* 0 0 0 *
//				//* 0 0 0 *
//				//* * * * *
//				//삼항연산이 가능하다 
//				
//				for (int i = 0; i < 4; i++) {
//					for (int j = 0; j < 5; j++) {
//						
//						if(i == 0 || i == 3 || j == 0 || j == 4) {
//							System.out.printf("%c ", '*');
//						}else {
//							System.out.printf("%c ", '0');
//						}
//
//					}System.out.println();
//				}
		
		

		//


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		





	}

}
