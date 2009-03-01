package quantum.tests;

import java.io.IOException;

public class RestartTest {
	public static void main( String[] argv ) throws IOException
	{
		new ProcessBuilder("notepad", "").start();
		System.exit(0);
	}
}
