package bc.org.bouncycastle.crypto.params;

import bc.org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public class ParametersWithIV implements CipherParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f24996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CipherParameters f24997b;

    public ParametersWithIV(CipherParameters cipherParameters, byte[] bArr) {
        this(cipherParameters, bArr, 0, bArr.length);
    }

    public byte[] getIV() {
        return this.f24996a;
    }

    public CipherParameters getParameters() {
        return this.f24997b;
    }

    public ParametersWithIV(CipherParameters cipherParameters, byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f24996a = bArr2;
        this.f24997b = cipherParameters;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }
}
