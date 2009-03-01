package quantum.game.commands;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public strictfp class PlantTreeCommand extends Command
{
	int id = 0;
	int planet;	
	
	public PlantTreeCommand( )
	{
		super( CommandTypes.PLANT_TREE );
	}
	
	public PlantTreeCommand( int id, int planet )
	{
		super( CommandTypes.PLANT_TREE );
		this.id = id;
		this.planet = planet;
	}	
	
	public int getId( )
	{
		return id;
	}
	
	public int getPlanet( )
	{
		return planet;
	}	
	
	@Override
	public void read(DataInputStream in) throws Exception 
	{
		id = in.readShort();
		planet = in.readShort();				
	}
	
	@Override
	public void write(DataOutputStream out) throws Exception 
	{	
		out.writeByte( type );
		out.writeShort( id );
		out.writeShort( planet );		
	}
}
