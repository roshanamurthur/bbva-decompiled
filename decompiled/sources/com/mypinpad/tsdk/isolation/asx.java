package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class asx extends aph.setDividerPadding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53788g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53789h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final atc f53790f;

    static {
        new asz(apj.setOnFocusChangeListener);
        int i10 = f53789h;
        int i11 = i10 | 123;
        int i12 = (i11 << 1) - ((~(i10 & 123)) & i11);
        f53788g = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public asx() {
        super(233, 74, 0, 0);
        this.f53790f = new atc(this, null, null);
        this.setX = setOnFocusChangeListener(BigInteger.valueOf(1L));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(2L);
        this.setDividerPadding = 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r5 != 6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        if (r5 != 6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        r5 = (r6 ^ 77) + ((r6 & 77) << 1);
        com.mypinpad.tsdk.isolation.asx.f53788g = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
    
        if ((r5 % 2) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b4, code lost:
    
        r4 = 30 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b9, code lost:
    
        r5 = (r6 | 43) << 1;
        r6 = -(((~r6) & 43) | (r6 & (-44)));
        r7 = (r5 ^ r6) + ((r5 & r6) << 1);
        com.mypinpad.tsdk.isolation.asx.f53788g = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object setDividerPadding(java.lang.Object[] r5, int r6, int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.asx.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setDividerPadding(new Object[]{this}, 689207377, -689207374, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setDividerPadding(new Object[]{this, bigInteger}, -229594684, 229594685, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setDividerPadding(new Object[]{this}, -1531349804, 1531349806, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, -2008742963, 2008742963, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setDividerPadding(new Object[]{this, apkVar, apkVar2}, -1073733758, 1073733763, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, 127857750, -127857746, i10)).booleanValue();
    }
}
