package quantum.tests;

import javax.swing.SwingUtilities;

public class GameTest extends BasicTest
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1872272579225115117L;

	public GameTest() throws Exception {
		super();	
	}
	
	public static void main( String[] argv ) throws Exception
	{		
		final GameTest app = new GameTest();

        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                app.setVisible(true);
            }
        }); 
	}
}
