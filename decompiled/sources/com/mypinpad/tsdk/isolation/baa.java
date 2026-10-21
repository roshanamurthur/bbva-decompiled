package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class baa extends azw {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final u2 f54282t0;

    public baa(azz azzVar, byte[] bArr) {
        super(false, azzVar);
        int iIntValue = ((Integer) azz.setOnFocusChangeListener(new Object[]{azzVar}, -434596743, 434596745, System.identityHashCode(azzVar))).intValue();
        int i10 = iIntValue * 2;
        if (bArr.length != i10) {
            throw new IllegalArgumentException("public key encoding does not match parameters");
        }
        this.f54282t0 = new u2((byte[]) bek.setOnFocusChangeListener(new Object[]{bArr, 0, Integer.valueOf(iIntValue)}, 525237936, -525237917, 0), (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(iIntValue), Integer.valueOf(i10)}, 525237936, -525237917, iIntValue));
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        baa baaVar = (baa) objArr[0];
        azz dividerPadding = baaVar.setDividerPadding();
        byte[] bArr = (byte[]) azz.setOnFocusChangeListener(new Object[]{dividerPadding}, -1303490317, 1303490318, System.identityHashCode(dividerPadding));
        u2 u2Var = baaVar.f54282t0;
        return (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr, u2Var.f61232a, u2Var.f61233b}, -271182023, 271182030, (int) System.currentTimeMillis());
    }

    public final byte[] setY() {
        return (byte[]) setX(new Object[]{this}, -297392802, 297392802, System.identityHashCode(this));
    }
}
