public class TestEditor {
	public static void main(String[] args) {
		DocumentInvoker myDocument = new DocumentInvoker("callmemaybe");
		myDocument.Write("Hey I just met you");
		myDocument.Write("And this is crazy");
		myDocument.Write("But here’s my number");
		myDocument.Undo(2);
		myDocument.Write("So call me maybe");
		myDocument.Redo();
		System.out.println(myDocument.Read());
		myDocument.printCommandBuffer();

		// myDocument.Write("So call me maybe");
		// myDocument.Erase("And this is crazy");
		// myDocument.Undo(0);
		// myDocument.Redo();
		// myDocument.Undo(1);
		// myDocument.Bold(1);
	}
	// myDocument.Erase("So call me maybe");
	// System.out.println(myDocument.Read());
	// myDocument.Write("So call me maybe?");
	// // myDocument.Undo();
	// System.out.println(myDocument.Read());
	// }
}
