package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class aqv extends apk.setDividerPadding {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53625c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53626d = 1;
    public static final BigInteger getNavBarTitleString = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"}, -666540625, 666540626, (int) System.currentTimeMillis()));
    protected int[] setLayoutAnimation;

    static {
        int i10 = f53625c;
        int i11 = ((-1) << 1) - ((-1) ^ ((i10 & 30) + (i10 | 30)));
        f53626d = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public aqv(int[] iArr) {
        this.setLayoutAnimation = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x027e  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x03ec, code lost:
    
        if (r1 == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x03ef, code lost:
    
        if (r1 == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x03f1, code lost:
    
        r0 = (((r3 ^ 41) | (r3 & 41)) << 1) - ((r3 & (-42)) | ((~r3) & 41));
        com.mypinpad.tsdk.isolation.aqv.f53626d = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0408, code lost:
    
        if ((r1 instanceof com.mypinpad.tsdk.isolation.aqv) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x040a, code lost:
    
        r0 = ((r2 & 11) - (~(r2 | 11))) - 1;
        com.mypinpad.tsdk.isolation.aqv.f53625c = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x041a, code lost:
    
        r0 = ((java.lang.Boolean) com.mypinpad.tsdk.isolation.auv.setDividerPadding(new java.lang.Object[]{r0.setLayoutAnimation, ((com.mypinpad.tsdk.isolation.aqv) r1).setLayoutAnimation}, -556949880, 556949904, (int) java.lang.System.currentTimeMillis())).booleanValue();
        r1 = com.mypinpad.tsdk.isolation.aqv.f53625c;
        r2 = (r1 | 77) << 1;
        r1 = -(((~r1) & 77) | (r1 & (-78)));
        r3 = ((r2 | r1) << 1) - (r1 ^ r2);
        com.mypinpad.tsdk.isolation.aqv.f53626d = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0451, code lost:
    
        if ((r3 % 2) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x045a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:?, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:?, code lost:
    
        return java.lang.Boolean.valueOf(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setY(java.lang.Object[] r16, int r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 1778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aqv.setY(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setY(new Object[]{this, obj}, -99905701, 99905711, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean getNavBarTitleString() {
        return ((Boolean) setY(new Object[]{this}, -471675006, 471675020, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setY(new Object[]{this}, -178407742, 178407750, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setY(new Object[]{this}, 1428954187, -1428954176, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, -329301215, 329301224, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, 1599957245, -1599957239, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setNavigationOnClickListener() {
        return (apk) setY(new Object[]{this}, -1708285319, 1708285324, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setOnDragListener() {
        return ((Boolean) setY(new Object[]{this}, 147560622, -147560618, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnFocusChangeListener(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, -427960857, 427960864, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnLongClickListener() {
        return (apk) setY(new Object[]{this}, -910065503, 910065518, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setX() {
        return (apk) setY(new Object[]{this}, -1317424325, 1317424325, System.identityHashCode(this));
    }

    public aqv() {
        this.setLayoutAnimation = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setY(new Object[]{this}, 1370292460, -1370292457, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding() {
        return (apk) setY(new Object[]{this}, 161256760, -161256759, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final int setOnFocusChangeListener() {
        return ((Integer) setY(new Object[]{this}, 956311760, -956311748, System.identityHashCode(this))).intValue();
    }

    public aqv(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(getNavBarTitleString) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        this.setLayoutAnimation = (int[]) aqy.setDividerPadding(new Object[]{bigInteger}, 198146799, -198146794, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY() {
        return (apk) setY(new Object[]{this}, 603142616, -603142614, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, 2117427996, -2117427983, System.identityHashCode(this));
    }
}
