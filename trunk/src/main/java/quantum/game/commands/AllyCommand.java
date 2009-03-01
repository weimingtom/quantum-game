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
package quantum.game.commands;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public strictfp class AllyCommand extends Command {
	public static int FOE = 0;
	public static int ALLY = 1;

	private int src_client_id;
	private int dest_client_id;
	private int ally_degree;

	public AllyCommand() {
		super(CommandTypes.ALLY);
	}

	public AllyCommand(int src_client_id, int dest_client_id, int ally_degree) {
		super(CommandTypes.ALLY);
		this.src_client_id = src_client_id;
		this.dest_client_id = dest_client_id;
		this.ally_degree = ally_degree;
	}

	public int getSourceClient() {
		return src_client_id;
	}

	public int getDestinationClient() {
		return dest_client_id;
	}

	public int getAllyDegree() {
		return ally_degree;
	}

	@Override
	public void read(DataInputStream in) throws Exception {
		src_client_id = in.readShort();
		dest_client_id = in.readShort();
		ally_degree = in.readByte();

	}

	@Override
	public void write(DataOutputStream out) throws Exception {
		out.writeByte(type);
		out.writeShort(src_client_id);
		out.writeShort(dest_client_id);
		out.writeByte(ally_degree);
	}
}
