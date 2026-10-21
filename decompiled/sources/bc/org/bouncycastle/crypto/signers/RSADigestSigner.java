package bc.org.bouncycastle.crypto.signers;

import androidx.camera.core.impl.a;
import bc.org.bouncycastle.crypto.CipherParameters;
import bc.org.bouncycastle.crypto.CryptoException;
import bc.org.bouncycastle.crypto.DataLengthException;
import bc.org.bouncycastle.crypto.Digest;
import bc.org.bouncycastle.crypto.Signer;
import bc.org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.b0;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.c1;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.i4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.j4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.l2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.l4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.n5;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.p;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.q5;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.r4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.s3;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public class RSADigestSigner implements Signer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Hashtable f24999e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f25000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f25001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Digest f25002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25003d;

    static {
        Hashtable hashtable = new Hashtable();
        f24999e = hashtable;
        hashtable.put("RIPEMD128", n5.f66216c);
        hashtable.put("RIPEMD160", n5.f66215b);
        hashtable.put("RIPEMD256", n5.f66217d);
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA1, q5.f66278j);
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA224, s3.f66344f);
        hashtable.put("SHA-256", s3.f66338c);
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA384, s3.f66340d);
        hashtable.put("SHA-512", s3.f66342e);
        hashtable.put("SHA-512/224", s3.f66346g);
        hashtable.put(SPHINCSKeyParameters.SHA512_256, s3.f66348h);
        hashtable.put("SHA3-224", s3.f66350i);
        hashtable.put("SHA3-256", s3.f66351j);
        hashtable.put("SHA3-384", s3.f66352k);
        hashtable.put("SHA3-512", s3.f66353l);
        hashtable.put("MD2", j4.H);
        hashtable.put("MD4", j4.I);
        hashtable.put("MD5", j4.J);
    }

    public RSADigestSigner(Digest digest) {
        this(digest, (p) f24999e.get(digest.getAlgorithmName()));
    }

    @Override // bc.org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws CryptoException, DataLengthException {
        if (!this.f25003d) {
            throw new IllegalStateException("RSADigestSigner not initialised for signature generation.");
        }
        Digest digest = this.f25002c;
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        try {
            byte[] encoded = new l2(this.f25001b, bArr).getEncoded(ASN1Encoding.DER);
            return this.f25000a.a(encoded, 0, encoded.length);
        } catch (IOException e5) {
            throw new CryptoException(a.d(e5, new StringBuilder("unable to encode signature: ")), e5);
        }
    }

    public String getAlgorithmName() {
        return this.f25002c.getAlgorithmName() + "withRSA";
    }

    @Override // bc.org.bouncycastle.crypto.Signer
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.f25003d = z10;
        AsymmetricKeyParameter asymmetricKeyParameter = cipherParameters instanceof l4 ? (AsymmetricKeyParameter) ((l4) cipherParameters).a() : (AsymmetricKeyParameter) cipherParameters;
        if (z10 && !asymmetricKeyParameter.isPrivate()) {
            throw new IllegalArgumentException("signing requires private key");
        }
        if (!z10 && asymmetricKeyParameter.isPrivate()) {
            throw new IllegalArgumentException("verification requires public key");
        }
        reset();
        this.f25000a.init(z10, cipherParameters);
    }

    @Override // bc.org.bouncycastle.crypto.Signer
    public void reset() {
        this.f25002c.reset();
    }

    @Override // bc.org.bouncycastle.crypto.Signer
    public void update(byte b10) {
        this.f25002c.update(b10);
    }

    @Override // bc.org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        if (this.f25003d) {
            throw new IllegalStateException("RSADigestSigner not initialised for verification");
        }
        Digest digest = this.f25002c;
        int digestSize = digest.getDigestSize();
        byte[] bArr2 = new byte[digestSize];
        digest.doFinal(bArr2, 0);
        try {
            byte[] bArrA = this.f25000a.a(bArr, 0, bArr.length);
            byte[] encoded = new l2(this.f25001b, bArr2).getEncoded(ASN1Encoding.DER);
            if (bArrA.length == encoded.length) {
                return Arrays.constantTimeAreEqual(bArrA, encoded);
            }
            if (bArrA.length != encoded.length - 2) {
                Arrays.constantTimeAreEqual(encoded, encoded);
                return false;
            }
            int length = (bArrA.length - digestSize) - 2;
            int length2 = (encoded.length - digestSize) - 2;
            encoded[1] = (byte) (encoded[1] - 2);
            encoded[3] = (byte) (encoded[3] - 2);
            int i10 = 0;
            for (int i11 = 0; i11 < digestSize; i11++) {
                i10 |= bArrA[length + i11] ^ encoded[length2 + i11];
            }
            for (int i12 = 0; i12 < length; i12++) {
                i10 |= bArrA[i12] ^ encoded[i12];
            }
            return i10 == 0;
        } catch (Exception unused) {
        }
    }

    public RSADigestSigner(Digest digest, p pVar) {
        this.f25000a = new i4(new r4());
        this.f25002c = digest;
        this.f25001b = new b0(pVar, c1.f65958p0);
    }

    @Override // bc.org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i10, int i11) {
        this.f25002c.update(bArr, i10, i11);
    }
}
