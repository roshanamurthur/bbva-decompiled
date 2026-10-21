package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: Schema.java */
/* JADX INFO: loaded from: classes2.dex */
public interface o0<T> {
    void a(T t10, T t11);

    void b(T t10);

    boolean c(T t10);

    int d(T t10);

    int e(T t10);

    boolean f(T t10, T t11);

    void g(T t10, m0 m0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    void h(Object obj, h hVar) throws IOException;

    void i(T t10, byte[] bArr, int i10, int i11, c.b bVar) throws IOException;

    T newInstance();
}
