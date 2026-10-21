package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class agj extends adl {
    public agj(adu aduVar, adp adpVar, ady adyVar, int i10, ady adyVar2) {
        super(aduVar, adpVar, adyVar, i10, adyVar2);
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        if ((i15 * 446) + (((~(i10 | i14 | i12)) | (~(i11 | i13))) * 446) + (((~((~i12) | i14)) | i15) * 446) + (i11 * (-445)) + (i10 * (-445)) != 1) {
            return (agj) objArr[0];
        }
        agj agjVar = (agj) objArr[0];
        adh adhVar = new adh(4);
        adu aduVar = agjVar.f52476t0;
        if (aduVar != null) {
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, aduVar}, 240298319, -240298315, System.identityHashCode(adhVar));
        }
        adp adpVar = agjVar.f52477u0;
        if (adpVar != null) {
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, adpVar}, 240298319, -240298315, System.identityHashCode(adhVar));
        }
        ady adyVar = agjVar.v0;
        if (adyVar != null) {
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, adyVar.a()}, 240298319, -240298315, System.identityHashCode(adhVar));
        }
        int i16 = agjVar.f52478w0;
        adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new agm(i16 == 0, i16, agjVar.f52479x0)}, 240298319, -240298315, System.identityHashCode(adhVar));
        return new agi(adhVar);
    }

    @Override // com.mypinpad.tsdk.isolation.adl, com.mypinpad.tsdk.isolation.ady
    public final ady a() {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, 258946619, -258946619, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.adl
    public final aed f() {
        return (aed) setCompoundDrawableTintBlendMode(new Object[]{this}, -584996176, 584996177, System.identityHashCode(this));
    }

    public agj(agi agiVar) {
        super(agiVar);
    }
}
