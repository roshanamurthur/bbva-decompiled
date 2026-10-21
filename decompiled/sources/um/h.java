package um;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.ExtendedDigest;

/* JADX INFO: loaded from: classes13.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f93894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f93895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Digest f93896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f93897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f93898e;

    public h(byte[] bArr, byte[] bArr2, ExtendedDigest extendedDigest) {
        this.f93894a = bArr;
        this.f93895b = bArr2;
        this.f93896c = extendedDigest;
    }

    public final void a(boolean z10, int i10, byte[] bArr) {
        int length = bArr.length;
        Digest digest = this.f93896c;
        if (length < digest.getDigestSize()) {
            throw new IllegalArgumentException("target length is less than digest size.");
        }
        byte[] bArr2 = this.f93894a;
        digest.update(bArr2, 0, bArr2.length);
        digest.update((byte) (this.f93897d >>> 24));
        digest.update((byte) (this.f93897d >>> 16));
        digest.update((byte) (this.f93897d >>> 8));
        digest.update((byte) this.f93897d);
        digest.update((byte) (this.f93898e >>> 8));
        digest.update((byte) this.f93898e);
        digest.update((byte) -1);
        byte[] bArr3 = this.f93895b;
        digest.update(bArr3, 0, bArr3.length);
        digest.doFinal(bArr, i10);
        if (z10) {
            this.f93898e++;
        }
    }
}
