package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes9.dex */
public class l5 extends o {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private b0 f66182p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private v0 f66183q0;

    public l5(v vVar) {
        if (vVar.h() != 2) {
            throw new IllegalArgumentException("Bad sequence size: " + vVar.h());
        }
        Enumeration enumerationG = vVar.g();
        this.f66182p0 = b0.a(enumerationG.nextElement());
        this.f66183q0 = v0.a(enumerationG.nextElement());
    }

    public static l5 a(Object obj) {
        if (obj instanceof l5) {
            return (l5) obj;
        }
        if (obj != null) {
            return new l5(v.a(obj));
        }
        return null;
    }

    public b0 c() {
        return this.f66182p0;
    }

    public v0 d() {
        return this.f66183q0;
    }

    public u e() throws IOException {
        return new l(this.f66183q0.h()).d();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o, com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        h hVar = new h();
        hVar.a(this.f66182p0);
        hVar.a(this.f66183q0);
        return new i1(hVar);
    }
}
