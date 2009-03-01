//
// Copyright (c) 2009 Mario Zechner.
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the GNU Lesser Public License v2.1
// which accompanies this distribution, and is available at
// http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
// 
// Contributors:
//     Mario Zechner - initial API and implementation
//
package quantum.gfx;

import javax.media.opengl.GL;
import javax.media.opengl.GLContext;

public class DisplayList 
{
	int id = 0;
	private static int dl_count;
	
	public DisplayList( )
	{
		GL gl = GLContext.getCurrent( ).getGL();
		id = gl.glGenLists( 1 );	
		dl_count++;
	}
	
	public void begin( int shape )
	{
		GLContext.getCurrent().getGL().glNewList( id, GL.GL_COMPILE );
		GLContext.getCurrent().getGL().glBegin( shape );
	}
	
	public void end( )
	{
		GLContext.getCurrent().getGL().glEnd();		
		GLContext.getCurrent().getGL().glEndList();
	}
	
	public void render( )
	{
		GLContext.getCurrent().getGL().glCallList( id );
	}
	
	public void dispose( )
	{
		GLContext.getCurrent().getGL().glDeleteLists( id, 1 );
		dl_count--;
	}

	public static int getDisplayListCount() 
	{	
		return dl_count;
	}
}
