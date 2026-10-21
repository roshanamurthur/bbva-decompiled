package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractParser<MessageType extends MessageLite> implements Parser<MessageType> {
    static {
        ExtensionRegistryLite.getEmptyRegistry();
    }

    public static void a(MessageLite messageLite) throws InvalidProtocolBufferException {
        if (messageLite == null || messageLite.isInitialized()) {
        } else {
            throw (messageLite instanceof AbstractMessageLite ? new UninitializedMessageException((AbstractMessageLite) messageLite) : new UninitializedMessageException(messageLite)).asInvalidProtocolBufferException().setUnfinishedMessage(messageLite);
        }
    }

    public MessageType parsePartialDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            return (MessageType) parsePartialFrom(new AbstractMessageLite.Builder.a(inputStream, CodedInputStream.readRawVarint32(i10, inputStream)), extensionRegistryLite);
        } catch (IOException e5) {
            throw new InvalidProtocolBufferException(e5.getMessage());
        }
    }

    public MessageType parsePartialFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStreamNewCodedInput = byteString.newCodedInput();
        MessageType partialFrom = parsePartialFrom(codedInputStreamNewCodedInput, extensionRegistryLite);
        try {
            codedInputStreamNewCodedInput.checkLastTagWas(0);
            return partialFrom;
        } catch (InvalidProtocolBufferException e5) {
            throw e5.setUnfinishedMessage(partialFrom);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    public MessageType parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        MessageType messagetype = (MessageType) parsePartialDelimitedFrom(inputStream, extensionRegistryLite);
        a(messagetype);
        return messagetype;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    public MessageType parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        MessageType messagetype = (MessageType) parsePartialFrom(byteString, extensionRegistryLite);
        a(messagetype);
        return messagetype;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    public MessageType parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        MessageType messagetype = (MessageType) parsePartialFrom(inputStream, extensionRegistryLite);
        a(messagetype);
        return messagetype;
    }

    public MessageType parsePartialFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(inputStream);
        MessageType partialFrom = parsePartialFrom(codedInputStreamNewInstance, extensionRegistryLite);
        try {
            codedInputStreamNewInstance.checkLastTagWas(0);
            return partialFrom;
        } catch (InvalidProtocolBufferException e5) {
            throw e5.setUnfinishedMessage(partialFrom);
        }
    }
}
