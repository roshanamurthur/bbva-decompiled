package org.bouncycastle.crypto.generators;

import androidx.camera.core.impl.utils.b;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes4.dex */
public class PKCS5S1ParametersGenerator extends PBEParametersGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f88782a;

    public PKCS5S1ParametersGenerator(Digest digest) {
        this.f88782a = digest;
    }

    public final byte[] a() {
        Digest digest = this.f88782a;
        int digestSize = digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        byte[] bArr2 = this.password;
        digest.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = this.salt;
        digest.update(bArr3, 0, bArr3.length);
        digest.doFinal(bArr, 0);
        for (int i10 = 1; i10 < this.iterationCount; i10++) {
            digest.update(bArr, 0, digestSize);
            digest.doFinal(bArr, 0);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedMacParameters(int i10) {
        return generateDerivedParameters(i10);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i10) {
        int i11 = i10 / 8;
        if (i11 <= this.f88782a.getDigestSize()) {
            return new KeyParameter(a(), 0, i11);
        }
        throw new IllegalArgumentException(b.a("Can't generate a derived key ", i11, " bytes long."));
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i10, int i11) {
        int i12 = i10 / 8;
        int i13 = i11 / 8;
        int i14 = i12 + i13;
        if (i14 > this.f88782a.getDigestSize()) {
            throw new IllegalArgumentException(b.a("Can't generate a derived key ", i14, " bytes long."));
        }
        byte[] bArrA = a();
        return new ParametersWithIV(new KeyParameter(bArrA, 0, i12), bArrA, i12, i13);
    }
}
