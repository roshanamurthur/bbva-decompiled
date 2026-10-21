package org.bouncycastle.crypto.agreement.kdf;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.DerivationParameters;

/* JADX INFO: loaded from: classes2.dex */
public class DHKDFParameters implements DerivationParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ASN1ObjectIdentifier f87939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f87941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f87942d;

    public DHKDFParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i10, byte[] bArr) {
        this(aSN1ObjectIdentifier, i10, bArr, null);
    }

    public ASN1ObjectIdentifier getAlgorithm() {
        return this.f87939a;
    }

    public byte[] getExtraInfo() {
        return this.f87942d;
    }

    public int getKeySize() {
        return this.f87940b;
    }

    public byte[] getZ() {
        return this.f87941c;
    }

    public DHKDFParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i10, byte[] bArr, byte[] bArr2) {
        this.f87939a = aSN1ObjectIdentifier;
        this.f87940b = i10;
        this.f87941c = bArr;
        this.f87942d = bArr2;
    }
}
