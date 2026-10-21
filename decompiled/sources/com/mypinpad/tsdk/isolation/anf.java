package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class anf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53307c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53308d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f53309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53310b;

    public anf(byte[] bArr, int i10) {
        this.f53309a = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f53310b = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c9, code lost:
    
        if ((r9 instanceof com.mypinpad.tsdk.isolation.anf) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ce, code lost:
    
        if ((r9 instanceof com.mypinpad.tsdk.isolation.anf) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d0, code lost:
    
        r9 = (r2 ^ 3) + ((r2 & 3) << 1);
        com.mypinpad.tsdk.isolation.anf.f53307c = r9 % 128;
        r9 = r9 % 2;
        r9 = (r2 & 71) + (r2 | 71);
        com.mypinpad.tsdk.isolation.anf.f53307c = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e9, code lost:
    
        r9 = (com.mypinpad.tsdk.isolation.anf) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ef, code lost:
    
        if (r9.f53310b == r11.f53310b) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f1, code lost:
    
        r9 = java.lang.System.identityHashCode(r11);
        r10 = ~r9;
        r3 = ((1938327993 & r10) | ((-1938327994) & r9)) | (1938327993 & r9);
        r4 = ~r3;
        r3 = (r3 | r4) & r4;
        r4 = (-533274633) - (~(-(~(-(-(((r3 & 7434818) | (7434818 ^ r3)) * 336))))));
        r5 = 552729435 & r10;
        r9 = ((~((r9 & 552729435) | ((r9 & (-552729436)) | r5))) | 1393033376) * (-168);
        r7 = ((r4 ^ r9) | (r4 & r9)) << 1;
        r9 = -((r9 & (~r4)) | ((~r9) & r4));
        r4 = (r7 & r9) + (r9 | r7);
        r9 = (r10 & (-552729436)) | ((~r10) & 552729435);
        r9 = (r9 & r5) | (r9 ^ r5);
        r10 = ~r9;
        r9 = (r9 | r10) & r10;
        r10 = 1938327993 & r9;
        r9 = (r9 | 1938327993) & (~r10);
        r9 = -(-(((r9 & r10) | (r9 ^ r10)) * 168));
        r10 = (((r4 ^ r9) | (r4 & r9)) << 1) - ((r9 & (~r4)) | ((~r9) & r4));
        r9 = java.lang.System.identityHashCode(r11);
        r2 = (-1796351711) ^ r9;
        r3 = ~r9;
        r4 = (-1796351711) & r9;
        r2 = (((r2 & r4) | (r2 ^ r4)) * (-50)) + 271747930;
        r4 = (1871947774 & r9) | (1871947774 ^ r9);
        r5 = ~r4;
        r6 = 209822582 ^ r3;
        r7 = 209822582 & r3;
        r4 = (((r4 | r5) & r5) | (~(((r6 & r7) | (r6 ^ r7)) | (-1796351711)))) * 50;
        r6 = ((r2 ^ r4) | (r2 & r4)) << 1;
        r2 = -(((~r2) & r4) | ((~r4) & r2));
        r4 = ((r6 | r2) << 1) - (r2 ^ r6);
        r9 = (r9 | r3) & r3;
        r2 = 209822582 ^ r9;
        r9 = r9 & 209822582;
        r9 = ~((r9 & r2) | (r2 ^ r9));
        r9 = (r9 & 1662125192) | (r9 ^ 1662125192);
        r2 = r3 & (-1796351711);
        r11 = ((-1796351711) | r3) & (~r2);
        r11 = ~((r11 & r2) | (r11 ^ r2));
        r2 = ((~r11) & r9) | ((~r9) & r11);
        r9 = r9 & r11;
        r9 = -(~(-(-(((r9 & r2) | (r2 ^ r9)) * 50))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01d3, code lost:
    
        if (r10 > ((((r4 | r9) << 1) - (r9 ^ r4)) - 1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01d5, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01d7, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01d8, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.anf.f53307c;
        r11 = r10 & 107;
        r10 = (r10 | 107) & (~r11);
        r11 = -(-(r11 << 1));
        r1 = ((r10 | r11) << 1) - (r10 ^ r11);
        com.mypinpad.tsdk.isolation.anf.f53308d = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01ee, code lost:
    
        if ((r1 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01f0, code lost:
    
        r10 = 87 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01f8, code lost:
    
        r9 = ((java.lang.Boolean) com.mypinpad.tsdk.isolation.bek.setOnFocusChangeListener(new java.lang.Object[]{r11.f53309a, r9.f53309a}, -576846525, 576846546, (int) java.lang.System.currentTimeMillis())).booleanValue();
        r11 = com.mypinpad.tsdk.isolation.anf.f53308d;
        r12 = (r11 & (-2)) | ((~r11) & 1);
        r11 = -(-((r11 & 1) << 1));
        r2 = (r12 ^ r11) + ((r11 & r12) << 1);
        com.mypinpad.tsdk.isolation.anf.f53307c = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x022c, code lost:
    
        if ((r2 % 2) != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x022f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return java.lang.Boolean.valueOf(r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setDividerPadding(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.anf.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, 81128120, -81128118, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, 2086315670, -2086315667, System.identityHashCode(this))).intValue();
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setDividerPadding(new Object[]{this}, 1211734093, -1211734093, System.identityHashCode(this));
    }

    public final int setX() {
        return ((Integer) setDividerPadding(new Object[]{this}, 1515847919, -1515847918, System.identityHashCode(this))).intValue();
    }
}
