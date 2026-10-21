package ff;

import com.google.crypto.tink.util.Bytes;
import com.google.errorprone.annotations.Immutable;

/* JADX INFO: compiled from: NistCurvesHpkeKemPrivateKey.java */
/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class n implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bytes f68441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bytes f68442b;

    public n(byte[] bArr, byte[] bArr2) {
        this.f68441a = Bytes.copyFrom(bArr);
        this.f68442b = Bytes.copyFrom(bArr2);
    }

    @Override // ff.k
    public final Bytes a() {
        return this.f68442b;
    }

    @Override // ff.k
    public final Bytes b() {
        return this.f68441a;
    }
}
