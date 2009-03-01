package quantum.game.commands;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public strictfp abstract class Command 
{
	protected int type = CommandTypes.MOVE_CREATURE;
	
	public Command( int type )
	{
		this.type = type;
	}
	
	public int getType( )
	{
		return type;
	}
	
	public abstract void write( DataOutputStream out ) throws Exception;
	public abstract void read( DataInputStream in ) throws Exception;
}
