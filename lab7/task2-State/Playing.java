/**
 * Playing.java
 *
 * This file represents the Playing state
 */

public class Playing implements State {
	private RemoteDevice remote;
	
	public Playing(RemoteDevice remote) {
		this.remote = remote;
	}

	// the Play button is pressed
	public boolean pressPlay() {
		System.out.println("The player is already playing.");
		
		return false;
	}

	// the Pause button is pressed
	public boolean pressPause() {
		System.out.println("The player is paused.");
		remote.setState(remote.getPausedState());
		
		return true;
	}

	// the Stop button is pressed
	public boolean pressStop() {
		System.out.println("The player is stopped.");
		remote.setState(remote.getPlayingState());
		remote.setPosition(0);

		return true;
	}

	public boolean pressRewind() {
		System.out.println("Cannot rewind! The player is still playing!");

		return false;
	}

	public boolean pressLocked() {
		System.out.println("The remote is now locked.");
        Locked locked = (Locked) remote.getLockedState();
        locked.setPrevState(remote.getPlayingState());
        remote.setState(locked);

		return true;
	}

}
