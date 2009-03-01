package quantum.tests;

import quantum.math.Vector2D;

public class VectorTest 
{
	public static void main( String[] argv )
	{
		Vector2D a = new Vector2D( );
		Vector2D b = new Vector2D( 10, 10 );
		
		for( int i = 0; i < 100000; i++ )
		{
			a.dst(b);
			a.nor();
		}
		
		long start = System.nanoTime();
		for( int i = 0; i < 400000; i++ )
			a.dst(b);
		System.out.println( "400000 dsts: " + (System.nanoTime() - start) / 1000000.0 + "ms");
		
		
		start = System.nanoTime();
		for( int i = 0; i < 400000; i++ )
			a.nor();
		System.out.println( "400000 dsts: " + (System.nanoTime() - start) / 1000000.0 + "ms");
	}
}
