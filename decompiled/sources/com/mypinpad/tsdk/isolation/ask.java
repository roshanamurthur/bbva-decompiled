package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ask extends apk.setOnFocusChangeListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53754f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53755g = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f53756e;

    public ask(long[] jArr) {
        this.f53756e = jArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0094, code lost:
    
        if (r11 <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0097, code lost:
    
        if (r11 <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        r11 = r2 & 13;
        r13 = -(-(r2 | 13));
        r14 = (r11 ^ r13) + ((r11 & r13) << 1);
        com.mypinpad.tsdk.isolation.ask.f53755g = r14 % 128;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a9, code lost:
    
        if ((r14 % 2) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ab, code lost:
    
        r11 = 22 / 0;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b0, code lost:
    
        r13 = (long[]) com.mypinpad.tsdk.isolation.auv.setDividerPadding(new java.lang.Object[0], -1915146282, 1915146293, (int) java.lang.System.currentTimeMillis());
        com.mypinpad.tsdk.isolation.asl.setOnFocusChangeListener(new java.lang.Object[]{r12.f53756e, java.lang.Integer.valueOf(r11), r13}, -236981925, 236981941, r11);
        r11 = new com.mypinpad.tsdk.isolation.ask(r13);
        r12 = com.mypinpad.tsdk.isolation.ask.f53755g + 77;
        com.mypinpad.tsdk.isolation.ask.f53754f = r12 % 128;
        r12 = r12 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setDividerPadding(java.lang.Object[] r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 1860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ask.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final int UiMessageCallbackKtWhenMappings() {
        return ((Integer) setDividerPadding(new Object[]{this}, 329087238, -329087218, System.identityHashCode(this))).intValue();
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, 1244385595, -1244385585, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean getNavBarTitleString() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -1127597777, 1127597784, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, 1338318168, -1338318147, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 1480629522, -1480629519, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(int i10) {
        return (apk) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, -829979955, 829979977, i10);
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final apk setIncludeFontPadding() {
        return (apk) setDividerPadding(new Object[]{this}, 2035280880, -2035280866, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setNavigationOnClickListener() {
        return (apk) setDividerPadding(new Object[]{this}, 695884064, -695884051, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setOnDragListener() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 1096673621, -1096673621, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnFocusChangeListener(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, 1171613579, -1171613563, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnLongClickListener() {
        return (apk) setDividerPadding(new Object[]{this}, -216075036, 216075054, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setX() {
        return (apk) setDividerPadding(new Object[]{this}, -232299205, 232299217, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar, apk apkVar2) {
        return (apk) setDividerPadding(new Object[]{this, apkVar, apkVar2}, 1103521004, -1103520987, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final boolean setZ() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -1119184884, 1119184889, System.identityHashCode(this))).booleanValue();
    }

    public ask() {
        this.f53756e = (long[]) auv.setDividerPadding(new Object[0], -1915146282, 1915146293, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar, apk apkVar2, apk apkVar3) {
        return (apk) setDividerPadding(new Object[]{this, apkVar, apkVar2, apkVar3}, 1408337525, -1408337523, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final int setOnFocusChangeListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, -492170534, 492170553, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY() {
        return (apk) setDividerPadding(new Object[]{this}, 65870807, -65870801, System.identityHashCode(this));
    }

    public ask(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.f53756e = (long[]) asl.setOnFocusChangeListener(new Object[]{bigInteger}, 1976744658, -1976744652, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, -355668389, 355668400, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar, apk apkVar2, apk apkVar3) {
        return (apk) setDividerPadding(new Object[]{this, apkVar, apkVar2, apkVar3}, -1156877752, 1156877753, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setDividerPadding(new Object[]{this}, 1783622826, -1783622822, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, -1365250697, 1365250705, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, 958414701, -958414686, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding() {
        return (apk) setDividerPadding(new Object[]{this}, 526929137, -526929128, System.identityHashCode(this));
    }
}
