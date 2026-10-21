package ef;

import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.EcPointFormat;
import com.google.crypto.tink.proto.EciesAeadHkdfParams;
import com.google.crypto.tink.proto.EllipticCurveType;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.subtle.EllipticCurves;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: HybridUtil.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: compiled from: HybridUtil.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f68335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f68336c;

        static {
            int[] iArr = new int[EcPointFormat.values().length];
            f68336c = iArr;
            try {
                iArr[EcPointFormat.UNCOMPRESSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68336c[EcPointFormat.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68336c[EcPointFormat.COMPRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EllipticCurveType.values().length];
            f68335b = iArr2;
            try {
                iArr2[EllipticCurveType.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68335b[EllipticCurveType.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f68335b[EllipticCurveType.NIST_P521.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[HashType.values().length];
            f68334a = iArr3;
            try {
                iArr3[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f68334a[HashType.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f68334a[HashType.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f68334a[HashType.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f68334a[HashType.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static EllipticCurves.CurveType a(EllipticCurveType ellipticCurveType) throws GeneralSecurityException {
        int i10 = a.f68335b[ellipticCurveType.ordinal()];
        if (i10 == 1) {
            return EllipticCurves.CurveType.NIST_P256;
        }
        if (i10 == 2) {
            return EllipticCurves.CurveType.NIST_P384;
        }
        if (i10 == 3) {
            return EllipticCurves.CurveType.NIST_P521;
        }
        throw new GeneralSecurityException("unknown curve type: " + ellipticCurveType);
    }

    public static String b(HashType hashType) throws NoSuchAlgorithmException {
        int i10 = a.f68334a[hashType.ordinal()];
        if (i10 == 1) {
            return "HmacSha1";
        }
        if (i10 == 2) {
            return "HmacSha224";
        }
        if (i10 == 3) {
            return "HmacSha256";
        }
        if (i10 == 4) {
            return "HmacSha384";
        }
        if (i10 == 5) {
            return "HmacSha512";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + hashType);
    }

    public static EllipticCurves.PointFormatType c(EcPointFormat ecPointFormat) throws GeneralSecurityException {
        int i10 = a.f68336c[ecPointFormat.ordinal()];
        if (i10 == 1) {
            return EllipticCurves.PointFormatType.UNCOMPRESSED;
        }
        if (i10 == 2) {
            return EllipticCurves.PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        if (i10 == 3) {
            return EllipticCurves.PointFormatType.COMPRESSED;
        }
        throw new GeneralSecurityException("unknown point format: " + ecPointFormat);
    }

    public static void d(EciesAeadHkdfParams eciesAeadHkdfParams) throws GeneralSecurityException {
        EllipticCurves.getCurveSpec(a(eciesAeadHkdfParams.getKemParams().getCurveType()));
        b(eciesAeadHkdfParams.getKemParams().getHkdfHashType());
        if (eciesAeadHkdfParams.getEcPointFormat() == EcPointFormat.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        Registry.newKeyData(eciesAeadHkdfParams.getDemParams().getAeadDem());
    }
}
