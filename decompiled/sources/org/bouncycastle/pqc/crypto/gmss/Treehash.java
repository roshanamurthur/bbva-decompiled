package org.bouncycastle.pqc.crypto.gmss;

import ad.d;
import androidx.appcompat.widget.a;
import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.c;
import androidx.camera.core.processing.f;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Vector;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes13.dex */
public class Treehash {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Vector f91054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Vector f91055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f91056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f91057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f91058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f91059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f91060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f91061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f91062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f91063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Digest f91064l;

    public Treehash(Vector vector, int i10, Digest digest) {
        this.f91054b = vector;
        this.f91053a = i10;
        this.f91056d = null;
        this.f91061i = false;
        this.f91062j = false;
        this.f91063k = false;
        this.f91064l = digest;
        this.f91058f = new byte[digest.getDigestSize()];
        this.f91057e = new byte[digest.getDigestSize()];
    }

    public void destroy() {
        this.f91061i = false;
        this.f91062j = false;
        this.f91056d = null;
        this.f91059g = 0;
        this.f91060h = -1;
    }

    public byte[] getFirstNode() {
        return this.f91056d;
    }

    public int getFirstNodeHeight() {
        return this.f91056d == null ? this.f91053a : this.f91060h;
    }

    public int getLowestNodeHeight() {
        if (this.f91056d == null) {
            return this.f91053a;
        }
        return this.f91059g == 0 ? this.f91060h : Math.min(this.f91060h, ((Integer) this.f91055c.lastElement()).intValue());
    }

    public byte[] getSeedActive() {
        return this.f91057e;
    }

    public byte[][] getStatByte() {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f91059g + 3, this.f91064l.getDigestSize());
        bArr[0] = this.f91056d;
        bArr[1] = this.f91057e;
        bArr[2] = this.f91058f;
        for (int i10 = 0; i10 < this.f91059g; i10++) {
            bArr[i10 + 3] = (byte[]) this.f91054b.elementAt(i10);
        }
        return bArr;
    }

    public int[] getStatInt() {
        int i10 = this.f91059g;
        int[] iArr = new int[i10 + 6];
        iArr[0] = this.f91053a;
        iArr[1] = i10;
        iArr[2] = this.f91060h;
        if (this.f91062j) {
            iArr[3] = 1;
        } else {
            iArr[3] = 0;
        }
        if (this.f91061i) {
            iArr[4] = 1;
        } else {
            iArr[4] = 0;
        }
        if (this.f91063k) {
            iArr[5] = 1;
        } else {
            iArr[5] = 0;
        }
        for (int i11 = 0; i11 < this.f91059g; i11++) {
            iArr[i11 + 6] = ((Integer) this.f91055c.elementAt(i11)).intValue();
        }
        return iArr;
    }

    public Vector getTailStack() {
        return this.f91054b;
    }

    public void initialize() {
        if (!this.f91063k) {
            System.err.println("Seed " + this.f91053a + " not initialized");
            return;
        }
        this.f91055c = new Vector();
        this.f91059g = 0;
        this.f91056d = null;
        this.f91060h = -1;
        this.f91061i = true;
        System.arraycopy(this.f91058f, 0, this.f91057e, 0, this.f91064l.getDigestSize());
    }

    public void initializeSeed(byte[] bArr) {
        System.arraycopy(bArr, 0, this.f91058f, 0, this.f91064l.getDigestSize());
        this.f91063k = true;
    }

    public void setFirstNode(byte[] bArr) {
        if (!this.f91061i) {
            initialize();
        }
        this.f91056d = bArr;
        this.f91060h = this.f91053a;
        this.f91062j = true;
    }

    public String toString() {
        String strF = "Treehash    : ";
        for (int i10 = 0; i10 < this.f91059g + 6; i10++) {
            strF = a.c(c.d(strF), getStatInt()[i10], " ");
        }
        for (int i11 = 0; i11 < this.f91059g + 3; i11++) {
            strF = getStatByte()[i11] != null ? d.f(c.d(strF), new String(Hex.encode(getStatByte()[i11])), " ") : u.f(strF, "null ");
        }
        StringBuilder sbE = f.e(strF, "  ");
        sbE.append(this.f91064l.getDigestSize());
        return sbE.toString();
    }

    public void update(GMSSRandom gMSSRandom, byte[] bArr) {
        Vector vector;
        PrintStream printStream;
        String str;
        if (this.f91062j) {
            printStream = System.err;
            str = "No more update possible for treehash instance!";
        } else {
            if (this.f91061i) {
                Digest digest = this.f91064l;
                byte[] bArr2 = new byte[digest.getDigestSize()];
                gMSSRandom.nextSeed(this.f91057e);
                if (this.f91056d == null) {
                    this.f91056d = bArr;
                    this.f91060h = 0;
                } else {
                    int i10 = 0;
                    while (true) {
                        int i11 = this.f91059g;
                        vector = this.f91054b;
                        if (i11 <= 0 || i10 != ((Integer) this.f91055c.lastElement()).intValue()) {
                            break;
                        }
                        int digestSize = digest.getDigestSize() << 1;
                        byte[] bArr3 = new byte[digestSize];
                        System.arraycopy(vector.lastElement(), 0, bArr3, 0, digest.getDigestSize());
                        vector.removeElementAt(vector.size() - 1);
                        Vector vector2 = this.f91055c;
                        vector2.removeElementAt(vector2.size() - 1);
                        System.arraycopy(bArr, 0, bArr3, digest.getDigestSize(), digest.getDigestSize());
                        digest.update(bArr3, 0, digestSize);
                        bArr = new byte[digest.getDigestSize()];
                        digest.doFinal(bArr, 0);
                        i10++;
                        this.f91059g--;
                    }
                    vector.addElement(bArr);
                    this.f91055c.addElement(Integers.valueOf(i10));
                    this.f91059g++;
                    if (((Integer) this.f91055c.lastElement()).intValue() == this.f91060h) {
                        int digestSize2 = digest.getDigestSize() << 1;
                        byte[] bArr4 = new byte[digestSize2];
                        System.arraycopy(this.f91056d, 0, bArr4, 0, digest.getDigestSize());
                        System.arraycopy(vector.lastElement(), 0, bArr4, digest.getDigestSize(), digest.getDigestSize());
                        vector.removeElementAt(vector.size() - 1);
                        Vector vector3 = this.f91055c;
                        vector3.removeElementAt(vector3.size() - 1);
                        digest.update(bArr4, 0, digestSize2);
                        byte[] bArr5 = new byte[digest.getDigestSize()];
                        this.f91056d = bArr5;
                        digest.doFinal(bArr5, 0);
                        this.f91060h++;
                        this.f91059g = 0;
                    }
                }
                if (this.f91060h == this.f91053a) {
                    this.f91062j = true;
                    return;
                }
                return;
            }
            printStream = System.err;
            str = "Treehash instance not initialized before update";
        }
        printStream.println(str);
    }

    public void updateNextSeed(GMSSRandom gMSSRandom) {
        gMSSRandom.nextSeed(this.f91058f);
    }

    public boolean wasFinished() {
        return this.f91062j;
    }

    public boolean wasInitialized() {
        return this.f91061i;
    }

    public Treehash(Digest digest, byte[][] bArr, int[] iArr) {
        this.f91064l = digest;
        this.f91053a = iArr[0];
        this.f91059g = iArr[1];
        this.f91060h = iArr[2];
        if (iArr[3] == 1) {
            this.f91062j = true;
        } else {
            this.f91062j = false;
        }
        if (iArr[4] == 1) {
            this.f91061i = true;
        } else {
            this.f91061i = false;
        }
        if (iArr[5] == 1) {
            this.f91063k = true;
        } else {
            this.f91063k = false;
        }
        this.f91055c = new Vector();
        for (int i10 = 0; i10 < this.f91059g; i10++) {
            this.f91055c.addElement(Integers.valueOf(iArr[i10 + 6]));
        }
        this.f91056d = bArr[0];
        this.f91057e = bArr[1];
        this.f91058f = bArr[2];
        this.f91054b = new Vector();
        for (int i11 = 0; i11 < this.f91059g; i11++) {
            this.f91054b.addElement(bArr[i11 + 3]);
        }
    }
}
