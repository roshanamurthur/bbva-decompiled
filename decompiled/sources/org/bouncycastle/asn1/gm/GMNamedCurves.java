package org.bouncycastle.asn1.gm;

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
public class GMNamedCurves {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Hashtable f87266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Hashtable f87267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Hashtable f87268c;

    public static class a extends X9ECParametersHolder {
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public final X9ECParameters createParameters() {
            BigInteger bigIntegerA = GMNamedCurves.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF");
            BigInteger bigIntegerA2 = GMNamedCurves.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC");
            BigInteger bigIntegerA3 = GMNamedCurves.a("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93");
            BigInteger bigIntegerA4 = GMNamedCurves.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123");
            BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
            ECCurve.Fp fp = new ECCurve.Fp(bigIntegerA, bigIntegerA2, bigIntegerA3, bigIntegerA4, bigIntegerValueOf);
            X9ECPoint x9ECPoint = new X9ECPoint(fp, Hex.decodeStrict("0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0"));
            WNafUtil.configureBasepoint(x9ECPoint.getPoint());
            return new X9ECParameters(fp, x9ECPoint, bigIntegerA4, bigIntegerValueOf, null);
        }
    }

    public static class b extends X9ECParametersHolder {
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public final X9ECParameters createParameters() {
            BigInteger bigIntegerA = GMNamedCurves.a("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F");
            BigInteger bigIntegerA2 = GMNamedCurves.a("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985");
            BigInteger bigIntegerA3 = GMNamedCurves.a("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1");
            BigInteger bigIntegerA4 = GMNamedCurves.a("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677");
            BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
            ECCurve.Fp fp = new ECCurve.Fp(bigIntegerA, bigIntegerA2, bigIntegerA3, bigIntegerA4, bigIntegerValueOf);
            X9ECPoint x9ECPoint = new X9ECPoint(fp, Hex.decodeStrict("044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2"));
            WNafUtil.configureBasepoint(x9ECPoint.getPoint());
            return new X9ECParameters(fp, x9ECPoint, bigIntegerA4, bigIntegerValueOf, null);
        }
    }

    static {
        a aVar = new a();
        b bVar = new b();
        Hashtable hashtable = new Hashtable();
        f87266a = hashtable;
        Hashtable hashtable2 = new Hashtable();
        f87267b = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        f87268c = hashtable3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = GMObjectIdentifiers.wapip192v1;
        hashtable.put(Strings.toLowerCase("wapip192v1"), aSN1ObjectIdentifier);
        hashtable3.put(aSN1ObjectIdentifier, "wapip192v1");
        hashtable2.put(aSN1ObjectIdentifier, bVar);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = GMObjectIdentifiers.sm2p256v1;
        hashtable.put(Strings.toLowerCase("sm2p256v1"), aSN1ObjectIdentifier2);
        hashtable3.put(aSN1ObjectIdentifier2, "sm2p256v1");
        hashtable2.put(aSN1ObjectIdentifier2, aVar);
    }

    public static BigInteger a(String str) {
        return new BigInteger(1, Hex.decodeStrict(str));
    }

    public static X9ECParameters getByName(String str) {
        ASN1ObjectIdentifier oid = getOID(str);
        if (oid == null) {
            return null;
        }
        return getByOID(oid);
    }

    public static X9ECParameters getByOID(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        X9ECParametersHolder x9ECParametersHolder = (X9ECParametersHolder) f87267b.get(aSN1ObjectIdentifier);
        if (x9ECParametersHolder == null) {
            return null;
        }
        return x9ECParametersHolder.getParameters();
    }

    public static String getName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) f87268c.get(aSN1ObjectIdentifier);
    }

    public static Enumeration getNames() {
        return f87268c.elements();
    }

    public static ASN1ObjectIdentifier getOID(String str) {
        return (ASN1ObjectIdentifier) f87266a.get(Strings.toLowerCase(str));
    }
}
