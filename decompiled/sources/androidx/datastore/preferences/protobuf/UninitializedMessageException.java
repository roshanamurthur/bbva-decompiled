package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UninitializedMessageException extends RuntimeException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final List<String> f21002p0;

    public UninitializedMessageException(MessageLite messageLite) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f21002p0 = null;
    }

    public InvalidProtocolBufferException asInvalidProtocolBufferException() {
        return new InvalidProtocolBufferException(getMessage());
    }

    public List<String> getMissingFields() {
        return Collections.unmodifiableList(this.f21002p0);
    }

    public UninitializedMessageException(List<String> list) {
        StringBuilder sb2 = new StringBuilder("Message missing required fields: ");
        boolean z10 = true;
        for (String str : list) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        super(sb2.toString());
        this.f21002p0 = list;
    }
}
