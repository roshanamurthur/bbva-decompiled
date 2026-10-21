package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class anq extends ano {
    public static int v0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f53342w0 = 1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final BigInteger f53343u0;

    public anq(BigInteger bigInteger, anr anrVar) {
        super(anrVar);
        this.f53343u0 = bigInteger;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e3, code lost:
    
        if (r6 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e6, code lost:
    
        if (r6 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e8, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.anq.f53342w0;
        r7 = ((r6 ^ 58) + ((r6 & 58) << 1)) - 1;
        com.mypinpad.tsdk.isolation.anq.v0 = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setDividerPadding(java.lang.Object[] r6, int r7, int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.anq.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.ano
    public final boolean equals(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, 1147989228, -1147989226, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ano
    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -1072647447, 1072647447, System.identityHashCode(this))).intValue();
    }
}
