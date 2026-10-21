package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSABlindingParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;

/* JADX INFO: loaded from: classes3.dex */
public class RSABlindingEngine implements AsymmetricBlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f88552a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RSAKeyParameters f88553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BigInteger f88554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f88555d;

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.f88552a.c();
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        return this.f88552a.d();
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        RSABlindingParameters rSABlindingParameters = (RSABlindingParameters) cipherParameters;
        this.f88552a.e(z10, rSABlindingParameters.getPublicKey());
        this.f88555d = z10;
        this.f88553b = rSABlindingParameters.getPublicKey();
        this.f88554c = rSABlindingParameters.getBlindingFactor();
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i10, int i11) {
        BigInteger bigIntegerMod;
        a aVar = this.f88552a;
        BigInteger bigIntegerA = aVar.a(bArr, i10, i11);
        if (this.f88555d) {
            bigIntegerMod = bigIntegerA.multiply(this.f88554c.modPow(this.f88553b.getExponent(), this.f88553b.getModulus())).mod(this.f88553b.getModulus());
        } else {
            BigInteger modulus = this.f88553b.getModulus();
            bigIntegerMod = bigIntegerA.multiply(this.f88554c.modInverse(modulus)).mod(modulus);
        }
        return aVar.b(bigIntegerMod);
    }
}
