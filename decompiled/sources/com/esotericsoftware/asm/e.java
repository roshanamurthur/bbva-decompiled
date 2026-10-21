package com.esotericsoftware.asm;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Label f39986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Label f39987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Label f39988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f39989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f39991f;

    public static e a(e eVar, Label label, Label label2) {
        if (eVar == null) {
            return null;
        }
        e eVarA = a(eVar.f39991f, label, label2);
        eVar.f39991f = eVarA;
        int i10 = eVar.f39986a.f39924c;
        Label label3 = eVar.f39987b;
        int i11 = label3.f39924c;
        int i12 = label.f39924c;
        int i13 = label2 == null ? Integer.MAX_VALUE : label2.f39924c;
        if (i12 >= i11 || i13 <= i10) {
            return eVar;
        }
        if (i12 <= i10) {
            if (i13 >= i11) {
                return eVarA;
            }
            eVar.f39986a = label2;
            return eVar;
        }
        if (i13 >= i11) {
            eVar.f39987b = label;
            return eVar;
        }
        e eVar2 = new e();
        eVar2.f39986a = label2;
        eVar2.f39987b = label3;
        eVar2.f39988c = eVar.f39988c;
        eVar2.f39989d = eVar.f39989d;
        eVar2.f39990e = eVar.f39990e;
        eVar2.f39991f = eVarA;
        eVar.f39987b = label;
        eVar.f39991f = eVar2;
        return eVar;
    }
}
