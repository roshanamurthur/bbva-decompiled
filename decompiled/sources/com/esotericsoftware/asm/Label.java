package com.esotericsoftware.asm;

import h3.p;

/* JADX INFO: loaded from: classes9.dex */
public class Label {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f39926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f39929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Label f39930i;
    public Object info;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p f39931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Label f39932k;

    public final Label a() {
        d dVar = this.f39929h;
        return dVar == null ? this : dVar.f39978a;
    }

    public final void b(int i10, int i11) {
        if (this.f39926e == null) {
            this.f39926e = new int[6];
        }
        int i12 = this.f39925d;
        int[] iArr = this.f39926e;
        if (i12 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f39926e = iArr2;
        }
        int[] iArr3 = this.f39926e;
        int i13 = this.f39925d;
        iArr3[i13] = i10;
        this.f39925d = i13 + 2;
        iArr3[i13 + 1] = i11;
    }

    public final void c(ByteVector byteVector, int i10, boolean z10) {
        if ((this.f39922a & 2) != 0) {
            if (z10) {
                byteVector.putInt(this.f39924c - i10);
                return;
            } else {
                byteVector.putShort(this.f39924c - i10);
                return;
            }
        }
        if (z10) {
            b((-1) - i10, byteVector.f39887b);
            byteVector.putInt(-1);
        } else {
            b(i10, byteVector.f39887b);
            byteVector.putShort(-1);
        }
    }

    public final boolean d(int i10, byte[] bArr) {
        this.f39922a |= 2;
        this.f39924c = i10;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < this.f39925d) {
            int[] iArr = this.f39926e;
            int i12 = i11 + 1;
            int i13 = iArr[i11];
            i11 += 2;
            int i14 = iArr[i12];
            if (i13 >= 0) {
                int i15 = i10 - i13;
                if (i15 < -32768 || i15 > 32767) {
                    int i16 = i14 - 1;
                    int i17 = bArr[i16] & 255;
                    if (i17 <= 168) {
                        bArr[i16] = (byte) (i17 + 49);
                    } else {
                        bArr[i16] = (byte) (i17 + 20);
                    }
                    z10 = true;
                }
                bArr[i14] = (byte) (i15 >>> 8);
                bArr[i14 + 1] = (byte) i15;
            } else {
                int i18 = i13 + i10 + 1;
                bArr[i14] = (byte) (i18 >>> 24);
                bArr[i14 + 1] = (byte) (i18 >>> 16);
                bArr[i14 + 2] = (byte) (i18 >>> 8);
                bArr[i14 + 3] = (byte) i18;
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0091  */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2 A[SYNTHETIC] */
    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void e(com.esotericsoftware.asm.Label r9, long r10, int r12) {
        /*
            r8 = this;
            r0 = r8
        L1:
            if (r0 == 0) goto La7
            com.esotericsoftware.asm.Label r1 = r0.f39932k
            r2 = 0
            r0.f39932k = r2
            r2 = 1
            if (r9 == 0) goto L50
            int r3 = r0.f39922a
            r4 = r3 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L12
            goto L63
        L12:
            r3 = r3 | 2048(0x800, float:2.87E-42)
            r0.f39922a = r3
            r4 = r3 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L7f
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L38
            int r3 = r9.f39922a
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L25
            goto L38
        L25:
            r3 = 0
        L26:
            int[] r4 = r0.f39926e
            int r5 = r4.length
            if (r3 >= r5) goto L38
            r4 = r4[r3]
            int[] r5 = r9.f39926e
            r5 = r5[r3]
            r4 = r4 & r5
            if (r4 == 0) goto L35
            goto L7f
        L35:
            int r3 = r3 + 1
            goto L26
        L38:
            h3.p r3 = new h3.p
            r3.<init>(r2)
            int r2 = r0.f39927f
            r3.f69333a = r2
            h3.p r2 = r9.f39931j
            java.lang.Object r2 = r2.f69334b
            com.esotericsoftware.asm.Label r2 = (com.esotericsoftware.asm.Label) r2
            r3.f69334b = r2
            h3.p r2 = r0.f39931j
            r3.f69335c = r2
            r0.f39931j = r3
            goto L7f
        L50:
            int r3 = r0.f39922a
            r4 = r3 & 1024(0x400, float:1.435E-42)
            r5 = 32
            if (r4 == 0) goto L65
            int[] r4 = r0.f39926e
            long r6 = r10 >>> r5
            int r6 = (int) r6
            r4 = r4[r6]
            int r6 = (int) r10
            r4 = r4 & r6
            if (r4 == 0) goto L65
        L63:
            r0 = r1
            goto L1
        L65:
            r4 = r3 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L74
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r0.f39922a = r3
            int r3 = r12 / 32
            int r3 = r3 + r2
            int[] r2 = new int[r3]
            r0.f39926e = r2
        L74:
            int[] r2 = r0.f39926e
            long r3 = r10 >>> r5
            int r3 = (int) r3
            r4 = r2[r3]
            int r5 = (int) r10
            r4 = r4 | r5
            r2[r3] = r4
        L7f:
            h3.p r2 = r0.f39931j
        L81:
            if (r2 == 0) goto L63
            int r3 = r0.f39922a
            r3 = r3 & 128(0x80, float:1.8E-43)
            if (r3 == 0) goto L91
            h3.p r3 = r0.f39931j
            java.lang.Object r3 = r3.f69335c
            h3.p r3 = (h3.p) r3
            if (r2 == r3) goto La2
        L91:
            java.lang.Object r3 = r2.f69334b
            r4 = r3
            com.esotericsoftware.asm.Label r4 = (com.esotericsoftware.asm.Label) r4
            com.esotericsoftware.asm.Label r4 = r4.f39932k
            if (r4 != 0) goto La2
            r4 = r3
            com.esotericsoftware.asm.Label r4 = (com.esotericsoftware.asm.Label) r4
            r4.f39932k = r1
            r1 = r3
            com.esotericsoftware.asm.Label r1 = (com.esotericsoftware.asm.Label) r1
        La2:
            java.lang.Object r2 = r2.f69335c
            h3.p r2 = (h3.p) r2
            goto L81
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.asm.Label.e(com.esotericsoftware.asm.Label, long, int):void");
    }

    public int getOffset() {
        if ((this.f39922a & 2) != 0) {
            return this.f39924c;
        }
        throw new IllegalStateException("Label offset position has not been resolved yet");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("L");
        stringBuffer.append(System.identityHashCode(this));
        return stringBuffer.toString();
    }
}
