package org.bouncycastle.crypto.params;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class DSAValidationParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f89260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f89261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f89262c;

    public DSAValidationParameters(byte[] bArr, int i10) {
        this(bArr, i10, -1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAValidationParameters)) {
            return false;
        }
        DSAValidationParameters dSAValidationParameters = (DSAValidationParameters) obj;
        if (dSAValidationParameters.f89262c != this.f89262c) {
            return false;
        }
        return Arrays.areEqual(this.f89261b, dSAValidationParameters.f89261b);
    }

    public int getCounter() {
        return this.f89262c;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f89261b);
    }

    public int getUsageIndex() {
        return this.f89260a;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f89261b) ^ this.f89262c;
    }

    public DSAValidationParameters(byte[] bArr, int i10, int i11) {
        this.f89261b = Arrays.clone(bArr);
        this.f89262c = i10;
        this.f89260a = i11;
    }
}
