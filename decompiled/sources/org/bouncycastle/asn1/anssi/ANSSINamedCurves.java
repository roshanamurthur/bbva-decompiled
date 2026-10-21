package org.bouncycastle.asn1.anssi;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes12.dex */
public class ANSSINamedCurves {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Hashtable f86591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Hashtable f86592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Hashtable f86593c;

    public static class a extends X9ECParametersHolder {
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public final X9ECParameters createParameters() {
            Hashtable hashtable = ANSSINamedCurves.f86591a;
            BigInteger bigInteger = new BigInteger(1, Hex.decodeStrict("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03"));
            BigInteger bigInteger2 = new BigInteger(1, Hex.decodeStrict("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00"));
            BigInteger bigInteger3 = new BigInteger(1, Hex.decodeStrict("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F"));
            BigInteger bigInteger4 = new BigInteger(1, Hex.decodeStrict("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1"));
            BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
            ECCurve.Fp fp = new ECCurve.Fp(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigIntegerValueOf);
            X9ECPoint x9ECPoint = new X9ECPoint(fp, Hex.decodeStrict("04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB"));
            WNafUtil.configureBasepoint(x9ECPoint.getPoint());
            return new X9ECParameters(fp, x9ECPoint, bigInteger4, bigIntegerValueOf, null);
        }
    }

    static {
        a aVar = new a();
        Hashtable hashtable = new Hashtable();
        f86591a = hashtable;
        Hashtable hashtable2 = new Hashtable();
        f86592b = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        f86593c = hashtable3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = ANSSIObjectIdentifiers.FRP256v1;
        hashtable.put(Strings.toLowerCase("FRP256v1"), aSN1ObjectIdentifier);
        hashtable3.put(aSN1ObjectIdentifier, "FRP256v1");
        hashtable2.put(aSN1ObjectIdentifier, aVar);
    }

    public static X9ECParameters getByName(String str) {
        ASN1ObjectIdentifier oid = getOID(str);
        if (oid == null) {
            return null;
        }
        return getByOID(oid);
    }

    public static X9ECParameters getByOID(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        X9ECParametersHolder x9ECParametersHolder = (X9ECParametersHolder) f86592b.get(aSN1ObjectIdentifier);
        if (x9ECParametersHolder == null) {
            return null;
        }
        return x9ECParametersHolder.getParameters();
    }

    public static String getName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) f86593c.get(aSN1ObjectIdentifier);
    }

    public static Enumeration getNames() {
        return f86593c.elements();
    }

    public static ASN1ObjectIdentifier getOID(String str) {
        return (ASN1ObjectIdentifier) f86591a.get(Strings.toLowerCase(str));
    }
}
