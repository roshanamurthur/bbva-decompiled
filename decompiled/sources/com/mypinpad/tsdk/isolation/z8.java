package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class z8<I> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f62284c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f62285d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f62286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final byte[] f62287b;

    /* JADX WARN: Multi-variable type inference failed */
    public z8(@NotNull byte[] bArr, Object obj) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f62286a = obj;
        this.f62287b = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0135, code lost:
    
        if ((!r9) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013c, code lost:
    
        if (java.util.Arrays.equals(r12, r9) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x013e, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.z8.f62284c;
        r10 = ((r9 & (-14)) | ((~r9) & 13)) + ((r9 & 13) << 1);
        com.mypinpad.tsdk.isolation.z8.f62285d = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.z8.a(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) a(new Object[]{this, obj}, -1825151569, 1825151570, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) a(new Object[]{this}, -681541648, 681541648, System.identityHashCode(this))).intValue();
    }
}
