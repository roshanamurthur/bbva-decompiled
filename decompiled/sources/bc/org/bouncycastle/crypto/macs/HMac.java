package bc.org.bouncycastle.crypto.macs;

import bc.org.bouncycastle.crypto.CipherParameters;
import bc.org.bouncycastle.crypto.Digest;
import bc.org.bouncycastle.crypto.params.KeyParameter;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.i3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.o3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.p3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.x2;
import java.util.Hashtable;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public class HMac implements o3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Hashtable f24970h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f24971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p3 f24974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p3 f24975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f24976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f24977g;

    static {
        Hashtable hashtable = new Hashtable();
        f24970h = hashtable;
        hashtable.put("GOST3411", i3.a(32));
        hashtable.put("MD2", i3.a(16));
        hashtable.put("MD4", i3.a(64));
        hashtable.put("MD5", i3.a(64));
        hashtable.put("RIPEMD128", i3.a(64));
        hashtable.put("RIPEMD160", i3.a(64));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA1, i3.a(64));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA224, i3.a(64));
        hashtable.put("SHA-256", i3.a(64));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA384, i3.a(128));
        hashtable.put("SHA-512", i3.a(128));
        hashtable.put("Tiger", i3.a(64));
        hashtable.put("Whirlpool", i3.a(64));
    }

    public HMac(Digest digest) {
        int iIntValue;
        if (digest instanceof x2) {
            iIntValue = ((x2) digest).getByteLength();
        } else {
            Integer num = (Integer) f24970h.get(digest.getAlgorithmName());
            if (num == null) {
                throw new IllegalArgumentException("unknown digest passed: " + digest.getAlgorithmName());
            }
            iIntValue = num.intValue();
        }
        this.f24971a = digest;
        int digestSize = digest.getDigestSize();
        this.f24972b = digestSize;
        this.f24973c = iIntValue;
        this.f24976f = new byte[iIntValue];
        this.f24977g = new byte[iIntValue + digestSize];
    }

    public int doFinal(byte[] bArr, int i10) {
        Digest digest = this.f24971a;
        byte[] bArr2 = this.f24977g;
        int i11 = this.f24973c;
        digest.doFinal(bArr2, i11);
        p3 p3Var = this.f24975e;
        if (p3Var != null) {
            ((p3) digest).reset(p3Var);
            digest.update(bArr2, i11, digest.getDigestSize());
        } else {
            digest.update(bArr2, 0, bArr2.length);
        }
        int iDoFinal = digest.doFinal(bArr, i10);
        while (i11 < bArr2.length) {
            bArr2[i11] = 0;
            i11++;
        }
        p3 p3Var2 = this.f24974d;
        if (p3Var2 != null) {
            ((p3) digest).reset(p3Var2);
        } else {
            byte[] bArr3 = this.f24976f;
            digest.update(bArr3, 0, bArr3.length);
        }
        return iDoFinal;
    }

    public String getAlgorithmName() {
        return this.f24971a.getAlgorithmName() + "/HMAC";
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o3
    public int getMacSize() {
        return this.f24972b;
    }

    public Digest getUnderlyingDigest() {
        return this.f24971a;
    }

    public void init(CipherParameters cipherParameters) {
        Digest digest = this.f24971a;
        digest.reset();
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        int length = key.length;
        byte[] bArr = this.f24976f;
        int i10 = this.f24973c;
        if (length > i10) {
            digest.update(key, 0, length);
            digest.doFinal(bArr, 0);
            length = this.f24972b;
        } else {
            System.arraycopy(key, 0, bArr, 0, length);
        }
        while (length < bArr.length) {
            bArr[length] = 0;
            length++;
        }
        byte[] bArr2 = this.f24977g;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) (bArr[i11] ^ 54);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) (bArr2[i12] ^ 92);
        }
        boolean z10 = digest instanceof p3;
        if (z10) {
            p3 p3VarCopy = ((p3) digest).copy();
            this.f24975e = p3VarCopy;
            ((Digest) p3VarCopy).update(bArr2, 0, i10);
        }
        digest.update(bArr, 0, bArr.length);
        if (z10) {
            this.f24974d = ((p3) digest).copy();
        }
    }

    public void reset() {
        Digest digest = this.f24971a;
        digest.reset();
        byte[] bArr = this.f24976f;
        digest.update(bArr, 0, bArr.length);
    }

    public void update(byte b10) {
        this.f24971a.update(b10);
    }

    public void update(byte[] bArr, int i10, int i11) {
        this.f24971a.update(bArr, i10, i11);
    }
}
