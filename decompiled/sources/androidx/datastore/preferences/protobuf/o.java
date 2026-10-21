package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: GeneratedMessageInfoFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f21102a = new o();

    @Override // androidx.datastore.preferences.protobuf.z
    public final y a(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (y) GeneratedMessageLite.f(cls.asSubclass(GeneratedMessageLite.class)).dynamicMethod(GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO);
        } catch (Exception e5) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e5);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public final boolean isSupported(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
