
public class TestGuitarHero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			GameCharacter player1 = new GameCharacterSlash();
//			GameCharacter player2 = new GameCharacterHendrix();
//			player1.playGuitar();
//			player2.playGuitar();
//			player1.playSolo();
//			player2.playSolo();
//			player1.change();
//			player1.playGuitar();

		GameCharacter player1 = new GameCharacterSlash();
		GameCharacter player2 = new GameCharacterHendrix();
		GameCharacter player3 = new GameCharacterYoung();

		player1.playGuitar();
		player1.playSolo();
		player1.change();
		player1.playGuitar();

		player2.playGuitar();
		player2.playSolo();

		player3.playGuitar();
		player3.playSolo();
	}
}

