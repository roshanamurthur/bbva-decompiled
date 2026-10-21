package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: ExtensionRegistryFactory.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f47223a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f47223a = cls;
    }

    public static final ExtensionRegistryLite a(String str) {
        Class<?> cls = f47223a;
        if (cls == null) {
            return null;
        }
        try {
            return (ExtensionRegistryLite) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
