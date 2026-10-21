package org.bouncycastle.crypto.modes.gcm;

import java.util.Vector;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class Tables1kGCMExponentiator implements GCMExponentiator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Vector f89167a;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void exponentiateX(long j10, byte[] bArr) {
        long[] jArrOneAsLongs = GCMUtil.oneAsLongs();
        int i10 = 0;
        while (j10 > 0) {
            if ((1 & j10) != 0) {
                int size = this.f89167a.size();
                if (size <= i10) {
                    long[] jArrClone = (long[]) this.f89167a.elementAt(size - 1);
                    do {
                        jArrClone = Arrays.clone(jArrClone);
                        GCMUtil.square(jArrClone, jArrClone);
                        this.f89167a.addElement(jArrClone);
                        size++;
                    } while (size <= i10);
                }
                GCMUtil.multiply(jArrOneAsLongs, (long[]) this.f89167a.elementAt(i10));
            }
            i10++;
            j10 >>>= 1;
        }
        GCMUtil.asBytes(jArrOneAsLongs, bArr);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void init(byte[] bArr) {
        long[] jArrAsLongs = GCMUtil.asLongs(bArr);
        Vector vector = this.f89167a;
        if (vector == null || !Arrays.areEqual(jArrAsLongs, (long[]) vector.elementAt(0))) {
            Vector vector2 = new Vector(8);
            this.f89167a = vector2;
            vector2.addElement(jArrAsLongs);
        }
    }
}
