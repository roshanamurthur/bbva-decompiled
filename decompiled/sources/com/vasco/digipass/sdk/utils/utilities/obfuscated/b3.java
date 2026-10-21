package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.asn1.x9.X9ECParameters;
import bc.org.bouncycastle.math.ec.ECCurve;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes9.dex */
public class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static t5 f65938a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static t5 f65939b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Hashtable f65940c = new Hashtable();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Hashtable f65941d = new Hashtable();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Hashtable f65942e = new Hashtable();

    public class a extends t5 {
        @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.t5
        public X9ECParameters a() {
            BigInteger bigIntegerB = b3.b("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF");
            BigInteger bigIntegerB2 = b3.b("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC");
            BigInteger bigIntegerB3 = b3.b("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93");
            BigInteger bigIntegerB4 = b3.b("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123");
            BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
            ECCurve eCCurveB = b3.b(new ECCurve.Fp(bigIntegerB, bigIntegerB2, bigIntegerB3, bigIntegerB4, bigIntegerValueOf));
            return new X9ECParameters(eCCurveB, new u5(eCCurveB, e3.a("0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0")), bigIntegerB4, bigIntegerValueOf, (byte[]) null);
        }
    }

    public class b extends t5 {
        @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.t5
        public X9ECParameters a() {
            BigInteger bigIntegerB = b3.b("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F");
            BigInteger bigIntegerB2 = b3.b("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985");
            BigInteger bigIntegerB3 = b3.b("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1");
            BigInteger bigIntegerB4 = b3.b("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677");
            BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
            ECCurve eCCurveB = b3.b(new ECCurve.Fp(bigIntegerB, bigIntegerB2, bigIntegerB3, bigIntegerB4, bigIntegerValueOf));
            return new X9ECParameters(eCCurveB, new u5(eCCurveB, e3.a("044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2")), bigIntegerB4, bigIntegerValueOf, (byte[]) null);
        }
    }

    static {
        a("wapip192v1", c3.J, f65939b);
        a("sm2p256v1", c3.F, f65938a);
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
        return (p) f65940c.get(k5.a(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BigInteger b(String str) {
        return new BigInteger(1, e3.a(str));
    }

    public static void a(String str, p pVar, t5 t5Var) {
        f65940c.put(k5.a(str), pVar);
        f65942e.put(pVar, str);
        f65941d.put(pVar, t5Var);
    }

    public static X9ECParameters a(p pVar) {
        t5 t5Var = (t5) f65941d.get(pVar);
        if (t5Var == null) {
            return null;
        }
        return t5Var.b();
    }

    public static Enumeration a() {
        return f65942e.elements();
    }
}
