package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setRevealOnFocusHint extends getInstallationId {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f60395j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f60396k = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final getX f60397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f60398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f60399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f60400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f60401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f60402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Terminal f60403i;

    public setRevealOnFocusHint(@NotNull getX getx, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(getx, "");
        this.f60397c = getx;
        this.f60398d = z10;
        this.f60399e = z11;
        this.f60400f = z12;
        this.f60401g = z13;
        this.f60402h = z14;
        this.f60403i = Terminal.KERNEL_3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        if (r12 != com.mypinpad.tsdk.isolation.getX.setDividerPadding) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        r12 = java.lang.System.identityHashCode(r11);
        r13 = ~r12;
        r2 = ~(r13 | 271749773);
        r2 = (r2 & 687940914) | ((r2 & (-687940915)) | ((~r2) & 687940914));
        r5 = (-270565898) & r13;
        r8 = (r12 & 270565897) | r5;
        r9 = (-270565898) & r12;
        r8 = (r8 & r9) | (r8 ^ r9);
        r9 = ~r8;
        r8 = (r8 | r9) & r9;
        r9 = r2 & r8;
        r2 = -(-((((r2 | r8) & (~r9)) | r9) * 717));
        r9 = 1099068493 & r2;
        r2 = -(-(r2 | 1099068493));
        r8 = (r9 ^ r2) + ((r2 & r9) << 1);
        r13 = (r13 & 270565897) | ((~r13) & (-270565898));
        r13 = (r13 & r5) | (r13 ^ r5);
        r2 = ~r13;
        r13 = (r13 | r2) & r2;
        r2 = (r13 & (-687940915)) | ((~r13) & 687940914);
        r13 = r13 & 687940914;
        r13 = (r13 & r2) | (r2 ^ r13);
        r2 = 271749773 & r12;
        r12 = (r12 | 271749773) & (~r2);
        r12 = ~((r12 & r2) | (r12 ^ r2));
        r12 = -(-(((r12 & r13) | (r13 ^ r12)) * 717));
        r1 = r8 & r12;
        r13 = (((r8 ^ r12) | r1) << 1) - ((r12 | r8) & (~r1));
        r11 = java.lang.System.identityHashCode(r11);
        r1 = ~((-1629498158) | r11);
        r3 = 1239277641 & r1;
        r1 = (r1 | 1239277641) & (~r3);
        r1 = -(~(-(-(((r1 & r3) | (r1 ^ r3)) * (-465)))));
        r1 = (-2) - (((1474508814 & r1) + (r1 | 1474508814)) ^ (-1));
        r3 = ((~r11) & 1239277641) | ((-1239277642) & r11);
        r4 = 1239277641 & r11;
        r3 = ~((r3 & r4) | (r3 ^ r4));
        r4 = (-1629498158) & r3;
        r3 = (r3 | (-1629498158)) & (~r4);
        r3 = -(-(((r3 & r4) | (r3 ^ r4)) * 930));
        r4 = r1 & r3;
        r1 = (r1 | r3) & (~r4);
        r3 = -(-(r4 << 1));
        r4 = (r1 ^ r3) + ((r1 & r3) << 1);
        r11 = (r11 & (-1629498158)) | ((-1629498158) ^ r11);
        r11 = ((r11 & 1239277641) | (r11 ^ 1239277641)) * 465;
        r12 = ((~r11) & r4) | ((~r4) & r11);
        r11 = (r11 & r4) << 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0129, code lost:
    
        if (r13 <= (((r12 | r11) << 1) - (r11 ^ r12))) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x012c, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0133, code lost:
    
        r11 = com.mypinpad.tsdk.isolation.setRevealOnFocusHint.f60395j;
        r11 = (-2) - ((((r11 | 92) << 1) - (r11 ^ 92)) ^ (-1));
        com.mypinpad.tsdk.isolation.setRevealOnFocusHint.f60396k = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return java.lang.Boolean.valueOf(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
    
        if (r12 != com.mypinpad.tsdk.isolation.getX.setDividerPadding) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setY(java.lang.Object[] r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setRevealOnFocusHint.setY(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @NotNull
    public final getX setCompoundDrawableTintBlendMode() {
        return (getX) setY(new Object[]{this}, -317774199, 317774203, System.identityHashCode(this));
    }

    public final boolean setDividerPadding() {
        return ((Boolean) setY(new Object[]{this}, 1247328667, -1247328661, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setLayoutAnimation() {
        return ((Boolean) setY(new Object[]{this}, -695071649, 695071651, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setOnDragListener() {
        return ((Boolean) setY(new Object[]{this}, 1867036297, -1867036296, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getInstallationId
    @NotNull
    public final Terminal setOnFocusChangeListener() {
        return (Terminal) setY(new Object[]{this}, 1466131326, -1466131321, System.identityHashCode(this));
    }

    public final boolean setOnLongClickListener() {
        return ((Boolean) setY(new Object[]{this}, 823990761, -823990758, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setX() {
        return ((Boolean) setY(new Object[]{this}, -1374154889, 1374154896, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getInstallationId
    public final boolean setY() {
        return ((Boolean) setY(new Object[]{this}, 1774629030, -1774629030, System.identityHashCode(this))).booleanValue();
    }
}
