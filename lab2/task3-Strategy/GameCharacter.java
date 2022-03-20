//Strategy
public abstract class GameCharacter {
	// families of behaviors

	GuitarBehavior guitarBehavior;
	SoloBehavior soloBehavior;

	private String name;

	public GameCharacter(String name) {
		this.name = name;
	}

	public void playGuitar() {
		System.out.print(this.name + " ");
		guitarBehavior.play();
	}

	public void playSolo() {
		System.out.print(this.name + " ");
		soloBehavior.solo();
	}

	public void setGuitar(GuitarBehavior g) {
		this.guitarBehavior = g;
	}

	public void setSolo(SoloBehavior s) {
		this.soloBehavior = s;
	}

	public void change() {
	}
}