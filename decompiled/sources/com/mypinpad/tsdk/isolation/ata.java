package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ata extends aph.setDividerPadding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53801g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53802h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final atb f53803f;

    static {
        new asz(apj.setOnFocusChangeListener);
        System.currentTimeMillis();
        System.currentTimeMillis();
    }

    public ata() {
        super(233, 74, 0, 0);
        this.f53803f = new atb(this, null, null);
        this.setX = setOnFocusChangeListener(BigInteger.valueOf(0L));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(BigInteger.valueOf(1L));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(4L);
        this.setDividerPadding = 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00be, code lost:
    
        if (r5 != 6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c1, code lost:
    
        if (r5 != 6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c3, code lost:
    
        r5 = ((r2 & (-60)) | ((~r2) & 59)) + ((r2 & 59) << 1);
        com.mypinpad.tsdk.isolation.ata.f53801g = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d6, code lost:
    
        r5 = r6 & 73;
        r6 = r6 | 73;
        r8 = ((r5 | r6) << 1) - (r5 ^ r6);
        com.mypinpad.tsdk.isolation.ata.f53802h = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e4, code lost:
    
        if ((r8 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object setY(java.lang.Object[] r5, int r6, int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ata.setY(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setY(new Object[]{this}, -2142929485, 2142929486, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setY(new Object[]{this, apkVar, apkVar2}, 1859366006, -1859366002, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setY(new Object[]{this, bigInteger}, 1618356187, -1618356182, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setY(new Object[]{this, Integer.valueOf(i10)}, 519018110, -519018107, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setY(new Object[]{this}, 246460784, -246460784, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setY(new Object[]{this}, -1245152531, 1245152533, System.identityHashCode(this));
    }
}
