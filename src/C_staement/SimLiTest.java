package C_staement;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("나는 금사빠다");
		String an = s.nextLine();
		if (an.equals("y")) { 
			System.out.println("연애할 떄 끌려다니는 타입니다");
			an = s.nextLine();
			if (an.equals("y")) { 
				System.out.println("감정 표현에 솔직한 편이다");
				an = s.nextLine();
				if (an.equals("y")) { 
					System.out.println("이성친구는 존재할 수 없다");
					an = s.nextLine();
					if (an.equals("y")) { 
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
						an = s.nextLine();
						if (an.equals("y")) { 
							System.out.println("당신은 d 타입");
						}else if (an.equals("n")) { 
							System.out.println("당신은 c 타입");
						}					
					}else if (an.equals("n")) { 
						System.out.println("당신은 b 타입");
					}	 				
				}else if (an.equals("n")) {
					System.out.println("데이트 코스는 미리 짜는게 편한다");
					an = s.nextLine();
					if (an.equals("y")) { 
						System.out.println("활동적인 데이트가 좋다");
				}else if (an.equals("n")) {
					System.out.println("감정 표현에 솔직한 편이다");
					if (an.equals("y")) {
						System.out.println("이성친구는 존재할 수 없다");
					}else if  (an.equals("n")) {
						System.out.println("활동적인 데이트가 좋다");
						if (an.equals("y")) {
							System.out.println("이성친구는 존재 할 수 없다");
						}else if  (an.equals("n")) {
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
							an = s.nextLine();
							if (an.equals("y")) {
								System.out.println("당신은 d 타입");
							}else 
								System.out.println("당신은 c 타입");
						}
					}
				}
				}
			}else if (an.equals("n")) {
				System.out.println("데이트 코스는 미리 짜는게 편한다");
				an = s.nextLine();
				if (an.equals("y")) { 
					System.out.println("활동적인 데이트가 좋다");
					an = s.nextLine();
					if (an.equals("y")) { 
						System.out.println("이성친구는 존재할 수 없다");
						an = s.nextLine();
						if (an.equals("y")) {
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
							an = s.nextLine();
							if (an.equals("y")) {
								System.out.println("당신은 d타입");
							}else 
								System.out.println("당신은 c 타입");
						
						}else 
							System.out.println("당신은 b 타입" );
					}else if (an.equals("n")) {
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
						an = s.nextLine();
						if (an.equals("y")) {
							System.out.println("당신은 d타입");
						}else 
							System.out.println("당신은 c 타입");
					}
				}else if (an.equals("n")){
					System.out.println("감정표현에 솔직한 편이다");
					an = s.nextLine();
					if (an.equals("y")) {
						System.out.println("이성친구는 존재할 수 없다");
						an = s.nextLine();
						if (an.equals("n")) {
							System.out.println("당신은 b 타입");
						}else if(an.equals("y")) { 
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
							an = s.nextLine();
							if (an.equals("y") ) {
								System.out.println("당신은 d 타입");						
							}else 
								System.out.println("당신은 c 타입");
						}
					}else if (an.equals("n")){
						System.out.println("활동적인 데이트가 좋다");
						an = s.nextLine();
						if (an.equals("y")){
							System.out.println("이성친구는 존재할 수 없다");
							an = s.nextLine();
							if(an.equals("n")) {
								System.out.println("당신은 b 타입");
							}else if ( an.equals("y")) {
								System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓인다");
								an = s.nextLine();
								if (an.equals("y")){
									System.out.println("d");
								}else 
									System.out.println("c");
							}
						}else if (an.equals("n") ){
							System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓인다");
							an = s.nextLine();
							if (an.equals("y")){
								System.out.println("d");
							}else 
								System.out.println("c");
						}
					}
				}
//					
			}
		}else if (an.equals("n")) {
			System.out.println("감정기복이 크지 않다");
			an = s.nextLine();
			if (an.equals("y")) { 
				System.out.println("연락이 없어도 믿고 기다리는 편이다");
				an = s.nextLine();
				if (an.equals("y")) { 
					System.out.println("당신은 a 타입");
					
				}else if (an.equals("n")) {
					System.out.println("이성친구는 존재할 수 없다");
					an = s.nextLine();
					if (an.equals("y")) { 
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
						an = s.nextLine();
						if (an.equals("y")) { 
							System.out.println("당신은 d 타입");
						}else 
							System.out.println("당신은 c 타입");
					}else if  (an.equals("n")) { 
						System.out.println("당신은 b타입");
					}			
			}
		
			}else if (an.equals("n")) {
				System.out.println("감정표현에 솔직한 편이다");
				an = s.nextLine();
				if (an.equals("y")) { 
					System.out.println("이성친구는 존재할 수 없다");
					an = s.nextLine();
					if (an.equals("y")) { 
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
						an = s.nextLine();
						if (an.equals("y")) { 
							System.out.println("당신은 d 타입");
						}else 
							System.out.println("당신은 c 타입");
					}else if (an.equals("n")) { 
						System.out.println("당신은 b 타입");
					}
					
				}else if (an.equals("n")) {
					System.out.println("활동적인 데이트가 좋다");
					an = s.nextLine();
					if (an.equals("y")) { 
						System.out.println("이성친구는 존재할 수 없다");
						an = s.nextLine();
						if (an.equals("y")) { 
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
							an = s.nextLine();
							if (an.equals("y")) { 
								System.out.println("당신은 d 타입");
							}else 
								System.out.println("당신은 c 타입");
								
						}else if (an.equals("n")) {
							System.out.println("당신읜 타입은 b");
							
						}else if (an.equals("n")) { 
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
							an = s.nextLine();
							if (an.equals("y")) { 
								System.out.println("당신은 d 타입");
							}else 
								System.out.println("당신은 c 타입 ");
						}
					}else if (an.equals("n")) { 
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
						an = s.nextLine();
						if (an.equals("y")) { 
							System.out.println("당신은 d 타입");
						}else 
							System.out.println("당신은 c 타입 ");
				}
			}
		}
		}
	}
}

			
