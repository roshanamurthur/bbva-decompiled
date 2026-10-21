package com.google.crypto.tink.util;

import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.annotations.Alpha;
import com.google.errorprone.annotations.Immutable;
import java.math.BigInteger;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
@Alpha
public final class SecretBigInteger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigInteger f47540a;

    public SecretBigInteger(BigInteger bigInteger) {
        this.f47540a = bigInteger;
    }

    public static SecretBigInteger fromBigInteger(BigInteger bigInteger, SecretKeyAccess secretKeyAccess) {
        if (secretKeyAccess != null) {
            return new SecretBigInteger(bigInteger);
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public boolean equalsSecretBigInteger(SecretBigInteger secretBigInteger) {
        return MessageDigest.isEqual(this.f47540a.toByteArray(), secretBigInteger.f47540a.toByteArray());
    }

    public BigInteger getBigInteger(SecretKeyAccess secretKeyAccess) {
        if (secretKeyAccess != null) {
            return this.f47540a;
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
