package football;

import java.util.Scanner;

public class Playball {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■■■□□□■■■■■■■□□□□■■■■■■□□□□■■■■■■□□□■■■■■■■■■");
		System.out.println("■■■■□■■■□■■■■■□■■■■□■■■■□■■■■□■■■■□■■■□■■■■■■■■");
		System.out.println("■■■□■■■■■□■■■■□■■■■□■■■■□■■■■□■■■□■■■■■□■■■■■■■");
		System.out.println("■■■□■■■■■□■■■■□■■■■□■■■■□■■■■□■■■□■■■■■□■■■■■■■");
		System.out.println("■■■■■■■■■□■■■■□■■■■□■■■■□■■■■□■■■■■■■■■□■■■■■■■");
		System.out.println("■■■■■■■□□■■■■■□■■■■□■■■■□■■■■□■■■■■■■□□■■■■■■■■");
		System.out.println("■■■■■□□■■■■■■■□■■■■□■■■■□■■■■□■■■■■■□□■■■■■■■■■");
		System.out.println("■■■■□□■■■■■■■■□■■■■□■■■■□■■■■□■■■■■□□■■■■■■■■■■");
		System.out.println("■■■□■■■■■■■■■■□■■■■□■■■■□■■■■□■■■■□■■■■■■■■■■■■");
		System.out.println("■■■□■■■■■■■■■■□■■■■□■■■■□■■■■□■■■□■■■■■■■■■■■■■");
		System.out.println("■■■□□□□□□□■■■■■□□□□■■■■■■□□□□■■■■□□□□□□■■■■■■■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

		
		System.out.println("안녕하세요 감독님 이름이 어떻게 되나요?");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		System.out.println(name+ "입니다. 이번 월드컵 잘 부탁드립니다 선수단 여러분 ");
		
		Team kor = new Korea();
		Team ger = new Germany();
		
			play start = new play();
			int result = start.playball(ger);
			if(result == 1 ) {
				Thread.sleep(1000);
				
				System.out.println("한국이 최초로 월드컵 결승전에 진출합니다.!!");
				System.out.println("일주일뒤 여기 대한민국 월드컵 경기장에서 다시 만나겠습니다.");
				Thread.sleep(3000);
				System.out.println("네 이곳은 대한민국 월드컵 경기장입니다 오늘 결승전 상대는 남미 최강 브라질 팀 입니다 !!  ");

				Team bra = new Brazil();
				result = start.playball(bra);
				if(result ==1){
					Thread.sleep(1000);
					System.out.println("대한민국 사상 최초 월드컵 우승 입니다!! 선수단 여러분 고생 많았습니다 우와와와아아아앙아아아아아");
					Thread.sleep(1000);

					System.out.println("이번 월드컵   mvp는 양윤성 선수 입니다 정말 축하드립니다 ");
					Thread.sleep(1000);

					System.out.println("      ■■■■■■■■■■■                                 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■                                                      ");                                      
					System.out.println("     ■           ■                                ■■■                                                   ■■■   ");
					System.out.println("     ■           ■                                ■■■                                                   ■■■         ");
					System.out.println("     ■           ■                                ■■■                                                   ■■■        ");
					System.out.println("     ■   ■    ■  ■                                ■■■                                                   ■■■         ");
					System.out.println("     ■   ■    ■  ■                                ■■■                                                   ■■■               ");
					System.out.println("     ■           ■                                ■■■                                                   ■■■    ");
					System.out.println("      ■         ■                                 ■■■                                                   ■■■    ");
					System.out.println("       ■■■■■■■■■                                  ■■■                                                   ■■■       ");
					System.out.println("     ■           ■                                ■■■                                                   ■■■      ");
					System.out.println("    ■             ■                               ■■■                                                   ■■■         ");
					System.out.println("   ■               ■                              ■■■                                                   ■■■     ");
					System.out.println("  ■                 ■                             ■■■                                                   ■■■           ");  
					System.out.println("  ■  ■           ■  ■                             ■■■                                                   ■■■                  ");
					System.out.println("  ■■■■           ■■■■            ■■■■■            ■■■                                                   ■■■        ");    
					System.out.println("     ■           ■        ■■■   ■     ■           ■■■                                                   ■■■               ");
					System.out.println("     ■    ■■■    ■              ■     ■           ■■■                                                   ■■■                  ");        
					System.out.println("     ■■■■■   ■■■■■        ■■■    ■■■■■            ■■■                                                   ■■■           ");      

				}
				if(result == 2){
					Thread.sleep(1000);
					System.out.println("대한민국 월드컵 최초 준우승입니다 선수단 여러분 고생 많았습니다 ");
					Thread.sleep(1000);
					System.out.println("이번 월드컵   mvp는 양윤성 선수 입니다 정말 축하드립니다 ");
					System.out.println("      ■■■■■■■■■■■                                 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■                                                      ");                                      
					System.out.println("     ■           ■                                ■■■                                                   ■■■   ");
					System.out.println("     ■           ■                                ■■■                                                   ■■■         ");
					System.out.println("     ■           ■                                ■■■                                                   ■■■        ");
					System.out.println("     ■   ■    ■  ■                                ■■■                                                   ■■■         ");
					System.out.println("     ■   ■    ■  ■                                ■■■                                                   ■■■               ");
					System.out.println("     ■           ■                                ■■■                                                   ■■■    ");
					System.out.println("      ■         ■                                 ■■■                                                   ■■■    ");
					System.out.println("       ■■■■■■■■■                                  ■■■                                                   ■■■       ");
					System.out.println("     ■           ■                                ■■■                                                   ■■■      ");
					System.out.println("    ■             ■                               ■■■                                                   ■■■         ");
					System.out.println("   ■               ■                              ■■■                                                   ■■■     ");
					System.out.println("  ■                 ■                             ■■■                                                   ■■■           ");  
					System.out.println("  ■  ■           ■  ■                             ■■■                                                   ■■■                  ");
					System.out.println("  ■■■■           ■■■■            ■■■■■            ■■■                                                   ■■■        ");    
					System.out.println("     ■           ■        ■■■   ■     ■           ■■■                                                   ■■■               ");
					System.out.println("     ■    ■■■    ■              ■     ■           ■■■                                                   ■■■                  ");        
					System.out.println("     ■■■■■   ■■■■■        ■■■    ■■■■■            ■■■                                                   ■■■           ");      
				}
			}
			if(result == 2){
				Thread.sleep(1000);
				 System.out.println("아쉽게도 3,4위전에서 만나야할거갔습니다 일주일뒤에 뵙겠습니다 그럼 안녕히 계세요");
					Thread.sleep(1000);

				System.out.println("네 이곳은 대한민국 월드컵 경기장입니다 오늘 3,4위전 상대는 터키팀 입니다 !!  ");

				Team tur = new Turkey();
				result = start.playball(tur);
				if(result ==1){
					Thread.sleep(1000);
					System.out.println("대한민국 최초 3등으로 월드컵을 마칩니다 . 선수단 여러분 고생 많았습니다");
					Thread.sleep(1000);

					System.out.println("이번 월드컵  한국 mvp는 양윤성 선수 입니다 정말 축하드립니다 ");
					System.out.println("      ■■■■■■■■■■■                                 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■                                                      ");                                      
					System.out.println("     ■           ■                                ■■■                                                   ■■■   ");
					System.out.println("     ■           ■                                ■■■                                                   ■■■         ");
					System.out.println("     ■           ■                                ■■■                                                   ■■■        ");
					System.out.println("     ■   ■    ■  ■                                ■■■                                                   ■■■         ");
					System.out.println("     ■   ■    ■  ■                                ■■■                                                   ■■■               ");
					System.out.println("     ■           ■                                ■■■                                                   ■■■    ");
					System.out.println("      ■         ■                                 ■■■                                                   ■■■    ");
					System.out.println("       ■■■■■■■■■                                  ■■■                                                   ■■■       ");
					System.out.println("     ■           ■                                ■■■                                                   ■■■      ");
					System.out.println("    ■             ■                               ■■■                                                   ■■■         ");
					System.out.println("   ■               ■                              ■■■                                                   ■■■     ");
					System.out.println("  ■                 ■                             ■■■                                                   ■■■           ");  
					System.out.println("  ■  ■           ■  ■                             ■■■                                                   ■■■                  ");
					System.out.println("  ■■■■           ■■■■            ■■■■■            ■■■                                                   ■■■        ");    
					System.out.println("     ■           ■        ■■■   ■     ■           ■■■                                                   ■■■               ");
					System.out.println("     ■    ■■■    ■              ■     ■           ■■■                                                   ■■■                  ");        
					System.out.println("     ■■■■■   ■■■■■        ■■■    ■■■■■            ■■■                                                   ■■■           ");      

				}
				if(result == 2){
					Thread.sleep(1000);
					System.out.println("대한민국 최초 4강 진출로 월드컵을 마칩니다 . 선수단 여러분 고생 많았습니다");
					Thread.sleep(1000);
					System.out.println("이번 월드컵   mvp는 양윤성 선수 입니다 정말 축하드립니다 ");
					System.out.println("      ■■■■■■■■■■■                                 ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■                                                      ");                                      
					System.out.println("     ■           ■                                ■■■                                                   ■■■   ");
					System.out.println("     ■           ■                                ■■■                                                   ■■■         ");
					System.out.println("     ■           ■                                ■■■                                                   ■■■        ");
					System.out.println("     ■   ■    ■  ■                                ■■■                                                   ■■■         ");
					System.out.println("     ■   ■    ■  ■                                ■■■                                                   ■■■               ");
					System.out.println("     ■           ■                                ■■■                                                   ■■■    ");
					System.out.println("      ■         ■                                 ■■■                                                   ■■■    ");
					System.out.println("       ■■■■■■■■■                                  ■■■                                                   ■■■       ");
					System.out.println("     ■           ■                                ■■■                                                   ■■■      ");
					System.out.println("    ■             ■                               ■■■                                                   ■■■         ");
					System.out.println("   ■               ■                              ■■■                                                   ■■■     ");
					System.out.println("  ■                 ■                             ■■■                                                   ■■■           ");  
					System.out.println("  ■  ■           ■  ■                             ■■■                                                   ■■■                  ");
					System.out.println("  ■■■■           ■■■■            ■■■■■            ■■■                                                   ■■■        ");    
					System.out.println("     ■           ■        ■■■   ■     ■           ■■■                                                   ■■■               ");
					System.out.println("     ■    ■■■    ■              ■     ■           ■■■                                                   ■■■                  ");        
					System.out.println("     ■■■■■   ■■■■■        ■■■    ■■■■■            ■■■                                                   ■■■           ");      
				}
				
			}
		
	}

}
