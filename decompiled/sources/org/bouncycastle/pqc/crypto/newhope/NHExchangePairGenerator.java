package org.bouncycastle.pqc.crypto.newhope;

import a4.c;
import b4.f;
import com.google.android.material.internal.ViewUtils;
import java.security.SecureRandom;
import kotlin.UShort;
import org.bouncycastle.crypto.engines.ChaChaEngine;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.pqc.crypto.ExchangePair;
import org.bouncycastle.pqc.crypto.ExchangePairGenerator;
import te.d;

/* JADX INFO: loaded from: classes13.dex */
public class NHExchangePairGenerator implements ExchangePairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecureRandom f91194a;

    public NHExchangePairGenerator(SecureRandom secureRandom) {
        this.f91194a = secureRandom;
    }

    @Override // org.bouncycastle.pqc.crypto.ExchangePairGenerator
    public ExchangePair GenerateExchange(AsymmetricKeyParameter asymmetricKeyParameter) {
        return generateExchange(asymmetricKeyParameter);
    }

    @Override // org.bouncycastle.pqc.crypto.ExchangePairGenerator
    public ExchangePair generateExchange(AsymmetricKeyParameter asymmetricKeyParameter) {
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[2048];
        byte[] bArr3 = ((NHPublicKeyParameters) asymmetricKeyParameter).f91199q0;
        short[] sArr = new short[1024];
        byte[] bArr4 = new byte[32];
        d.c(bArr3, sArr);
        int i10 = 0;
        System.arraycopy(bArr3, 1792, bArr4, 0, 32);
        short[] sArr2 = new short[1024];
        androidx.collection.b.a(bArr4, sArr2);
        byte[] bArr5 = new byte[32];
        this.f91194a.nextBytes(bArr5);
        short[] sArr3 = new short[1024];
        d.e(sArr3, bArr5, (byte) 0);
        short[] sArr4 = b.f91203c;
        for (int i11 = 0; i11 < 1024; i11++) {
            sArr3[i11] = f.c((sArr3[i11] & UShort.MAX_VALUE) * (65535 & sArr4[i11]));
        }
        short[] sArr5 = b.f91201a;
        a.a(sArr3, sArr5);
        short[] sArr6 = new short[1024];
        int i12 = 1;
        d.e(sArr6, bArr5, (byte) 1);
        for (int i13 = 0; i13 < 1024; i13++) {
            sArr6[i13] = f.c((sArr6[i13] & UShort.MAX_VALUE) * (sArr4[i13] & UShort.MAX_VALUE));
        }
        a.a(sArr6, sArr5);
        short[] sArr7 = new short[1024];
        d.g(sArr2, sArr3, sArr7);
        d.a(sArr7, sArr6, sArr7);
        short[] sArr8 = new short[1024];
        d.g(sArr, sArr3, sArr8);
        d.d(sArr8);
        short[] sArr9 = new short[1024];
        d.e(sArr9, bArr5, (byte) 2);
        d.a(sArr8, sArr9, sArr8);
        short[] sArr10 = new short[1024];
        short s4 = 8;
        byte[] bArr6 = new byte[8];
        bArr6[0] = 3;
        byte[] bArr7 = new byte[32];
        ChaChaEngine chaChaEngine = new ChaChaEngine(20);
        chaChaEngine.init(true, new ParametersWithIV(new KeyParameter(bArr5), bArr6));
        chaChaEngine.processBytes(bArr7, 0, 32, bArr7, 0);
        int[] iArr = new int[8];
        int i14 = 0;
        while (i14 < 256) {
            int i15 = ((bArr7[i14 >>> 3] >>> (i14 & 7)) & i12) * 4;
            int i16 = i14 + 256;
            int i17 = i14 + 512;
            int iA = c.a(2, 6, (sArr8[i17] * 8) + i15, iArr) + c.a(i12, 5, (sArr8[i16] * 8) + i15, iArr) + c.a(i10, 4, (sArr8[i14] * s4) + i15, iArr);
            int i18 = i14 + ViewUtils.EDGE_TO_EDGE_FLAGS;
            int iA2 = (24577 - (c.a(3, 7, (sArr8[i18] * 8) + i15, iArr) + iA)) >> 31;
            int i19 = ~iA2;
            int i20 = (i19 & iArr[0]) ^ (iA2 & iArr[4]);
            int i21 = (i19 & iArr[1]) ^ (iA2 & iArr[5]);
            int i22 = (i19 & iArr[2]) ^ (iA2 & iArr[6]);
            int i23 = (iArr[7] & iA2) ^ (i19 & iArr[3]);
            sArr10[i14] = (short) ((i20 - i23) & 3);
            sArr10[i16] = (short) ((i21 - i23) & 3);
            sArr10[i17] = (short) ((i22 - i23) & 3);
            sArr10[i18] = (short) (((i23 * 2) + (-iA2)) & 3);
            i14++;
            i10 = 0;
            i12 = 1;
            s4 = 8;
        }
        d.h(bArr2, sArr7);
        while (i10 < 256) {
            int i24 = i10 * 4;
            bArr2[i10 + 1792] = (byte) ((sArr10[i24 + 3] << 6) | sArr10[i24] | (sArr10[i24 + 1] << 2) | (sArr10[i24 + 2] << 4));
            i10++;
        }
        c.c(bArr, sArr8, sArr10);
        androidx.collection.b.c(bArr);
        return new ExchangePair(new NHPublicKeyParameters(bArr2), bArr);
    }
}
