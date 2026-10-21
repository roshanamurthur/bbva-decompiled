package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f54232c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f54233d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Terminal f54234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final md f54235b;

    public b0(@NotNull Terminal terminal, @NotNull md mdVar) {
        Intrinsics.checkNotNullParameter(terminal, "");
        Intrinsics.checkNotNullParameter(mdVar, "");
        this.f54234a = terminal;
        this.f54235b = mdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        if (r9 == r7) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        r7 = (r3 & (-94)) | ((~r3) & 93);
        r9 = (r3 & 93) << 1;
        r1 = (r7 ^ r9) + ((r7 & r9) << 1);
        com.mypinpad.tsdk.isolation.b0.f54233d = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        if ((r1 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        if ((!(r7 instanceof com.mypinpad.tsdk.isolation.b0)) == true) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        r7 = (com.mypinpad.tsdk.isolation.b0) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        if (r9.f54234a == r7.f54234a) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        r7 = r2 ^ 41;
        r8 = (r2 & 41) << 1;
        r9 = ((r7 | r8) << 1) - (r7 ^ r8);
        com.mypinpad.tsdk.isolation.b0.f54232c = r9 % 128;
        r9 = r9 % 2;
        r7 = ((r2 | 125) << 1) - (r2 ^ 125);
        com.mypinpad.tsdk.isolation.b0.f54232c = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        if ((r7 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        if (r9.f54235b == r7.f54235b) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a3, code lost:
    
        r7 = ((r2 | 67) << 1) - (r2 ^ 67);
        com.mypinpad.tsdk.isolation.b0.f54232c = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
    
        java.lang.System.identityHashCode(r9);
        java.lang.System.identityHashCode(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b9, code lost:
    
        r2 = r2 + 111;
        r7 = r2 % 128;
        com.mypinpad.tsdk.isolation.b0.f54232c = r7;
        r2 = r2 % 2;
        r1 = r7 & 83;
        r9 = ((((r7 ^ 83) | r1) << 1) - (~(-((r7 | 83) & (~r1))))) - 1;
        com.mypinpad.tsdk.isolation.b0.f54233d = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
    
        if ((r9 % 2) != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        r7 = 5 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return java.lang.Boolean.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (r9 == r7) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(java.lang.Object[] r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.b0.a(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) a(new Object[]{this, obj}, -871051715, 871051715, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) a(new Object[]{this}, 642432589, -642432588, System.identityHashCode(this))).intValue();
    }

    @NotNull
    public final String toString() {
        return (String) a(new Object[]{this}, -285326949, 285326951, System.identityHashCode(this));
    }
}
