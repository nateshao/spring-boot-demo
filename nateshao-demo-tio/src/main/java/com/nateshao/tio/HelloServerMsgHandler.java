package com.nateshao.tio;

import org.tio.core.ChannelContext;
import org.tio.core.intf.Packet;
import org.tio.server.intf.ServerAioHandler;
import org.tio.core.exception.AioDecodeException;
import org.tio.core.GroupContext;
import org.tio.annotation.TioMsgHandler;
import java.nio.ByteBuffer;

@TioMsgHandler
public class HelloServerMsgHandler implements ServerAioHandler {
    @Override
    public Packet decode(ByteBuffer buffer, int limit, int position, int readableLength, ChannelContext channelContext) throws AioDecodeException {
        return PacketUtil.decode(buffer, limit, position, readableLength, channelContext);
    }

    @Override
    public ByteBuffer encode(Packet packet, GroupContext groupContext, ChannelContext channelContext) {
        return PacketUtil.encode(packet, groupContext, channelContext);
    }

    @Override
    public void handler(Packet packet, ChannelContext channelContext) throws Exception {
        HelloPacket helloPacket = (HelloPacket) packet;
        byte[] body = helloPacket.getBody();
        if (body != null) {
            String str = new String(body, HelloPacket.CHARSET);
            HelloPacket resppacket = new HelloPacket();
            resppacket.setBody(("Echo: " + str).getBytes(HelloPacket.CHARSET));
            org.tio.core.Tio.send(channelContext, resppacket);
        }
    }
} 