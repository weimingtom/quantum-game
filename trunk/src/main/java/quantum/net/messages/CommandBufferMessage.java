package quantum.net.messages;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import quantum.game.commands.CommandBuffer;

public strictfp class CommandBufferMessage extends Message 
{
	int id = 0;
	CommandBuffer buffer = new CommandBuffer( 0 );
	int cmd_turns = 0;
	
	public CommandBufferMessage( ) 
	{
		super(MessageTypes.COMMAND_BUFFER);
	}
	
	public CommandBufferMessage( int id, CommandBuffer buffer ) 
	{
		super(MessageTypes.COMMAND_BUFFER);
		this.id = id;
		this.buffer = buffer;
	}
	
	public int getId( )
	{
		return id;
	}
	
	public int getNextCommandTurns( )
	{
		return cmd_turns;
	}
	
	public void setCommandTurns( int cmd_turns )
	{
		this.cmd_turns = cmd_turns;
	}
	
	public CommandBuffer getCommandBuffer( )
	{
		return buffer;
	}
	
	@Override
	public void read(DataInputStream in) throws Exception 
	{			
		buffer.clear();
		id = in.readShort();	
		cmd_turns = in.readShort();
		buffer.read( in );		
	}

	@Override
	public void write(DataOutputStream out) throws Exception 
	{
		out.writeInt(MessageTypes.COMMAND_BUFFER);
		out.writeShort(id);
		out.writeShort( cmd_turns );
		buffer.write( out );
		out.flush();
	}

}
