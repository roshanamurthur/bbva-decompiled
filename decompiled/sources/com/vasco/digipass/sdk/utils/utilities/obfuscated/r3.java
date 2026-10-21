package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.asn1.x9.X9ECParameters;
import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes9.dex */
public class r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Hashtable f66295a = new Hashtable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Hashtable f66296b = new Hashtable();

    static {
        a("B-571", z4.F);
        a("B-409", z4.D);
        a("B-283", z4.f66518n);
        a("B-233", z4.f66524t);
        a("B-163", z4.f66517l);
        a("K-571", z4.E);
        a("K-409", z4.C);
        a("K-283", z4.m);
        a("K-233", z4.f66523s);
        a("K-163", z4.f66507b);
        a("P-521", z4.B);
        a("P-384", z4.A);
        a("P-256", z4.H);
        a("P-224", z4.f66530z);
        a("P-192", z4.G);
    }

    public static void a(String str, p pVar) {
        f66295a.put(str, pVar);
        f66296b.put(pVar, str);
    }

    public static X9ECParameters a(String str) {
        p pVar = (p) f66295a.get(k5.b(str));
        if (pVar != null) {
            return a(pVar);
        }
        return null;
    }

    public static X9ECParameters a(p pVar) {
        return y4.a(pVar);
    }

    public static Enumeration a() {
        return f66295a.keys();
    }
}
