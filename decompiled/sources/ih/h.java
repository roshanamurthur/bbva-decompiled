package ih;

/* JADX INFO: compiled from: DetectionResultRowIndicatorColumn.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f69710c;

    public h(c cVar, boolean z10) {
        super(cVar);
        this.f69710c = z10;
    }

    public final a c() {
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        b bVar4 = new b();
        d[] dVarArr = this.f69709b;
        for (d dVar : dVarArr) {
            if (dVar != null) {
                dVar.b();
                int i10 = dVar.f69698d % 30;
                int i11 = dVar.f69699e;
                if (!this.f69710c) {
                    i11 += 2;
                }
                int i12 = i11 % 3;
                if (i12 == 0) {
                    bVar2.b((i10 * 3) + 1);
                } else if (i12 == 1) {
                    bVar4.b(i10 / 3);
                    bVar3.b(i10 % 3);
                } else if (i12 == 2) {
                    bVar.b(i10 + 1);
                }
            }
        }
        if (bVar.a().length == 0 || bVar2.a().length == 0 || bVar3.a().length == 0 || bVar4.a().length == 0 || bVar.a()[0] <= 0 || bVar2.a()[0] + bVar3.a()[0] < 3 || bVar2.a()[0] + bVar3.a()[0] > 90) {
            return null;
        }
        a aVar = new a(bVar.a()[0], bVar2.a()[0], bVar3.a()[0], bVar4.a()[0]);
        d(dVarArr, aVar);
        return aVar;
    }

    public final void d(d[] dVarArr, a aVar) {
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            d dVar = dVarArr[i10];
            if (dVar != null) {
                int i11 = dVar.f69698d % 30;
                int i12 = dVar.f69699e;
                if (i12 > aVar.f69684e) {
                    dVarArr[i10] = null;
                } else {
                    if (!this.f69710c) {
                        i12 += 2;
                    }
                    int i13 = i12 % 3;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 == 2 && i11 + 1 != aVar.f69680a) {
                                dVarArr[i10] = null;
                            }
                        } else if (i11 / 3 != aVar.f69681b || i11 % 3 != aVar.f69683d) {
                            dVarArr[i10] = null;
                        }
                    } else if ((i11 * 3) + 1 != aVar.f69682c) {
                        dVarArr[i10] = null;
                    }
                }
            }
        }
    }

    @Override // ih.g
    public final String toString() {
        return "IsLeft: " + this.f69710c + '\n' + super.toString();
    }
}
