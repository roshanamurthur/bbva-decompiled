package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractParser<MessageType extends MessageLite> implements Parser<MessageType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExtensionRegistryLite f46953a = ExtensionRegistryLite.getEmptyRegistry();

    public static void a(MessageLite messageLite) throws InvalidProtocolBufferException {
        if (messageLite == null || messageLite.isInitialized()) {
        } else {
            throw (messageLite instanceof AbstractMessageLite ? new UninitializedMessageException((AbstractMessageLite) messageLite) : new UninitializedMessageException(messageLite)).asInvalidProtocolBufferException().setUnfinishedMessage(messageLite);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        MessageType messagetype = (MessageType) parsePartialDelimitedFrom(inputStream, extensionRegistryLite);
        a(messagetype);
        return messagetype;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            return (MessageType) parsePartialFrom((InputStream) new AbstractMessageLite.Builder.a(inputStream, CodedInputStream.readRawVarint32(i10, inputStream)), extensionRegistryLite);
        } catch (IOException e5) {
            throw new InvalidProtocolBufferException(e5);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) parseDelimitedFrom(inputStream, f46953a);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) parsePartialDelimitedFrom(inputStream, f46953a);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return parsePartialFrom(codedInputStream, f46953a);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
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

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        MessageType partialFrom = parsePartialFrom(codedInputStream, extensionRegistryLite);
        a(partialFrom);
        return partialFrom;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(codedInputStream, f46953a);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        MessageType messagetype = (MessageType) parsePartialFrom(byteString, extensionRegistryLite);
        a(messagetype);
        return messagetype;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(byteString, f46953a);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(byteString, f46953a);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr, int i10, int i11, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(bArr, i10, i11);
        MessageType partialFrom = parsePartialFrom(codedInputStreamNewInstance, extensionRegistryLite);
        try {
            codedInputStreamNewInstance.checkLastTagWas(0);
            return partialFrom;
        } catch (InvalidProtocolBufferException e5) {
            throw e5.setUnfinishedMessage(partialFrom);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(byteBuffer);
        MessageType partialFrom = parsePartialFrom(codedInputStreamNewInstance, extensionRegistryLite);
        try {
            codedInputStreamNewInstance.checkLastTagWas(0);
            a(partialFrom);
            return partialFrom;
        } catch (InvalidProtocolBufferException e5) {
            throw e5.setUnfinishedMessage(partialFrom);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(bArr, i10, i11, f46953a);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(bArr, 0, bArr.length, extensionRegistryLite);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(byteBuffer, f46953a);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(bArr, 0, bArr.length, f46953a);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(byte[] bArr, int i10, int i11, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        MessageType messagetype = (MessageType) parsePartialFrom(bArr, i10, i11, extensionRegistryLite);
        a(messagetype);
        return messagetype;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
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

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(bArr, i10, i11, f46953a);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(bArr, 0, bArr.length, extensionRegistryLite);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(bArr, f46953a);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        MessageType messagetype = (MessageType) parsePartialFrom(inputStream, extensionRegistryLite);
        a(messagetype);
        return messagetype;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) parsePartialFrom(inputStream, f46953a);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return (MessageType) parseFrom(inputStream, f46953a);
    }
}
