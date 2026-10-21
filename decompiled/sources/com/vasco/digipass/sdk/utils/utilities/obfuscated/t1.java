package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes9.dex */
public class t1 extends o {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    m f66373p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    m f66374q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    m f66375r0;

    private t1(v vVar) {
        Enumeration enumerationG = vVar.g();
        this.f66373p0 = m.a(enumerationG.nextElement());
        this.f66374q0 = m.a(enumerationG.nextElement());
        if (enumerationG.hasMoreElements()) {
            this.f66375r0 = (m) enumerationG.nextElement();
        } else {
            this.f66375r0 = null;
        }
    }

    public static t1 a(Object obj) {
        if (obj instanceof t1) {
            return (t1) obj;
        }
        if (obj != null) {
            return new t1(v.a(obj));
        }
        return null;
    }

    public BigInteger c() {
        return this.f66374q0.g();
    }

    public BigInteger d() {
        m mVar = this.f66375r0;
        if (mVar == null) {
            return null;
        }
        return mVar.g();
    }

    public BigInteger e() {
        return this.f66373p0.g();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o, com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        h hVar = new h();
        hVar.a(this.f66373p0);
        hVar.a(this.f66374q0);
        if (d() != null) {
            hVar.a(this.f66375r0);
        }
        return new i1(hVar);
    }
}
