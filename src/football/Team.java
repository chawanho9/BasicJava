package football;

import java.util.Scanner;

public  abstract class Team {
	String country = "";
	int[][] formation = new int[][] {{4,3,3},{4,4,2},{4,5,1},{5,2,3}};
	
	
	Team(String country){
		this.country = country;
	}
	abstract String[][] playerlist();{
	}
	
	
	
	void playlist(String[][] playerlist){
		for(int i=0;i<playerlist.length;i++) {
			if(i==0) {
				for(int j=0;j<playerlist[i].length;j++)
					System.out.println("수비: "+playerlist[i][j]);
			}
			else if(i==1) {
				for(int j=0;j<playerlist[i].length;j++)
					System.out.println("미드필더: "+playerlist[i][j]);
			}
			else if(i==2) {
				for(int j=0;j<playerlist[i].length;j++)
					System.out.println("공격수: "+playerlist[i][j]);
			}
		}
	}
	
	String[][]formation() {
		Scanner s = new Scanner(System.in);
		String[][] formation = new String[3][5]; 
		System.out.println("-----------"+this.country+" playerlist"+"---------------");
		for(int i=0; i<playerlist().length;i++) {
			System.out.println();
			for(int j=0; j<playerlist()[i].length;j++) {
				System.out.print(playerlist()[i][j]+" ");
			}
				System.out.println();
		}
		System.out.println();
		System.out.println("--------------------------------------------");

		System.out.println("포메이션을 선택해주세요 [442] [433] [451] [523] / [0:랜덤]");
		String answer = s.nextLine();
		if(Integer.parseInt(answer)==433){
			for(int i=0; i<3; i++) {
				if(i==0) {
					System.out.println("수비수 4명을 선택해주세요");
					for(int j=0; j<4; j++) {
						String name = s.nextLine();
						if(playerlist()[i][j].equals(name)) {
							formation[i][j]=name;
						}
					}
				}
				if(i==1) {
					System.out.println("미드필더 3명을 선택해주세요");
					for(int j=0; j<3; j++) {
						String name = s.nextLine();
						if(playerlist()[i][j].equals(name)) {
							formation[i][j]=name;
						}
					}
				}
				if(i==2) {
					System.out.println("공격수 3명을 선택해주세요");
					for(int j=0; j<3; j++) {
						String name = s.nextLine();
						if(playerlist()[i][j].equals(name)) {
							formation[i][j]=name;
						}
					}
				}
				
			}	
			
		}
		else if(Integer.parseInt(answer)==0){
			for( int i=0; i<3; i++){
				if(i==0){
					for( int j=0; j<4;j++){
						 formation[i][j]=playerlist()[i][j];
						
					}
				}
				if(i==1){
					for( int j=0; j<4;j++){
						formation[i][j]=playerlist()[i][j];
						

					}
				}
				if(i==2){
					for( int j=0; j<2;j++){
						formation[i][j]=playerlist()[i][j];
						

					}
				}
			}
		
		}
		return formation;
		
	}
	
}

		
		
	
	

