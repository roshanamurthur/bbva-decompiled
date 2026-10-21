package ff;

import com.google.crypto.tink.hybrid.internal.HpkeUtil;
import com.google.crypto.tink.internal.BigIntegerEncoding;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.subtle.Bytes;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: compiled from: HpkeContext.java */
/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public final class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f68416g = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f68417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigInteger f68418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f68419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f68420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f68421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @GuardedBy("this")
    public BigInteger f68422f = BigInteger.ZERO;

    public e(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, d dVar) {
        this.f68421e = bArr;
        this.f68419c = bArr2;
        this.f68420d = bArr3;
        this.f68418b = bigInteger;
        this.f68417a = dVar;
    }

    public static e b(byte[] bArr, byte[] bArr2, h hVar, c cVar, d dVar, byte[] bArr3) throws GeneralSecurityException {
        byte[] bArrConcat = Bytes.concat(HpkeUtil.f46586b, hVar.c(), cVar.c(), dVar.b());
        byte[] bArr4 = HpkeUtil.EMPTY_SALT;
        byte[] bArr5 = f68416g;
        byte[] bArr6 = HpkeUtil.f46587c;
        Charset charset = Util.UTF_8;
        byte[] bArrConcat2 = Bytes.concat(HpkeUtil.BASE_MODE, cVar.b(Bytes.concat(bArr6, bArrConcat, "psk_id_hash".getBytes(charset), bArr5), bArr4), cVar.b(Bytes.concat(bArr6, bArrConcat, "info_hash".getBytes(charset), bArr3), bArr4));
        byte[] bArrB = cVar.b(Bytes.concat(bArr6, bArrConcat, "secret".getBytes(charset), bArr5), bArr2);
        int iA = dVar.a();
        byte[] bArrA = cVar.a(iA, bArrB, HpkeUtil.a("key", bArrConcat2, bArrConcat, iA));
        dVar.e();
        byte[] bArrA2 = cVar.a(12, bArrB, HpkeUtil.a("base_nonce", bArrConcat2, bArrConcat, 12));
        dVar.e();
        BigInteger bigInteger = BigInteger.ONE;
        return new e(bArr, bArrA, bArrA2, bigInteger.shiftLeft(96).subtract(bigInteger), dVar);
    }

    public final synchronized byte[] a() throws GeneralSecurityException {
        byte[] bArrXor;
        BigInteger bigInteger = this.f68422f;
        this.f68417a.e();
        bArrXor = Bytes.xor(this.f68420d, BigIntegerEncoding.toBigEndianBytesOfFixedLength(bigInteger, 12));
        if (this.f68422f.compareTo(this.f68418b) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.f68422f = this.f68422f.add(BigInteger.ONE);
        return bArrXor;
    }
}
