package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.engines.Zuc128CoreEngine;
import org.bouncycastle.crypto.engines.Zuc256CoreEngine;

/* JADX INFO: loaded from: classes4.dex */
public final class Zuc256Mac implements Mac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f88945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f88947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f88948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Zuc256CoreEngine f88949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f88951g;

    public static class a extends Zuc256CoreEngine {
        public final int j() {
            return super.makeKeyStreamWord();
        }
    }

    public Zuc256Mac(int i10) {
        this.f88945a = new a(i10);
        this.f88946b = i10;
        int i11 = i10 / 32;
        this.f88947c = new int[i11];
        this.f88948d = new int[i11 + 1];
    }

    public final void a() {
        a aVar;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f88947c;
            int length = iArr.length;
            aVar = this.f88945a;
            if (i11 >= length) {
                break;
            }
            iArr[i11] = aVar.j();
            i11++;
        }
        while (true) {
            int[] iArr2 = this.f88948d;
            if (i10 >= iArr2.length - 1) {
                this.f88950f = iArr2.length - 1;
                this.f88951g = 3;
                return;
            } else {
                iArr2[i10] = aVar.j();
                i10++;
            }
        }
    }

    public final void b(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = this.f88947c;
            if (i11 >= iArr.length) {
                return;
            }
            int i12 = iArr[i11];
            int i13 = this.f88950f + i11;
            int[] iArr2 = this.f88948d;
            int i14 = iArr2[i13 % iArr2.length];
            if (i10 != 0) {
                i14 = (i14 << i10) | (iArr2[(i13 + 1) % iArr2.length] >>> (32 - i10));
            }
            iArr[i11] = i12 ^ i14;
            i11++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) {
        int i11 = (this.f88951g + 1) % 4;
        this.f88951g = i11;
        if (i11 == 0) {
            this.f88950f = (this.f88950f + 1) % this.f88948d.length;
        }
        b(i11 * 8);
        int i12 = 0;
        while (true) {
            int[] iArr = this.f88947c;
            if (i12 >= iArr.length) {
                reset();
                return getMacSize();
            }
            Zuc128CoreEngine.encode32be(iArr[i12], bArr, (i12 * 4) + i10);
            i12++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "Zuc256Mac-" + this.f88946b;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.f88946b / 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        a aVar = this.f88945a;
        aVar.init(true, cipherParameters);
        this.f88949e = (Zuc256CoreEngine) aVar.copy();
        a();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        Zuc256CoreEngine zuc256CoreEngine = this.f88949e;
        if (zuc256CoreEngine != null) {
            this.f88945a.reset(zuc256CoreEngine);
        }
        a();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) {
        int i10 = (this.f88951g + 1) % 4;
        this.f88951g = i10;
        if (i10 == 0) {
            int i11 = this.f88950f;
            int iJ = this.f88945a.j();
            int[] iArr = this.f88948d;
            iArr[i11] = iJ;
            this.f88950f = (this.f88950f + 1) % iArr.length;
        }
        int i12 = this.f88951g * 8;
        int i13 = 128;
        int i14 = 0;
        while (i13 > 0) {
            if ((b10 & i13) != 0) {
                b(i12 + i14);
            }
            i13 >>= 1;
            i14++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            update(bArr[i10 + i12]);
        }
    }
}
