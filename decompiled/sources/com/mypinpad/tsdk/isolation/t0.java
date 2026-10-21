package com.mypinpad.tsdk.isolation;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes10.dex */
public final class t0 implements Enumeration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60962c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60963d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public adq f60964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f60965b;

    /* JADX WARN: Code duplicated, block: B:20:0x008e  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a9  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r5 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        r5 = r4.f60965b;
        r4.f60965b = a(new java.lang.Object[]{r4}, 2080550194, -2080550193, java.lang.System.identityHashCode(r4));
        r4 = com.mypinpad.tsdk.isolation.t0.f60963d;
        r6 = r4 & 19;
        r6 = (r6 - (~((r4 ^ 19) | r6))) - 1;
        com.mypinpad.tsdk.isolation.t0.f60962c = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        throw new java.util.NoSuchElementException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f1, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r5 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(java.lang.Object[] r4, int r5, int r6, int r7) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.t0.a(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return ((Boolean) a(new Object[]{this}, 1571895897, -1571895895, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        return a(new Object[]{this}, 241753011, -241753011, System.identityHashCode(this));
    }
}
