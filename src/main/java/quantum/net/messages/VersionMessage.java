package quantum.net.messages;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import quantum.game.Constants;

public class VersionMessage extends Message
{
	int version = Constants.VERSION;
	
	public VersionMessage() {
		super(MessageTypes.VERSION);	
	}

	public void read(DataInputStream in) throws Exception 
	{	
		version = in.readInt( ); 
	}
	
	public void write(DataOutputStream out) throws Exception 
	{	
		out.writeInt( type );
		out.writeInt( version );
	}

	public int getVersion() 
	{	
		return version;
	}

}
