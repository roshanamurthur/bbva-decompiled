package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class ajg extends adw implements adg {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52875t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52876u0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final add f52877r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f52878s0;

    public ajg(int i10, adw adwVar) {
        this.f52877r0 = adwVar;
        this.f52878s0 = i10;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0287  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c5, code lost:
    
        if ((r5 instanceof com.mypinpad.tsdk.isolation.ajg) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cc, code lost:
    
        if ((!(r5 instanceof com.mypinpad.tsdk.isolation.ajg)) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
    
        if ((r5 instanceof com.mypinpad.tsdk.isolation.aeh) == true) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d5, code lost:
    
        if ((!(r5 instanceof byte[])) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d7, code lost:
    
        r6 = (r3 & 103) + (r3 | 103);
        com.mypinpad.tsdk.isolation.ajg.f52875t0 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e1, code lost:
    
        r5 = (com.mypinpad.tsdk.isolation.ajg) setY(new java.lang.Object[]{(com.mypinpad.tsdk.isolation.ady) com.mypinpad.tsdk.isolation.ady.setNavigationOnClickListener(new java.lang.Object[]{(byte[]) r5}, -1692126728, 1692126730, (int) java.lang.System.currentTimeMillis())}, -614136404, 614136407, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010d, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.ajg.f52876u0 + 37;
        com.mypinpad.tsdk.isolation.ajg.f52875t0 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0116, code lost:
    
        if ((r6 % 2) != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0122, code lost:
    
        throw new java.lang.IllegalArgumentException("unable to parse encoded general name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012e, code lost:
    
        throw new java.lang.IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(r5, "unknown object in getInstance: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012f, code lost:
    
        r2 = r6 & 91;
        r6 = (r6 | 91) & (~r2);
        r2 = r2 << 1;
        r3 = (r6 ^ r2) + ((r6 & r2) << 1);
        com.mypinpad.tsdk.isolation.ajg.f52876u0 = r3 % 128;
        r3 = r3 % 2;
        r5 = (com.mypinpad.tsdk.isolation.aeh) r5;
        r6 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.aeh.setOnFocusChangeListener(new java.lang.Object[]{r5}, -1417963191, 1417963201, java.lang.System.identityHashCode(r5))).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015a, code lost:
    
        switch(r6) {
            case 0: goto L56;
            case 1: goto L52;
            case 2: goto L52;
            case 3: goto L56;
            case 4: goto L48;
            case 5: goto L56;
            case 6: goto L52;
            case 7: goto L47;
            case 8: goto L45;
            default: goto L43;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016c, code lost:
    
        throw new java.lang.IllegalArgumentException("unknown tag: ".concat(java.lang.String.valueOf(r6)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x016d, code lost:
    
        r7 = new com.mypinpad.tsdk.isolation.ajg(r6, com.mypinpad.tsdk.isolation.adu.setX(r5));
        r5 = com.mypinpad.tsdk.isolation.ajg.f52876u0;
        r6 = (r5 | 97) << 1;
        r5 = -(((~r5) & 97) | (r5 & (-98)));
        r8 = ((r6 | r5) << 1) - (r5 ^ r6);
        com.mypinpad.tsdk.isolation.ajg.f52875t0 = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x018f, code lost:
    
        r7 = new com.mypinpad.tsdk.isolation.ajg(r6, com.mypinpad.tsdk.isolation.ads.setCompoundDrawableTintBlendMode(r5, false));
        r5 = com.mypinpad.tsdk.isolation.ajg.f52876u0 + 101;
        com.mypinpad.tsdk.isolation.ajg.f52875t0 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a2, code lost:
    
        r8 = new com.mypinpad.tsdk.isolation.ajg(r6, com.mypinpad.tsdk.isolation.ain.setX(r5));
        r5 = com.mypinpad.tsdk.isolation.ajg.f52875t0;
        r5 = (-2) - (((r5 & 84) + (r5 | 84)) ^ (-1));
        com.mypinpad.tsdk.isolation.ajg.f52876u0 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01bb, code lost:
    
        if ((r5 % 2) == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c1, code lost:
    
        r8 = new com.mypinpad.tsdk.isolation.ajg(r6, com.mypinpad.tsdk.isolation.adn.setOnFocusChangeListener(r5));
        r5 = com.mypinpad.tsdk.isolation.ajg.f52876u0;
        r6 = r5 & 123;
        r6 = r6 + ((r5 ^ 123) | r6);
        com.mypinpad.tsdk.isolation.ajg.f52875t0 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01d7, code lost:
    
        if ((r6 % 2) != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01da, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01db, code lost:
    
        r7 = new com.mypinpad.tsdk.isolation.ajg(r6, com.mypinpad.tsdk.isolation.aed.setOnFocusChangeListener(r5, false));
        r5 = com.mypinpad.tsdk.isolation.ajg.f52875t0;
        r6 = r5 & 121;
        r5 = (r5 ^ 121) | r6;
        r1 = (r6 & r5) + (r5 | r6);
        com.mypinpad.tsdk.isolation.ajg.f52876u0 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01f4, code lost:
    
        if ((r1 % 2) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01f6, code lost:
    
        r5 = 21 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setY(java.lang.Object[] r5, int r6, int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ajg.setY(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setY(new Object[]{this}, 1488552134, -1488552130, System.identityHashCode(this));
    }

    public final add setCompoundDrawableTintBlendMode() {
        return (add) setY(new Object[]{this}, -1317152162, 1317152162, System.identityHashCode(this));
    }

    public final int setX() {
        return ((Integer) setY(new Object[]{this}, -1465077207, 1465077209, System.identityHashCode(this))).intValue();
    }

    public final String toString() {
        return (String) setY(new Object[]{this}, 850052562, -850052561, System.identityHashCode(this));
    }

    public static ajg setCompoundDrawableTintBlendMode(Object obj) {
        return (ajg) setY(new Object[]{obj}, -614136404, 614136407, (int) System.currentTimeMillis());
    }
}
