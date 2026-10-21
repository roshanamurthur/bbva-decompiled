package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class pv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f57766a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57767b = 1;

    public /* synthetic */ class setDividerPadding {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f57768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f57769b;
        public static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[TransactionNotAuthorisedReason.values().length];
            try {
                iArr[TransactionNotAuthorisedReason.setY.ordinal()] = 1;
                int i10 = 99 << 1;
                int i11 = -((~0) & 99);
                int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
                f57769b = i12 % 128;
                int i13 = i12 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionNotAuthorisedReason.setOnFocusChangeListener.ordinal()] = 2;
                int i14 = f57769b;
                int i15 = i14 & 41;
                int i16 = ((((i14 ^ 41) | i15) << 1) - (~(-((i14 | 41) & (~i15))))) - 1;
                f57768a = i16 % 128;
                int i17 = i16 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            setX = iArr;
            int i18 = f57768a;
            int i19 = i18 & 27;
            int i20 = i19 + ((i18 ^ 27) | i19);
            f57769b = i20 % 128;
            int i21 = i20 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
    
        if (r6 == 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        if (r6 == 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.qs.setCompoundDrawableTintBlendMode;
        r8 = com.mypinpad.tsdk.isolation.pv.f57766a;
        r0 = r8 ^ 119;
        r8 = (((r8 & 119) | r0) << 1) - r0;
        com.mypinpad.tsdk.isolation.pv.f57767b = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if ((r8 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setX(java.lang.Object[] r6, int r7, int r8, int r9) {
        /*
            int r0 = r7 * 399
            int r1 = r8 * 399
            int r1 = r1 + r0
            int r0 = ~r7
            r0 = r0 | r8
            int r0 = ~r0
            int r2 = ~r8
            r3 = r2 | r7
            int r3 = ~r3
            r4 = r0 | r3
            r5 = r2 | r9
            int r5 = ~r5
            r4 = r4 | r5
            int r4 = r4 * 398
            int r4 = r4 + r1
            r7 = r7 | r8
            int r7 = r7 * (-1194)
            int r7 = r7 + r4
            int r8 = ~r9
            r8 = r8 | r2
            int r8 = ~r8
            r8 = r8 | r0
            r8 = r8 | r3
            int r8 = r8 * 398
            int r8 = r8 + r7
            r7 = 0
            r9 = 2
            r0 = 0
            r1 = 1
            if (r8 == r1) goto L5c
            r6 = r6[r0]
            com.mypinpad.tsdk.i.TransactionNotAuthorisedReason r6 = (com.mypinpad.tsdk.isolation.TransactionNotAuthorisedReason) r6
            int r8 = com.mypinpad.tsdk.isolation.pv.f57767b
            int r8 = r8 + 101
            int r2 = r8 % 128
            com.mypinpad.tsdk.isolation.pv.f57766a = r2
            int r8 = r8 % r9
            r9 = 1706507313(0x65b73c31, float:1.08162925E23)
            r2 = -1706507312(0xffffffff9a48c3d0, float:-4.1517207E-23)
            if (r8 != 0) goto L4c
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r0] = r6
            long r0 = java.lang.System.currentTimeMillis()
            int r6 = (int) r0
            java.lang.Object r6 = setX(r7, r2, r9, r6)
            com.mypinpad.tsdk.i.qs r6 = (com.mypinpad.tsdk.isolation.qs) r6
            goto Lb1
        L4c:
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r0] = r6
            long r0 = java.lang.System.currentTimeMillis()
            int r6 = (int) r0
            java.lang.Object r6 = setX(r8, r2, r9, r6)
            com.mypinpad.tsdk.i.qs r6 = (com.mypinpad.tsdk.isolation.qs) r6
            throw r7
        L5c:
            r6 = r6[r0]
            com.mypinpad.tsdk.i.TransactionNotAuthorisedReason r6 = (com.mypinpad.tsdk.isolation.TransactionNotAuthorisedReason) r6
            int r8 = com.mypinpad.tsdk.isolation.pv.f57766a
            int r8 = r8 + 39
            int r2 = r8 % 128
            com.mypinpad.tsdk.isolation.pv.f57767b = r2
            int r8 = r8 % r9
            if (r8 != 0) goto L7a
            int[] r8 = com.mypinpad.tsdk.i.pv.setDividerPadding.setX
            int r6 = r6.ordinal()
            r6 = r8[r6]
            r8 = 7
            int r8 = r8 / r0
            if (r6 == r1) goto La0
            if (r6 != r9) goto L9a
            goto L86
        L7a:
            int[] r8 = com.mypinpad.tsdk.i.pv.setDividerPadding.setX
            int r6 = r6.ordinal()
            r6 = r8[r6]
            if (r6 == r1) goto La0
            if (r6 != r9) goto L9a
        L86:
            com.mypinpad.tsdk.i.qs r6 = com.mypinpad.tsdk.isolation.qs.setCompoundDrawableTintBlendMode
            int r8 = com.mypinpad.tsdk.isolation.pv.f57766a
            r0 = r8 ^ 119(0x77, float:1.67E-43)
            r8 = r8 & 119(0x77, float:1.67E-43)
            r8 = r8 | r0
            int r8 = r8 << r1
            int r8 = r8 - r0
            int r0 = r8 % 128
            com.mypinpad.tsdk.isolation.pv.f57767b = r0
            int r8 = r8 % r9
            if (r8 == 0) goto L99
            goto Lb1
        L99:
            throw r7
        L9a:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        La0:
            com.mypinpad.tsdk.i.qs r6 = com.mypinpad.tsdk.isolation.qs.setDividerPadding
            int r8 = com.mypinpad.tsdk.isolation.pv.f57767b
            r0 = r8 ^ 95
            r8 = r8 & 95
            int r8 = r8 << r1
            int r0 = r0 + r8
            int r8 = r0 % 128
            com.mypinpad.tsdk.isolation.pv.f57766a = r8
            int r0 = r0 % r9
            if (r0 != 0) goto Lb2
        Lb1:
            return r6
        Lb2:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.pv.setX(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static final /* synthetic */ qs setX(TransactionNotAuthorisedReason transactionNotAuthorisedReason) {
        return (qs) setX(new Object[]{transactionNotAuthorisedReason}, -1770134076, 1770134076, (int) System.currentTimeMillis());
    }
}
