package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class aqz extends apk.setDividerPadding {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53639d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f53640e = 1;
    protected int[] setNavigationOnClickListener;
    public static final BigInteger setOnDragListener = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"}, -666540625, 666540626, (int) System.currentTimeMillis()));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f53638c = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};

    static {
        int i10 = f53640e;
        int i11 = (i10 ^ 11) + ((i10 & 11) << 1);
        f53639d = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public aqz(int[] iArr) {
        this.setNavigationOnClickListener = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x08a5  */
    /* JADX WARN: Code restructure failed: missing block: B:112:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:?, code lost:
    
        return java.lang.Boolean.valueOf(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:?, code lost:
    
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0407, code lost:
    
        if (r1 == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x040a, code lost:
    
        if (r1 == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x040c, code lost:
    
        r2 = r2 + 55;
        com.mypinpad.tsdk.isolation.aqz.f53640e = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0419, code lost:
    
        if ((r1 instanceof com.mypinpad.tsdk.isolation.aqz) == true) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x041b, code lost:
    
        r0 = r2 & 37;
        r1 = -(-((r2 ^ 37) | r0));
        r3 = (r0 ^ r1) + ((r0 & r1) << 1);
        com.mypinpad.tsdk.isolation.aqz.f53640e = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x042c, code lost:
    
        if ((r3 % 2) != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x042f, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0430, code lost:
    
        r0 = (r2 & 15) + (r2 | 15);
        com.mypinpad.tsdk.isolation.aqz.f53640e = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0440, code lost:
    
        r0 = ((java.lang.Boolean) com.mypinpad.tsdk.isolation.avb.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r0.setNavigationOnClickListener, ((com.mypinpad.tsdk.isolation.aqz) r1).setNavigationOnClickListener}, -1978536009, 1978536023, (int) java.lang.System.currentTimeMillis())).booleanValue();
        r1 = com.mypinpad.tsdk.isolation.aqz.f53640e;
        r2 = ((r1 ^ 45) | (r1 & 45)) << 1;
        r1 = -(((~r1) & 45) | (r1 & (-46)));
        r3 = ((r2 | r1) << 1) - (r1 ^ r2);
        com.mypinpad.tsdk.isolation.aqz.f53639d = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x047a, code lost:
    
        if ((r3 % 2) != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0482, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setY(java.lang.Object[] r16, int r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 2424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aqz.setY(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setY(new Object[]{this, obj}, -1462773752, 1462773758, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean getNavBarTitleString() {
        return ((Boolean) setY(new Object[]{this}, -360537223, 360537231, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setY(new Object[]{this}, 1513227370, -1513227370, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setY(new Object[]{this}, -1147769509, 1147769524, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, 1284826142, -1284826135, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, 266943217, -266943204, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setNavigationOnClickListener() {
        return (apk) setY(new Object[]{this}, -1140390507, 1140390516, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setOnDragListener() {
        return ((Boolean) setY(new Object[]{this}, 1933593840, -1933593829, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnFocusChangeListener(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, -106128020, 106128022, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnLongClickListener() {
        return (apk) setY(new Object[]{this}, 1869952244, -1869952241, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setX() {
        return (apk) setY(new Object[]{this}, -1321119970, 1321119980, System.identityHashCode(this));
    }

    public aqz() {
        this.setNavigationOnClickListener = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setY(new Object[]{this}, 499920651, -499920637, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding() {
        return (apk) setY(new Object[]{this}, 1215776558, -1215776557, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final int setOnFocusChangeListener() {
        return ((Integer) setY(new Object[]{this}, -1538118042, 1538118046, System.identityHashCode(this))).intValue();
    }

    public aqz(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(setOnDragListener) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        this.setNavigationOnClickListener = (int[]) arb.setDividerPadding(new Object[]{bigInteger}, -1544672899, 1544672909, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY() {
        return (apk) setY(new Object[]{this}, 2025507400, -2025507388, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, 2032546834, -2032546829, System.identityHashCode(this));
    }
}
