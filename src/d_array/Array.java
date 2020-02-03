package d_array;

import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Array {

	public static void main(String[] args) {
		/*
		 * << 배열 >>
		 * - int[] number = new int[5]; -초기화 갯수를 지정 (5개)
		 * - int[] number = new int[]{10, 20, 30, 40, 50};
		 * - int[] number = {10, 20, 30, 40, 50}; -new int 생략후 값 넣어준것 
		 * - 한번 길이가 정해지면 바꿀수없다.
		 */
		
		//배열은 참조형 타입입니다.
		int[] array;// 배열의 '주소'를 저장할 공간이 만들어진다.
		array = new int[10]; //배열이 생성되고 그 주소가 저장된다.
		//new : 새로운 저장공간 생성 및 주소 반환
		//int[5] : int를 저장할 수 있는 5개의 공간
		//배열 초기화시 기본값이 저장된다.
		System.out.println(array);
		System.out.println(array[0]);//실제값에 접근하기 위해서는 index를 지정해줘야 한다.
		//index에는 int만 사용할 수 있다.(리터럴, 변수, 상수, 연산 등)
		//배열의 최대 크기는 int의 최대값 (약 20억) 이다.
		String arrayStr = Arrays.toString(array); //배열의 모든 인덱스에 저장된 값을 문자열로 반환한다.
		System.out.println(arrayStr);
		
		int[] iArray1 = new int[]{1,2,3}; //값의 개수로 배열의 길이가 정해진다.
		int[] iArray2 = {1,2,3};//선언과 초기화를 동시에 해야한다.
		int[] iArray3;
//		iArray3 = {1,2,3}; //컴파일 에러발생
		
		
		array[0] = 10; //인덱스는 0부터 시작한다.
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
//		array[4] = 50;
		System.out.println(arrayStr = Arrays.toString(array));
		
		//정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화 해주세요.
		int[] array1 = new int[10];
		
//		array_  = {0,0,0,0,0,0,0,0,0,0};

		array[0] = 10;
		array[1] = 10;
		array[2] = 10;
		array[3] = 10;
		array[4] = 10;
		array[5] = 10;
		array[6] = 10;
		array[7] = 10;
		array[8] = 10;
		array[9] = 10;
		
		//모든 인덱스에 있는 값을 더해주세요.
		System.out.println(array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6]+array[7]+array[8]+array[9]);
		int sum=0;
		for(int i=0; i< array.length ; i++) {
			System.out.println(array[i]);
			sum += array[i];
			System.out.println(sum);
		}
		
		for (int i=0; i< array.length; i++){
			array[i]= i + 1;
		}
		System.out.println(Arrays.toString(array));
		
		//배열에 숫자를 저장하고 합계랑 평균을 구해봐
		int [] numbers = new int[10];
		double avg=0;
		for(int i=0; i < numbers.length; i ++){
			numbers[i] = (int)(Math.random()* 100) +1;
			sum += numbers[i];	
		}
		avg = (double)sum/numbers.length;
		System.out.println(Arrays.toString((numbers)));
		System.out.println("합계: "+sum+" 평균: "+avg);
		
		//향상된 for문
		for(int number : numbers){
//			System.out.println(number);
		}
		
		for(int number : numbers){
			number = 0; //numbers의 값은 변경되지 않는다.
//			System.out.println(number);
			
		}
		System.out.println(Arrays.toString(numbers)); // 배열의 값을 읽기 위해 사용
		
		//배열에 저장된 숫자들중 최소값과 최대값을 찾아주세요.
		
		int min =numbers[0];
		int max =numbers[0];
		for (int i=0 ; i < numbers.length ; i++){
	
			if(max < numbers[i]){
				max = numbers[i];
			}
			if(min > numbers[i]){
				min = numbers[i];
			}
		}
		System.out.println("max: "+ max +" min: "+min);
		int random =0;
		int[] shuffle = new int[30];
		int temp = 0;
		for(int i=0; i < shuffle.length; i++) {
			shuffle[i] = i+1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		for(int i=0; i < shuffle.length; i++) {
			random=(int)(Math.random()*shuffle.length);
			temp= shuffle[i];
			shuffle[i] =  shuffle[random];
//			shuffle[random]=shuffle[temp];
		}
		System.out.println(Arrays.toString(shuffle));
		
		
		// 1~10사이의 난수를 500번 생성하고 ,각숫자가 생선된 횟수를 ㅜㄹ력해라임마
		
		int[] r_array = new int[1];
		int[] a =new int[1];
//		a[0]=1    a[1]= 3  a[2]= 2  a[3]= 2    1322
//		b[0]=0	  b[1]=1   b[2]= 2  b[3]= 1    1= 1,    2 = 2.  3 = 1
		for(int i=0; i <1; i++){
//	두배열의 포문길이가 달라야함; 즉 포문 두개 
			 r_array[i] = 1;
			 a[r_array[i]-1]++;
		}
		
		System.out.println("---------------------------------------------");
		System.out.println(Arrays.toString(a));
	}
}














