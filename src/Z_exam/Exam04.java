package Z_exam;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		/*[4-1] 다음의 문장들을 조건식으로 표현하라
		 * int형 변수 x가 10보다 크고 20보다 적을떄 true의 조건식
		 */
		//[1]
		int x;
		x= 15;
		if (x>10&&x<20) {
			System.out.println("true");
		}
		//[2]
		char ch ='A';
		if (ch != '\t' && ch !=' ') { 
			System.out.println("true");
		}
		//[3]
		if(ch =='x' || ch == 'X'){
			System.out.println("true");
		}
		//[4]
		if(ch>=0 && ch<=9){
			System.out.println("true");
		}
		//[5]
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
			System.out.println("true");
		}
		//[6]
		int year =400;
		if(year%400 == 0 || year%4 == 0 && year%100 != 0) {
			System.out.println("true");
		}
		//[7]
		boolean powerOn;
		if (powerOn = false){  //불린은 == 게 아니고 =?
			System.out.println("true");
		}
		//[8]
		String str = "yes"; 
		if(str.equals("yes")){
			System.out.println("true");
		}
		
		//[4-2] 부터 까지의 정수 중에서 또는 의 배수가 아닌 수의 총합을 구하시오 1 20 2 3 
		int sum =0;
		for(int i=1;i<=20; i++){
			if (i%2 !=0 ||i%3 !=0){
				sum += i;
			}
		}
		System.out.println(sum);
		//[4-3] 
//		sum = 0;
//		for (int i=1; i<=10; i++) {
//			sum += sum + i;
//			System.out.println(sum);
//		}
		//[4-4]
		sum =0;
	System.out.println("4번");
		for (int i=0;i<=101; i++) {
			if(i%2==0) {
				sum += -i;
				System.out.println(-i);
			}else {
				sum += i;
				System.out.println(i);
			}
		}
		//[4-5]
		int i= 0;
		while(true) {
			if(i <=10) {
				for (int j=0;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
				i += 1;
			}else break;
		}
		//sem
		i = 0;
		
		while (i <= 10) {
			int j =0;
			while ( j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		//[4-6]
		int a = 1;
		int b = 1;
		for (int j=1;j<=6;j++) {
			for ( int k=1;k<=6;k ++) {
				if(j+k == 6) {
					System.out.println(j+"+"+k+"="+(j+k));
				}
			}  
		}
		//[4-7]
		int value = (int)(Math.random()* 6) + 1;
		System.out.println("values:"+value);
		
		//[4-8]
		for(int j=0;j<=10;j++){
			for(int k=0;k <= 10; k++){
				System.out.println("x= "+j+" y= "+k+" = "+(2*j+4*k));
			}
		}
		
		//[4-10]
		System.out.println("-------------------------------------------------------------------------");
		int num = 12345;
		sum = 0;
		while(num > 0 ){
			sum+= num%10;
			num/= 10;
			System.out.println(num);
		}

		System.out.println("sum="+sum);
		
		
		//[4-14]
//		int answer ; 
//		int input = 0;
//		int count =0;
//		
//		Scanner s = new Scanner(System.in);
//		
//		do{
//			count++;
//			System.out.println("1과 100사이의 값을 입력하세요:");
//			input = s.nextLine();
//			
//			while(i==input){
//				if(i<input) { 
//					System.out.println("i 가 더큼");
//				}
		int number = 12321;
		int tmp = number;
		int result =0;
		while(tmp !=0) {
//			result += tmp%10;
//			result *= 10;
			result = result * 10 + tmp % 10;
			tmp /= 10;
			}
		if(number == result){
			System.out.println(number + "회문수입니다");
			
		}else 
			System.out.println(number+ " 회문수가 아ㅁ니야");
	
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
