package gf;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: RsaKem.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f68603a = new byte[0];

    public static void a(BigInteger bigInteger) throws GeneralSecurityException {
        if (bigInteger.bitLength() < 2048) {
            throw new GeneralSecurityException(String.format("RSA key must be of at least size %d bits, but got %d", 2048, Integer.valueOf(bigInteger.bitLength())));
        }
    }
}
