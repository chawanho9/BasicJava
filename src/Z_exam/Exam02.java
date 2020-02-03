package Z_exam;

public class Exam02 {
// pass 2-12
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		[2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
		
		종 류 크 기
		     1 byte 2 byte 4 byte 8 byte
		논리형  boolean
		문자형                     char
		정수형      byte    short  int    long
		실수형                                     float double
		*/	
		
		/*
		 * [2-2] 주민등록번호를 숫자로 저장하고자 한다 이 값을 저장하기 위해서는 어떤 자료형을 
		 * 선택해야 할까 라는 이름의 변수를 선언하고 자신의 주민등록번호로 (data type) ?
		 *  regNo 초기화 하는 한 줄의 코드를 적으시오.
		*/
		
		long regNo = 9503020000000l;
		
		/*
		 * [2-3] 다음의 문장에서 리터럴 변수 상수 키워드를 적으시오 
		 *  . int i = 100; long l =100L; final float PI = 3.14f;
                         리터럴 - :  100, 100ㅣ, 3.14f
                         변수 - : i, l
                         키워드 - :  int long, fina,l float
                         상수 - : PI

		 */
		
		/*[2-4] 다음 중 기본형 이 아닌 것은 (primitive type) ? (b)
		a. int b. Byte c. double d. boolean   int
		*/ 
		
		System.out.println("1"+"2");
		System.out.println(true + "");
		System.out.println('A' +'B');
		System.out.println('1'+ 2 ); 
		System.out.println('1'+'2'); 
		System.out.println('J' + "ava");  //String 타입을 더할경우 전체를 String으로 바꿔 
		//System.out.println(true + null); ( 오류 ) //기본형과 참조형은 연산 불가능 특히 불린은 연산 불가능 
		/* 		
		[2-6] 다음 중 키워드가 아닌 것은 모두 고르시오 ?( b, c, d, e) 
		a. if b. True c. NULL d. Class e. System
		 */// 앞글자가 대문자로 시작하는 키워드는 없음 대문자로 시작하는건 클래스를 의미
		
		/*
		[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은 모두 고르시오 ? ( a, d,g, e) 
		a. $ystem b. channel#5 c. 7eleven d. If e. 자바
		f. new g. $MAX_NUM h. hello@com
		*/ //a, d, g, e
		
		
		/*[2-8] 참조형 변수(4byte) 와 같은 크기의 기본형 은 모두 고르시오
		a. int b. long c. short d. float e. double
		*/ 
		
		/*[2-9] 다음 중 형변환을 생략할 수 있는 것은 모두 고르시오 ? ( d,e)
		byte b = 10; char ch = 'A'; int i = 100; long l = 1000L;
		a. b = (byte)i; 
		b. ch = (char)b; 
		c. short s = (short)ch;
		d. float f = (float)l;   float 이 훨씬 크기 떄문에 생략가능 
		e. i = (int)ch;
		*/  //서로가 완벽하게 바꿀수 없으면 형변환 생략 불가능 
		
		//[2-10] 타입의 변수에 저장될 수 있는 정수 값의 범위는 진수로 적으시오 char ? (?)
		
		/*[2-11] 다음중 변수를 잘못 초기화 한 것은 모두 고르시오 ? ( a,b, c, d)
		a. byte b = 256; b. char c = '';    byte: 127까지 표현가능 
		c. char answer = 'no';
		d. float f = 3.14 e. double d = 1.4e3f;
		*/ 
		
		/*[2-12] 다음 중 메서드의 선언부로 알맞은 것은 모두 고르시오 main ? (e  ) 
		a. public static void main(String[] args)
		b. public static void main(String args[]) 
		c. public static void main(String[] arv) 
		d. public void static main(String[] args) 
		e. static public void main(String[] args)
		*/ 
		
		/*[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은 모두 고르시오 ? ( ) 
		a. boolean - false  b. char - '\u0000' 
		c. float - 0.0(f)  d. int - 0  e. long - 0 (0L)f. String - ""(null)
		*/ //c, e, f
	}

}
