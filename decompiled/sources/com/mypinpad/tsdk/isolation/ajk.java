package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class ajk extends adw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f52893s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52894t0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public acz f52895r0;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r5.length == 1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        r2 = new java.lang.StringBuilder("KeyUsage: 0x");
        r2.append(java.lang.Integer.toHexString(r5[0] & 255));
        r5 = r2.toString();
        r6 = com.mypinpad.tsdk.isolation.ajk.f52893s0;
        r8 = r6 & 43;
        r6 = -(-((r6 ^ 43) | r8));
        r2 = (r8 ^ r6) + ((r6 & r8) << 1);
        com.mypinpad.tsdk.isolation.ajk.f52894t0 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0082, code lost:
    
        if ((r2 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0086, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0087, code lost:
    
        r2 = new java.lang.StringBuilder("KeyUsage: 0x");
        r6 = (r5[1] & 255) << 8;
        r5 = r5[0] & 255;
        r8 = r6 & r5;
        r5 = (r5 | r6) & (~r8);
        r2.append(java.lang.Integer.toHexString((r5 & r8) | (r5 ^ r8)));
        r5 = r2.toString();
        r6 = com.mypinpad.tsdk.isolation.ajk.f52894t0;
        r8 = r6 & 17;
        r6 = (r6 | 17) & (~r8);
        r8 = r8 << 1;
        r2 = (r6 ^ r8) + ((r6 & r8) << 1);
        com.mypinpad.tsdk.isolation.ajk.f52893s0 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00bd, code lost:
    
        if ((r2 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
    
        if (r5.length == 1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object setDividerPadding(java.lang.Object[] r5, int r6, int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ajk.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static ajk setOnFocusChangeListener(Object obj) {
        return (ajk) setDividerPadding(new Object[]{obj}, -1521535284, 1521535286, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setDividerPadding(new Object[]{this}, -1178284768, 1178284769, System.identityHashCode(this));
    }

    public final String toString() {
        return (String) setDividerPadding(new Object[]{this}, 1592948590, -1592948590, System.identityHashCode(this));
    }
}
