package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setAutofillHints extends setFindListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f59478j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f59479k = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f59480i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setAutofillHints(@NotNull PinViewportDp pinViewportDp, int i10) {
        super(pinViewportDp);
        Intrinsics.checkNotNullParameter(pinViewportDp, "");
        this.f59480i = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0074, code lost:
    
        if (r4.length == r6.f59480i) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        if (r4.length == r6.f59480i) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
    
        r4 = com.mypinpad.tsdk.isolation.setAutofillHints.f59478j + 5;
        com.mypinpad.tsdk.isolation.setAutofillHints.f59479k = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008c, code lost:
    
        r4 = com.mypinpad.tsdk.isolation.setAutofillHints.f59479k;
        r5 = (((r4 ^ 89) | (r4 & 89)) << 1) - (((~r4) & 89) | (r4 & (-90)));
        com.mypinpad.tsdk.isolation.setAutofillHints.f59478j = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a1, code lost:
    
        if ((r5 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a5, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setOnFocusChangeListener(java.lang.Object[] r4, int r5, int r6, int r7) {
        /*
            int r0 = r5 * (-112)
            int r1 = r6 * (-112)
            int r1 = r1 + r0
            int r0 = ~r6
            int r2 = ~r7
            r2 = r2 | r0
            int r3 = ~r2
            r3 = r3 | r5
            int r3 = r3 * 226
            int r3 = r3 + r1
            int r1 = ~r5
            r6 = r6 | r1
            int r6 = ~r6
            r1 = r1 | r7
            int r1 = ~r1
            r6 = r6 | r1
            r5 = r5 | r2
            int r5 = ~r5
            r5 = r5 | r6
            int r5 = r5 * (-113)
            int r5 = r5 + r3
            r6 = r0 | r7
            int r6 = ~r6
            int r6 = r6 * 113
            int r6 = r6 + r5
            r5 = 0
            r7 = 1
            if (r6 == r7) goto L51
            r4 = r4[r5]
            com.mypinpad.tsdk.i.setAutofillHints r4 = (com.mypinpad.tsdk.isolation.setAutofillHints) r4
            int r6 = com.mypinpad.tsdk.isolation.setAutofillHints.f59479k
            r0 = r6 & 18
            r6 = r6 | 18
            int r0 = r0 + r6
            r6 = r0 ^ (-1)
            int r0 = r0 << r7
            int r6 = r6 + r0
            int r0 = r6 % 128
            com.mypinpad.tsdk.isolation.setAutofillHints.f59478j = r0
            int r6 = r6 % 2
            int r4 = r4.f59480i
            r6 = r0 ^ 3
            r0 = r0 & 3
            int r7 = r0 << 1
            int r6 = r6 + r7
            int r7 = r6 % 128
            com.mypinpad.tsdk.isolation.setAutofillHints.f59479k = r7
            int r6 = r6 % 2
            if (r6 != 0) goto L4c
            r6 = 51
            int r6 = r6 / r5
        L4c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto La5
        L51:
            r6 = r4[r5]
            com.mypinpad.tsdk.i.setAutofillHints r6 = (com.mypinpad.tsdk.isolation.setAutofillHints) r6
            r4 = r4[r7]
            byte[] r4 = (byte[]) r4
            int r0 = com.mypinpad.tsdk.isolation.setAutofillHints.f59478j
            r1 = r0 ^ 45
            r0 = r0 & 45
            int r0 = r0 << r7
            int r1 = r1 + r0
            int r0 = r1 % 128
            com.mypinpad.tsdk.isolation.setAutofillHints.f59479k = r0
            int r1 = r1 % 2
            java.lang.String r0 = ""
            if (r1 != 0) goto L77
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r4 = r4.length
            int r6 = r6.f59480i
            r0 = 17
            int r0 = r0 / r5
            if (r4 != r6) goto L8c
            goto L7f
        L77:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r4 = r4.length
            int r5 = r6.f59480i
            if (r4 != r5) goto L8c
        L7f:
            int r4 = com.mypinpad.tsdk.isolation.setAutofillHints.f59478j
            int r4 = r4 + 5
            int r5 = r4 % 128
            com.mypinpad.tsdk.isolation.setAutofillHints.f59479k = r5
            int r4 = r4 % 2
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            goto La5
        L8c:
            int r4 = com.mypinpad.tsdk.isolation.setAutofillHints.f59479k
            r5 = r4 ^ 89
            r6 = r4 & 89
            r5 = r5 | r6
            int r5 = r5 << r7
            r6 = r4 & (-90)
            int r4 = ~r4
            r4 = r4 & 89
            r4 = r4 | r6
            int r5 = r5 - r4
            int r4 = r5 % 128
            com.mypinpad.tsdk.isolation.setAutofillHints.f59478j = r4
            int r5 = r5 % 2
            if (r5 != 0) goto La6
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
        La5:
            return r4
        La6:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setAutofillHints.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.setFindListener
    public final boolean setX(@NotNull byte[] bArr) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, bArr}, 1422736975, -1422736974, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setFindListener
    public final int setOnFocusChangeListener() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, 646347835, -646347835, System.identityHashCode(this))).intValue();
    }
}
