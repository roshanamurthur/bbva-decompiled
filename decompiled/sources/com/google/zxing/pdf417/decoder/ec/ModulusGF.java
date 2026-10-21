package com.google.zxing.pdf417.decoder.ec;

import com.google.zxing.pdf417.PDF417Common;
import jh.a;

/* JADX INFO: loaded from: classes10.dex */
public final class ModulusGF {
    public static final ModulusGF PDF417_GF = new ModulusGF();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f50000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f50001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f50002e = PDF417Common.NUMBER_OF_CODEWORDS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f49998a = new int[PDF417Common.NUMBER_OF_CODEWORDS];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f49999b = new int[PDF417Common.NUMBER_OF_CODEWORDS];

    public ModulusGF() {
        int i10 = 1;
        for (int i11 = 0; i11 < 929; i11++) {
            this.f49998a[i11] = i10;
            i10 = (i10 * 3) % PDF417Common.NUMBER_OF_CODEWORDS;
        }
        for (int i12 = 0; i12 < 928; i12++) {
            this.f49999b[this.f49998a[i12]] = i12;
        }
        this.f50000c = new a(this, new int[]{0});
        this.f50001d = new a(this, new int[]{1});
    }

    public final int a(int i10) {
        if (i10 == 0) {
            throw new ArithmeticException();
        }
        return this.f49998a[(this.f50002e - this.f49999b[i10]) - 1];
    }

    public final int b(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f49999b;
        return this.f49998a[(iArr[i10] + iArr[i11]) % (this.f50002e - 1)];
    }
}
