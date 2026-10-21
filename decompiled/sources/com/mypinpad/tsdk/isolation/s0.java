package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class s0 extends x0 {
    public static final byte[] v0 = new byte[0];

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f58177w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f58178x0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f58179t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f58180u0;

    static {
        int i10 = (1 | 41) << 1;
        int i11 = -(1 ^ 41);
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        f58177w0 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public s0(InputStream inputStream, int i10, int i11) throws IOException {
        super(inputStream, i11);
        if (i10 <= 0) {
            if (i10 < 0) {
                throw new IllegalArgumentException("negative lengths not allowed");
            }
            x0.a(new Object[]{this}, 105926738, -105926738, System.identityHashCode(this));
        }
        this.f58179t0 = i10;
        this.f58180u0 = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x018f, code lost:
    
        if (r0.f58180u0 == r3.length) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0195, code lost:
    
        if (r0.f58180u0 == r3.length) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0199, code lost:
    
        if (r0.f58180u0 != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x019b, code lost:
    
        r1 = r11 & 119;
        r0 = (((r11 ^ 119) | r1) << 1) - ((~r1) & (r11 | 119));
        com.mypinpad.tsdk.isolation.s0.f58177w0 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01ad, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.x0.a(new java.lang.Object[]{r0}, -54208317, 54208318, java.lang.System.identityHashCode(r0)).intValue();
        r7 = r0.f58180u0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01bf, code lost:
    
        if (r7 >= r6) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01c1, code lost:
    
        r1 = r3.length;
        r1 = -((java.lang.Integer) com.mypinpad.tsdk.isolation.bfc.setOnFocusChangeListener(new java.lang.Object[]{r0.f61704p0, r3, java.lang.Integer.valueOf(r1)}, -396467491, 396467492, r1)).intValue();
        r2 = java.lang.System.identityHashCode(r0);
        r3 = r1 * 491;
        r5 = r7 * (-489);
        r6 = (r3 & r5) + (r3 | r5);
        r3 = ~r1;
        r5 = ~r7;
        r7 = r3 & r5;
        r10 = (~r7) & (r3 | r5);
        r7 = (r7 & r10) | (r10 ^ r7);
        r10 = ~r2;
        r10 = r10 & (r10 | r2);
        r11 = r7 & r10;
        r7 = (r7 | r10) & (~r11);
        r7 = -(-(((r7 & r11) | (r7 ^ r11)) * (-490)));
        r10 = r6 & r7;
        r6 = (r6 | r7) & (~r10);
        r7 = -(-(r10 << 1));
        r10 = (r6 ^ r7) + ((r6 & r7) << 1);
        r6 = r5 & r1;
        r1 = (r1 | r5) & (~r6);
        r1 = ~((r1 & r6) | (r1 ^ r6));
        r2 = ~(r2 | r5);
        r5 = r1 & r2;
        r1 = (((r1 | r2) & (~r5)) | r5) * 490;
        r3 = (r3 * 490) + ((((r10 ^ r1) | (r10 & r1)) << 1) - ((r1 & (~r10)) | ((~r1) & r10)));
        r0.f58180u0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x023a, code lost:
    
        if (r3 != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x023c, code lost:
    
        com.mypinpad.tsdk.isolation.x0.a(new java.lang.Object[]{r0}, 105926738, -105926738, java.lang.System.identityHashCode(r0));
        r0 = com.mypinpad.tsdk.isolation.s0.f58178x0;
        r1 = (r0 ^ 83) + ((r0 & 83) << 1);
        com.mypinpad.tsdk.isolation.s0.f58177w0 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x025a, code lost:
    
        if ((r1 % 2) != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x025c, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0260, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0261, code lost:
    
        r2 = new java.lang.StringBuilder("DEF length ");
        r2.append(r0.f58179t0);
        r2.append(" object truncated by ");
        r2.append(r0.f58180u0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x027c, code lost:
    
        throw new java.io.EOFException(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x027d, code lost:
    
        r4 = new java.lang.StringBuilder("corrupted stream - out of bounds length found: ");
        r4.append(r0.f58180u0);
        r4.append(" >= ");
        r4.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0296, code lost:
    
        throw new java.io.IOException(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x029e, code lost:
    
        throw new java.lang.IllegalArgumentException("buffer length not right for data");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.io.Serializable b(java.lang.Object[] r19, int r20, int r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.s0.b(java.lang.Object[], int, int, int):java.io.Serializable");
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        return ((Integer) b(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, 1612668169, -1612668169, i10)).intValue();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return ((Integer) b(new Object[]{this}, -930993895, 930993898, System.identityHashCode(this))).intValue();
    }
}
