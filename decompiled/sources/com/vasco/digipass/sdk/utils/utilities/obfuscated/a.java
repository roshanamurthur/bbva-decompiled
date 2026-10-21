package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.asn1.x9.X9ECParameters;
import bc.org.bouncycastle.math.ec.ECCurve;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static t5 f65920a = new C0273a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Hashtable f65921b = new Hashtable();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Hashtable f65922c = new Hashtable();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Hashtable f65923d = new Hashtable();

    /* JADX INFO: renamed from: com.vasco.digipass.sdk.utils.utilities.obfuscated.a$a, reason: collision with other inner class name */
    public class C0273a extends t5 {
        @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.t5
        public X9ECParameters a() {
            BigInteger bigIntegerB = a.b("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
            BigInteger bigIntegerB2 = a.b("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
            BigInteger bigIntegerB3 = a.b("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
            BigInteger bigIntegerB4 = a.b("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
            BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
            ECCurve eCCurveB = a.b(new ECCurve.Fp(bigIntegerB, bigIntegerB2, bigIntegerB3, bigIntegerB4, bigIntegerValueOf));
            return new X9ECParameters(eCCurveB, new u5(eCCurveB, e3.a("04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB")), bigIntegerB4, bigIntegerValueOf, (byte[]) null);
        }
    }

    static {
        a("FRP256v1", b.f65933a, f65920a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ECCurve b(ECCurve eCCurve) {
        return eCCurve;
    }

    public static X9ECParameters c(String str) {
        p pVarD = d(str);
        if (pVarD == null) {
            return null;
        }
        return a(pVarD);
    }

    public static p d(String str) {
        return (p) f65921b.get(k5.a(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BigInteger b(String str) {
        return new BigInteger(1, e3.a(str));
    }

    public static void a(String str, p pVar, t5 t5Var) {
        f65921b.put(k5.a(str), pVar);
        f65923d.put(pVar, str);
        f65922c.put(pVar, t5Var);
    }

    public static X9ECParameters a(p pVar) {
        t5 t5Var = (t5) f65922c.get(pVar);
        if (t5Var == null) {
            return null;
        }
        return t5Var.b();
    }

    public static Enumeration a() {
        return f65923d.elements();
    }
}
