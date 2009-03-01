package quantum.game;

public class Player 
{
	String name;
	int id;
	
	public Player( String name, int id )
	{
		this.name = name;
		this.id = id;
	}
	
	public String getName( )
	{
		return name;
	}
	
	public int getId( )
	{
		return id;
	}
	
	public void setId( int id )
	{
		this.id = id;
	}
	
	public String toString( )
	{
		return name;
	}
}