package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ast extends aph.setDividerPadding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53778g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53779h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final asv f53780f;

    static {
        new asw(apj.setOnFocusChangeListener);
        int i10 = f53779h;
        int i11 = ((i10 & 103) - (~(-(-(i10 | 103))))) - 1;
        f53778g = i11 % 128;
        int i12 = i11 % 2;
    }

    public ast() {
        super(Opcodes.INSTANCEOF, 15, 0, 0);
        this.f53780f = new asv(this, null, null);
        this.setX = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"010000000000000000000000015AAB561B005413CCD4EE99D5"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(2L);
        this.setDividerPadding = 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b7, code lost:
    
        if (r4 != 6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ba, code lost:
    
        if (r4 != 6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
    
        r5 = r5 + 33;
        com.mypinpad.tsdk.isolation.ast.f53779h = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c6, code lost:
    
        r5 = r5 + 25;
        com.mypinpad.tsdk.isolation.ast.f53779h = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object setDividerPadding(java.lang.Object[] r4, int r5, int r6, int r7) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ast.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setDividerPadding(new Object[]{this}, 681729234, -681729232, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setDividerPadding(new Object[]{this, bigInteger}, -1859634759, 1859634764, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setDividerPadding(new Object[]{this}, -527636533, 527636533, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, 1809101510, -1809101509, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setDividerPadding(new Object[]{this, apkVar, apkVar2}, 755733718, -755733714, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, 563853649, -563853646, i10)).booleanValue();
    }
}
