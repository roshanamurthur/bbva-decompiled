package lf;

import com.google.crypto.tink.proto.HashType;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: StreamingAeadUtil.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: compiled from: StreamingAeadUtil.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f83210a;

        static {
            int[] iArr = new int[HashType.values().length];
            f83210a = iArr;
            try {
                iArr[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83210a[HashType.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83210a[HashType.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83210a[HashType.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f83210a[HashType.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static String a(HashType hashType) throws NoSuchAlgorithmException {
        int i10 = a.f83210a[hashType.ordinal()];
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
}
