package com.google.android.datatransport.runtime;

import androidx.annotation.NonNull;
import com.google.android.datatransport.Encoding;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class EncodedPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Encoding f43691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f43692b;

    public EncodedPayload(@NonNull Encoding encoding, @NonNull byte[] bArr) {
        if (encoding == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f43691a = encoding;
        this.f43692b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncodedPayload)) {
            return false;
        }
        EncodedPayload encodedPayload = (EncodedPayload) obj;
        if (this.f43691a.equals(encodedPayload.f43691a)) {
            return Arrays.equals(this.f43692b, encodedPayload.f43692b);
        }
        return false;
    }

    public byte[] getBytes() {
        return this.f43692b;
    }

    public Encoding getEncoding() {
        return this.f43691a;
    }

    public int hashCode() {
        return ((this.f43691a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f43692b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f43691a + ", bytes=[...]}";
    }
}
