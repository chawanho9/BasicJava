package C_staement;

import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int a = (int)(Math.random()*9)+1;
		int b = 0;
		int c = 0;
		int tmp;
		while(a!=(tmp=(int)(Math.random()*9)+1)){
			 b = tmp;
		}
		while ( a!= (tmp=(int)(Math.random()*9)+1) && b != tmp ){
				 c = tmp;
		}		
		System.out.println("a: "+a+" b: "+b+" c: "+c);	
		
		System.out.println("숫자를 3개를 나열해 입력해주세요 : ");
		int result = Integer.parseInt(s.nextLine());
		
		int result2 = Integer.parseInt(s.nextLine());
		int result3 = Integer.parseInt(s.nextLine());
		int str = 0;
		int ball = 0;
		int out = 0;
		int count =0;
		while(a!=result || b!=result2 || c!=result3) {
			if (a==result){
				str+=1;
			}else if ( a!=result && b == result) {
				ball +=1;
			}else if (a!=result && b != result && c==result ) {
				ball +=1;
			}
			if (b==result2){
				str+=1;
			}else if ( a==result2 && b != result2) {
				ball +=1;
			}else if (a!=result2 && b!= result2 && c==result2 ) {
				ball +=1;
			}
			if (c==result3){
				str+=1;
			}else if ( a==result3 && c != result3) {
				ball +=1;
			}else if (a!=result3 && c!= result3 && b==result3 ) {
				ball +=1;
			}
			++count;
			System.out.println(count+"차 시도 "+"str: "+ str + " ball: "+ ball+" out: "+(3-str-ball));
			System.out.println("숫자를 3개를 입력해주세요 : ");
			result = Integer.parseInt(s.nextLine());
			result2 = Integer.parseInt(s.nextLine());
			result3 = Integer.parseInt(s.nextLine());
			 str = 0;
			 ball =0;
		}	
			System.out.println((count+1)+"회 "+"경기종료");	
	}
}
