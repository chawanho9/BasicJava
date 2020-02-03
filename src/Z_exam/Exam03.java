package Z_exam;

public class Exam03 {

	public static void main(String[] args) {
		/*
		 * [3-1] 다음 연산의 결과를 적으시오.
		 */
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(x+=2);
		System.out.println(!('A' <= c && c <='Z'));
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
		System.out.println("1번종료");
		//6 ( true, 4, false, 2, 5, 66, B, B, C)
		
		/*
		 * 아래의 코드는 사과를 담는데 필요한 바구니 버켓 의 수를 구하는 코드이다 만일
		 * 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면 개의
		 * 바구니가 필요할 것이다 에 알맞은 코드를 넣으시오 .
		 */
		int numOfApples = 123; //사과의 개수
		int sizeOfBucket= 10; //바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = ( numOfApples/sizeOfBucket+1); //모든 사과를 담는데 피룡한 바구니의수 
		System.out.println("필요한 바구니의 수 : "+ numOfBucket);
		
		/*[3-3] 아래는 변수 의 값에 따라 num 양수 음수 ‘0’을  출력하는 코드이다 
		 * 삼항 연산자를 이용해서 알맞은 코드를 넣으시오 
		 */
		int num = 10;
		String result = num < 0 ? "음수": (num > 0 ? "양수":"0");
		System.out.println(result);
		
		/*[3-4] 아래는 변수 의 값 중에서 백의 자리 이하를 버리는 코드이다 
		 * 만일 변수 num의 값이  456 이라면 이 되고 이라면‘400’되고  ‘111’ 이라면 ‘100’이 된다
		 * 에 알맞은 코드를 넣으 시오.
		 */
		num = 456;
		System.out.println(num - num%100);
		System.out.println("###################3-4##############");
		/*[3-5] 아래는 변수num의 값 중에서 일의 자리를 1로 바꾸는 코드이다 만일 변수 의 
		 * num이 값이 333이라면 331이되고  num 값이  777이라면 777이 된다 에 알맞은 코드를 넣으시오 
		 */
		num = 333;
		System.out.println(num - (num%10)+1);
		
		/*
		 *[3-6] 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺸
		 *나머지를 구하는 코드이다. 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이다. 19의 경우 20이고 
		 *, 81의 경우 90이 된다. 30에서 24를 뺸 나머지는 6이기 떄문에 변수 num의 값이 24라면 6을 결과로 얻어야한다
		 */
		 num = 24;
		 System.out.println((num - (num%10) + 10)-num);
		 System.out.println(10 - num % 10 );
		 /*[3-7] 아래는 화씨(Fahreheit)를 섭씨(Celoius)로 변환하는 코드이다. 변환 공식이 
		  * 'C= 5/9 x (F - 32)라고 할때 알맞은 코드를 넣으시오 
		  * 단 변환 결과값은 소수점 셋째자리에서 반올림해야한다. 매서스 사용금지
		  */
		  int fahrenheit = 100;
		  float celcius = (int)((((float)fahrenheit-32)*5/9*100)+0.5f)/100f;		  
		  System.out.println("Fahrenheit: " + fahrenheit);
		  System.out.println("Celcius: " + celcius);

		 /*
		  * [3-8] 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
		  */
		
		  byte a = 10; 
		  byte b = 20; 
		  int c1 = a + b; 
		  int ch = 'A'; 
		  ch = ch + 2; 
		  float f = 3 / 2; 
		  long l = 3000 * 3000 * 3000; 
		  float f2 = 0.1f; 
		  double d = 0.1; 
		  boolean res = d==f2; 
		  System.out.println("c="+c); 
		  System.out.println("ch="+ch); 
		  System.out.println("f="+f); 
		  System.out.println("l="+l); 
		  System.out.println("res="+res);

		 /*[3-9]
		  * 다음은 문자형변수 chrk 영문자(대문자 또는 소문자)이거나 숫자일 떄만 변수 b의 값이 ture가 되도록 하는코드이다
		  */
		  char ch_ = 'z';
		  boolean _b = 'a'<=ch_ && ch_ <='z' || 'A'<=ch_ && ch_ <='Z' ||  '0' <= ch_ && ch_ <= '9' ;
		  System.out.println(_b);
		  
		  /*[3-10]
		   *다음은 대문자를 소문자로 변경하는 코드인데 문자 에 저장된 문자가 대문자  ch 인 경우에만 소문자로 변경한다
		   *문자코드는 소문자가 대문자보다 만큼 더 크다 예를 . 32 . 들어 의 코드는 이고 의 코드는 이다 에 알맞은 코드를 넣으시오 
		   *'A‘ 65 ’a' 97 . (1)~(2) .
		   */
		   char ch10 ='A';
		   char lowerCase = ch10 <= 'Z' && ch10 >='A' ? (char)(ch10+32) : ch10;
		   System.out.println(ch10);
		   
		   
		
		
	}
}
