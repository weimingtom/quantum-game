package quantum.utils;

import java.io.ByteArrayOutputStream;

public class ByteArrayStream extends ByteArrayOutputStream
{
	public byte[] getArray( )
	{
		return buf;
	}
}
