package com.google.zxing.common.reedsolomon;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import zg.a;

/* JADX INFO: loaded from: classes10.dex */
public final class GenericGF {
    public static final GenericGF AZTEC_DATA_6;
    public static final GenericGF AZTEC_DATA_8;
    public static final GenericGF AZTEC_PARAM;
    public static final GenericGF DATA_MATRIX_FIELD_256;
    public static final GenericGF MAXICODE_FIELD_64;
    public static final GenericGF QR_CODE_FIELD_256;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f49851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f49852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f49853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f49854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f49855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f49856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f49857g;
    public static final GenericGF AZTEC_DATA_12 = new GenericGF(4201, 4096, 1);
    public static final GenericGF AZTEC_DATA_10 = new GenericGF(1033, 1024, 1);

    static {
        GenericGF genericGF = new GenericGF(67, 64, 1);
        AZTEC_DATA_6 = genericGF;
        AZTEC_PARAM = new GenericGF(19, 16, 1);
        QR_CODE_FIELD_256 = new GenericGF(285, 256, 0);
        GenericGF genericGF2 = new GenericGF(301, 256, 1);
        DATA_MATRIX_FIELD_256 = genericGF2;
        AZTEC_DATA_8 = genericGF2;
        MAXICODE_FIELD_64 = genericGF;
    }

    public GenericGF(int i10, int i11, int i12) {
        this.f49856f = i10;
        this.f49855e = i11;
        this.f49857g = i12;
        this.f49851a = new int[i11];
        this.f49852b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f49851a[i14] = i13;
            i13 <<= 1;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f49852b[this.f49851a[i15]] = i15;
        }
        this.f49853c = new a(this, new int[]{0});
        this.f49854d = new a(this, new int[]{1});
    }

    public final a a(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f49853c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new a(this, iArr);
    }

    public final int b(int i10) {
        if (i10 == 0) {
            throw new ArithmeticException();
        }
        return this.f49851a[(this.f49855e - this.f49852b[i10]) - 1];
    }

    public final int c(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f49852b;
        return this.f49851a[(iArr[i10] + iArr[i11]) % (this.f49855e - 1)];
    }

    public int getGeneratorBase() {
        return this.f49857g;
    }

    public int getSize() {
        return this.f49855e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GF(0x");
        sb2.append(Integer.toHexString(this.f49856f));
        sb2.append(AbstractJsonLexerKt.COMMA);
        return androidx.activity.a.d(sb2, this.f49855e, RootService.CLOSE_BRACKET);
    }
}
