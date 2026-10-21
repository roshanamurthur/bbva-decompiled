package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class ad extends t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f52443j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f52444k = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f52445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f52446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f52447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f52448i;

    public ad() {
        super(setAnimation.component33().setDividerPadding());
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x013c, code lost:
    
        if (r11 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x013f, code lost:
    
        if (r11 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0141, code lost:
    
        r13 = r12 & 39;
        r12 = (r12 | 39) & (~r13);
        r13 = r13 << 1;
        r0 = ((r12 | r13) << 1) - (r12 ^ r13);
        r12 = r0 % 128;
        com.mypinpad.tsdk.isolation.ad.f52443j = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0152, code lost:
    
        if ((r0 % 2) != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0154, code lost:
    
        r13 = ((r12 ^ 15) | (r12 & 15)) << 1;
        r12 = -(((~r12) & 15) | (r12 & (-16)));
        r14 = ((r13 | r12) << 1) - (r12 ^ r13);
        com.mypinpad.tsdk.isolation.ad.f52444k = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x016d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016e, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r11 = com.mypinpad.tsdk.isolation.ad.f52443j;
        r12 = (((r11 | 1) << 1) - (~(-(((~r11) & 1) | (r11 & (-2)))))) - 1;
        com.mypinpad.tsdk.isolation.ad.f52444k = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setDividerPadding(java.lang.Object[] r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 1315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ad.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @NotNull
    public final byte[] getNavBarTitleString() {
        return (byte[]) setDividerPadding(new Object[]{this}, 820012834, -820012830, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setLayoutAnimation() {
        return (byte[]) setDividerPadding(new Object[]{this}, -596089916, 596089922, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList, com.mypinpad.tsdk.isolation.setLeftTopRightBottom
    public final int setOnFocusChangeListener(@Nullable byte[] bArr, int i10) {
        return ((Integer) setDividerPadding(new Object[]{this, bArr, Integer.valueOf(i10)}, 299584634, -299584631, i10)).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList
    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setDividerPadding(new Object[]{this}, 678039699, -678039697, System.identityHashCode(this));
    }
}
