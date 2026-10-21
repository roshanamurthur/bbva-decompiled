package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class KDFCounterParameters implements DerivationParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f89317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f89318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f89319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f89320d;

    public KDFCounterParameters(byte[] bArr, byte[] bArr2, int i10) {
        this(bArr, null, bArr2, i10);
    }

    public byte[] getFixedInputData() {
        return Arrays.clone(this.f89319c);
    }

    public byte[] getFixedInputDataCounterPrefix() {
        return Arrays.clone(this.f89318b);
    }

    public byte[] getFixedInputDataCounterSuffix() {
        return Arrays.clone(this.f89319c);
    }

    public byte[] getKI() {
        return this.f89317a;
    }

    public int getR() {
        return this.f89320d;
    }

    public KDFCounterParameters(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
        if (bArr == null) {
            throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
        }
        this.f89317a = Arrays.clone(bArr);
        if (bArr2 == null) {
            this.f89318b = new byte[0];
        } else {
            this.f89318b = Arrays.clone(bArr2);
        }
        if (bArr3 == null) {
            this.f89319c = new byte[0];
        } else {
            this.f89319c = Arrays.clone(bArr3);
        }
        if (i10 != 8 && i10 != 16 && i10 != 24 && i10 != 32) {
            throw new IllegalArgumentException("Length of counter should be 8, 16, 24 or 32");
        }
        this.f89320d = i10;
    }
}
