package xg;

import com.google.zxing.aztec.encoder.HighLevelEncoder;

/* JADX INFO: compiled from: State.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f94644e = new c(d.f94649b, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f94646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f94647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f94648d;

    public c(d dVar, int i10, int i11, int i12) {
        this.f94646b = dVar;
        this.f94645a = i10;
        this.f94647c = i11;
        this.f94648d = i12;
    }

    public final c a(int i10) {
        int i11;
        d bVar = this.f94646b;
        int i12 = this.f94645a;
        int i13 = this.f94648d;
        if (i12 == 4 || i12 == 2) {
            int[] iArr = HighLevelEncoder.f49698c[i12];
            i12 = 0;
            int i14 = iArr[0];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            bVar.getClass();
            i13 += i16;
            bVar = new b(bVar, i15, i16);
        }
        int i17 = this.f94647c;
        if (i17 == 0 || i17 == 31) {
            i11 = 18;
        } else {
            i11 = i17 == 62 ? 9 : 8;
        }
        int i18 = i17 + 1;
        c cVar = new c(bVar, i12, i18, i13 + i11);
        return i18 == 2078 ? cVar.b(i10 + 1) : cVar;
    }

    public final c b(int i10) {
        int i11 = this.f94647c;
        if (i11 == 0) {
            return this;
        }
        d dVar = this.f94646b;
        dVar.getClass();
        return new c(new a(dVar, i10 - i11, i11), this.f94645a, 0, this.f94648d);
    }

    public final boolean c(c cVar) {
        int i10;
        int i11 = this.f94648d + (HighLevelEncoder.f49698c[this.f94645a][cVar.f94645a] >> 16);
        int i12 = cVar.f94647c;
        if (i12 > 0 && ((i10 = this.f94647c) == 0 || i10 > i12)) {
            i11 += 10;
        }
        return i11 <= cVar.f94648d;
    }

    public final c d(int i10, int i11) {
        int i12 = this.f94648d;
        d bVar = this.f94646b;
        int i13 = this.f94645a;
        if (i10 != i13) {
            int i14 = HighLevelEncoder.f49698c[i13][i10];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            bVar.getClass();
            i12 += i16;
            bVar = new b(bVar, i15, i16);
        }
        int i17 = i10 == 2 ? 4 : 5;
        bVar.getClass();
        return new c(new b(bVar, i11, i17), i10, 0, i12 + i17);
    }

    public final c e(int i10, int i11) {
        int i12 = this.f94645a;
        int i13 = i12 == 2 ? 4 : 5;
        int i14 = HighLevelEncoder.f49700e[i12][i10];
        d dVar = this.f94646b;
        dVar.getClass();
        return new c(new b(new b(dVar, i14, i13), i11, 5), i12, 0, this.f94648d + i13 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", HighLevelEncoder.f49697b[this.f94645a], Integer.valueOf(this.f94648d), Integer.valueOf(this.f94647c));
    }
}
