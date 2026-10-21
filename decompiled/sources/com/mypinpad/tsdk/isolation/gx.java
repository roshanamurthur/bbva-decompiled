package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class gx extends setRotationX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f56105n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f56106o = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public getBeepOnFailure f56107k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public getBeepOnFailure f56108l;
    public getBeepOnFailure m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(@NotNull byte[] bArr) throws Exception {
        super(bArr);
        Intrinsics.checkNotNullParameter(bArr, "");
        setDividerPadding(setRotationY.setCompoundDrawableTintBlendMode);
        setCompoundDrawableTintBlendMode(new Object[]{this}, 381158939, -381158938, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01ce, code lost:
    
        if (r0 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01d1, code lost:
    
        if (r0 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01d3, code lost:
    
        r1 = (r2 & 47) + (r2 | 47);
        com.mypinpad.tsdk.isolation.gx.f56105n = r1 % 128;
        r1 = r1 % 2;
        r3 = r2 & 19;
        r1 = ((r2 ^ 19) | r3) << 1;
        r2 = -((r2 | 19) & (~r3));
        r3 = (r1 ^ r2) + ((r1 & r2) << 1);
        com.mypinpad.tsdk.isolation.gx.f56105n = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01f1, code lost:
    
        if ((r3 % 2) != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01f5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01f6, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r0 = com.mypinpad.tsdk.isolation.gx.f56106o;
        r1 = r0 ^ 55;
        r0 = ((r0 & 55) | r1) << 1;
        r1 = -r1;
        r2 = (r0 & r1) + (r0 | r1);
        com.mypinpad.tsdk.isolation.gx.f56105n = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x020b, code lost:
    
        if ((r2 % 2) != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x020f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r17, int r18, int r19, int r20) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.gx.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @NotNull
    public final getBeepOnFailure getNavBarTitleString() {
        return (getBeepOnFailure) setCompoundDrawableTintBlendMode(new Object[]{this}, -1617299184, 1617299192, System.identityHashCode(this));
    }

    @NotNull
    public final getBeepOnFailure setIncludeFontPadding() {
        return (getBeepOnFailure) setCompoundDrawableTintBlendMode(new Object[]{this}, -89900749, 89900754, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setRotationX
    @NotNull
    public final setMaxWidth setOnDragListener() {
        return (setMaxWidth) setCompoundDrawableTintBlendMode(new Object[]{this}, 1018278956, -1018278950, System.identityHashCode(this));
    }
}
