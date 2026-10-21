package org.bouncycastle.crypto.params;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class DHValidationParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f89243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89244b;

    public DHValidationParameters(byte[] bArr, int i10) {
        this.f89243a = Arrays.clone(bArr);
        this.f89244b = i10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHValidationParameters)) {
            return false;
        }
        DHValidationParameters dHValidationParameters = (DHValidationParameters) obj;
        if (dHValidationParameters.f89244b != this.f89244b) {
            return false;
        }
        return Arrays.areEqual(this.f89243a, dHValidationParameters.f89243a);
    }

    public int getCounter() {
        return this.f89244b;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f89243a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f89243a) ^ this.f89244b;
    }
}
