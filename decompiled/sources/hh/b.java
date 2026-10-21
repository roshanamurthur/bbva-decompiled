package hh;

/* JADX INFO: compiled from: AI01320xDecoder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends f {
    @Override // hh.i
    public final void c(int i10, StringBuilder sb2) {
        if (i10 < 10000) {
            sb2.append("(3202)");
        } else {
            sb2.append("(3203)");
        }
    }

    @Override // hh.i
    public final int d(int i10) {
        return i10 < 10000 ? i10 : i10 - 10000;
    }
}
