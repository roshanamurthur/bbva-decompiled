package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class aqj extends apk.setDividerPadding {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53588c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53589d = 1;
    public static final BigInteger setLayoutAnimation = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"}, -666540625, 666540626, (int) System.currentTimeMillis()));
    protected int[] getNavBarTitleString;

    static {
        int i10 = f53588c;
        int i11 = i10 ^ 77;
        int i12 = -(-((i10 & 77) << 1));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53589d = i13 % 128;
        int i14 = i13 % 2;
    }

    public aqj(int[] iArr) {
        this.getNavBarTitleString = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0222  */
    /* JADX WARN: Code duplicated, block: B:27:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:28:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:30:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:31:0x03da  */
    /* JADX WARN: Code duplicated, block: B:33:0x03dc  */
    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:?, code lost:
    
        return java.lang.Boolean.valueOf(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:?, code lost:
    
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x042d, code lost:
    
        if (r2 == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0430, code lost:
    
        if (r2 == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0432, code lost:
    
        r0 = ((r3 ^ 65) - (~(-(-((r3 & 65) << 1))))) - 1;
        r2 = r0 % 128;
        com.mypinpad.tsdk.isolation.aqj.f53589d = r2;
        r0 = r0 % 2;
        r0 = (r2 & 88) + (r2 | 88);
        r2 = (r0 ^ (-1)) + (r0 << 1);
        com.mypinpad.tsdk.isolation.aqj.f53588c = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x044f, code lost:
    
        if ((r2 % 2) == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0451, code lost:
    
        r0 = 89 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x045a, code lost:
    
        if ((!(r2 instanceof com.mypinpad.tsdk.isolation.aqj)) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x045c, code lost:
    
        r0 = ((r3 ^ 97) | (r3 & 97)) << 1;
        r1 = -((r3 & (-98)) | ((~r3) & 97));
        r2 = ((r0 | r1) << 1) - (r0 ^ r1);
        com.mypinpad.tsdk.isolation.aqj.f53589d = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0474, code lost:
    
        if ((r2 % 2) != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0477, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x047e, code lost:
    
        r0 = ((java.lang.Boolean) com.mypinpad.tsdk.isolation.auw.setOnFocusChangeListener(new java.lang.Object[]{r0.getNavBarTitleString, ((com.mypinpad.tsdk.isolation.aqj) r2).getNavBarTitleString}, 563716878, -563716874, (int) java.lang.System.currentTimeMillis())).booleanValue();
        r1 = com.mypinpad.tsdk.isolation.aqj.f53588c;
        r2 = (r1 & 75) + (r1 | 75);
        com.mypinpad.tsdk.isolation.aqj.f53589d = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x06e9, code lost:
    
        if (((java.lang.Integer) com.mypinpad.tsdk.isolation.auw.setOnFocusChangeListener(r2, 2002673659, -2002673653, (int) java.lang.System.currentTimeMillis())).intValue() == 1) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0703, code lost:
    
        if (((java.lang.Integer) com.mypinpad.tsdk.isolation.auw.setOnFocusChangeListener(r2, 2002673659, -2002673653, (int) java.lang.System.currentTimeMillis())).intValue() == 1) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0705, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.aqj.f53588c;
        r1 = ((113 & (~r0)) | (r0 & (-114))) + ((r0 & 113) << 1);
        com.mypinpad.tsdk.isolation.aqj.f53589d = r1 % 128;
        r1 = r1 % 2;
        r1 = r0 & 35;
        r0 = ((r0 | 35) & (~r1)) + (r1 << 1);
        com.mypinpad.tsdk.isolation.aqj.f53589d = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0725, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.aqj.f53589d;
        r1 = (r0 & 7) + (r0 | 7);
        com.mypinpad.tsdk.isolation.aqj.f53588c = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0733, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setY(java.lang.Object[] r16, int r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 1878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aqj.setY(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setY(new Object[]{this, obj}, -2000439010, 2000439019, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean getNavBarTitleString() {
        return ((Boolean) setY(new Object[]{this}, -1098560039, 1098560046, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setY(new Object[]{this}, 1680852613, -1680852601, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setY(new Object[]{this}, 1691451487, -1691451486, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, 285151780, -285151765, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, -1747344934, 1747344938, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setNavigationOnClickListener() {
        return (apk) setY(new Object[]{this}, -395497778, 395497786, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setOnDragListener() {
        return ((Boolean) setY(new Object[]{this}, -2028440034, 2028440039, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnFocusChangeListener(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, -1341695577, 1341695579, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnLongClickListener() {
        return (apk) setY(new Object[]{this}, 1429388685, -1429388674, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setX() {
        return (apk) setY(new Object[]{this}, -1995193408, 1995193408, System.identityHashCode(this));
    }

    public aqj() {
        this.getNavBarTitleString = (int[]) auw.setOnFocusChangeListener(new Object[0], 282180333, -282180314, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setY(new Object[]{this}, -278577079, 278577082, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding() {
        return (apk) setY(new Object[]{this}, -499787984, 499787997, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final int setOnFocusChangeListener() {
        return ((Integer) setY(new Object[]{this}, 969988494, -969988484, System.identityHashCode(this))).intValue();
    }

    public aqj(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(setLayoutAnimation) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.getNavBarTitleString = (int[]) aqc.setX(new Object[]{bigInteger}, 482491134, -482491125, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY() {
        return (apk) setY(new Object[]{this}, -255407361, 255407375, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, 689698215, -689698209, System.identityHashCode(this));
    }
}
