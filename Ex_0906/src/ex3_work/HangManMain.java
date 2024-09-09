package ex3_work;

public class HangManMain {
	public static void main(String[] args) {
		
		String[] word = {"apple", "test", "doctor"};
		int rnd = new Random().nextInt( word.length );
		
		PlayGame pg = new PlayGame();
		int playCount = pg.play( word[rnd] );
		
		HighScore his = new HighScore();
		his.outputScore( playCount ) ;
		
	}//main
}
