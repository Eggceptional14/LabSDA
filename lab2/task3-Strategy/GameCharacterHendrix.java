
public class GameCharacterHendrix extends GameCharacter {
	
	public GameCharacterHendrix() {
		super("Jimmy Hendrix");
		 guitarBehavior=new Guitar_Telecaster();
		 soloBehavior=new Solo_PutGuitarOnFire();
	}
}
