package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class asp extends apl.setY {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53767f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53768g = 1;

    /* JADX WARN: Code duplicated, block: B:91:0x0340  */
    /* JADX WARN: Code duplicated, block: B:92:0x0370  */
    /* JADX WARN: Code duplicated, block: B:94:0x038f  */
    /* JADX WARN: Code restructure failed: missing block: B:171:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (r7 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        if (r8.setOnDragListener() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.asp.f53768g;
        r2 = r0 & 47;
        r0 = (((r0 | 47) & (~r2)) - (~(-(-(r2 << 1))))) - 1;
        com.mypinpad.tsdk.isolation.asp.f53767f = r0 % 128;
        r0 = r0 % 2;
        r0 = r3.setY();
        r2 = com.mypinpad.tsdk.isolation.asp.f53768g;
        r3 = (((r2 ^ 23) | (r2 & 23)) << 1) - (((~r2) & 23) | (r2 & (-24)));
        com.mypinpad.tsdk.isolation.asp.f53767f = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c2, code lost:
    
        if ((r3 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c7, code lost:
    
        r0 = r6.setOnFocusChangeListener(r0);
        r1 = com.mypinpad.tsdk.isolation.asp.f53768g + 17;
        com.mypinpad.tsdk.isolation.asp.f53767f = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object setDividerPadding(java.lang.Object[] r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 1791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.asp.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setDividerPadding(new Object[]{this}, 2064647739, -2064647736, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apk setNavigationOnClickListener() {
        return (apk) setDividerPadding(new Object[]{this}, 1391447122, -1391447120, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setDividerPadding(new Object[]{this}, -805578950, 805578951, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setDividerPadding(new Object[]{this, aplVar}, 501816185, -501816185, System.identityHashCode(this));
    }
}
