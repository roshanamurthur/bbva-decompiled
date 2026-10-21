package bc.org.bouncycastle.crypto.engines;

import bc.org.bouncycastle.crypto.CipherParameters;
import bc.org.bouncycastle.crypto.DataLengthException;
import bc.org.bouncycastle.crypto.params.KeyParameter;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.h4;

/* JADX INFO: loaded from: classes2.dex */
public class DESedeEngine extends DESEngine {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f24964o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int[] f24965p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int[] f24966q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f24967r;

    @Override // bc.org.bouncycastle.crypto.engines.DESEngine, bc.org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "DESede";
    }

    @Override // bc.org.bouncycastle.crypto.engines.DESEngine, bc.org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // bc.org.bouncycastle.crypto.engines.DESEngine, bc.org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to DESede init - ".concat(cipherParameters.getClass().getName()));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 24 && key.length != 16) {
            throw new IllegalArgumentException("key size must be 16 or 24 bytes.");
        }
        this.f24967r = z10;
        byte[] bArr = new byte[8];
        System.arraycopy(key, 0, bArr, 0, 8);
        this.f24964o = a(z10, bArr);
        byte[] bArr2 = new byte[8];
        System.arraycopy(key, 8, bArr2, 0, 8);
        this.f24965p = a(!z10, bArr2);
        if (key.length != 24) {
            this.f24966q = this.f24964o;
            return;
        }
        byte[] bArr3 = new byte[8];
        System.arraycopy(key, 16, bArr3, 0, 8);
        this.f24966q = a(z10, bArr3);
    }

    @Override // bc.org.bouncycastle.crypto.engines.DESEngine, bc.org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArr = this.f24964o;
        if (iArr == null) {
            throw new IllegalStateException("DESede engine not initialised");
        }
        if (i10 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 8 > bArr2.length) {
            throw new h4("output buffer too short");
        }
        byte[] bArr3 = new byte[8];
        if (this.f24967r) {
            a(iArr, bArr, i10, bArr3, 0);
            a(this.f24965p, bArr3, 0, bArr3, 0);
            a(this.f24966q, bArr3, 0, bArr2, i11);
        } else {
            a(this.f24966q, bArr, i10, bArr3, 0);
            a(this.f24965p, bArr3, 0, bArr3, 0);
            a(this.f24964o, bArr3, 0, bArr2, i11);
        }
        return 8;
    }

    @Override // bc.org.bouncycastle.crypto.engines.DESEngine, bc.org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
