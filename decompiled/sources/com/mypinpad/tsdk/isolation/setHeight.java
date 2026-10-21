package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/mypinpad/tsdk/i/setHeight;", "", "Lcom/mypinpad/tsdk/i/Terminal;", "p0", "Lcom/mypinpad/tsdk/i/getValue;", "p1", "Lcom/mypinpad/tsdk/i/setTextKeepState;", "p2", "Lcom/mypinpad/tsdk/i/eu;", "p3", "Lcom/mypinpad/tsdk/i/setNextFocusForwardId;", "setY", "(Lcom/mypinpad/tsdk/i/Terminal;Lcom/mypinpad/tsdk/i/getValue;Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/eu;)Lcom/mypinpad/tsdk/i/setNextFocusForwardId;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setHeight {

    @NotNull
    public static final setHeight INSTANCE = new setHeight();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f59784a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59785b = 1;

    public /* synthetic */ class setOnFocusChangeListener {
        public static final /* synthetic */ int[] setDividerPadding;

        static {
            int[] iArr = new int[Terminal.valuesCustom().length];
            iArr[Terminal.KERNEL_2.ordinal()] = 1;
            setDividerPadding = iArr;
            int i10 = 63 % 128;
            if (63 % 2 == 0) {
                throw null;
            }
        }
    }

    static {
        int i10 = f59784a;
        int i11 = i10 & 109;
        int i12 = ((i10 ^ 109) | i11) << 1;
        int i13 = -((i10 | 109) & (~i11));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        f59785b = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
    
        r5 = new com.mypinpad.tsdk.isolation.setTransitionAlpha(r7, r1, r4);
        r4 = com.mypinpad.tsdk.isolation.setHeight.f59785b;
        r6 = ((r4 | 11) << 1) - (r4 ^ 11);
        com.mypinpad.tsdk.isolation.setHeight.f59784a = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
    
        if ((r6 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0083, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003b, code lost:
    
        if (com.mypinpad.tsdk.i.setHeight.setOnFocusChangeListener.setDividerPadding[r5.ordinal()] == 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0052, code lost:
    
        if (com.mypinpad.tsdk.i.setHeight.setOnFocusChangeListener.setDividerPadding[r5.ordinal()] == 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0054, code lost:
    
        r5 = new com.mypinpad.tsdk.isolation.configBeepVolume(r7, r1, r4);
        r4 = com.mypinpad.tsdk.isolation.setHeight.f59784a;
        r4 = (-2) - ((((r4 | 90) << 1) - (r4 ^ 90)) ^ (-1));
        com.mypinpad.tsdk.isolation.setHeight.f59785b = r4 % 128;
        r4 = r4 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setOnFocusChangeListener(java.lang.Object[] r4, int r5, int r6, int r7) {
        /*
            r5 = 0
            r5 = r4[r5]
            com.mypinpad.tsdk.i.Terminal r5 = (com.mypinpad.tsdk.isolation.Terminal) r5
            r6 = 1
            r7 = r4[r6]
            com.mypinpad.tsdk.i.getValue r7 = (com.mypinpad.tsdk.isolation.getValue) r7
            r0 = 2
            r1 = r4[r0]
            com.mypinpad.tsdk.i.setTextKeepState r1 = (com.mypinpad.tsdk.isolation.setTextKeepState) r1
            r2 = 3
            r4 = r4[r2]
            com.mypinpad.tsdk.i.eu r4 = (com.mypinpad.tsdk.isolation.eu) r4
            int r2 = com.mypinpad.tsdk.isolation.setHeight.f59784a
            r3 = r2 & 65
            r2 = r2 ^ 65
            r2 = r2 | r3
            int r2 = ~r2
            int r3 = r3 - r2
            int r3 = r3 - r6
            int r2 = r3 % 128
            com.mypinpad.tsdk.isolation.setHeight.f59785b = r2
            int r3 = r3 % r0
            java.lang.String r2 = ""
            if (r3 != 0) goto L3e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            int[] r2 = com.mypinpad.tsdk.i.setHeight.setOnFocusChangeListener.setDividerPadding
            int r5 = r5.ordinal()
            r5 = r2[r5]
            if (r5 != r6) goto L6c
            goto L54
        L3e:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            int[] r2 = com.mypinpad.tsdk.i.setHeight.setOnFocusChangeListener.setDividerPadding
            int r5 = r5.ordinal()
            r5 = r2[r5]
            if (r5 != r6) goto L6c
        L54:
            com.mypinpad.tsdk.i.configBeepVolume r5 = new com.mypinpad.tsdk.i.configBeepVolume
            r5.<init>(r7, r1, r4)
            int r4 = com.mypinpad.tsdk.isolation.setHeight.f59784a
            r7 = r4 | 90
            int r6 = r7 << 1
            r4 = r4 ^ 90
            int r6 = r6 - r4
            r4 = r6 ^ (-1)
            int r4 = (-2) - r4
            int r6 = r4 % 128
            com.mypinpad.tsdk.isolation.setHeight.f59785b = r6
            int r4 = r4 % r0
            goto L81
        L6c:
            com.mypinpad.tsdk.i.setTransitionAlpha r5 = new com.mypinpad.tsdk.i.setTransitionAlpha
            r5.<init>(r7, r1, r4)
            int r4 = com.mypinpad.tsdk.isolation.setHeight.f59785b
            r7 = r4 | 11
            int r6 = r7 << 1
            r4 = r4 ^ 11
            int r6 = r6 - r4
            int r4 = r6 % 128
            com.mypinpad.tsdk.isolation.setHeight.f59784a = r4
            int r6 = r6 % r0
            if (r6 != 0) goto L82
        L81:
            return r5
        L82:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setHeight.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @NotNull
    public static setNextFocusForwardId setY(@NotNull Terminal p4, @NotNull getValue p10, @NotNull setTextKeepState p11, @NotNull eu p12) {
        return (setNextFocusForwardId) setOnFocusChangeListener(new Object[]{p4, p10, p11, p12}, -623003752, 623003752, (int) System.currentTimeMillis());
    }
}
