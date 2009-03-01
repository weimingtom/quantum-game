package quantum.net.messages;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public strictfp class GameOverMessage extends Message
{
	public GameOverMessage( )
	{
		super( MessageTypes.GAME_OVER );
	}
	
	@Override
	public void read(DataInputStream in) throws Exception 
	{	
		
	}

	@Override
	public void write(DataOutputStream out) throws Exception 
	{	
		out.writeInt( type );	
	}

}
