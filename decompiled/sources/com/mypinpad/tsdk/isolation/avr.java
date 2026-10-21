package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class avr extends adw {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f53997t0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final adp f53998r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final aiw f53999s0;

    public avr(aed aedVar) {
        this.f53998r0 = (adp) adp.setOnFocusChangeListener(new Object[]{aedVar.setX(0)}, -837021952, 837021958, (int) System.currentTimeMillis());
        this.f53999s0 = (aiw) aiw.setOnFocusChangeListener(new Object[]{aedVar.setX(1)}, 866360717, -866360713, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a0, code lost:
    
        if ((r5 instanceof com.mypinpad.tsdk.isolation.avr) != true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a6, code lost:
    
        if ((!(r5 instanceof com.mypinpad.tsdk.isolation.avr)) != true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a8, code lost:
    
        r6 = (r1 & 51) + (r1 | 51);
        r8 = r6 % 128;
        com.mypinpad.tsdk.isolation.avr.f53997t0 = r8;
        r5 = (com.mypinpad.tsdk.isolation.avr) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b4, code lost:
    
        if ((r6 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b6, code lost:
    
        r1 = r8 & 105;
        r6 = ((r8 ^ 105) | r1) << 1;
        r8 = -((r8 | 105) & (~r1));
        r7 = ((r6 | r8) << 1) - (r6 ^ r8);
        r6 = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00cb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cc, code lost:
    
        if (r5 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ce, code lost:
    
        r6 = new com.mypinpad.tsdk.isolation.avr(com.mypinpad.tsdk.isolation.aed.setCompoundDrawableTintBlendMode(r5));
        r5 = com.mypinpad.tsdk.isolation.avr.f53997t0;
        r8 = r5 | 13;
        r1 = ((r8 << 1) - (~(-((~(r5 & 13)) & r8)))) - 1;
        r5 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e8, code lost:
    
        if ((r1 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ec, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ed, code lost:
    
        r5 = (r1 ^ 37) + ((r1 & 37) << 1);
        com.mypinpad.tsdk.isolation.avr.f53997t0 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setX(java.lang.Object[] r5, int r6, int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.avr.setX(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static final avr setY(Object obj) {
        return (avr) setX(new Object[]{obj}, -19534878, 19534879, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setX(new Object[]{this}, 1885977355, -1885977355, System.identityHashCode(this));
    }

    public avr(aiw aiwVar) {
        this.f53998r0 = new adp(0L);
        this.f53999s0 = aiwVar;
    }

    public final aiw setX() {
        return (aiw) setX(new Object[]{this}, -656659519, 656659521, System.identityHashCode(this));
    }
}
