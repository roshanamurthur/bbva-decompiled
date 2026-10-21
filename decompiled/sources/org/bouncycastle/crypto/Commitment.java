package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes2.dex */
public class Commitment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f87852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f87853b;

    public Commitment(byte[] bArr, byte[] bArr2) {
        this.f87852a = bArr;
        this.f87853b = bArr2;
    }

    public byte[] getCommitment() {
        return this.f87853b;
    }

    public byte[] getSecret() {
        return this.f87852a;
    }
}
