package com.vasco.digipass.sdk.utils.utilities.obfuscated;

/* JADX INFO: loaded from: classes9.dex */
public class b0 extends o {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private p f65934p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private g f65935q0;

    public b0(p pVar, g gVar) {
        this.f65934p0 = pVar;
        this.f65935q0 = gVar;
    }

    public static b0 a(Object obj) {
        if (obj instanceof b0) {
            return (b0) obj;
        }
        if (obj != null) {
            return new b0(v.a(obj));
        }
        return null;
    }

    public p c() {
        return this.f65934p0;
    }

    public g d() {
        return this.f65935q0;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o, com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        h hVar = new h();
        hVar.a(this.f65934p0);
        g gVar = this.f65935q0;
        if (gVar != null) {
            hVar.a(gVar);
        }
        return new i1(hVar);
    }

    private b0(v vVar) {
        if (vVar.h() >= 1 && vVar.h() <= 2) {
            this.f65934p0 = p.a(vVar.a(0));
            if (vVar.h() == 2) {
                this.f65935q0 = vVar.a(1);
                return;
            } else {
                this.f65935q0 = null;
                return;
            }
        }
        throw new IllegalArgumentException("Bad sequence size: " + vVar.h());
    }
}
