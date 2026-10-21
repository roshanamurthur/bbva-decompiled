package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class HKDFParameters implements DerivationParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f89308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f89309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f89310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f89311d;

    public HKDFParameters(byte[] bArr, boolean z10, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            throw new IllegalArgumentException("IKM (input keying material) should not be null");
        }
        this.f89308a = Arrays.clone(bArr);
        this.f89309b = z10;
        if (bArr2 == null || bArr2.length == 0) {
            this.f89310c = null;
        } else {
            this.f89310c = Arrays.clone(bArr2);
        }
        if (bArr3 == null) {
            this.f89311d = new byte[0];
        } else {
            this.f89311d = Arrays.clone(bArr3);
        }
    }

    public static HKDFParameters defaultParameters(byte[] bArr) {
        return new HKDFParameters(bArr, false, null, null);
    }

    public static HKDFParameters skipExtractParameters(byte[] bArr, byte[] bArr2) {
        return new HKDFParameters(bArr, true, null, bArr2);
    }

    public byte[] getIKM() {
        return Arrays.clone(this.f89308a);
    }

    public byte[] getInfo() {
        return Arrays.clone(this.f89311d);
    }

    public byte[] getSalt() {
        return Arrays.clone(this.f89310c);
    }

    public boolean skipExtract() {
        return this.f89309b;
    }

    public HKDFParameters(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(bArr, false, bArr2, bArr3);
    }
}
