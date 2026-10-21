package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public abstract class bdy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54608a;
    protected int setCompoundDrawableTintBlendMode;
    protected int setY;

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = (~(i13 | i14)) | (~(i14 | i12));
        int i16 = ~i12;
        int i17 = i16 | i10;
        if (((~i17) * 886) + ((i10 | (~(i11 | i16))) * (-1772)) + ((i15 | (~(i17 | i11))) * 886) + (i11 * (-885)) + (i10 * 1773) != 1) {
            bdy bdyVar = (bdy) objArr[0];
            int i18 = f54608a;
            int i19 = ((i18 | 11) << 1) - (i18 ^ 11);
            int i20 = i19 % 128;
            int i21 = i19 % 2;
            int i22 = bdyVar.setY;
            if (i21 == 0) {
                int i23 = 60 / 0;
            }
            return Integer.valueOf(i22);
        }
        bdy bdyVar2 = (bdy) objArr[0];
        int i24 = f54608a;
        int i25 = (i24 & 5) + (i24 | 5);
        int i26 = i25 % 128;
        int i27 = i25 % 2;
        int i28 = bdyVar2.setCompoundDrawableTintBlendMode;
        int i29 = (((i26 & (-100)) | ((~i26) & 99)) - (~((i26 & 99) << 1))) - 1;
        f54608a = i29 % 128;
        int i30 = i29 % 2;
        return Integer.valueOf(i28);
    }

    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -1110144417, 1110144418, System.identityHashCode(this))).intValue();
    }

    public final int setY() {
        return ((Integer) setDividerPadding(new Object[]{this}, 1226377489, -1226377489, System.identityHashCode(this))).intValue();
    }
}
