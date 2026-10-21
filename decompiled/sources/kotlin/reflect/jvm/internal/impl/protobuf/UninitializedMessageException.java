package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes12.dex */
public class UninitializedMessageException extends RuntimeException {
    public UninitializedMessageException(MessageLite messageLite) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public InvalidProtocolBufferException asInvalidProtocolBufferException() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
