package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;

/* JADX INFO: loaded from: classes10.dex */
public final class afg extends adl {
    public static int F0 = 0;
    public static int G0 = 1;

    public afg(adu aduVar, adp adpVar, ady adyVar, int i10, ady adyVar2) {
        super(aduVar, adpVar, adyVar, i10, adyVar2);
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-500)) + (i10 * (-500));
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~i10;
        int i17 = ((~(i16 | (~i12) | i11)) * 501) + ((~(i14 | i16)) * 1002) + ((i15 | (~(i16 | i11 | i12))) * 501) + i13;
        if (i17 == 1) {
            afg afgVar = (afg) objArr[0];
            int i18 = F0;
            int i19 = (i18 & 11) + (i18 | 11);
            G0 = i19 % 128;
            if (i19 % 2 != 0) {
                return afgVar;
            }
            throw null;
        }
        if (i17 == 2) {
            afg afgVar2 = (afg) objArr[0];
            int i20 = G0;
            int i21 = i20 & 11;
            int i22 = i21 + ((i20 ^ 11) | i21);
            F0 = i22 % 128;
            if (i22 % 2 == 0) {
                return afgVar2;
            }
            throw null;
        }
        afg afgVar3 = (afg) objArr[0];
        adh adhVar = new adh(4);
        adu aduVar = afgVar3.f52476t0;
        if (aduVar != null) {
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, aduVar}, 240298319, -240298315, System.identityHashCode(adhVar));
        }
        adp adpVar = afgVar3.f52477u0;
        if (adpVar != null) {
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, adpVar}, 240298319, -240298315, System.identityHashCode(adhVar));
        }
        ady adyVar = afgVar3.v0;
        if (adyVar != null) {
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, adyVar.e()}, 240298319, -240298315, System.identityHashCode(adhVar));
        }
        int i23 = afgVar3.f52478w0;
        return c.a(adhVar, new Object[]{adhVar, new afx(i23 == 0, i23, afgVar3.f52479x0)}, 240298319, -240298315, adhVar);
    }

    @Override // com.mypinpad.tsdk.isolation.adl, com.mypinpad.tsdk.isolation.ady
    public final ady a() {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, -1490403437, 1490403439, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.adl, com.mypinpad.tsdk.isolation.ady
    public final ady e() {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, 594558287, -594558286, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.adl
    public final aed f() {
        return (aed) setCompoundDrawableTintBlendMode(new Object[]{this}, -1174478177, 1174478177, System.identityHashCode(this));
    }

    public afg(afv afvVar) {
        super(afvVar);
    }
}
