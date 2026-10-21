package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.engines.Zuc128CoreEngine;

/* JADX INFO: loaded from: classes4.dex */
public final class Zuc128Mac implements Mac {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f88940b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Zuc128CoreEngine f88942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88944f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f88939a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f88941c = new int[2];

    public static class a extends Zuc128CoreEngine {
        public final int i() {
            return super.makeKeyStreamWord();
        }
    }

    public final void a() {
        int i10 = 0;
        this.f88940b = 0;
        while (true) {
            int[] iArr = this.f88941c;
            if (i10 >= iArr.length - 1) {
                this.f88943e = iArr.length - 1;
                this.f88944f = 3;
                return;
            } else {
                iArr[i10] = this.f88939a.i();
                i10++;
            }
        }
    }

    public final void b() {
        int i10 = (this.f88944f + 1) % 4;
        this.f88944f = i10;
        if (i10 == 0) {
            int i11 = this.f88943e;
            int i12 = this.f88939a.i();
            int[] iArr = this.f88941c;
            iArr[i11] = i12;
            this.f88943e = (this.f88943e + 1) % iArr.length;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) {
        int i11;
        b();
        int i12 = this.f88940b;
        int i13 = this.f88944f;
        int i14 = i13 * 8;
        int i15 = this.f88943e;
        int[] iArr = this.f88941c;
        int i16 = iArr[i15];
        if (i14 != 0) {
            i16 = (i16 << i14) | (iArr[(i15 + 1) % iArr.length] >>> (32 - i14));
        }
        int i17 = i12 ^ i16;
        this.f88940b = i17;
        if (i13 != 0) {
            i11 = this.f88939a.i();
        } else {
            int length = (i15 + 1) % iArr.length;
            this.f88943e = length;
            i11 = iArr[length];
        }
        int i18 = i17 ^ i11;
        this.f88940b = i18;
        Zuc128CoreEngine.encode32be(i18, bArr, i10);
        reset();
        return getMacSize();
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "Zuc128Mac";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 4;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        a aVar = this.f88939a;
        aVar.init(true, cipherParameters);
        this.f88942d = (Zuc128CoreEngine) aVar.copy();
        a();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        Zuc128CoreEngine zuc128CoreEngine = this.f88942d;
        if (zuc128CoreEngine != null) {
            this.f88939a.reset(zuc128CoreEngine);
        }
        a();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) {
        b();
        int i10 = this.f88944f * 8;
        int i11 = 128;
        int i12 = 0;
        while (i11 > 0) {
            if ((b10 & i11) != 0) {
                int i13 = i10 + i12;
                int i14 = this.f88940b;
                int i15 = this.f88943e;
                int[] iArr = this.f88941c;
                int i16 = iArr[i15];
                if (i13 != 0) {
                    i16 = (i16 << i13) | (iArr[(i15 + 1) % iArr.length] >>> (32 - i13));
                }
                this.f88940b = i14 ^ i16;
            }
            i11 >>= 1;
            i12++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            update(bArr[i10 + i12]);
        }
    }
}
