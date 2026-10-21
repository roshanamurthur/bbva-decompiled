package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class h2 implements ben {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f56130t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f56131u0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f56132p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final f2 f56133q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final axy f56134r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[][] f56135s0;

    public h2(int i10, f2 f2Var, axy axyVar, byte[][] bArr) {
        this.f56132p0 = i10;
        this.f56133q0 = f2Var;
        this.f56134r0 = axyVar;
        this.f56135s0 = bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0473, code lost:
    
        if (r7 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x04ab, code lost:
    
        if (r7 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x04b2, code lost:
    
        if (r8.equals(r7) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x04b4, code lost:
    
        r4 = com.mypinpad.tsdk.isolation.h2.f56131u0;
        r5 = (r4 & (-84)) | ((~r4) & 83);
        r4 = -(-((r4 & 83) << 1));
        r6 = (r5 & r4) + (r4 | r5);
        com.mypinpad.tsdk.isolation.h2.f56130t0 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x04cb, code lost:
    
        if (r7 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x04cd, code lost:
    
        r4 = com.mypinpad.tsdk.isolation.h2.f56131u0;
        r0 = (-2) - (((r4 ^ 114) + ((r4 & 114) << 1)) ^ (-1));
        com.mypinpad.tsdk.isolation.h2.f56130t0 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x04df, code lost:
    
        if ((r0 % 2) != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x04e3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x04e4, code lost:
    
        r0 = java.util.Arrays.deepEquals(r5.f56135s0, r6.f56135s0);
        r1 = com.mypinpad.tsdk.isolation.h2.f56130t0;
        r3 = r1 | 71;
        r4 = r3 << 1;
        r1 = -((~(r1 & 71)) & r3);
        r3 = (r4 & r1) + (r1 | r4);
        com.mypinpad.tsdk.isolation.h2.f56131u0 = r3 % 128;
        r3 = r3 % 2;
        r0 = java.lang.Boolean.valueOf(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(java.lang.Object[] r16, int r17, int r18, int r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.h2.a(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        return ((Boolean) a(new Object[]{this, obj}, -554798456, 554798458, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) a(new Object[]{this}, 962101613, -962101610, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ben
    public final byte[] setAlwaysDrawnWithCacheEnabled() throws IOException {
        return (byte[]) a(new Object[]{this}, 800993465, -800993464, System.identityHashCode(this));
    }
}
