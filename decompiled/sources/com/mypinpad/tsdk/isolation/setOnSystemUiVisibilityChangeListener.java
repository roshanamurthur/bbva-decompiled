package com.mypinpad.tsdk.isolation;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setOnSystemUiVisibilityChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60258c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60259d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setRotationX f60260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f60261b;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/mypinpad/tsdk/i/setMaxWidth;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/setMaxWidth;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function0<setMaxWidth> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f60262q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60263r0 = 1;

        public a() {
            super(0);
        }

        public static /* synthetic */ setMaxWidth a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-344)) + (i10 * (-344));
            int i14 = ~i10;
            int i15 = ~i11;
            int i16 = i14 | i15;
            if (((~(i16 | i12)) * 345) + (((~(i10 | i15)) | (~(i14 | (~i12)))) * 345) + (((~i16) | (~(i14 | i12))) * 345) + i13 != 1) {
                a aVar = (a) objArr[0];
                int i17 = f60262q0;
                int i18 = ((i17 & 80) + (i17 | 80)) - 1;
                f60263r0 = i18 % 128;
                int i19 = i18 % 2;
                setMaxWidth setmaxwidth = (setMaxWidth) setOnSystemUiVisibilityChangeListener.setDividerPadding(new Object[]{setOnSystemUiVisibilityChangeListener.this}, 847347002, -847347000, (int) System.currentTimeMillis());
                int i20 = f60262q0;
                int i21 = ((i20 ^ 43) | (i20 & 43)) << 1;
                int i22 = -(((~i20) & 43) | (i20 & (-44)));
                int i23 = (i21 & i22) + (i22 | i21);
                f60263r0 = i23 % 128;
                int i24 = i23 % 2;
                return setmaxwidth;
            }
            a aVar2 = (a) objArr[0];
            int i25 = f60263r0;
            int i26 = i25 & 97;
            int i27 = (i25 | 97) & (~i26);
            int i28 = -(-(i26 << 1));
            int i29 = (i27 & i28) + (i27 | i28);
            f60262q0 = i29 % 128;
            int i30 = i29 % 2;
            setMaxWidth setmaxwidthA = a(new Object[]{aVar2}, -354137738, 354137738, System.identityHashCode(aVar2));
            int i31 = f60263r0 + 101;
            f60262q0 = i31 % 128;
            if (i31 % 2 == 0) {
                return setmaxwidthA;
            }
            int i32 = 48 / 0;
            return setmaxwidthA;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ setMaxWidth invoke() {
            return a(new Object[]{this}, -1706940016, 1706940017, System.identityHashCode(this));
        }
    }

    public setOnSystemUiVisibilityChangeListener(@NotNull setRotationX setrotationx) {
        Intrinsics.checkNotNullParameter(setrotationx, "");
        this.f60260a = setrotationx;
        this.f60261b = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x030b, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.setMaxWidth.setX(r2, 420631327, -420631322, java.lang.System.identityHashCode(r0))).booleanValue() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x034d, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.setMaxWidth.setX(new java.lang.Object[]{r0, (java.lang.String) com.mypinpad.tsdk.isolation.TransactionFailed.setX(new java.lang.Object[]{r1}, 1914607362, -1914607356, java.lang.System.identityHashCode(r1))}, 420631327, -420631322, java.lang.System.identityHashCode(r0))).booleanValue() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x034f, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.setOnSystemUiVisibilityChangeListener.f60258c;
        r1 = (((r0 & (-102)) | ((~r0) & 101)) - (~((r0 & 101) << 1))) - 1;
        com.mypinpad.tsdk.isolation.setOnSystemUiVisibilityChangeListener.f60259d = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0362, code lost:
    
        if ((r1 % 2) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0364, code lost:
    
        r0 = 20 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setDividerPadding(java.lang.Object[] r16, int r17, int r18, int r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setOnSystemUiVisibilityChangeListener.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static final /* synthetic */ setMaxWidth setX(setOnSystemUiVisibilityChangeListener setonsystemuivisibilitychangelistener) {
        return (setMaxWidth) setDividerPadding(new Object[]{setonsystemuivisibilitychangelistener}, 847347002, -847347000, (int) System.currentTimeMillis());
    }

    public final boolean setDividerPadding(@NotNull Terminal terminal) {
        return ((Boolean) setDividerPadding(new Object[]{this, terminal}, -2126466168, 2126466169, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final setMaxWidth setDividerPadding() {
        return (setMaxWidth) setDividerPadding(new Object[]{this}, 1558719089, -1558719089, System.identityHashCode(this));
    }
}
