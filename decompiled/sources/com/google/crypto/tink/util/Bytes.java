package com.google.crypto.tink.util;

import com.google.crypto.tink.subtle.Hex;
import com.google.errorprone.annotations.Immutable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class Bytes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f47524a;

    public Bytes(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f47524a = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public static Bytes copyFrom(byte[] bArr) {
        if (bArr != null) {
            return copyFrom(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public boolean equals(Object obj) {
        if (obj instanceof Bytes) {
            return Arrays.equals(((Bytes) obj).f47524a, this.f47524a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f47524a);
    }

    public int size() {
        return this.f47524a.length;
    }

    public byte[] toByteArray() {
        byte[] bArr = this.f47524a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public String toString() {
        return "Bytes(" + Hex.encode(this.f47524a) + ")";
    }

    public static Bytes copyFrom(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            return new Bytes(bArr, i10, i11);
        }
        throw new NullPointerException("data must be non-null");
    }
}
