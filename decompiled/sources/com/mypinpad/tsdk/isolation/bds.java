package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class bds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54592a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54593b = 1;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
    
        if (r1 != r10.length) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        r10 = (r0 | 9) << 1;
        r11 = -(r0 ^ 9);
        r12 = (r10 & r11) + (r10 | r11);
        com.mypinpad.tsdk.isolation.bds.f54592a = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        r0 = r11.length;
        r1 = (int) java.lang.System.currentTimeMillis();
        r2 = -(-(r0 * 46));
        r5 = (-46) & r2;
        r4 = (((((-46) ^ r2) | r5) << 1) - (~(-((r2 | (-46)) & (~r5))))) - 1;
        r2 = ~r0;
        r3 = (r2 | r0) & r2;
        r5 = ~r1;
        r6 = r3 ^ r5;
        r7 = r3 & r5;
        r6 = (r6 & r7) | (r6 ^ r7);
        r7 = ~r6;
        r6 = (r6 | r7) & r7;
        r8 = (-1) ^ r6;
        r6 = ((r6 & r8) | (r8 ^ r6)) * (-90);
        r8 = r4 ^ r6;
        r4 = (r4 & r6) << 1;
        r6 = (r8 ^ r4) + ((r4 & r8) << 1);
        r4 = r2 & r1;
        r4 = r4 | ((~r4) & (r2 | r1));
        r8 = ~r4;
        r4 = (r4 | r8) & r8;
        r0 = ~((r0 & r2) | (r2 ^ r0));
        r2 = ((~r0) & r4) | ((~r4) & r0);
        r0 = r0 & r4;
        r0 = -(~(-(-(((r0 & r2) | (r2 ^ r0)) * (-45)))));
        r0 = (-2) - ((((r6 | r0) << 1) - (r0 ^ r6)) ^ (-1));
        r1 = (r1 | r5) & r5;
        r2 = ((~r1) & r3) | ((~r3) & r1);
        r1 = r1 & r3;
        r1 = (r1 & r2) | (r2 ^ r1);
        r2 = ~r5;
        r2 = ~((r2 & r5) | (r2 ^ r5));
        r1 = ((r1 & r2) | (r1 ^ r2)) * 45;
        r2 = (r0 & r1) + (r0 | r1);
        r0 = com.mypinpad.tsdk.isolation.bds.f54592a;
        r1 = r0 & 77;
        r0 = -(-(r0 | 77));
        r3 = (r1 ^ r0) + ((r0 & r1) << 1);
        com.mypinpad.tsdk.isolation.bds.f54593b = r3 % 128;
        r3 = r3 % 2;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f7, code lost:
    
        if (r2 < 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f9, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.bds.f54592a;
        r3 = r1 + 111;
        r4 = r3 % 128;
        com.mypinpad.tsdk.isolation.bds.f54593b = r4;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0107, code lost:
    
        if (r11[r2] != r10[r2]) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0109, code lost:
    
        r3 = r1 & 11;
        r4 = (r1 ^ 11) | r3;
        r5 = (r3 & r4) + (r3 | r4);
        com.mypinpad.tsdk.isolation.bds.f54593b = r5 % 128;
        r5 = r5 % 2;
        r3 = r1 & 107;
        r1 = (r1 | 107) & (~r3);
        r3 = r3 << 1;
        r4 = ((r1 | r3) << 1) - (r1 ^ r3);
        com.mypinpad.tsdk.isolation.bds.f54593b = r4 % 128;
        r4 = r4 % 2;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x012c, code lost:
    
        r1 = (r4 ^ 21) + ((r4 & 21) << 1);
        com.mypinpad.tsdk.isolation.bds.f54592a = r1 % 128;
        r1 = r1 % 2;
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0139, code lost:
    
        r0 = r0 & r1;
        r2 = r2 - 29;
        r1 = r2 ^ 28;
        r2 = (((r2 & 28) | r1) << 1) - r1;
        r1 = com.mypinpad.tsdk.isolation.bds.f54593b;
        r3 = (r1 & 121) + (r1 | 121);
        com.mypinpad.tsdk.isolation.bds.f54592a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0151, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.bds.f54593b;
        r11 = ((r10 ^ 43) | (r10 & 43)) << 1;
        r10 = -(((~r10) & 43) | (r10 & (-44)));
        r12 = (r11 & r10) + (r10 | r11);
        com.mypinpad.tsdk.isolation.bds.f54592a = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0194, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004a, code lost:
    
        if (r1 != r10.length) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.bds.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static int[] setDividerPadding(int[] iArr) {
        return (int[]) setCompoundDrawableTintBlendMode(new Object[]{iArr}, 1409201840, -1409201839, (int) System.currentTimeMillis());
    }

    public static boolean setX(int[] iArr, int[] iArr2) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2}, -134876455, 134876455, (int) System.currentTimeMillis())).booleanValue();
    }
}
