package ff;

import com.google.crypto.tink.proto.HpkeKem;

/* JADX INFO: compiled from: HpkeKemKeyFactory.java */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f68437a;

    static {
        int[] iArr = new int[HpkeKem.values().length];
        f68437a = iArr;
        try {
            iArr[HpkeKem.DHKEM_X25519_HKDF_SHA256.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f68437a[HpkeKem.DHKEM_P256_HKDF_SHA256.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f68437a[HpkeKem.DHKEM_P384_HKDF_SHA384.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f68437a[HpkeKem.DHKEM_P521_HKDF_SHA512.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
