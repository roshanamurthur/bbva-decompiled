package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ate extends aph.setDividerPadding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53810g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53811h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final atd f53812f;

    static {
        new atf(apj.setOnFocusChangeListener);
        int i10 = f53810g;
        int i11 = i10 & 57;
        int i12 = ((i10 ^ 57) | i11) << 1;
        int i13 = -((i10 | 57) & (~i11));
        int i14 = (i12 & i13) + (i13 | i12);
        f53811h = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    public ate() {
        super(239, 158, 0, 0);
        this.f53812f = new atd(this, null, null);
        this.setX = setOnFocusChangeListener(BigInteger.valueOf(0L));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(BigInteger.valueOf(1L));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(4L);
        this.setDividerPadding = 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f4, code lost:
    
        if (r5 != 6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f7, code lost:
    
        if (r5 != 6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f9, code lost:
    
        r5 = r6 ^ 11;
        r6 = -(-((r6 & 11) << 1));
        r7 = ((r5 | r6) << 1) - (r5 ^ r6);
        com.mypinpad.tsdk.isolation.ate.f53811h = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010d, code lost:
    
        r5 = ((r6 | 110) << 1) - (r6 ^ 110);
        r6 = (r5 ^ (-1)) + (r5 << 1);
        com.mypinpad.tsdk.isolation.ate.f53811h = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011c, code lost:
    
        if ((r6 % 2) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011e, code lost:
    
        r5 = 65 / 0;
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
    public static java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r5, int r6, int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ate.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar, apkVar2}, 454311614, -454311610, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, bigInteger}, 1765119183, -1765119182, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, 643587733, -643587733, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10)}, 1751150311, -1751150309, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 788928006, -788928001, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setCompoundDrawableTintBlendMode(new Object[]{this}, 1135111559, -1135111556, System.identityHashCode(this));
    }
}
