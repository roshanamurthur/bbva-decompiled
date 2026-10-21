package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;

/* JADX INFO: loaded from: classes10.dex */
public final class Version {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Version[] f49864h = {new Version(1, 10, 10, 8, 8, new b(5, new a(1, 3))), new Version(2, 12, 12, 10, 10, new b(7, new a(1, 5))), new Version(3, 14, 14, 12, 12, new b(10, new a(1, 8))), new Version(4, 16, 16, 14, 14, new b(12, new a(1, 12))), new Version(5, 18, 18, 16, 16, new b(14, new a(1, 18))), new Version(6, 20, 20, 18, 18, new b(18, new a(1, 22))), new Version(7, 22, 22, 20, 20, new b(20, new a(1, 30))), new Version(8, 24, 24, 22, 22, new b(24, new a(1, 36))), new Version(9, 26, 26, 24, 24, new b(28, new a(1, 44))), new Version(10, 32, 32, 14, 14, new b(36, new a(1, 62))), new Version(11, 36, 36, 16, 16, new b(42, new a(1, 86))), new Version(12, 40, 40, 18, 18, new b(48, new a(1, 114))), new Version(13, 44, 44, 20, 20, new b(56, new a(1, 144))), new Version(14, 48, 48, 22, 22, new b(68, new a(1, 174))), new Version(15, 52, 52, 24, 24, new b(42, new a(2, 102))), new Version(16, 64, 64, 14, 14, new b(56, new a(2, 140))), new Version(17, 72, 72, 16, 16, new b(36, new a(4, 92))), new Version(18, 80, 80, 18, 18, new b(48, new a(4, 114))), new Version(19, 88, 88, 20, 20, new b(56, new a(4, 144))), new Version(20, 96, 96, 22, 22, new b(68, new a(4, 174))), new Version(21, 104, 104, 24, 24, new b(56, new a(6, 136))), new Version(22, 120, 120, 18, 18, new b(68, new a(6, 175))), new Version(23, 132, 132, 20, 20, new b(62, new a(8, 163))), new Version(24, 144, 144, 22, 22, new b(new a(8, 156), new a(2, 155))), new Version(25, 8, 18, 6, 16, new b(7, new a(1, 5))), new Version(26, 8, 32, 6, 14, new b(11, new a(1, 10))), new Version(27, 12, 26, 10, 24, new b(14, new a(1, 16))), new Version(28, 12, 36, 10, 16, new b(18, new a(1, 22))), new Version(29, 16, 36, 14, 16, new b(24, new a(1, 32))), new Version(30, 16, 48, 14, 22, new b(28, new a(1, 49)))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f49868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f49869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f49870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f49871g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49873b;

        public a(int i10, int i11) {
            this.f49872a = i10;
            this.f49873b = i11;
        }
    }

    public Version(int i10, int i11, int i12, int i13, int i14, b bVar) {
        this.f49865a = i10;
        this.f49866b = i11;
        this.f49867c = i12;
        this.f49868d = i13;
        this.f49869e = i14;
        this.f49870f = bVar;
        int i15 = 0;
        for (a aVar : bVar.f49875b) {
            i15 += (aVar.f49873b + bVar.f49874a) * aVar.f49872a;
        }
        this.f49871g = i15;
    }

    public static Version getVersionForDimensions(int i10, int i11) throws FormatException {
        if ((i10 & 1) != 0 || (i11 & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        for (Version version : f49864h) {
            if (version.f49866b == i10 && version.f49867c == i11) {
                return version;
            }
        }
        throw FormatException.getFormatInstance();
    }

    public int getDataRegionSizeColumns() {
        return this.f49869e;
    }

    public int getDataRegionSizeRows() {
        return this.f49868d;
    }

    public int getSymbolSizeColumns() {
        return this.f49867c;
    }

    public int getSymbolSizeRows() {
        return this.f49866b;
    }

    public int getTotalCodewords() {
        return this.f49871g;
    }

    public int getVersionNumber() {
        return this.f49865a;
    }

    public String toString() {
        return String.valueOf(this.f49865a);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a[] f49875b;

        public b(int i10, a aVar) {
            this.f49874a = i10;
            this.f49875b = new a[]{aVar};
        }

        public b(a aVar, a aVar2) {
            this.f49874a = 62;
            this.f49875b = new a[]{aVar, aVar2};
        }
    }
}
