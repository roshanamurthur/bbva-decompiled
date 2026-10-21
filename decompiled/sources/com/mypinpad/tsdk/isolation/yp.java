package com.mypinpad.tsdk.isolation;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class yp {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f62170d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f62171e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final xh f62172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Proxy f62173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InetSocketAddress f62174c;

    public yp(@NotNull xh xhVar, @NotNull Proxy proxy, @NotNull InetSocketAddress inetSocketAddress) {
        Intrinsics.checkNotNullParameter(xhVar, "");
        Intrinsics.checkNotNullParameter(proxy, "");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        this.f62172a = xhVar;
        this.f62173b = proxy;
        this.f62174c = inetSocketAddress;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:26:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:28:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:30:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:33:0x01fb  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01f8, code lost:
    
        if (r7 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01ff, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7, r8) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0201, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.yp.f62170d;
        r8 = ((((r7 ^ 91) | (r7 & 91)) << 1) - (~(-(((~r7) & 91) | (r7 & (-92)))))) - 1;
        com.mypinpad.tsdk.isolation.yp.f62171e = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.yp.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, obj}, -643974450, 643974454, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 1775046716, -1775046711, System.identityHashCode(this))).intValue();
    }

    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 1989779594, -1989779591, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "socketAddress")
    @NotNull
    public final InetSocketAddress setX() {
        return (InetSocketAddress) setCompoundDrawableTintBlendMode(new Object[]{this}, -1865027862, 1865027863, System.identityHashCode(this));
    }

    @JvmName(name = "address")
    @NotNull
    public final xh setY() {
        return (xh) setCompoundDrawableTintBlendMode(new Object[]{this}, 204812250, -204812248, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -1655649100, 1655649106, System.identityHashCode(this));
    }

    @JvmName(name = "proxy")
    @NotNull
    public final Proxy setCompoundDrawableTintBlendMode() {
        return (Proxy) setCompoundDrawableTintBlendMode(new Object[]{this}, 250524162, -250524162, System.identityHashCode(this));
    }
}
