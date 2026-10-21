package bc.org.bouncycastle.crypto.params;

import bc.org.bouncycastle.crypto.CipherParameters;
import bc.org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class KeyParameter implements CipherParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f24995a;

    public KeyParameter(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public void clear() {
        Arrays.fill(this.f24995a, (byte) 0);
    }

    public byte[] getKey() {
        return this.f24995a;
    }

    public KeyParameter(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f24995a = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }
}
