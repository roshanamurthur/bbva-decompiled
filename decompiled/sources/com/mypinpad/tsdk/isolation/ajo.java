package com.mypinpad.tsdk.isolation;

import java.util.Date;

/* JADX INFO: loaded from: classes10.dex */
public final class ajo extends adw implements adg {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f52917s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52918t0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ady f52919r0;

    public ajo(ady adyVar) {
        if (!(adyVar instanceof aeq) && !(adyVar instanceof adm)) {
            throw new IllegalArgumentException("unknown object passed to Time");
        }
        this.f52919r0 = adyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        if (r6 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        if ((!r6) != true) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        r5 = (com.mypinpad.tsdk.isolation.aeq) r5.f52919r0;
        r5 = (java.lang.String) com.mypinpad.tsdk.isolation.aeq.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r5}, -1116567257, 1116567262, java.lang.System.identityHashCode(r5));
        r6 = com.mypinpad.tsdk.isolation.ajo.f52917s0;
        r7 = r6 & 109;
        r6 = ((r6 | 109) & (~r7)) + (r7 << 1);
        com.mypinpad.tsdk.isolation.ajo.f52918t0 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
    
        r5 = (com.mypinpad.tsdk.isolation.adm) r5.f52919r0;
        r5 = (java.lang.String) com.mypinpad.tsdk.isolation.adm.setDividerPadding(new java.lang.Object[]{r5}, -742607419, 742607419, java.lang.System.identityHashCode(r5));
        r6 = com.mypinpad.tsdk.isolation.ajo.f52918t0;
        r7 = (r6 | 5) << 1;
        r6 = -(r6 ^ 5);
        r1 = (r7 ^ r6) + ((r6 & r7) << 1);
        com.mypinpad.tsdk.isolation.ajo.f52917s0 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r5, int r6, int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ajo.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static ajo setY(Object obj) {
        return (ajo) setCompoundDrawableTintBlendMode(new Object[]{obj}, 149911214, -149911213, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, -2014427996, 2014428000, System.identityHashCode(this));
    }

    public final String setDividerPadding() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 509972914, -509972911, System.identityHashCode(this));
    }

    public final Date setOnFocusChangeListener() {
        return (Date) setCompoundDrawableTintBlendMode(new Object[]{this}, 1704230957, -1704230955, System.identityHashCode(this));
    }

    public final String toString() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 15556497, -15556497, System.identityHashCode(this));
    }
}
