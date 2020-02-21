package football;

public  class Brazil extends Team {
	Brazil(){
		super("Brazil");
	}
	
	
	String[][] playerlist(){
		String[][]  lineup= {{"카푸","루시우","에드밀슨","카를로스"},{"리카디뇨","실바","파울레스타","네이마르"},{"호나우두","카카"}};
		return lineup;
	}
}