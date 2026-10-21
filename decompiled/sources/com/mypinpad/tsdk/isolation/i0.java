package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56317b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f56318c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f56319a;

    public i0(Class cls) {
        this.f56319a = cls;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11) {
        int i12 = ~i10;
        int i13 = (i12 * (-624)) + (i11 * (-623)) + (i10 * (-623));
        if (((i10 | i11) * 624) + ((i12 | i11) * 624) + i13 != 1) {
            i0 i0Var = (i0) objArr[0];
            int i14 = f56317b;
            int i15 = (i14 & 105) + (i14 | 105);
            f56318c = i15 % 128;
            int i16 = i15 % 2;
            int iHashCode = super.hashCode();
            System.identityHashCode(i0Var);
            System.identityHashCode(i0Var);
            return Integer.valueOf(iHashCode);
        }
        i0 i0Var2 = (i0) objArr[0];
        Object obj = objArr[1];
        int i17 = f56318c;
        int i18 = i17 + 87;
        int i19 = i18 % 128;
        f56317b = i19;
        if (i18 % 2 != 0) {
            throw null;
        }
        if (i0Var2 != obj) {
            int i20 = ((i17 | 61) << 1) - ((i17 & (-62)) | ((~i17) & 61));
            f56317b = i20 % 128;
            int i21 = i20 % 2;
            return Boolean.FALSE;
        }
        int i22 = i19 & 79;
        int i23 = ((~i22) & (i19 | 79)) + (i22 << 1);
        f56318c = i23 % 128;
        if (i23 % 2 != 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {this, obj};
        System.identityHashCode(this);
        return ((Boolean) a(objArr, 1682857082, -1682857081)).booleanValue();
    }

    public final int hashCode() {
        Object[] objArr = {this};
        System.identityHashCode(this);
        return ((Integer) a(objArr, 1761502835, -1761502835)).intValue();
    }
}
