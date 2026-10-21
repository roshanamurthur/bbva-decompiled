package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class iw implements setAccessibilityPaneTitle.setY {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56545b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f56546c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f56547a;

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (((~(i10 | i12)) | (~(i11 | (~i12)))) * 627) + (((~((~i11) | i12)) | i10) * (-627)) + ((i11 | i12 | (~i10)) * (-627)) + (i11 * 628) + (i10 * 628);
        if (i13 == 1) {
            iw iwVar = (iw) objArr[0];
            int i14 = f56545b;
            int i15 = (((i14 ^ 1) | (i14 & 1)) << 1) - (((~i14) & 1) | (i14 & (-2)));
            int i16 = i15 % 128;
            f56546c = i16;
            if (i15 % 2 == 0) {
                iwVar.f56547a = true;
            } else {
                iwVar.f56547a = false;
            }
            int i17 = (((i16 & (-64)) | ((~i16) & 63)) - (~(-(-((i16 & 63) << 1))))) - 1;
            f56545b = i17 % 128;
            if (i17 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (i13 != 2) {
            iw iwVar2 = (iw) objArr[0];
            int i18 = f56546c;
            int i19 = ((i18 ^ 82) + ((i18 & 82) << 1)) - 1;
            f56545b = i19 % 128;
            if (i19 % 2 != 0) {
                iwVar2.f56547a = false;
                return null;
            }
            iwVar2.f56547a = true;
            return null;
        }
        iw iwVar3 = (iw) objArr[0];
        int i20 = f56545b;
        int i21 = i20 ^ 27;
        int i22 = ((i20 & 27) | i21) << 1;
        int i23 = -i21;
        int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
        int i25 = i24 % 128;
        f56546c = i25;
        int i26 = i24 % 2;
        boolean z10 = iwVar3.f56547a;
        int i27 = i25 & 53;
        int i28 = (i27 - (~(-(-((i25 ^ 53) | i27))))) - 1;
        f56545b = i28 % 128;
        int i29 = i28 % 2;
        return Boolean.valueOf(z10);
    }

    @Override // com.mypinpad.tsdk.i.setAccessibilityPaneTitle.setY
    public final void setCompoundDrawableTintBlendMode() {
        setOnFocusChangeListener(new Object[]{this}, -1157902356, 1157902357, System.identityHashCode(this));
    }

    public final void setDividerPadding() {
        setOnFocusChangeListener(new Object[]{this}, -1545700222, 1545700222, System.identityHashCode(this));
    }

    public final boolean setX() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -1546748914, 1546748916, System.identityHashCode(this))).booleanValue();
    }
}
