package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ash extends aph.setDividerPadding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53747g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53748h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final asi f53749f;

    static {
        new asf(apj.setOnFocusChangeListener);
        int i10 = f53748h;
        int i11 = i10 & 119;
        int i12 = -(-(i10 | 119));
        int i13 = (i11 & i12) + (i12 | i11);
        f53747g = i13 % 128;
        int i14 = i13 % 2;
    }

    public ash() {
        super(131, 2, 3, 8);
        this.f53749f = new asi(this, null, null);
        this.setX = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"03E5A88919D7CAFCBF415F07C2176573B2"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"04B8266A46C55657AC734CE38F018F2192"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"0400000000000000016954A233049BA98F"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(2L);
        this.setDividerPadding = 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b5, code lost:
    
        if (r5 != 6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
    
        if (r5 != 6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ba, code lost:
    
        r3 = r3 + 107;
        com.mypinpad.tsdk.isolation.ash.f53747g = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c1, code lost:
    
        if ((r3 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c7, code lost:
    
        r5 = r6 & 117;
        r6 = -(-((r6 ^ 117) | r5));
        r7 = ((r5 | r6) << 1) - (r5 ^ r6);
        com.mypinpad.tsdk.isolation.ash.f53748h = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d8, code lost:
    
        if ((r7 % 2) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dd, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object setDividerPadding(java.lang.Object[] r5, int r6, int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ash.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setDividerPadding(new Object[]{this}, -1943801376, 1943801381, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setDividerPadding(new Object[]{this, bigInteger}, -301285764, 301285766, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setDividerPadding(new Object[]{this}, 603358841, -603358841, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, -2038798001, 2038798005, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setDividerPadding(new Object[]{this, apkVar, apkVar2}, -2138266174, 2138266175, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, 772979279, -772979276, i10)).booleanValue();
    }
}
