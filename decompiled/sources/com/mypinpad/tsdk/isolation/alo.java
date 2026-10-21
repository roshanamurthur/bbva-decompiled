package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class alo implements akl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53051c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f53053b;

    public alo(String str, int i10, Object obj, akp akpVar) {
        this.f53052a = str;
        this.f53053b = obj;
        if (obj instanceof akp) {
            throw new IllegalArgumentException("params should not be CryptoServicePurpose");
        }
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        alo aloVar = (alo) objArr[0];
        int i13 = f53051c;
        int i14 = i13 & 121;
        int i15 = ((i13 ^ 121) | i14) << 1;
        int i16 = -((i13 | 121) & (~i14));
        int i17 = (i15 & i16) + (i16 | i15);
        int i18 = i17 % 128;
        int i19 = i17 % 2;
        String str = aloVar.f53052a;
        int i20 = (i18 | 1) << 1;
        int i21 = -(((~i18) & 1) | (i18 & (-2)));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        f53051c = i22 % 128;
        if (i22 % 2 != 0) {
            int i23 = 44 / 0;
        }
        return str;
    }

    @Override // com.mypinpad.tsdk.isolation.akl
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setDividerPadding(new Object[]{this}, -1138074861, 1138074861, System.identityHashCode(this));
    }

    public alo(String str) {
        this(str, 256, null, akp.getNavBarTitleString);
    }
}
