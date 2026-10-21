package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class atm extends apl.setY {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53832f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53833g = 1;

    /* JADX WARN: Code duplicated, block: B:107:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:108:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:110:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:112:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:113:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:115:0x0412  */
    /* JADX WARN: Code duplicated, block: B:116:0x0430  */
    /* JADX WARN: Code duplicated, block: B:119:0x045c  */
    /* JADX WARN: Code duplicated, block: B:120:0x047a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0480  */
    /* JADX WARN: Code duplicated, block: B:124:0x048f  */
    /* JADX WARN: Code duplicated, block: B:125:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:127:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:130:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:132:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:134:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:136:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:139:0x0529  */
    /* JADX WARN: Code restructure failed: missing block: B:167:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        if (r4 != true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        if ((!r4) != true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        r0 = r9.setY();
        r1 = com.mypinpad.tsdk.isolation.atm.f53833g;
        r3 = r1 & 85;
        r1 = (r1 ^ 85) | r3;
        r4 = (r3 & r1) + (r1 | r3);
        com.mypinpad.tsdk.isolation.atm.f53832f = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00be, code lost:
    
        if ((r4 % 2) == 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        r1 = 70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
    
        r0 = r3.setOnFocusChangeListener(r0);
        r2 = com.mypinpad.tsdk.isolation.atm.f53833g;
        r3 = (r2 ^ 117) + ((r2 & 117) << 1);
        com.mypinpad.tsdk.isolation.atm.f53832f = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d6, code lost:
    
        if ((r3 % 2) != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 1530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.atm.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, -596889933, 596889936, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apk setNavigationOnClickListener() {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this}, 885135813, -885135812, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, -1689362109, 1689362111, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this, aplVar}, -80550980, 80550980, System.identityHashCode(this));
    }
}
