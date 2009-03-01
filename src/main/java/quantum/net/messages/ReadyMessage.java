package quantum.net.messages;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public strictfp class ReadyMessage extends Message 
{
	int id = 0;
	String name = "";
	
	public ReadyMessage( ) 
	{
		super(MessageTypes.READY);	
	}
	
	public ReadyMessage( int id, String name )
	{
		super( MessageTypes.READY );
		this.id = id;
		this.name = name;
	}
	
	public int getId( )
	{
		return id;
	}
	
	public String getName( )
	{
		return name;
	}

	@Override
	public void read(DataInputStream in) throws Exception 
	{			
		id = in.readShort();
		name = readString( in );
	}

	@Override
	public void write(DataOutputStream out) throws Exception 
	{	
		out.writeInt( type );
		out.writeShort( id );
		writeString(out, name );
		out.flush();
	}
	
}
