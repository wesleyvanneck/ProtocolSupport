package protocolsupport.protocol.packet.middleimpl.serverbound.play.v_8;

import io.netty.buffer.ByteBuf;
import protocolsupport.protocol.packet.middle.serverbound.play.MiddleBlockDig;
import protocolsupport.protocol.serializer.MiscSerializer;
import protocolsupport.protocol.serializer.PositionSerializer;

public class BlockDig extends MiddleBlockDig {

	@Override
	public void readFromClientData(ByteBuf clientdata) {
		status = MiscSerializer.readByteEnum(clientdata, Action.CONSTANT_LOOKUP);
		position = PositionSerializer.readPosition(clientdata);
		face = clientdata.readUnsignedByte();
	}

}
