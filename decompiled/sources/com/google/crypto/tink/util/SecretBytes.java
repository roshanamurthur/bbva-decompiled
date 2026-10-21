package com.google.crypto.tink.util;

import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.subtle.Random;
import com.google.errorprone.annotations.Immutable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
@Alpha
public final class SecretBytes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bytes f47541a;

    public SecretBytes(Bytes bytes) {
        this.f47541a = bytes;
    }

    public static SecretBytes copyFrom(byte[] bArr, SecretKeyAccess secretKeyAccess) {
        if (secretKeyAccess != null) {
            return new SecretBytes(Bytes.copyFrom(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public static SecretBytes randomBytes(int i10) {
        return new SecretBytes(Bytes.copyFrom(Random.randBytes(i10)));
    }

    public boolean equalsSecretBytes(SecretBytes secretBytes) {
        return MessageDigest.isEqual(this.f47541a.toByteArray(), secretBytes.f47541a.toByteArray());
    }

    public int size() {
        return this.f47541a.size();
    }

    public byte[] toByteArray(SecretKeyAccess secretKeyAccess) {
        if (secretKeyAccess != null) {
            return this.f47541a.toByteArray();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
