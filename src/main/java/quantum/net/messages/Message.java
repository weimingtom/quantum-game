package quantum.net.messages;

import java.io.DataInputStream;
import java.io.DataOutputStream;


public strictfp abstract class Message 
{
	protected int type = MessageTypes.READY;
	
	public Message( int type )
	{
		this.type = type;
	}
	
	public int getType( )
	{
		return type;
	}
	
	
	public static String readString( DataInputStream in ) throws Exception
	{		
		int n = in.readInt();	
		byte[] chars = new byte[n];
		in.readFully( chars );		
		return new String( chars );		
	}
	
	public static void writeString( DataOutputStream out, String string ) throws Exception
	{
		byte[] chars = string.getBytes();
		out.writeInt( chars.length );
		out.write( chars );
	}
	
	public abstract void write( DataOutputStream out ) throws Exception;
	public abstract void read( DataInputStream in ) throws Exception;
	
	
}
