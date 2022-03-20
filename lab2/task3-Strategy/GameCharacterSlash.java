public class GameCharacterSlash extends GameCharacter {

	public GameCharacterSlash() {
		super("Slash");
		 guitarBehavior=new Guitar_GibsonLesPaul();
		 soloBehavior=new Solo_SmashTheGuitar();
	}
	
	public void change() {
		this.setGuitar(new Guitar_GibsonSG());
	}
}