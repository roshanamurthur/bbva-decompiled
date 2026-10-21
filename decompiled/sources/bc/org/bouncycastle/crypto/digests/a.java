package bc.org.bouncycastle.crypto.digests;

import com.vasco.digipass.sdk.utils.utilities.obfuscated.k4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.p3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.x2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements x2, p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f24930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f24932c;

    public a() {
        this.f24930a = new byte[4];
        this.f24931b = 0;
    }

    public abstract void a();

    public abstract void a(long j10);

    public void a(a aVar) {
        byte[] bArr = aVar.f24930a;
        System.arraycopy(bArr, 0, this.f24930a, 0, bArr.length);
        this.f24931b = aVar.f24931b;
        this.f24932c = aVar.f24932c;
    }

    public abstract void a(byte[] bArr, int i10);

    public void finish() {
        long j10 = this.f24932c << 3;
        update((byte) -128);
        while (this.f24931b != 0) {
            update((byte) 0);
        }
        a(j10);
        a();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.x2
    public int getByteLength() {
        return 64;
    }

    @Override // bc.org.bouncycastle.crypto.Digest
    public void reset() {
        this.f24932c = 0L;
        this.f24931b = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f24930a;
            if (i10 >= bArr.length) {
                return;
            }
            bArr[i10] = 0;
            i10++;
        }
    }

    @Override // bc.org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        int i10 = this.f24931b;
        int i11 = i10 + 1;
        this.f24931b = i11;
        byte[] bArr = this.f24930a;
        bArr[i10] = b10;
        if (i11 == bArr.length) {
            a(bArr, 0);
            this.f24931b = 0;
        }
        this.f24932c++;
    }

    public a(a aVar) {
        this.f24930a = new byte[4];
        a(aVar);
    }

    public void a(byte[] bArr) {
        System.arraycopy(this.f24930a, 0, bArr, 0, this.f24931b);
        k4.a(this.f24931b, bArr, 4);
        k4.a(this.f24932c, bArr, 8);
    }

    @Override // bc.org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        int iMax = Math.max(0, i11);
        int i13 = this.f24931b;
        byte[] bArr2 = this.f24930a;
        if (i13 != 0) {
            int i14 = 0;
            while (true) {
                if (i14 >= iMax) {
                    i12 = i14;
                    break;
                }
                int i15 = this.f24931b;
                int i16 = i15 + 1;
                this.f24931b = i16;
                int i17 = i14 + 1;
                bArr2[i15] = bArr[i14 + i10];
                if (i16 == 4) {
                    a(bArr2, 0);
                    this.f24931b = 0;
                    i12 = i17;
                    break;
                }
                i14 = i17;
            }
        }
        int i18 = ((iMax - i12) & (-4)) + i12;
        while (i12 < i18) {
            a(bArr, i10 + i12);
            i12 += 4;
        }
        while (i12 < iMax) {
            int i19 = this.f24931b;
            this.f24931b = i19 + 1;
            bArr2[i19] = bArr[i12 + i10];
            i12++;
        }
        this.f24932c += (long) iMax;
    }

    public a(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        this.f24930a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        this.f24931b = k4.a(bArr, 4);
        this.f24932c = k4.b(bArr, 8);
    }
}
