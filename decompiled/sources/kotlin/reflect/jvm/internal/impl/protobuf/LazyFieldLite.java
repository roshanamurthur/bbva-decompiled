package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class LazyFieldLite {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f81416a;
    protected volatile MessageLite value;

    public void ensureInitialized(MessageLite messageLite) {
        if (this.value != null) {
            return;
        }
        synchronized (this) {
            if (this.value != null) {
                return;
            }
            try {
                this.value = messageLite;
            } catch (IOException unused) {
            }
        }
    }

    public int getSerializedSize() {
        if (this.f81416a) {
            return this.value.getSerializedSize();
        }
        throw null;
    }

    public MessageLite getValue(MessageLite messageLite) {
        ensureInitialized(messageLite);
        return this.value;
    }

    public MessageLite setValue(MessageLite messageLite) {
        MessageLite messageLite2 = this.value;
        this.value = messageLite;
        this.f81416a = true;
        return messageLite2;
    }
}
