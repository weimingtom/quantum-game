package quantum.game;

import quantum.net.messages.CommandBufferMessage;

public interface CommandTurnListener 
{
	public void commandTurn( CommandBufferMessage msg ) throws Exception;	
}
