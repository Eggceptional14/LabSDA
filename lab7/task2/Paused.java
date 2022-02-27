/**
 * Paused.java
 * 
 * This file represents the Paused state.
 */

public class Paused implements State {
	private RemoteDevice remote;
	
	public Paused(RemoteDevice remote) {
		this.remote = remote;
	}

	// the Play button is pressed
	public boolean pressPlay() {
		System.out.println("The player is now playing.");
		remote.setState(remote.getPlayingState());
		remote.setPosition(remote.getPosition()+1);
		
		return true;
	}

	// the Pause button is pressed
	public boolean pressPause() {
		System.out.println("The player is already paused.");
		
		return false;
	}


	// the Stop button is pressed
	public boolean pressStop() {
		System.out.println("The player is now stopped.");
		remote.setState(remote.getStoppedState());
		remote.setPosition(0);
		
		return true;
	}

	public boolean pressRewind() {
		System.out.println("Cannot rewind! The player is on paused!");

		return false;
	}

	public boolean pressLocked() {
		System.out.println("The remote is now locked.");
        Locked locked = (Locked) remote.getLockedState();
        locked.setPrevState(remote.getPausedState());
        remote.setState(locked);

		return true;
	}
}
