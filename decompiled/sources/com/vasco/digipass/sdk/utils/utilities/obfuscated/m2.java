package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes9.dex */
public class m2 extends o {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final m f66186p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final m f66187q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final m f66188r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private final m f66189s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private final p5 f66190t0;

    private m2(v vVar) {
        if (vVar.h() < 3 || vVar.h() > 5) {
            throw new IllegalArgumentException("Bad sequence size: " + vVar.h());
        }
        Enumeration enumerationG = vVar.g();
        this.f66186p0 = m.a(enumerationG.nextElement());
        this.f66187q0 = m.a(enumerationG.nextElement());
        this.f66188r0 = m.a(enumerationG.nextElement());
        g gVarA = a(enumerationG);
        if (gVarA == null || !(gVarA instanceof m)) {
            this.f66189s0 = null;
        } else {
            this.f66189s0 = m.a(gVarA);
            gVarA = a(enumerationG);
        }
        if (gVarA != null) {
            this.f66190t0 = p5.a(gVarA.toASN1Primitive());
        } else {
            this.f66190t0 = null;
        }
    }

    public static m2 a(Object obj) {
        if (obj instanceof m2) {
            return (m2) obj;
        }
        if (obj != null) {
            return new m2(v.a(obj));
        }
        return null;
    }

    public BigInteger c() {
        return this.f66187q0.g();
    }

    public BigInteger d() {
        m mVar = this.f66189s0;
        if (mVar == null) {
            return null;
        }
        return mVar.g();
    }

    public BigInteger e() {
        return this.f66186p0.g();
    }

    public BigInteger f() {
        return this.f66188r0.g();
    }

    public p5 g() {
        return this.f66190t0;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o, com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        h hVar = new h();
        hVar.a(this.f66186p0);
        hVar.a(this.f66187q0);
        hVar.a(this.f66188r0);
        m mVar = this.f66189s0;
        if (mVar != null) {
            hVar.a(mVar);
        }
        p5 p5Var = this.f66190t0;
        if (p5Var != null) {
            hVar.a(p5Var);
        }
        return new i1(hVar);
    }

    private static g a(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (g) enumeration.nextElement();
        }
        return null;
    }
}
