package ff;

import com.google.crypto.tink.util.Bytes;
import com.google.errorprone.annotations.Immutable;

/* JADX INFO: compiled from: X25519HpkeKemPrivateKey.java */
/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class p implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bytes f68444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bytes f68445b;

    public p(byte[] bArr, byte[] bArr2) {
        this.f68444a = Bytes.copyFrom(bArr);
        this.f68445b = Bytes.copyFrom(bArr2);
    }

    @Override // ff.k
    public final Bytes a() {
        return this.f68445b;
    }

    @Override // ff.k
    public final Bytes b() {
        return this.f68444a;
    }
}
