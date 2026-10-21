package ff;

import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.proto.HpkeKem;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: HpkeDecrypt.java */
/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class f implements HybridDecrypt {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f68423f = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f68424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f68425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f68426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f68427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f68428e;

    /* JADX INFO: compiled from: HpkeDecrypt.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68429a;

        static {
            int[] iArr = new int[HpkeKem.values().length];
            f68429a = iArr;
            try {
                iArr[HpkeKem.DHKEM_X25519_HKDF_SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68429a[HpkeKem.DHKEM_P256_HKDF_SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68429a[HpkeKem.DHKEM_P384_HKDF_SHA384.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68429a[HpkeKem.DHKEM_P521_HKDF_SHA512.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public f(k kVar, h hVar, c cVar, d dVar, int i10) {
        this.f68424a = kVar;
        this.f68425b = hVar;
        this.f68426c = cVar;
        this.f68427d = dVar;
        this.f68428e = i10;
    }

    @Override // com.google.crypto.tink.HybridDecrypt
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f68428e;
        if (length < i10) {
            throw new GeneralSecurityException("Ciphertext is too short.");
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, bArr.length);
        c cVar = this.f68426c;
        d dVar = this.f68427d;
        h hVar = this.f68425b;
        e eVarB = e.b(bArrCopyOf, hVar.a(bArrCopyOf, this.f68424a), hVar, cVar, dVar, bArr2);
        byte[] bArr3 = f68423f;
        return eVarB.f68417a.c(eVarB.f68419c, eVarB.a(), bArrCopyOfRange, bArr3);
    }
}
