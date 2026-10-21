package com.google.crypto.tink.subtle;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* JADX INFO: loaded from: classes10.dex */
public final class EciesHkdfSenderKem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECPublicKey f47451a;

    public static final class KemKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.crypto.tink.util.Bytes f47452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.crypto.tink.util.Bytes f47453b;

        public KemKey(byte[] bArr, byte[] bArr2) {
            if (bArr == null) {
                throw new NullPointerException("KemBytes must be non-null");
            }
            if (bArr2 == null) {
                throw new NullPointerException("symmetricKey must be non-null");
            }
            this.f47452a = com.google.crypto.tink.util.Bytes.copyFrom(bArr);
            this.f47453b = com.google.crypto.tink.util.Bytes.copyFrom(bArr2);
        }

        public byte[] getKemBytes() {
            return this.f47452a.toByteArray();
        }

        public byte[] getSymmetricKey() {
            return this.f47453b.toByteArray();
        }
    }

    public EciesHkdfSenderKem(ECPublicKey eCPublicKey) {
        this.f47451a = eCPublicKey;
    }

    public KemKey generateKey(String str, byte[] bArr, byte[] bArr2, int i10, EllipticCurves.PointFormatType pointFormatType) throws GeneralSecurityException {
        ECPublicKey eCPublicKey = this.f47451a;
        KeyPair keyPairGenerateKeyPair = EllipticCurves.generateKeyPair(eCPublicKey.getParams());
        ECPublicKey eCPublicKey2 = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
        byte[] bArrComputeSharedSecret = EllipticCurves.computeSharedSecret((ECPrivateKey) keyPairGenerateKeyPair.getPrivate(), eCPublicKey);
        byte[] bArrPointEncode = EllipticCurves.pointEncode(eCPublicKey2.getParams().getCurve(), pointFormatType, eCPublicKey2.getW());
        return new KemKey(bArrPointEncode, Hkdf.computeEciesHkdfSymmetricKey(bArrPointEncode, bArrComputeSharedSecret, str, bArr, bArr2, i10));
    }
}
