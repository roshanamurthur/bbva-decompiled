package com.google.crypto.tink.subtle;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.prf.Prf;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class PrfHmacJce implements Prf {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f47473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Key f47475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47476d;

    public class a extends ThreadLocal<Mac> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        public final Mac initialValue() {
            PrfHmacJce prfHmacJce = PrfHmacJce.this;
            try {
                Mac engineFactory = EngineFactory.MAC.getInstance(prfHmacJce.f47474b);
                engineFactory.init(prfHmacJce.f47475c);
                return engineFactory;
            } catch (GeneralSecurityException e5) {
                throw new IllegalStateException(e5);
            }
        }
    }

    public PrfHmacJce(String str, Key key) throws GeneralSecurityException {
        a aVar = new a();
        this.f47473a = aVar;
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f47474b = str;
        this.f47475c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.getClass();
        switch (str) {
            case "HMACSHA1":
                this.f47476d = 20;
                break;
            case "HMACSHA224":
                this.f47476d = 28;
                break;
            case "HMACSHA256":
                this.f47476d = 32;
                break;
            case "HMACSHA384":
                this.f47476d = 48;
                break;
            case "HMACSHA512":
                this.f47476d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        aVar.get();
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] bArr, int i10) throws GeneralSecurityException {
        if (i10 > this.f47476d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        a aVar = this.f47473a;
        aVar.get().update(bArr);
        return Arrays.copyOf(aVar.get().doFinal(), i10);
    }

    public int getMaxOutputLength() {
        return this.f47476d;
    }
}
