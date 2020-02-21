package football;

public class play {
	
	void goal(){
		
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■■■□□□□□□□□□□■■■■■■■■■■■■□□□□□□□□□□□□■■■■■■■■□□□□□□□□□□□□■■■■■■■□□■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■□■■■■■■■■■■■■□■■■■■■■■□□■■■■■■■■■■■■□□■■■■■□■■■■■■■■■■■■□■■■■■■□□■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■□■■■■■■■■■■■■□■■■■■■■■□■■■■■■■■■■■■■■□■■■■□■■■■■■■■■■■■■■□■■■■■□□■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■□■■■■■■■■■■■■■■■■■■■■■□■■■■■■■■■■■■■■□■■■■■■■■■■■■■■■■■■■□■■■■■□□■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■□■■■■■■■■■■■■■■■■■■■■■□■■■■■■■■■■■■■■□■■■■■■■■■■■■■■■■■■■□■■■■■□□■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■□■■■■■■■■■■■■■■■■■■■■■□■■■■■■■■■■■■■■□■■■■■■■■■■■■■■■■■■■□■■■■■□□■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■□■■■■■■■■■■■■■■■■■■■■■□■■■■■■■■■■■■■■□■■■■■□□□□□□□□■■■■■■□■■■■■□□■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■□■■■■■■□□□□□□□□□□■■■■■□■■■■■■■■■■■■■■□■■■■□■■■■■■■■□□■■■■□■■■■■□□■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■□■■■■■■■■■■■■■■■□■■■■■□■■■■■■■■■■■■■■□■■■■□■■■■■■■■■□□■■■□■■■■■□□■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■□■■■■■■■■■■■■■■■□■■■■■□■■■■■■■■■■■■■■□■■■■□■■■■■■■■■■□□■■□■■■■■□□■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■□■■■■■■■■■■■■□■■□■■■■■□■■■■■■■■■■■■■■□■■■■□■■■■■■■■■■■□■■□■■■■■□□■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■□■■■■■■■■■■■■□■■□■■■■■□■■■■■■■■■■■■■■□■■■■□■■■■■■■■■■■□□■□■■■■■□□■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■■□■■■■■■■■■■□■■■□■■■■■■□□■■■■■■■■■■□□■■■■■□■■■■■■■■■■■□□□■■■■■■□□■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■■■□□□□□□□□□□■■■■□■■■■■■■■□□□□□□□□□□■■■■■■■■■□□□□□□□□□□□□■■□□□□■□□□□□□□□□□□□□□■■■■■■■■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■□■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}
	
	int playball(Team away) throws InterruptedException{
		Team kor = new Korea();		
		int count = 0;
		String[][] lineup ;
		lineup = kor.formation();
		String[][] home_sub = new String[3][2];
		String[][] away_sub = new String[3][2];
		
		
		
		System.out.println("경기 시작합니다.");
			 
		

		int[] a = {0,1,2,3,4,5,6,7,8,9,10};
		int home_score = 0;
		int away_score  =0 ;
			for(int i=0; i<=90; i++){
				if(i%5==0 || i%6==0){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
//					
					int  b =  (int)(Math.random()*11);

//				
					if(b==1){
						System.out.print(i+"분  ");home_setpiece(lineup,kor);
						int  bc=  (int)(Math.random()*6);
						if(bc>4){
							goal();
							System.out.println(lineup[(int)(Math.random()*2)+1][(int)(Math.random()*2)]+"골!! 운좋게 득점합니다.");
							home_score++;
							socore(home_score,away_score,away);
							
						}
						
					}
					if(b==2){
						System.out.print(i+"분  ");away_setpiece(away.playerlist(),away);
						int  bc=  (int)(Math.random()*5);
						if(bc>3){
							goal();

							System.out.println(away.playerlist()[(int)(Math.random()*2)+1][(int)(Math.random()*2)]+"골!! 운좋게 득점합니다.");
							away_score++;
							socore(home_score,away_score,away);

						}
					}
					if(b==3){
						System.out.print(i+"분  ");honme_situation(lineup,kor);
						int  bc=  (int)(Math.random()*6);
						if(bc>4){
							goal();

							System.out.println(lineup[(int)(Math.random()*2)+1][(int)(Math.random()*2)]+"선수의 골!! 깔끔하게 득점합니다.");
							home_score++;
							socore(home_score,away_score,away);
						}
					}
					if(b==4){
						System.out.print(i+"분  ");away_setpiece(away.playerlist(),away);
						int  bc=  (int)(Math.random()*5);
						if(bc>3){
							goal();

							System.out.println(away.playerlist()[(int)(Math.random()*2)+1][(int)(Math.random()*2)]+"선수의  골!! 운좋게 득점합니다.");
							away_score++;
							socore(home_score,away_score,away);
						}
						
					}
					if(b==6){
						System.out.print(i+"분  ");home_action(away.playerlist());
						
						
					}
					if(b==7){
						System.out.print(i+"분  ");away_action(away.playerlist());
						
						}
						
					}
				if(i==90){
					System.out.println("경기 종료합니다 경기 결과는  ");
					socore(home_score,away_score,away);
					if(home_score > away_score){
//						if(count ==1){
//							if(home_score > away_score){
//								System.out.println("대한민국 사상 최초 월드컵 우승 입니다!! 선수단 여러분 고생 많았습니다");
//								System.out.println("이번 월드컵 mvp는 "+lineup[(int)(Math.random()*2)+1][(int)(Math.random()*2)]+"입니다 정말 축하드립니다 ");
//							}
//						}
//						System.out.println("한국이 최초로 월드컵 결승전에 진출합니다.!!");
//						System.out.println("일주일뒤 여기 대한민국 월드컵 경기장에서 다시 만나겠습니다.");
						count++;
//						Thread.sleep(3000);
//						away = new Brazil();
//						System.out.println("네 이곳은 대한민국 월드컵 경기장입니다 오늘 결승전 상대는 "+ away.country +"팀 입니다 !!  ");
//						Thread.sleep(3000);
						

					}
					else if(home_score<away_score) {
//						if(count ==2){
//							if(home_score > away_score){
//								System.out.println("대한민국 최초 4강 진출로 월드컵을 마칩니다 . 선수단 여러분 고생 많았습니다");
//								System.out.println("이번 월드컵  한국 mvp는 "+lineup[(int)(Math.random()*2)+1][(int)(Math.random()*2)]+"입니다 정말 축하드립니다 ");
//							}
//						}
//					 System.out.println("아쉽게도 3,4위전에서 만나야할거갔습니다 일주일뒤에 뵙겠습니다 그럼 안녕히 계세요");
//					Thread.sleep(2000);
					count = 2;
//					away = new Turkey();
//					System.out.println("네 이곳은 대한민국 월드컵 경기장입니다 오늘 3,4위전 상대는 "+ away.country +"팀 입니다 !!  ");
//					Thread.sleep(3000);
					
					}else if (home_score == away_score){
						 System.out.println("연장전  준비를 해야겠네요 ");
						Thread.sleep(2000);
						System.out.println("선수들이 준비를 다 마친것 같습니다 연장전 시작하겠습니다!");
						for(int j=90; j<=120; j++){
							if(j%5==0 || j%3==0){
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								int  b =  (int)(Math.random()*11);

//							
								if(b==1){
									System.out.print(j+"분  ");home_setpiece(lineup,kor);
									int  bc=  (int)(Math.random()*6);
									if(bc>3){
										goal();
										System.out.println(lineup[(int)(Math.random()*2)+1][(int)(Math.random()*2)]+"골!! 운좋게 득점합니다.");
										home_score++;
										socore(home_score,away_score,away);
										
									}
									
								}
								if(b==2){
									System.out.print(j+"분  ");away_setpiece(away.playerlist(),away);
									int  bc=  (int)(Math.random()*5);
									if(bc>3){
										goal();

										System.out.println(away.playerlist()[(int)(Math.random()*2)+1][(int)(Math.random()*2)]+"골!! 운좋게 득점합니다.");
										away_score++;
										socore(home_score,away_score,away);

									}
								}
								if(b==3){
									System.out.print(j+"분  ");honme_situation(lineup,kor);
									int  bc=  (int)(Math.random()*6);
									if(bc>3){
										goal();

										System.out.println(lineup[(int)(Math.random()*2)+1][(int)(Math.random()*2)]+"선수의 골!! 깔끔하게 득점합니다.");
										home_score++;
										socore(home_score,away_score,away);
									}
								}
								if(b==4){
									System.out.print(j+"분  ");away_setpiece(away.playerlist(),away);
									int  bc=  (int)(Math.random()*5);
									if(bc>3){
										goal();

										System.out.println(away.playerlist()[(int)(Math.random()*2)+1][(int)(Math.random()*2)]+"선수의  골!! 운좋게 득점합니다.");
										away_score++;
										socore(home_score,away_score,away);
									}
									
								}
								if(b==6){
									System.out.print(j+"분  ");home_action(away.playerlist());
									
									
								}
								if(b==7){
									System.out.print(j+"분  ");away_action(away.playerlist());
									
									}
									
								}
							if(j==120){
								System.out.println("경기 종료합니다 경기 결과는  ");
								socore(home_score,away_score,away);
								if(home_score > away_score){
//									System.out.println("한국이 최초로 월드컵 결승전에 진출합니다.!!");
//									System.out.println("일주일뒤 여기 대한민국 월드컵 경기장에서 다시 만나겠습니다.");
//									Thread.sleep(3000);
									count++;
//									away = new Brazil();
//									System.out.println("네 이곳은 대한민국 월드컵 경기장입니다 오늘 결승전 상대는 "+ away.country +"팀 입니다 !!  ");
//									Thread.sleep(3000);
//
								}
								else if(home_score<away_score){
//								 System.out.println("아쉽게도 3,4위전에서 만나야할거갔습니다 일주일뒤에 뵙겠습니다 그럼 안녕히 계세요");
//								Thread.sleep(2000);
								count = 2;
//								away = new Turkey();
//								System.out.println("네 이곳은 대한민국 월드컵 경기장입니다 오늘 3,4위전 상대는 "+ away.country +"팀 입니다 !!  ");
//								Thread.sleep(3000);
//
								}else if (home_score == away_score){
									 System.out.println("승부 차기 를 시작하겠습니다 . ");
									Thread.sleep(2000);
									System.out.println(" 5:4 로  패배했습니다. ");
									count = 2;
						}
							}		}			
					}
				}
				}
			return count;
				
			}
	static void subplayer(String[][] lineup,String[][] playerlist){
	}
	
	
	static void home_action(String[][] lineup){
			String[] action = {lineup[(int)(Math.random()*2)][(int)(Math.random()*4)]+" 선수가 "+lineup[2][(int)(Math.random()*2)]+"선수에게  길게 패스합니다 좋은 기회를 잡을것 같습니다.",lineup[0][(int)(Math.random()*4)]+" 선수 강하게 수비합니다. 점점 경기가 과열 되고 있습니다.",lineup[2][(int)(Math.random()*2)]+" 선수 본인에게 공들 달라고 손짓하고있네요!",lineup[(int)(Math.random()*2)][(int)(Math.random()*4)]+" 선수와 "+lineup[2][(int)(Math.random()*2)]+"선수의 좋은 연계 플레이를 보여줍니다  ",lineup[1][(int)(Math.random()*2)]+"선수의 좋은 탈압박입니다."};
			System.out.println(action[(int)(Math.random()*5)]);
	}
		
	static void away_action(String[][] lineup){
		String[] action = {lineup[(int)(Math.random()*2)][(int)(Math.random()*4)]+" 선수가 "+lineup[2][(int)(Math.random()*2)]+"선수에게  길게 패스합니다 좋은 기회를 잡을것 같습니다.",lineup[0][(int)(Math.random()*4)]+" 선수 강하게 수비합니다. 점점 경기가 과열 되고 있습니다.",lineup[2][(int)(Math.random()*2)]+" 선수 본인에게 공들 달라고 손짓하고있네요!",lineup[(int)(Math.random()*2)][(int)(Math.random()*4)]+" 선수와 "+lineup[2][(int)(Math.random()*2)]+"선수의 좋은 연계 플레이를 보여줍니다  ",lineup[1][(int)(Math.random()*2)]+"선수의 좋은 탈압박입니다."};		
		System.out.println(action[(int)(Math.random()*5)]);
		}
	
	
	static void honme_situation(String[][] lineup,Team a){
		String[] situation ={a.country+" 팀 역습을 가져갑니다.",lineup[(int)(Math.random()*2)+1][(int)(Math.random()*2)]+" 기회를 잡습니다.",lineup[(int)(Math.random()*2)+1][(int)(Math.random()*2)]+"선수! 상대 골기퍼와 1;1 찬스",lineup[(int)(Math.random()*2)+1][(int)(Math.random()*2)]+" 기회를 잡습니다."};
		System.out.println(situation[(int)(Math.random()*3)]);

	}
	static void away_situation(String[][] lineup,Team a){
		String[] situation ={a.country+" 팀 역습을 가져갑니다.",lineup[(int)(Math.random()*2)+1][(int)(Math.random()*2)]+" 기회를 잡습니다.",lineup[(int)(Math.random()*2)+1][(int)(Math.random()*2)]+"선수! 상대 골기퍼와 1;1 찬스",lineup[(int)(Math.random()*2)+1][(int)(Math.random()*2)]+" 기회를 잡습니다."};
		System.out.println(situation[(int)(Math.random()*3)]);

	}
	static 	void home_setpiece(String[][] lineup,Team a){
		String[] prikick ={a.country+"팀의 코너킥을 선언하는 주심",lineup[(int)(Math.random()*2)+1][(int)(Math.random()*2)]+"선수가  가까운 거리에서 프리킥 기회를 가집니다.",a.country+"팀의 스로잉",lineup[(int)(Math.random()*2)+1][(int)(Math.random()*2)]+" 프리킥을 준비합니다."};
		System.out.println(prikick[(int)(Math.random()*3)]);
	}
	static 	void away_setpiece(String[][] lineup,Team a){
		String[] prikick ={a.country+"팀의 코너킥을 선언하는 주심",lineup[(int)(Math.random()*2)+1][(int)(Math.random()*2)]+"선수가  가까운 거리에서 프리킥 기회를 가집니다.",a.country+"팀의 스로잉",lineup[(int)(Math.random()*2)+1][(int)(Math.random()*2)]+" 프리킥을 준비합니다."};
		System.out.println(prikick[(int)(Math.random()*3)]);
	}
	static 	void socore(int home_score, int away_score,Team away){
		System.out.println("대한민국 :" + home_score +" "+ away.country+":" + away_score);
	}
}


