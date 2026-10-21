package org.bouncycastle.pqc.crypto.newhope;

import b4.f;
import java.security.SecureRandom;
import kotlin.UShort;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import te.d;

/* JADX INFO: loaded from: classes13.dex */
public class NHKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecureRandom f91195a;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        byte[] bArr = new byte[1824];
        short[] sArr = new short[1024];
        SecureRandom secureRandom = this.f91195a;
        byte[] bArr2 = new byte[32];
        secureRandom.nextBytes(bArr2);
        androidx.collection.b.c(bArr2);
        short[] sArr2 = new short[1024];
        androidx.collection.b.a(bArr2, sArr2);
        byte[] bArr3 = new byte[32];
        secureRandom.nextBytes(bArr3);
        d.e(sArr, bArr3, (byte) 0);
        short[] sArr3 = b.f91203c;
        for (int i10 = 0; i10 < 1024; i10++) {
            sArr[i10] = f.c((sArr[i10] & UShort.MAX_VALUE) * (65535 & sArr3[i10]));
        }
        short[] sArr4 = b.f91201a;
        a.a(sArr, sArr4);
        short[] sArr5 = new short[1024];
        d.e(sArr5, bArr3, (byte) 1);
        for (int i11 = 0; i11 < 1024; i11++) {
            sArr5[i11] = f.c((sArr5[i11] & UShort.MAX_VALUE) * (sArr3[i11] & UShort.MAX_VALUE));
        }
        a.a(sArr5, sArr4);
        short[] sArr6 = new short[1024];
        d.g(sArr2, sArr, sArr6);
        short[] sArr7 = new short[1024];
        d.a(sArr6, sArr5, sArr7);
        d.h(bArr, sArr7);
        System.arraycopy(bArr2, 0, bArr, 1792, 32);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NHPublicKeyParameters(bArr), (AsymmetricKeyParameter) new NHPrivateKeyParameters(sArr));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.f91195a = keyGenerationParameters.getRandom();
    }
}
