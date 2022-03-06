public class Locked implements State {
    private RemoteDevice remote;
    private State prevState;

    public Locked(RemoteDevice remote) {
		this.remote = remote;
	}
    public Locked(RemoteDevice remote, State state) {
        this.remote = remote;
        this.prevState = state;
    }

    public void setPrevState(State prevState) {
        this.prevState = prevState;
    }

	// the Play button is pressed
	public boolean pressPlay() {
		System.out.println("Cannot play! The remote is locked.");
		
		return false;
	}

	// the Paused button is pressed
	public boolean pressPause() {
		System.out.println("Cannot pause! The remote is locked.");
		
		return false;
	}

	// the  Stop button is pressed
	public boolean pressStop() {
		System.out.println("Cannot stop! The remote is locked.");
		
		return false;
	}

	public boolean pressRewind() {
		System.out.println("Cannot rewind! The remote is locked.");

		return false;
	}

	public boolean pressLocked() {
        System.out.println("Unlocked the remote.");
        remote.setState(prevState);

		return true;
	}

}
