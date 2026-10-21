package org.bouncycastle.pqc.crypto.gmss;

import ad.d;
import androidx.appcompat.widget.a;
import androidx.camera.core.impl.utils.c;
import androidx.camera.core.processing.f;
import java.lang.reflect.Array;
import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes13.dex */
public class GMSSRootCalc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Treehash[] f91005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Vector[] f91006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f91007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[][] f91008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f91009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Vector f91010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Vector f91011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Digest f91012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final GMSSDigestProvider f91013k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f91014l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f91015n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f91016o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f91017p;

    public GMSSRootCalc(int i10, int i11, GMSSDigestProvider gMSSDigestProvider) {
        this.f91003a = i10;
        this.f91013k = gMSSDigestProvider;
        Digest digest = gMSSDigestProvider.get();
        this.f91012j = digest;
        int digestSize = digest.getDigestSize();
        this.f91004b = digestSize;
        this.f91009g = i11;
        this.f91014l = new int[i10];
        this.f91008f = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i10, digestSize);
        this.f91007e = new byte[digestSize];
        this.f91006d = new Vector[i11 - 1];
        for (int i12 = 0; i12 < i11 - 1; i12++) {
            this.f91006d[i12] = new Vector();
        }
    }

    public byte[][] getAuthPath() {
        byte[][] bArr = this.f91008f;
        if (bArr == null) {
            return null;
        }
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i10 = 0; i10 != bArr.length; i10++) {
            bArr2[i10] = Arrays.clone(bArr[i10]);
        }
        return bArr2;
    }

    public Vector[] getRetain() {
        Vector[] vectorArr = this.f91006d;
        if (vectorArr == null) {
            return null;
        }
        Vector[] vectorArr2 = new Vector[vectorArr.length];
        for (int i10 = 0; i10 != vectorArr.length; i10++) {
            vectorArr2[i10] = new Vector();
            Enumeration enumerationElements = vectorArr[i10].elements();
            while (enumerationElements.hasMoreElements()) {
                vectorArr2[i10].addElement(enumerationElements.nextElement());
            }
        }
        return vectorArr2;
    }

    public byte[] getRoot() {
        return Arrays.clone(this.f91007e);
    }

    public Vector getStack() {
        Vector vector = new Vector();
        Enumeration enumerationElements = this.f91010h.elements();
        while (enumerationElements.hasMoreElements()) {
            vector.addElement(enumerationElements.nextElement());
        }
        return vector;
    }

    public byte[][] getStatByte() {
        Vector vector = this.f91010h;
        int size = vector == null ? 0 : vector.size();
        int i10 = this.f91003a;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i10 + 1 + size, 64);
        bArr[0] = this.f91007e;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i11 + 1;
            bArr[i12] = this.f91008f[i11];
            i11 = i12;
        }
        for (int i13 = 0; i13 < size; i13++) {
            bArr[i10 + 1 + i13] = (byte[]) this.f91010h.elementAt(i13);
        }
        return bArr;
    }

    public int[] getStatInt() {
        Vector vector = this.f91010h;
        int size = vector == null ? 0 : vector.size();
        int i10 = this.f91003a;
        int[] iArr = new int[i10 + 8 + size];
        iArr[0] = i10;
        iArr[1] = this.f91004b;
        iArr[2] = this.f91009g;
        iArr[3] = this.f91016o;
        iArr[4] = this.f91017p;
        if (this.f91015n) {
            iArr[5] = 1;
        } else {
            iArr[5] = 0;
        }
        if (this.m) {
            iArr[6] = 1;
        } else {
            iArr[6] = 0;
        }
        iArr[7] = size;
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11 + 8] = this.f91014l[i11];
        }
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i10 + 8 + i12] = ((Integer) this.f91011i.elementAt(i12)).intValue();
        }
        return iArr;
    }

    public Treehash[] getTreehash() {
        Treehash[] treehashArr = this.f91005c;
        if (treehashArr == null) {
            return null;
        }
        Treehash[] treehashArr2 = new Treehash[treehashArr.length];
        System.arraycopy(treehashArr, 0, treehashArr2, 0, treehashArr.length);
        return treehashArr2;
    }

    public void initialize(Vector vector) {
        int i10 = this.f91003a;
        int i11 = this.f91009g;
        this.f91005c = new Treehash[i10 - i11];
        for (int i12 = 0; i12 < i10 - i11; i12++) {
            this.f91005c[i12] = new Treehash(vector, i12, this.f91013k.get());
        }
        this.f91014l = new int[i10];
        int i13 = this.f91004b;
        this.f91008f = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i10, i13);
        this.f91007e = new byte[i13];
        this.f91010h = new Vector();
        this.f91011i = new Vector();
        this.m = true;
        this.f91015n = false;
        for (int i14 = 0; i14 < i10; i14++) {
            this.f91014l[i14] = -1;
        }
        this.f91006d = new Vector[i11 - 1];
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f91006d[i15] = new Vector();
        }
        this.f91016o = 3;
        this.f91017p = 0;
    }

    public void initializeTreehashSeed(byte[] bArr, int i10) {
        this.f91005c[i10].initializeSeed(bArr);
    }

    public String toString() {
        int i10;
        Vector vector = this.f91010h;
        int size = vector == null ? 0 : vector.size();
        String strF = "";
        int i11 = 0;
        while (true) {
            i10 = this.f91003a;
            if (i11 >= i10 + 8 + size) {
                break;
            }
            strF = a.c(c.d(strF), getStatInt()[i11], " ");
            i11++;
        }
        for (int i12 = 0; i12 < i10 + 1 + size; i12++) {
            strF = d.f(c.d(strF), new String(Hex.encode(getStatByte()[i12])), " ");
        }
        StringBuilder sbE = f.e(strF, "  ");
        sbE.append(this.f91013k.get().getDigestSize());
        return sbE.toString();
    }

    public void update(byte[] bArr) {
        if (this.f91015n) {
            System.out.print("Too much updates for Tree!!");
            return;
        }
        if (!this.m) {
            System.err.println("GMSSRootCalc not initialized!");
            return;
        }
        int[] iArr = this.f91014l;
        int i10 = iArr[0] + 1;
        iArr[0] = i10;
        int i11 = this.f91009g;
        int i12 = this.f91004b;
        int i13 = this.f91003a;
        if (i10 == 1) {
            System.arraycopy(bArr, 0, this.f91008f[0], 0, i12);
        } else if (i10 == 3 && i13 > i11) {
            this.f91005c[0].setFirstNode(bArr);
        }
        int i14 = this.f91014l[0];
        if ((i14 - 3) % 2 == 0 && i14 >= 3 && i13 == i11) {
            this.f91006d[0].insertElementAt(bArr, 0);
        }
        if (this.f91014l[0] == 0) {
            this.f91010h.addElement(bArr);
            this.f91011i.addElement(Integers.valueOf(0));
            return;
        }
        byte[] bArr2 = new byte[i12];
        int i15 = i12 << 1;
        byte[] bArr3 = new byte[i15];
        System.arraycopy(bArr, 0, bArr2, 0, i12);
        int i16 = 0;
        while (this.f91010h.size() > 0 && i16 == ((Integer) this.f91011i.lastElement()).intValue()) {
            System.arraycopy(this.f91010h.lastElement(), 0, bArr3, 0, i12);
            Vector vector = this.f91010h;
            vector.removeElementAt(vector.size() - 1);
            Vector vector2 = this.f91011i;
            vector2.removeElementAt(vector2.size() - 1);
            System.arraycopy(bArr2, 0, bArr3, i12, i12);
            Digest digest = this.f91012j;
            digest.update(bArr3, 0, i15);
            byte[] bArr4 = new byte[digest.getDigestSize()];
            digest.doFinal(bArr4, 0);
            i16++;
            if (i16 < i13) {
                int[] iArr2 = this.f91014l;
                int i17 = iArr2[i16] + 1;
                iArr2[i16] = i17;
                if (i17 == 1) {
                    System.arraycopy(bArr4, 0, this.f91008f[i16], 0, i12);
                }
                if (i16 >= i13 - i11) {
                    if (i16 == 0) {
                        System.out.println("M���P");
                    }
                    int i18 = this.f91014l[i16];
                    if ((i18 - 3) % 2 == 0 && i18 >= 3) {
                        this.f91006d[i16 - (i13 - i11)].insertElementAt(bArr4, 0);
                    }
                } else if (this.f91014l[i16] == 3) {
                    this.f91005c[i16].setFirstNode(bArr4);
                }
            }
            bArr2 = bArr4;
        }
        this.f91010h.addElement(bArr2);
        this.f91011i.addElement(Integers.valueOf(i16));
        if (i16 == i13) {
            this.f91015n = true;
            this.m = false;
            this.f91007e = (byte[]) this.f91010h.lastElement();
        }
    }

    public boolean wasFinished() {
        return this.f91015n;
    }

    public boolean wasInitialized() {
        return this.m;
    }

    public void update(byte[] bArr, byte[] bArr2) {
        int i10 = this.f91017p;
        if (i10 < this.f91003a - this.f91009g && this.f91016o - 2 == this.f91014l[0]) {
            initializeTreehashSeed(bArr, i10);
            this.f91017p++;
            this.f91016o *= 2;
        }
        update(bArr2);
    }
}
