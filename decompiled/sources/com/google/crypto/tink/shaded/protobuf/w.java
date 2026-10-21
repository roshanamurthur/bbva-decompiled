package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: ManifestSchemaFactory.java */
/* JADX INFO: loaded from: classes10.dex */
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47303b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f47304a;

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public class a implements b0 {
        @Override // com.google.crypto.tink.shaded.protobuf.b0
        public final a0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.b0
        public final boolean isSupported(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public static class b implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b0[] f47305a;

        @Override // com.google.crypto.tink.shaded.protobuf.b0
        public final a0 a(Class<?> cls) {
            for (b0 b0Var : this.f47305a) {
                if (b0Var.isSupported(cls)) {
                    return b0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.b0
        public final boolean isSupported(Class<?> cls) {
            for (b0 b0Var : this.f47305a) {
                if (b0Var.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public w() {
        b0 b0Var;
        b0[] b0VarArr = new b0[2];
        b0VarArr[0] = m.f47237a;
        try {
            b0Var = (b0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            b0Var = f47303b;
        }
        b0VarArr[1] = b0Var;
        b bVar = new b();
        bVar.f47305a = b0VarArr;
        Charset charset = Internal.f47106a;
        this.f47304a = bVar;
    }
}
