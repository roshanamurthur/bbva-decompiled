package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class InvalidProtocolBufferException extends IOException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public MessageLite f20957p0;

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        public InvalidWireTypeException(String str) {
            super(str);
        }
    }

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f20957p0 = null;
    }

    public static InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    public static InvalidProtocolBufferException b() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public static InvalidProtocolBufferException c() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    public static InvalidWireTypeException d() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    public static InvalidProtocolBufferException e() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    public static InvalidProtocolBufferException f() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static InvalidProtocolBufferException g() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    public static InvalidProtocolBufferException h() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static InvalidProtocolBufferException i() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public MessageLite getUnfinishedMessage() {
        return this.f20957p0;
    }

    public InvalidProtocolBufferException setUnfinishedMessage(MessageLite messageLite) {
        this.f20957p0 = messageLite;
        return this;
    }

    public IOException unwrapIOException() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    public InvalidProtocolBufferException(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f20957p0 = null;
    }

    public InvalidProtocolBufferException(String str, IOException iOException) {
        super(str, iOException);
        this.f20957p0 = null;
    }
}
