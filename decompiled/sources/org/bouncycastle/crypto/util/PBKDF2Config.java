package org.bouncycastle.crypto.util;

import java.util.HashMap;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes5.dex */
public class PBKDF2Config extends PBKDFConfig {
    public static final AlgorithmIdentifier PRF_SHA1;
    public static final AlgorithmIdentifier PRF_SHA256;
    public static final AlgorithmIdentifier PRF_SHA3_256;
    public static final AlgorithmIdentifier PRF_SHA3_512;
    public static final AlgorithmIdentifier PRF_SHA512;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f89635e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f89637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AlgorithmIdentifier f89638d;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f89639a = 1024;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f89640b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AlgorithmIdentifier f89641c = PBKDF2Config.PRF_SHA1;

        public PBKDF2Config build() {
            return new PBKDF2Config(this);
        }

        public Builder withIterationCount(int i10) {
            this.f89639a = i10;
            return this;
        }

        public Builder withPRF(AlgorithmIdentifier algorithmIdentifier) {
            this.f89641c = algorithmIdentifier;
            return this;
        }

        public Builder withSaltLength(int i10) {
            this.f89640b = i10;
            return this;
        }
    }

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_hmacWithSHA1;
        DERNull dERNull = DERNull.INSTANCE;
        PRF_SHA1 = new AlgorithmIdentifier(aSN1ObjectIdentifier, dERNull);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.id_hmacWithSHA256;
        PRF_SHA256 = new AlgorithmIdentifier(aSN1ObjectIdentifier2, dERNull);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PKCSObjectIdentifiers.id_hmacWithSHA512;
        PRF_SHA512 = new AlgorithmIdentifier(aSN1ObjectIdentifier3, dERNull);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_hmacWithSHA3_256;
        PRF_SHA3_256 = new AlgorithmIdentifier(aSN1ObjectIdentifier4, dERNull);
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NISTObjectIdentifiers.id_hmacWithSHA3_512;
        PRF_SHA3_512 = new AlgorithmIdentifier(aSN1ObjectIdentifier5, dERNull);
        HashMap map = new HashMap();
        f89635e = map;
        map.put(aSN1ObjectIdentifier, Integers.valueOf(20));
        map.put(aSN1ObjectIdentifier2, Integers.valueOf(32));
        map.put(aSN1ObjectIdentifier3, Integers.valueOf(64));
        map.put(PKCSObjectIdentifiers.id_hmacWithSHA224, Integers.valueOf(28));
        map.put(PKCSObjectIdentifiers.id_hmacWithSHA384, Integers.valueOf(48));
        map.put(NISTObjectIdentifiers.id_hmacWithSHA3_224, Integers.valueOf(28));
        map.put(aSN1ObjectIdentifier4, Integers.valueOf(32));
        map.put(NISTObjectIdentifiers.id_hmacWithSHA3_384, Integers.valueOf(48));
        map.put(aSN1ObjectIdentifier5, Integers.valueOf(64));
        map.put(CryptoProObjectIdentifiers.gostR3411Hmac, Integers.valueOf(32));
        map.put(RosstandartObjectIdentifiers.id_tc26_hmac_gost_3411_12_256, Integers.valueOf(32));
        map.put(RosstandartObjectIdentifiers.id_tc26_hmac_gost_3411_12_512, Integers.valueOf(64));
        map.put(GMObjectIdentifiers.hmac_sm3, Integers.valueOf(32));
    }

    public PBKDF2Config(Builder builder) {
        super(PKCSObjectIdentifiers.id_PBKDF2);
        this.f89636b = builder.f89639a;
        AlgorithmIdentifier algorithmIdentifier = builder.f89641c;
        this.f89638d = algorithmIdentifier;
        int iIntValue = builder.f89640b;
        if (iIntValue < 0) {
            ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
            HashMap map = f89635e;
            if (!map.containsKey(algorithm)) {
                throw new IllegalStateException("no salt size for algorithm: " + algorithm);
            }
            iIntValue = ((Integer) map.get(algorithm)).intValue();
        }
        this.f89637c = iIntValue;
    }

    public int getIterationCount() {
        return this.f89636b;
    }

    public AlgorithmIdentifier getPRF() {
        return this.f89638d;
    }

    public int getSaltLength() {
        return this.f89637c;
    }
}
