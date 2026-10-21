package ff;

import com.google.crypto.tink.hybrid.internal.HpkeUtil;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.subtle.Bytes;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.Mac;

/* JADX INFO: compiled from: NistCurvesHpkeKem.java */
/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class m implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EllipticCurves.CurveType f68438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f68439b;

    /* JADX INFO: compiled from: NistCurvesHpkeKem.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68440a;

        static {
            int[] iArr = new int[EllipticCurves.CurveType.values().length];
            f68440a = iArr;
            try {
                iArr[EllipticCurves.CurveType.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68440a[EllipticCurves.CurveType.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68440a[EllipticCurves.CurveType.NIST_P521.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public m(c cVar, EllipticCurves.CurveType curveType) {
        this.f68439b = cVar;
        this.f68438a = curveType;
    }

    public static m e(EllipticCurves.CurveType curveType) throws GeneralSecurityException {
        int i10 = a.f68440a[curveType.ordinal()];
        if (i10 == 1) {
            return new m(new c("HmacSha256"), EllipticCurves.CurveType.NIST_P256);
        }
        if (i10 == 2) {
            return new m(new c("HmacSha384"), EllipticCurves.CurveType.NIST_P384);
        }
        if (i10 == 3) {
            return new m(new c("HmacSha512"), EllipticCurves.CurveType.NIST_P521);
        }
        throw new GeneralSecurityException("invalid curve type: " + curveType);
    }

    @Override // ff.h
    public final byte[] a(byte[] bArr, k kVar) throws GeneralSecurityException {
        byte[] byteArray = kVar.b().toByteArray();
        EllipticCurves.CurveType curveType = this.f68438a;
        return d(EllipticCurves.computeSharedSecret(EllipticCurves.getEcPrivateKey(curveType, byteArray), EllipticCurves.getEcPublicKey(curveType, EllipticCurves.PointFormatType.UNCOMPRESSED, bArr)), bArr, kVar.a().toByteArray());
    }

    @Override // ff.h
    public final i b(byte[] bArr) throws GeneralSecurityException {
        EllipticCurves.CurveType curveType = this.f68438a;
        KeyPair keyPairGenerateKeyPair = EllipticCurves.generateKeyPair(curveType);
        EllipticCurves.PointFormatType pointFormatType = EllipticCurves.PointFormatType.UNCOMPRESSED;
        byte[] bArrComputeSharedSecret = EllipticCurves.computeSharedSecret((ECPrivateKey) keyPairGenerateKeyPair.getPrivate(), EllipticCurves.getEcPublicKey(curveType, pointFormatType, bArr));
        byte[] bArrPointEncode = EllipticCurves.pointEncode(curveType, pointFormatType, ((ECPublicKey) keyPairGenerateKeyPair.getPublic()).getW());
        return new i(d(bArrComputeSharedSecret, bArrPointEncode, bArr), bArrPointEncode);
    }

    @Override // ff.h
    public final byte[] c() throws GeneralSecurityException {
        int i10 = a.f68440a[this.f68438a.ordinal()];
        if (i10 == 1) {
            return HpkeUtil.P256_HKDF_SHA256_KEM_ID;
        }
        if (i10 == 2) {
            return HpkeUtil.P384_HKDF_SHA384_KEM_ID;
        }
        if (i10 == 3) {
            return HpkeUtil.P521_HKDF_SHA512_KEM_ID;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    public final byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        byte[] bArrConcat = Bytes.concat(bArr2, bArr3);
        byte[] bArrConcat2 = Bytes.concat(HpkeUtil.f46585a, c());
        c cVar = this.f68439b;
        int macLength = Mac.getInstance(cVar.f68415a).getMacLength();
        return cVar.a(macLength, cVar.b(Bytes.concat(HpkeUtil.f46587c, bArrConcat2, "eae_prk".getBytes(Util.UTF_8), bArr), null), HpkeUtil.a("shared_secret", bArrConcat, bArrConcat2, macLength));
    }
}
