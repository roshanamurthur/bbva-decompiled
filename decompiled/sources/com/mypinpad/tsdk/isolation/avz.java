package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;

/* JADX INFO: loaded from: classes10.dex */
public final class avz extends adw {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final adp f54033r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f54034s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f54035t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final aiw f54036u0;

    public avz(aed aedVar) {
        this.f54033r0 = (adp) adp.setOnFocusChangeListener(new Object[]{aedVar.setX(0)}, -837021952, 837021958, (int) System.currentTimeMillis());
        adp adpVar = (adp) adp.setOnFocusChangeListener(new Object[]{aedVar.setX(1)}, -837021952, 837021958, (int) System.currentTimeMillis());
        this.f54034s0 = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar}, -2079758436, 2079758436, System.identityHashCode(adpVar))).intValue();
        adp adpVar2 = (adp) adp.setOnFocusChangeListener(new Object[]{aedVar.setX(2)}, -837021952, 837021958, (int) System.currentTimeMillis());
        this.f54035t0 = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar2}, -2079758436, 2079758436, System.identityHashCode(adpVar2))).intValue();
        this.f54036u0 = (aiw) aiw.setOnFocusChangeListener(new Object[]{aedVar.setX(3)}, 866360717, -866360713, (int) System.currentTimeMillis());
    }

    public static avz setCompoundDrawableTintBlendMode(Object obj) {
        return (avz) setX(new Object[]{obj}, -366821983, 366821987, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = (((~(i10 | i14)) | (~(i12 | (~i10))) | i13) * 45) + (((~(i11 | i10)) | (~(i13 | i12))) * (-45)) + (((~(i13 | i14)) | i10) * (-90)) + (i11 * 46) + (i10 * 46);
        if (i15 == 1) {
            return Integer.valueOf(((avz) objArr[0]).f54034s0);
        }
        if (i15 == 2) {
            avz avzVar = (avz) objArr[0];
            adh adhVar = new adh();
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, avzVar.f54033r0}, 240298319, -240298315, System.identityHashCode(adhVar));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(avzVar.f54034s0)}, 240298319, -240298315, System.identityHashCode(adhVar));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(avzVar.f54035t0)}, 240298319, -240298315, System.identityHashCode(adhVar));
            return c.a(adhVar, new Object[]{adhVar, avzVar.f54036u0}, 240298319, -240298315, adhVar);
        }
        if (i15 == 3) {
            return Integer.valueOf(((avz) objArr[0]).f54035t0);
        }
        avz avzVar2 = null;
        if (i15 == 4) {
            Object obj = objArr[0];
            if (obj instanceof avz) {
                avzVar2 = (avz) obj;
            } else if (obj != null) {
                avzVar2 = new avz(aed.setCompoundDrawableTintBlendMode(obj));
            }
            return avzVar2;
        }
        avz avzVar3 = (avz) objArr[0];
        aiw aiwVar = avzVar3.f54036u0;
        int iIdentityHashCode = System.identityHashCode(avzVar3);
        int i16 = ~iIdentityHashCode;
        int i17 = (-335601829) ^ i16;
        int i18 = (-335601829) & i16;
        int i19 = ~((i18 & i17) | (i17 ^ i18));
        int i20 = ~(((-168037378) & iIdentityHashCode) | ((-168037378) ^ iIdentityHashCode));
        int i21 = i19 & i20;
        int i22 = (((i19 | i20) & (~i21)) | i21) * (-272);
        int i23 = (((~i22) & 542700354) | ((-542700355) & i22)) + ((i22 & 542700354) << 1);
        int i24 = iIdentityHashCode & (-1241915146);
        int i25 = (i16 & 1241915145) | i24;
        int i26 = 1241915145 & iIdentityHashCode;
        int i27 = ((~((i25 & i26) | (i25 ^ i26))) | (-1577516974)) * (-272);
        int i28 = i23 & i27;
        int i29 = -(-((i27 ^ i23) | i28));
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        int i31 = ~((iIdentityHashCode ^ (-1241915146)) | i24);
        int i32 = ((i31 & 1409479596) | ((~i31) & 1409479596) | ((-1409479597) & i31)) * 272;
        int i33 = (((~i32) & i30) | ((~i30) & i32)) + ((i32 & i30) << 1);
        int iIdentityHashCode2 = System.identityHashCode(avzVar3);
        int i34 = (136865228 | iIdentityHashCode2) & (-1073577439);
        int i35 = (i34 | ((~i34) & ((-936712211) | iIdentityHashCode2))) * 376;
        int i36 = ((~i35) & 1350533626) | ((-1350533627) & i35);
        int i37 = (i35 & 1350533626) << 1;
        int i38 = (i36 & i37) + (i37 | i36);
        int i39 = ~iIdentityHashCode2;
        int i40 = i39 & 501839326;
        int i41 = (i39 | 501839326) & (~i40);
        int i42 = ((~((i41 & i40) | (i41 ^ i40))) | (-1073577439)) * (-376);
        int i43 = i38 & i42;
        int i44 = ((i42 | i38) & (~i43)) + (i43 << 1);
        int i45 = (-501839327) ^ iIdentityHashCode2;
        int i46 = iIdentityHashCode2 & (-501839327);
        int i47 = (i46 & i45) | (i45 ^ i46);
        int i48 = ~i47;
        int i49 = (i47 | i48) & i48;
        int i50 = ((i49 & 708603340) | (708603340 ^ i49)) * 376;
        int i51 = i44 & i50;
        int i52 = (i50 | i44) & (~i51);
        int i53 = i51 << 1;
        if (i33 <= (i52 ^ i53) + ((i52 & i53) << 1)) {
            return aiwVar;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setX(new Object[]{this}, -1546427963, 1546427965, System.identityHashCode(this));
    }

    public final int setOnFocusChangeListener() {
        return ((Integer) setX(new Object[]{this}, -388635423, 388635424, System.identityHashCode(this))).intValue();
    }

    public final aiw setY() {
        return (aiw) setX(new Object[]{this}, -1861972624, 1861972624, System.identityHashCode(this));
    }

    public avz(int i10, int i11, aiw aiwVar) {
        this.f54033r0 = new adp(0L);
        this.f54034s0 = i10;
        this.f54035t0 = i11;
        this.f54036u0 = aiwVar;
    }

    public final int setX() {
        return ((Integer) setX(new Object[]{this}, 1906123259, -1906123256, System.identityHashCode(this))).intValue();
    }
}
