package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class LazyFieldLite {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteString f20961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExtensionRegistryLite f20962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile ByteString f20963c;
    protected volatile MessageLite value;

    static {
        ExtensionRegistryLite.getEmptyRegistry();
    }

    public LazyFieldLite() {
    }

    public LazyFieldLite(ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
        if (extensionRegistryLite == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (byteString == null) {
            throw new NullPointerException("found null ByteString");
        }
        this.f20962b = extensionRegistryLite;
        this.f20961a = byteString;
    }

    public static LazyFieldLite fromValue(MessageLite messageLite) {
        LazyFieldLite lazyFieldLite = new LazyFieldLite();
        lazyFieldLite.setValue(messageLite);
        return lazyFieldLite;
    }

    public void clear() {
        this.f20961a = null;
        this.value = null;
        this.f20963c = null;
    }

    public boolean containsDefaultInstance() {
        ByteString byteString;
        ByteString byteString2 = this.f20963c;
        ByteString byteString3 = ByteString.EMPTY;
        return byteString2 == byteString3 || (this.value == null && ((byteString = this.f20961a) == null || byteString == byteString3));
    }

    public void ensureInitialized(MessageLite messageLite) {
        if (this.value != null) {
            return;
        }
        synchronized (this) {
            if (this.value != null) {
                return;
            }
            try {
                if (this.f20961a != null) {
                    this.value = messageLite.getParserForType().parseFrom(this.f20961a, this.f20962b);
                    this.f20963c = this.f20961a;
                } else {
                    this.value = messageLite;
                    this.f20963c = ByteString.EMPTY;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.value = messageLite;
                this.f20963c = ByteString.EMPTY;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyFieldLite)) {
            return false;
        }
        LazyFieldLite lazyFieldLite = (LazyFieldLite) obj;
        MessageLite messageLite = this.value;
        MessageLite messageLite2 = lazyFieldLite.value;
        if (messageLite == null && messageLite2 == null) {
            return toByteString().equals(lazyFieldLite.toByteString());
        }
        if (messageLite == null || messageLite2 == null) {
            return messageLite != null ? messageLite.equals(lazyFieldLite.getValue(messageLite.getDefaultInstanceForType())) : getValue(messageLite2.getDefaultInstanceForType()).equals(messageLite2);
        }
        return messageLite.equals(messageLite2);
    }

    public int getSerializedSize() {
        if (this.f20963c != null) {
            return this.f20963c.size();
        }
        ByteString byteString = this.f20961a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.value != null) {
            return this.value.getSerializedSize();
        }
        return 0;
    }

    public MessageLite getValue(MessageLite messageLite) {
        ensureInitialized(messageLite);
        return this.value;
    }

    public int hashCode() {
        return 1;
    }

    public void merge(LazyFieldLite lazyFieldLite) {
        ByteString byteString;
        if (lazyFieldLite.containsDefaultInstance()) {
            return;
        }
        if (containsDefaultInstance()) {
            set(lazyFieldLite);
            return;
        }
        if (this.f20962b == null) {
            this.f20962b = lazyFieldLite.f20962b;
        }
        ByteString byteString2 = this.f20961a;
        if (byteString2 != null && (byteString = lazyFieldLite.f20961a) != null) {
            this.f20961a = byteString2.concat(byteString);
            return;
        }
        if (this.value == null && lazyFieldLite.value != null) {
            MessageLite messageLiteBuild = lazyFieldLite.value;
            try {
                messageLiteBuild = messageLiteBuild.toBuilder().mergeFrom(this.f20961a, this.f20962b).build();
            } catch (InvalidProtocolBufferException unused) {
            }
            setValue(messageLiteBuild);
        } else {
            if (this.value == null || lazyFieldLite.value != null) {
                setValue(this.value.toBuilder().mergeFrom(lazyFieldLite.value).build());
                return;
            }
            MessageLite messageLiteBuild2 = this.value;
            try {
                messageLiteBuild2 = messageLiteBuild2.toBuilder().mergeFrom(lazyFieldLite.f20961a, lazyFieldLite.f20962b).build();
            } catch (InvalidProtocolBufferException unused2) {
            }
            setValue(messageLiteBuild2);
        }
    }

    public void mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        if (containsDefaultInstance()) {
            setByteString(codedInputStream.readBytes(), extensionRegistryLite);
            return;
        }
        if (this.f20962b == null) {
            this.f20962b = extensionRegistryLite;
        }
        ByteString byteString = this.f20961a;
        if (byteString != null) {
            setByteString(byteString.concat(codedInputStream.readBytes()), this.f20962b);
        } else {
            try {
                setValue(this.value.toBuilder().mergeFrom(codedInputStream, extensionRegistryLite).build());
            } catch (InvalidProtocolBufferException unused) {
            }
        }
    }

    public void set(LazyFieldLite lazyFieldLite) {
        this.f20961a = lazyFieldLite.f20961a;
        this.value = lazyFieldLite.value;
        this.f20963c = lazyFieldLite.f20963c;
        ExtensionRegistryLite extensionRegistryLite = lazyFieldLite.f20962b;
        if (extensionRegistryLite != null) {
            this.f20962b = extensionRegistryLite;
        }
    }

    public void setByteString(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        if (extensionRegistryLite == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (byteString == null) {
            throw new NullPointerException("found null ByteString");
        }
        this.f20961a = byteString;
        this.f20962b = extensionRegistryLite;
        this.value = null;
        this.f20963c = null;
    }

    public MessageLite setValue(MessageLite messageLite) {
        MessageLite messageLite2 = this.value;
        this.f20961a = null;
        this.f20963c = null;
        this.value = messageLite;
        return messageLite2;
    }

    public ByteString toByteString() {
        if (this.f20963c != null) {
            return this.f20963c;
        }
        ByteString byteString = this.f20961a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            try {
                if (this.f20963c != null) {
                    return this.f20963c;
                }
                if (this.value == null) {
                    this.f20963c = ByteString.EMPTY;
                } else {
                    this.f20963c = this.value.toByteString();
                }
                return this.f20963c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
