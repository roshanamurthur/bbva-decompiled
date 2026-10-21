package com.fasterxml.jackson.core.sym;

import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class NameN extends Name {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f43139f;

    public NameN(String str, int i10, int i11, int i12, int i13, int i14, int[] iArr, int i15) {
        super(str, i10);
        this.f43134a = i11;
        this.f43135b = i12;
        this.f43136c = i13;
        this.f43137d = i14;
        this.f43139f = iArr;
        this.f43138e = i15;
    }

    public static NameN construct(String str, int i10, int[] iArr, int i11) {
        if (i11 >= 4) {
            return new NameN(str, i10, iArr[0], iArr[1], iArr[2], iArr[3], i11 + (-4) > 0 ? Arrays.copyOfRange(iArr, 4, i11) : null, i11);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i10) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i10, int i11) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i10, int i11, int i12) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int[] iArr, int i10) {
        int i11 = this.f43138e;
        if (i10 != i11 || iArr[0] != this.f43134a || iArr[1] != this.f43135b || iArr[2] != this.f43136c || iArr[3] != this.f43137d) {
            return false;
        }
        int[] iArr2 = this.f43139f;
        switch (i10) {
            case 8:
                if (iArr[7] != iArr2[3]) {
                    return false;
                }
            case 7:
                if (iArr[6] != iArr2[2]) {
                    return false;
                }
            case 6:
                if (iArr[5] != iArr2[1]) {
                    return false;
                }
            case 5:
                if (iArr[4] != iArr2[0]) {
                    return false;
                }
            case 4:
                return true;
            default:
                int i12 = i11 - 4;
                for (int i13 = 0; i13 < i12; i13++) {
                    if (iArr[i13 + 4] != iArr2[i13]) {
                        return false;
                    }
                }
                return true;
        }
    }
}
