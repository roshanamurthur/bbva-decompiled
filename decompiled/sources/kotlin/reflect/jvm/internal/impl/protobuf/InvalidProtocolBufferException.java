package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class InvalidProtocolBufferException extends IOException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public MessageLite f81413p0;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f81413p0 = null;
    }

    public static InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public MessageLite getUnfinishedMessage() {
        return this.f81413p0;
    }

    public InvalidProtocolBufferException setUnfinishedMessage(MessageLite messageLite) {
        this.f81413p0 = messageLite;
        return this;
    }
}
