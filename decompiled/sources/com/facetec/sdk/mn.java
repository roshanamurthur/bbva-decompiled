package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
public final class mn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int[] f42604b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f42605c;

    public final boolean b(int i10) {
        return ((1 << i10) & this.f42605c) != 0;
    }

    public final mn c(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f42604b;
            if (i10 < iArr.length) {
                this.f42605c = (1 << i10) | this.f42605c;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int d(int i10) {
        return this.f42604b[i10];
    }

    public final int b() {
        if ((this.f42605c & 2) != 0) {
            return this.f42604b[1];
        }
        return -1;
    }

    public final int d() {
        if ((this.f42605c & 128) != 0) {
            return this.f42604b[7];
        }
        return 65535;
    }
}
