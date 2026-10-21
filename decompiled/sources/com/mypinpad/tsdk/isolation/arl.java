package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class arl extends apk.setDividerPadding {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53685c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53686d = 1;
    public static final BigInteger setLayoutAnimation = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"}, -666540625, 666540626, (int) System.currentTimeMillis()));
    protected int[] setOnDragListener;

    static {
        int i10 = f53686d + 85;
        f53685c = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 86 / 0;
        }
    }

    public arl(int[] iArr) {
        this.setOnDragListener = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        r1 = r4 & 61;
        r0 = ((r4 ^ 61) | r1) << 1;
        r1 = -((~r1) & (r4 | 61));
        r2 = ((r0 | r1) << 1) - (r0 ^ r1);
        r0 = r2 % 128;
        com.mypinpad.tsdk.isolation.arl.f53685c = r0;
        r2 = r2 % 2;
        r1 = ((r0 | 29) << 1) - (r0 ^ 29);
        com.mypinpad.tsdk.isolation.arl.f53686d = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0080, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0086, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        if ((r3 instanceof com.mypinpad.tsdk.isolation.arl) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
    
        r0 = (r4 & 85) + (r4 | 85);
        r1 = r0 % 128;
        com.mypinpad.tsdk.isolation.arl.f53685c = r1;
        r0 = r0 % 2;
        r0 = (-2) - (((r1 ^ 50) + ((r1 & 50) << 1)) ^ (-1));
        com.mypinpad.tsdk.isolation.arl.f53686d = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
    
        r0 = ((java.lang.Boolean) com.mypinpad.tsdk.isolation.avf.setX(new java.lang.Object[]{r0.setOnDragListener, ((com.mypinpad.tsdk.isolation.arl) r3).setOnDragListener}, -434699419, 434699434, (int) java.lang.System.currentTimeMillis())).booleanValue();
        r1 = com.mypinpad.tsdk.isolation.arl.f53685c + 29;
        com.mypinpad.tsdk.isolation.arl.f53686d = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cc, code lost:
    
        if ((r1 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ce, code lost:
    
        r1 = 27 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005b, code lost:
    
        if (r3 == r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
    
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005e, code lost:
    
        if (r3 == r0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setX(java.lang.Object[] r16, int r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 1868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.arl.setX(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, -1942538340, 1942538340, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean getNavBarTitleString() {
        return ((Boolean) setX(new Object[]{this}, -1140029275, 1140029283, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, -1913150790, 1913150799, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setX(new Object[]{this}, 1904959539, -1904959529, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar) {
        return (apk) setX(new Object[]{this, apkVar}, 382646192, -382646186, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding(apk apkVar) {
        return (apk) setX(new Object[]{this, apkVar}, 1601886316, -1601886314, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setNavigationOnClickListener() {
        return (apk) setX(new Object[]{this}, -1796350022, 1796350029, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setOnDragListener() {
        return ((Boolean) setX(new Object[]{this}, -1008991265, 1008991277, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnFocusChangeListener(apk apkVar) {
        return (apk) setX(new Object[]{this, apkVar}, 407715821, -407715816, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnLongClickListener() {
        return (apk) setX(new Object[]{this}, -1056825667, 1056825668, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY() {
        return (apk) setX(new Object[]{this}, -2053427104, 2053427118, System.identityHashCode(this));
    }

    public arl() {
        this.setOnDragListener = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setX(new Object[]{this}, -823509826, 823509829, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding() {
        return (apk) setX(new Object[]{this}, 1170384017, -1170384002, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final int setOnFocusChangeListener() {
        return ((Integer) setX(new Object[]{this}, -257315591, 257315602, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar) {
        return (apk) setX(new Object[]{this, apkVar}, 469316614, -469316610, System.identityHashCode(this));
    }

    public arl(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(setLayoutAnimation) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.setOnDragListener = (int[]) arm.setX(new Object[]{bigInteger}, -1902789300, 1902789301, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setX() {
        return (apk) setX(new Object[]{this}, 680343102, -680343089, System.identityHashCode(this));
    }
}
