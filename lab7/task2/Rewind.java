public class Rewind implements State {
    private RemoteDevice remote;

    public Rewind(RemoteDevice remote) {
		this.remote = remote;
	}

	// the Play button is pressed
	public boolean pressPlay() {
		System.out.println("The player is still rewinding.");
		
		return false;
	}

	// the Paused button is pressed
	public boolean pressPause() {
		System.out.println("The player is still rewinding.");
		
		return false;
	}

	// the  Stop button is pressed
	public boolean pressStop() {
		System.out.println("The player is still rewinding.");
		
		return false;
	}

	public boolean pressRewind() {
		System.out.println("The player is already in rewinding.");

		return false;
	}

	public boolean pressLocked() {
        System.out.println("The remote is now locked.");
        Locked locked = (Locked) remote.getLockedState();
        locked.setPrevState(remote.getRewindState());
        remote.setState(locked);

		return true;
	}
}
