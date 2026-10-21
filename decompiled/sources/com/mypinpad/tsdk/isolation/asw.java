package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class asw extends apk.setOnFocusChangeListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53785f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53786g = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f53787e;

    public asw(long[] jArr) {
        this.f53787e = jArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0658, code lost:
    
        if (r12 <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x065b, code lost:
    
        if (r12 <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x065d, code lost:
    
        r12 = (r14 ^ 35) + ((r14 & 35) << 1);
        com.mypinpad.tsdk.isolation.asw.f53786g = r12 % 128;
        r12 = r12 % 2;
        r12 = r14 & 65;
        r12 = (r12 - (~((r14 ^ 65) | r12))) - 1;
        com.mypinpad.tsdk.isolation.asw.f53786g = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0677, code lost:
    
        r14 = (long[]) com.mypinpad.tsdk.isolation.avf.setX(new java.lang.Object[0], 261521621, -261521615, (int) java.lang.System.currentTimeMillis());
        com.mypinpad.tsdk.isolation.asn.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r13.f53787e, java.lang.Integer.valueOf(r12), r14}, 371706175, -371706170, r12);
        r12 = new com.mypinpad.tsdk.isolation.asw(r14);
        r13 = com.mypinpad.tsdk.isolation.asw.f53785f;
        r14 = r13 & 95;
        r13 = (((r13 | 95) & (~r14)) - (~(r14 << 1))) - 1;
        com.mypinpad.tsdk.isolation.asw.f53786g = r13 % 128;
        r13 = r13 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setY(java.lang.Object[] r12, int r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 1818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.asw.setY(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final int UiMessageCallbackKtWhenMappings() {
        return ((Integer) setY(new Object[]{this}, 1216655894, -1216655873, System.identityHashCode(this))).intValue();
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setY(new Object[]{this, obj}, 437103054, -437103044, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean getNavBarTitleString() {
        return ((Boolean) setY(new Object[]{this}, -728488276, 728488288, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setY(new Object[]{this}, -175327036, 175327051, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setY(new Object[]{this}, -1411728628, 1411728632, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(int i10) {
        return (apk) setY(new Object[]{this, Integer.valueOf(i10)}, 1848145045, -1848145043, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, 872257301, -872257284, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final apk setIncludeFontPadding() {
        return (apk) setY(new Object[]{this}, -407110256, 407110278, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setNavigationOnClickListener() {
        return (apk) setY(new Object[]{this}, -11780931, 11780932, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setOnDragListener() {
        return ((Boolean) setY(new Object[]{this}, 589014751, -589014745, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnFocusChangeListener(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, -469016064, 469016083, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnLongClickListener() {
        return (apk) setY(new Object[]{this}, 103675212, -103675196, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setX() {
        return (apk) setY(new Object[]{this}, -250038612, 250038625, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final boolean setZ() {
        return ((Boolean) setY(new Object[]{this}, -1254850182, 1254850182, System.identityHashCode(this))).booleanValue();
    }

    public asw() {
        this.f53787e = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar, apk apkVar2, apk apkVar3) {
        return (apk) setY(new Object[]{this, apkVar, apkVar2, apkVar3}, -1145023717, 1145023726, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding() {
        return (apk) setY(new Object[]{this}, 1229288616, -1229288611, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final int setOnFocusChangeListener() {
        return ((Integer) setY(new Object[]{this}, -274368535, 274368553, System.identityHashCode(this))).intValue();
    }

    public asw(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        this.f53787e = (long[]) asn.setCompoundDrawableTintBlendMode(new Object[]{bigInteger}, -1588076976, 1588076978, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, -1711746308, 1711746319, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setY(new Object[]{this}, -365001236, 365001250, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar, apk apkVar2) {
        return (apk) setY(new Object[]{this, apkVar, apkVar2}, 1088350187, -1088350167, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY() {
        return (apk) setY(new Object[]{this}, -1772506457, 1772506464, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar, apk apkVar2, apk apkVar3) {
        return (apk) setY(new Object[]{this, apkVar, apkVar2, apkVar3}, -545701929, 545701937, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, -947549784, 947549787, System.identityHashCode(this));
    }
}
