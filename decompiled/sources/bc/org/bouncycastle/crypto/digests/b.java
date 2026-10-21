package bc.org.bouncycastle.crypto.digests;

import com.vasco.digipass.sdk.utils.utilities.obfuscated.k4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.p3;

/* JADX INFO: loaded from: classes2.dex */
public class b extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f24933i = new int[64];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f24934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f24935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f24937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f24938h;

    static {
        int i10;
        int i11 = 0;
        while (true) {
            if (i11 >= 16) {
                break;
            }
            f24933i[i11] = (2043430169 >>> (32 - i11)) | (2043430169 << i11);
            i11++;
        }
        for (i10 = 16; i10 < 64; i10++) {
            int i12 = i10 % 32;
            f24933i[i10] = (2055708042 >>> (32 - i12)) | (2055708042 << i12);
        }
    }

    public b() {
        this.f24934d = new int[8];
        this.f24935e = new int[16];
        this.f24937g = new int[68];
        this.f24938h = new int[64];
        reset();
    }

    @Override // bc.org.bouncycastle.crypto.digests.a
    public void a(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
        int i12 = this.f24936f;
        this.f24935e[i12] = i11;
        int i13 = i12 + 1;
        this.f24936f = i13;
        if (i13 >= 16) {
            a();
        }
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.p3
    public p3 copy() {
        return new b(this);
    }

    @Override // bc.org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        int[] iArr = this.f24934d;
        k4.a(iArr[0], bArr, i10);
        k4.a(iArr[1], bArr, i10 + 4);
        k4.a(iArr[2], bArr, i10 + 8);
        k4.a(iArr[3], bArr, i10 + 12);
        k4.a(iArr[4], bArr, i10 + 16);
        k4.a(iArr[5], bArr, i10 + 20);
        k4.a(iArr[6], bArr, i10 + 24);
        k4.a(iArr[7], bArr, i10 + 28);
        reset();
        return 32;
    }

    @Override // bc.org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SM3";
    }

    @Override // bc.org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.p3
    public void reset(p3 p3Var) {
        b bVar = (b) p3Var;
        super.a(bVar);
        int[] iArr = bVar.f24934d;
        int[] iArr2 = this.f24934d;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = this.f24935e;
        System.arraycopy(bVar.f24935e, 0, iArr3, 0, iArr3.length);
        this.f24936f = bVar.f24936f;
    }

    @Override // bc.org.bouncycastle.crypto.digests.a
    public void a(long j10) {
        int i10 = this.f24936f;
        int[] iArr = this.f24935e;
        if (i10 > 14) {
            iArr[i10] = 0;
            this.f24936f = i10 + 1;
            a();
        }
        while (true) {
            int i11 = this.f24936f;
            if (i11 < 14) {
                iArr[i11] = 0;
                this.f24936f = i11 + 1;
            } else {
                iArr[i11] = (int) (j10 >>> 32);
                this.f24936f = i11 + 2;
                iArr[i11 + 1] = (int) j10;
                return;
            }
        }
    }

    @Override // bc.org.bouncycastle.crypto.digests.a, bc.org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        int[] iArr = this.f24934d;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.f24936f = 0;
    }

    public b(b bVar) {
        super(bVar);
        int[] iArr = new int[8];
        this.f24934d = iArr;
        this.f24935e = new int[16];
        this.f24937g = new int[68];
        this.f24938h = new int[64];
        System.arraycopy(bVar.f24934d, 0, iArr, 0, iArr.length);
        int[] iArr2 = this.f24935e;
        System.arraycopy(bVar.f24935e, 0, iArr2, 0, iArr2.length);
        this.f24936f = bVar.f24936f;
    }

    @Override // bc.org.bouncycastle.crypto.digests.a
    public void a() {
        int[] iArr;
        int i10;
        int[] iArr2;
        int i11;
        int[] iArr3;
        int i12 = 0;
        while (true) {
            iArr = this.f24937g;
            i10 = 16;
            if (i12 >= 16) {
                break;
            }
            iArr[i12] = this.f24935e[i12];
            i12++;
        }
        for (int i13 = 16; i13 < 68; i13++) {
            int i14 = iArr[i13 - 3];
            int i15 = iArr[i13 - 13];
            int i16 = ((i14 >>> 17) | (i14 << 15)) ^ (iArr[i13 - 16] ^ iArr[i13 - 9]);
            iArr[i13] = (((i16 ^ ((i16 << 15) | (i16 >>> 17))) ^ ((i16 << 23) | (i16 >>> 9))) ^ ((i15 >>> 25) | (i15 << 7))) ^ iArr[i13 - 6];
        }
        int i17 = 0;
        while (true) {
            iArr2 = this.f24938h;
            i11 = 64;
            if (i17 >= 64) {
                break;
            }
            iArr2[i17] = iArr[i17] ^ iArr[i17 + 4];
            i17++;
        }
        int[] iArr4 = this.f24934d;
        int i18 = iArr4[0];
        int i19 = iArr4[1];
        int i20 = iArr4[2];
        int i21 = iArr4[3];
        int i22 = iArr4[4];
        int i23 = iArr4[5];
        int i24 = iArr4[6];
        int i25 = iArr4[7];
        int i26 = 0;
        while (true) {
            iArr3 = f24933i;
            if (i26 >= 16) {
                break;
            }
            int i27 = (i18 << 12) | (i18 >>> 20);
            int i28 = i27 + i22 + iArr3[i26];
            int i29 = (i28 << 7) | (i28 >>> 25);
            int i30 = ((i18 ^ i19) ^ i20) + i21 + (i29 ^ i27) + iArr2[i26];
            int i31 = ((i22 ^ i23) ^ i24) + i25 + i29 + iArr[i26];
            int i32 = (i19 << 9) | (i19 >>> 23);
            int i33 = (i23 << 19) | (i23 >>> 13);
            i26++;
            i19 = i18;
            i18 = i30;
            i21 = i20;
            i20 = i32;
            i23 = i22;
            i22 = (i31 ^ ((i31 << 9) | (i31 >>> 23))) ^ ((i31 << 17) | (i31 >>> 15));
            i25 = i24;
            i24 = i33;
        }
        while (i10 < i11) {
            int i34 = (i18 << 12) | (i18 >>> 20);
            int i35 = i34 + i22 + iArr3[i10];
            int i36 = (i35 << 7) | (i35 >>> 25);
            int i37 = ((i18 & i19) | (i18 & i20) | (i19 & i20)) + i21 + (i36 ^ i34) + iArr2[i10];
            int i38 = (((~i22) & i24) | (i22 & i23)) + i25 + i36 + iArr[i10];
            int i39 = (i19 >>> 23) | (i19 << 9);
            int i40 = (i23 << 19) | (i23 >>> 13);
            int i41 = (i38 ^ ((i38 << 9) | (i38 >>> 23))) ^ ((i38 << 17) | (i38 >>> 15));
            i10++;
            i23 = i22;
            i25 = i24;
            i22 = i41;
            i24 = i40;
            i11 = 64;
            i19 = i18;
            i18 = i37;
            i21 = i20;
            i20 = i39;
        }
        iArr4[0] = iArr4[0] ^ i18;
        iArr4[1] = iArr4[1] ^ i19;
        iArr4[2] = iArr4[2] ^ i20;
        iArr4[3] = iArr4[3] ^ i21;
        iArr4[4] = iArr4[4] ^ i22;
        iArr4[5] = iArr4[5] ^ i23;
        iArr4[6] = iArr4[6] ^ i24;
        iArr4[7] = iArr4[7] ^ i25;
        this.f24936f = 0;
    }
}
