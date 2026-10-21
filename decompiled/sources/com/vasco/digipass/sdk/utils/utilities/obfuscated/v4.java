package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes9.dex */
public class v4 extends o {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private BigInteger f66401p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private BigInteger f66402q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private BigInteger f66403r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private BigInteger f66404s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private BigInteger f66405t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private BigInteger f66406u0;
    private BigInteger v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private BigInteger f66407w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private BigInteger f66408x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private v f66409y0;

    private v4(v vVar) {
        this.f66409y0 = null;
        Enumeration enumerationG = vVar.g();
        BigInteger bigIntegerH = ((m) enumerationG.nextElement()).h();
        if (bigIntegerH.intValue() != 0 && bigIntegerH.intValue() != 1) {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        this.f66401p0 = bigIntegerH;
        this.f66402q0 = ((m) enumerationG.nextElement()).h();
        this.f66403r0 = ((m) enumerationG.nextElement()).h();
        this.f66404s0 = ((m) enumerationG.nextElement()).h();
        this.f66405t0 = ((m) enumerationG.nextElement()).h();
        this.f66406u0 = ((m) enumerationG.nextElement()).h();
        this.v0 = ((m) enumerationG.nextElement()).h();
        this.f66407w0 = ((m) enumerationG.nextElement()).h();
        this.f66408x0 = ((m) enumerationG.nextElement()).h();
        if (enumerationG.hasMoreElements()) {
            this.f66409y0 = (v) enumerationG.nextElement();
        }
    }

    public static v4 a(Object obj) {
        if (obj instanceof v4) {
            return (v4) obj;
        }
        if (obj != null) {
            return new v4(v.a(obj));
        }
        return null;
    }

    public BigInteger c() {
        return this.f66408x0;
    }

    public BigInteger d() {
        return this.v0;
    }

    public BigInteger e() {
        return this.f66407w0;
    }

    public BigInteger f() {
        return this.f66402q0;
    }

    public BigInteger g() {
        return this.f66405t0;
    }

    public BigInteger h() {
        return this.f66406u0;
    }

    public BigInteger i() {
        return this.f66404s0;
    }

    public BigInteger j() {
        return this.f66403r0;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o, com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        h hVar = new h();
        hVar.a(new m(this.f66401p0));
        hVar.a(new m(f()));
        hVar.a(new m(j()));
        hVar.a(new m(i()));
        hVar.a(new m(g()));
        hVar.a(new m(h()));
        hVar.a(new m(d()));
        hVar.a(new m(e()));
        hVar.a(new m(c()));
        v vVar = this.f66409y0;
        if (vVar != null) {
            hVar.a(vVar);
        }
        return new i1(hVar);
    }
}
