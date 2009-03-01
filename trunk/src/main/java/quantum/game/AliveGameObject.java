package quantum.game;

import quantum.math.Vector2D;

public strictfp interface AliveGameObject 
{	
	public Vector2D getPosition( );
	public int getPlanet( );
	public float getHealth( );
	public void adjustHealth( float health );
	public boolean isDead( );	
	public int getId( );
}
