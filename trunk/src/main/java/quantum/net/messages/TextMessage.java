package quantum.net.messages;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public strictfp class TextMessage extends Message
{
	int id = 0;
	String name = "";
	String message = "";
		
	public TextMessage( ) {
		super(MessageTypes.TEXT_MESSAGE);
	}
	
	public TextMessage( int id, String name, String message )
	{
		super( MessageTypes.TEXT_MESSAGE );
		this.id = id;
		this.name = name;
		this.message = message;
	}
	
	public String getName( )
	{
		return name;
	}
	
	public String getMessage( )
	{
		return message;
	}

	@Override
	public void read(DataInputStream in) throws Exception {
		id = in.readShort();
		name = readString( in );
		message = readString( in );		
	}

	@Override
	public void write(DataOutputStream out) throws Exception {
		out.writeInt( type );
		out.writeShort( id );
		writeString( out, name );
		writeString( out, message );
		out.flush();
	}
	
}
