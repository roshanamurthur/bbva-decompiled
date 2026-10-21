package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class ahj extends afk {
    public ahj(acz aczVar) {
        super(aczVar.setNavigationOnClickListener(), aczVar.setOnDragListener());
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        ahj ahjVar = (ahj) objArr[0];
        StringBuilder sb2 = new StringBuilder("NetscapeCertType: 0x");
        sb2.append(Integer.toHexString(ahjVar.setCompoundDrawableTintBlendMode()));
        return sb2.toString();
    }

    @Override // com.mypinpad.tsdk.isolation.acz
    public final String toString() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -998609666, 998609666, System.identityHashCode(this));
    }
}
