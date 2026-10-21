package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: GeneratedMessageInfoFactory.java */
/* JADX INFO: loaded from: classes10.dex */
public final class m implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f47237a = new m();

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final a0 a(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (a0) GeneratedMessageLite.h(cls.asSubclass(GeneratedMessageLite.class)).dynamicMethod(GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO);
        } catch (Exception e5) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e5);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final boolean isSupported(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
