package org.bouncycastle.pqc.crypto.gmss;

/* JADX INFO: loaded from: classes13.dex */
public class GMSSPublicKeyParameters extends GMSSKeyParameters {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f91002r0;

    public GMSSPublicKeyParameters(byte[] bArr, GMSSParameters gMSSParameters) {
        super(false, gMSSParameters);
        this.f91002r0 = bArr;
    }

    public byte[] getPublicKey() {
        return this.f91002r0;
    }
}
