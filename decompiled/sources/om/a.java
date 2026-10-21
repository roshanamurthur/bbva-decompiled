package om;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.spec.ECParameterSpec;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECCurve;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static AsymmetricKeyParameter a(PublicKey publicKey) throws InvalidKeyException {
        return publicKey instanceof BCECPublicKey ? ((BCECPublicKey) publicKey).f89833r0 : ECUtil.generatePublicKeyParameter(publicKey);
    }

    public static X962Parameters b(ECParameterSpec eCParameterSpec, boolean z10) {
        if (!(eCParameterSpec instanceof ECNamedCurveSpec)) {
            if (eCParameterSpec == null) {
                return new X962Parameters((ASN1Null) DERNull.INSTANCE);
            }
            ECCurve eCCurveConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
            return new X962Parameters(new X9ECParameters(eCCurveConvertCurve, new X9ECPoint(EC5Util.convertPoint(eCCurveConvertCurve, eCParameterSpec.getGenerator()), z10), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed()));
        }
        ECNamedCurveSpec eCNamedCurveSpec = (ECNamedCurveSpec) eCParameterSpec;
        ASN1ObjectIdentifier namedCurveOid = ECUtil.getNamedCurveOid(eCNamedCurveSpec.getName());
        if (namedCurveOid == null) {
            namedCurveOid = new ASN1ObjectIdentifier(eCNamedCurveSpec.getName());
        }
        return new X962Parameters(namedCurveOid);
    }

    public static X9ECParameters c(String str) {
        try {
            if (str.charAt(0) >= '0' && str.charAt(0) <= '2') {
                return ECUtil.getNamedCurveByOid(new ASN1ObjectIdentifier(str));
            }
            if (str.indexOf(32) > 0) {
                str = str.substring(str.indexOf(32) + 1);
            }
            return ECUtil.getNamedCurveByName(str);
        } catch (IllegalArgumentException unused) {
            return ECUtil.getNamedCurveByName(str);
        }
    }
}
