package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class asf extends apk.setOnFocusChangeListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53742f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53743g = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f53744e;

    public asf(long[] jArr) {
        this.f53744e = jArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x02a4, code lost:
    
        if (r12 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02a7, code lost:
    
        if (r12 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02a9, code lost:
    
        r12 = r15 & 81;
        r14 = r15 | 81;
        r15 = r12 + r14;
        com.mypinpad.tsdk.isolation.asf.f53742f = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02b4, code lost:
    
        if ((r15 % 2) != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02b6, code lost:
    
        r15 = ((r12 | r14) << 1) - (r12 ^ r14);
        com.mypinpad.tsdk.isolation.asf.f53742f = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02c0, code lost:
    
        if ((r15 % 2) == 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x02c2, code lost:
    
        r12 = 37 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x02c7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02c8, code lost:
    
        r14 = (long[]) com.mypinpad.tsdk.isolation.auv.setDividerPadding(new java.lang.Object[0], -1915146282, 1915146293, (int) java.lang.System.currentTimeMillis());
        com.mypinpad.tsdk.isolation.asd.setY(new java.lang.Object[]{r13.f53744e, java.lang.Integer.valueOf(r12), r14}, -1771747778, 1771747787, r12);
        r12 = new com.mypinpad.tsdk.isolation.asf(r14);
        r13 = com.mypinpad.tsdk.isolation.asf.f53742f;
        r14 = r13 & 75;
        r13 = -(-((r13 ^ 75) | r14));
        r15 = (r14 & r13) + (r13 | r14);
        com.mypinpad.tsdk.isolation.asf.f53743g = r15 % 128;
        r15 = r15 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r12, int r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 1904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.asf.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final int UiMessageCallbackKtWhenMappings() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -487375136, 487375141, System.identityHashCode(this))).intValue();
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, obj}, 372299361, -372299351, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean getNavBarTitleString() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 1100961127, -1100961120, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -1200719098, 1200719120, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 898812812, -898812801, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding(apk apkVar) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar}, 477994905, -477994905, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final apk setIncludeFontPadding() {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this}, 463256533, -463256519, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setNavigationOnClickListener() {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this}, 1604142219, -1604142198, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setOnDragListener() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -1801264196, 1801264211, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnFocusChangeListener(apk apkVar) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar}, -1495005520, 1495005536, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnLongClickListener() {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this}, 672498879, -672498859, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setX() {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this}, -1233050341, 1233050342, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar, apk apkVar2) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar, apkVar2}, 1754558623, -1754558619, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final boolean setZ() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 534296217, -534296204, System.identityHashCode(this))).booleanValue();
    }

    public asf() {
        this.f53744e = (long[]) auv.setDividerPadding(new Object[0], -1915146282, 1915146293, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding() {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this}, -473275495, 473275503, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final int setOnFocusChangeListener() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 1156043115, -1156043096, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY() {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this}, 1924589887, -1924589869, System.identityHashCode(this));
    }

    public asf(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        this.f53744e = (long[]) asd.setY(new Object[]{bigInteger}, 1293734004, -1293733997, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar, apk apkVar2, apk apkVar3) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar, apkVar2, apkVar3}, -645037696, 645037698, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar}, 1725528235, -1725528218, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(int i10) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10)}, -1208402865, 1208402877, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar, apk apkVar2, apk apkVar3) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar, apkVar2, apkVar3}, 190645113, -190645107, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar}, 1585552743, -1585552734, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, 965193722, -965193719, System.identityHashCode(this));
    }
}
