
public class TestDrive {
	public static void main(String[] args) {
		
		// what about a singleton here???
		// RemoteDeviceV1 remote = new RemoteDeviceV1();
		RemoteDevice remote = new RemoteDevice();
		
		remote.pressPlay();
		
		remote.pressPause();
		remote.pressLocked();
		
		remote.pressStop();
		remote.pressLocked();
		remote.pressStop();
		
		remote.pressPlay();
		remote.pressPlay();

	}

}
