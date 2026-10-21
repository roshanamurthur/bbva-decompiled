package org.bouncycastle.pqc.crypto.gmss;

import ad.d;
import androidx.appcompat.widget.a;
import androidx.appcompat.widget.o1;
import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.c;
import androidx.camera.core.processing.f;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes13.dex */
public class GMSSLeaf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Digest f90978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f90980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GMSSRandom f90981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f90982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f90983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f90984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f90985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f90986i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f90987j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f90988k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f90989l;
    public byte[] m;

    public GMSSLeaf(Digest digest, int i10, int i11, byte[] bArr) {
        this.f90987j = i10;
        this.f90978a = digest;
        this.f90981d = new GMSSRandom(digest);
        int digestSize = digest.getDigestSize();
        this.f90979b = digestSize;
        double d2 = i10;
        int iCeil = (int) Math.ceil(((double) (digestSize << 3)) / d2);
        int i12 = 2;
        int i13 = 1;
        while (i12 < (iCeil << i10) + 1) {
            i12 <<= 1;
            i13++;
        }
        int iCeil2 = iCeil + ((int) Math.ceil(((double) i13) / d2));
        this.f90980c = iCeil2;
        int i14 = 1 << i10;
        this.f90986i = i14;
        this.f90988k = (int) Math.ceil(((double) ((((i14 - 1) * iCeil2) + 1) + iCeil2)) / ((double) i11));
        this.f90989l = new byte[digestSize];
        this.f90982e = new byte[digestSize];
        this.m = new byte[digestSize];
        this.f90983f = new byte[digestSize * iCeil2];
        a(bArr);
    }

    public final void a(byte[] bArr) {
        this.f90984g = 0;
        this.f90985h = 0;
        byte[] bArr2 = new byte[this.f90979b];
        System.arraycopy(bArr, 0, bArr2, 0, this.f90989l.length);
        this.f90989l = this.f90981d.nextSeed(bArr2);
    }

    public final GMSSLeaf b() {
        int i10;
        GMSSLeaf gMSSLeaf = new GMSSLeaf();
        Digest digest = this.f90978a;
        gMSSLeaf.f90978a = digest;
        gMSSLeaf.f90979b = this.f90979b;
        gMSSLeaf.f90980c = this.f90980c;
        gMSSLeaf.f90981d = this.f90981d;
        gMSSLeaf.f90982e = Arrays.clone(this.f90982e);
        gMSSLeaf.f90983f = Arrays.clone(this.f90983f);
        gMSSLeaf.f90984g = this.f90984g;
        gMSSLeaf.f90985h = this.f90985h;
        gMSSLeaf.f90986i = this.f90986i;
        gMSSLeaf.f90987j = this.f90987j;
        gMSSLeaf.f90988k = this.f90988k;
        gMSSLeaf.f90989l = Arrays.clone(this.f90989l);
        gMSSLeaf.m = Arrays.clone(this.m);
        byte[] bArr = new byte[digest.getDigestSize()];
        int i11 = 0;
        while (true) {
            int i12 = gMSSLeaf.f90988k;
            if (i11 >= i12 + 10000) {
                StringBuilder sbC = o1.c("unable to updateLeaf in steps: ", i12, " ");
                sbC.append(gMSSLeaf.f90984g);
                sbC.append(" ");
                sbC.append(gMSSLeaf.f90985h);
                throw new IllegalStateException(sbC.toString());
            }
            int i13 = gMSSLeaf.f90984g;
            int i14 = gMSSLeaf.f90980c;
            byte[] bArr2 = gMSSLeaf.f90983f;
            int i15 = gMSSLeaf.f90986i;
            if (i13 == i14 && gMSSLeaf.f90985h == i15 - 1) {
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[digest.getDigestSize()];
                gMSSLeaf.f90982e = bArr3;
                digest.doFinal(bArr3, 0);
                return gMSSLeaf;
            }
            if (i13 == 0 || gMSSLeaf.f90985h == (i10 = i15 - 1)) {
                gMSSLeaf.f90984g = i13 + 1;
                gMSSLeaf.f90985h = 0;
                gMSSLeaf.m = gMSSLeaf.f90981d.nextSeed(gMSSLeaf.f90989l);
            } else {
                byte[] bArr4 = gMSSLeaf.m;
                digest.update(bArr4, 0, bArr4.length);
                gMSSLeaf.m = bArr;
                digest.doFinal(bArr, 0);
                int i16 = gMSSLeaf.f90985h + 1;
                gMSSLeaf.f90985h = i16;
                if (i16 == i10) {
                    byte[] bArr5 = gMSSLeaf.m;
                    int i17 = gMSSLeaf.f90984g - 1;
                    int i18 = gMSSLeaf.f90979b;
                    System.arraycopy(bArr5, 0, bArr2, i17 * i18, i18);
                }
            }
            i11++;
        }
    }

    public byte[] getLeaf() {
        return Arrays.clone(this.f90982e);
    }

    public byte[][] getStatByte() {
        return new byte[][]{this.m, this.f90989l, this.f90983f, this.f90982e};
    }

    public int[] getStatInt() {
        return new int[]{this.f90984g, this.f90985h, this.f90988k, this.f90987j};
    }

    public String toString() {
        String strC = "";
        for (int i10 = 0; i10 < 4; i10++) {
            strC = a.c(c.d(strC), getStatInt()[i10], " ");
        }
        StringBuilder sbE = f.e(strC, " ");
        sbE.append(this.f90979b);
        sbE.append(" ");
        sbE.append(this.f90980c);
        sbE.append(" ");
        String strC2 = a.c(sbE, this.f90986i, " ");
        byte[][] statByte = getStatByte();
        for (int i11 = 0; i11 < 4; i11++) {
            strC2 = statByte[i11] != null ? d.f(c.d(strC2), new String(Hex.encode(statByte[i11])), " ") : u.f(strC2, "null ");
        }
        return strC2;
    }

    public GMSSLeaf(Digest digest, byte[][] bArr, int[] iArr) {
        this.f90984g = iArr[0];
        this.f90985h = iArr[1];
        this.f90988k = iArr[2];
        int i10 = iArr[3];
        this.f90987j = i10;
        this.f90978a = digest;
        this.f90981d = new GMSSRandom(digest);
        int digestSize = digest.getDigestSize();
        this.f90979b = digestSize;
        double d2 = i10;
        int iCeil = (int) Math.ceil(((double) (digestSize << 3)) / d2);
        int i11 = 1;
        int i12 = 2;
        while (i12 < (iCeil << i10) + 1) {
            i12 <<= 1;
            i11++;
        }
        this.f90980c = iCeil + ((int) Math.ceil(((double) i11) / d2));
        this.f90986i = 1 << i10;
        this.m = bArr[0];
        this.f90989l = bArr[1];
        this.f90983f = bArr[2];
        this.f90982e = bArr[3];
    }
}
