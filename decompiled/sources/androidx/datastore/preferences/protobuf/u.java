package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: ManifestSchemaFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21145b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f21146a;

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public static class a implements z {
        @Override // androidx.datastore.preferences.protobuf.z
        public final y a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public final boolean isSupported(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public static class b implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z[] f21147a;

        @Override // androidx.datastore.preferences.protobuf.z
        public final y a(Class<?> cls) {
            for (z zVar : this.f21147a) {
                if (zVar.isSupported(cls)) {
                    return zVar.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public final boolean isSupported(Class<?> cls) {
            for (z zVar : this.f21147a) {
                if (zVar.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public u() {
        z zVar;
        z[] zVarArr = new z[2];
        zVarArr[0] = o.f21102a;
        try {
            zVar = (z) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zVar = f21145b;
        }
        zVarArr[1] = zVar;
        b bVar = new b();
        bVar.f21147a = zVarArr;
        Charset charset = Internal.f20943a;
        this.f21146a = bVar;
    }
}
