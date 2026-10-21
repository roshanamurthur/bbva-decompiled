package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class avo extends adw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f53987s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f53988t0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public byte[] f53989r0;

    public avo(byte[] bArr) {
        this.f53989r0 = bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007e, code lost:
    
        if (r2 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
    
        if ((!r2) != true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0084, code lost:
    
        r7 = (r1 & 106) + (r1 | 106);
        r2 = (r7 ^ (-1)) + (r7 << 1);
        com.mypinpad.tsdk.isolation.avo.f53988t0 = r2 % 128;
        r2 = r2 % 2;
        r6 = (com.mypinpad.tsdk.isolation.avo) r6;
        r7 = r1 & 83;
        r1 = (r1 | 83) & (~r7);
        r7 = r7 << 1;
        r2 = (r1 ^ r7) + ((r7 & r1) << 1);
        com.mypinpad.tsdk.isolation.avo.f53988t0 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a5, code lost:
    
        if ((r2 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:
    
        r7 = 18 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ac, code lost:
    
        if (r6 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ae, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.aed.setCompoundDrawableTintBlendMode(r6);
        r7 = new com.mypinpad.tsdk.isolation.avo();
        r6 = (com.mypinpad.tsdk.isolation.ads) com.mypinpad.tsdk.isolation.ads.setDividerPadding(new java.lang.Object[]{r6.setX(0)}, 1337255032, -1337255030, (int) java.lang.System.currentTimeMillis());
        r7.f53989r0 = (byte[]) com.mypinpad.tsdk.isolation.bek.setOnFocusChangeListener(new java.lang.Object[]{(byte[]) com.mypinpad.tsdk.isolation.ads.setDividerPadding(new java.lang.Object[]{r6}, -952512304, 952512305, java.lang.System.identityHashCode(r6))}, -150521869, 150521882, (int) java.lang.System.currentTimeMillis());
        r6 = com.mypinpad.tsdk.isolation.avo.f53988t0;
        r6 = (-2) - (((r6 & 106) + (r6 | 106)) ^ (-1));
        com.mypinpad.tsdk.isolation.avo.f53987s0 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x010d, code lost:
    
        r6 = r7 & 45;
        r7 = (r7 | 45) & (~r6);
        r6 = r6 << 1;
        r8 = (r7 ^ r6) + ((r6 & r7) << 1);
        com.mypinpad.tsdk.isolation.avo.f53987s0 = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object setOnFocusChangeListener(java.lang.Object[] r6, int r7, int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.avo.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static avo setX(Object obj) {
        return (avo) setOnFocusChangeListener(new Object[]{obj}, 658749726, -658749724, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setOnFocusChangeListener(new Object[]{this}, -611087247, 611087248, System.identityHashCode(this));
    }

    public final byte[] setY() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -22282219, 22282219, System.identityHashCode(this));
    }
}
