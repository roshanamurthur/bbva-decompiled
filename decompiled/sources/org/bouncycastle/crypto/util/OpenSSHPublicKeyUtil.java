package org.bouncycastle.crypto.util;

import java.io.IOException;
import lm.b;
import lm.c;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.custom.sec.SecP256R1Curve;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
public class OpenSSHPublicKeyUtil {
    public static byte[] encodePublicKey(AsymmetricKeyParameter asymmetricKeyParameter) throws IOException {
        if (asymmetricKeyParameter == null) {
            throw new IllegalArgumentException("cipherParameters was null.");
        }
        if (asymmetricKeyParameter instanceof RSAKeyParameters) {
            if (asymmetricKeyParameter.isPrivate()) {
                throw new IllegalArgumentException("RSAKeyParamaters was for encryption");
            }
            RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) asymmetricKeyParameter;
            c cVar = new c();
            cVar.d("ssh-rsa");
            cVar.b(rSAKeyParameters.getExponent());
            cVar.b(rSAKeyParameters.getModulus());
            return cVar.f83225a.toByteArray();
        }
        if (asymmetricKeyParameter instanceof ECPublicKeyParameters) {
            c cVar2 = new c();
            ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) asymmetricKeyParameter;
            if (!(eCPublicKeyParameters.getParameters().getCurve() instanceof SecP256R1Curve)) {
                throw new IllegalArgumentException("unable to derive ssh curve name for ".concat(eCPublicKeyParameters.getParameters().getCurve().getClass().getName()));
            }
            cVar2.d("ecdsa-sha2-nistp256");
            cVar2.d("nistp256");
            cVar2.c(eCPublicKeyParameters.getQ().getEncoded(false));
            return cVar2.f83225a.toByteArray();
        }
        if (asymmetricKeyParameter instanceof DSAPublicKeyParameters) {
            DSAPublicKeyParameters dSAPublicKeyParameters = (DSAPublicKeyParameters) asymmetricKeyParameter;
            DSAParameters parameters = dSAPublicKeyParameters.getParameters();
            c cVar3 = new c();
            cVar3.d("ssh-dss");
            cVar3.b(parameters.getP());
            cVar3.b(parameters.getQ());
            cVar3.b(parameters.getG());
            cVar3.b(dSAPublicKeyParameters.getY());
            return cVar3.f83225a.toByteArray();
        }
        if (asymmetricKeyParameter instanceof Ed25519PublicKeyParameters) {
            c cVar4 = new c();
            cVar4.d("ssh-ed25519");
            cVar4.c(((Ed25519PublicKeyParameters) asymmetricKeyParameter).getEncoded());
            return cVar4.f83225a.toByteArray();
        }
        throw new IllegalArgumentException("unable to convert " + asymmetricKeyParameter.getClass().getName() + " to private key");
    }

    public static AsymmetricKeyParameter parsePublicKey(b bVar) {
        AsymmetricKeyParameter ed25519PublicKeyParameters;
        String strFromByteArray = Strings.fromByteArray(bVar.b());
        if ("ssh-rsa".equals(strFromByteArray)) {
            ed25519PublicKeyParameters = new RSAKeyParameters(false, bVar.a(), bVar.a());
        } else if ("ssh-dss".equals(strFromByteArray)) {
            ed25519PublicKeyParameters = new DSAPublicKeyParameters(bVar.a(), new DSAParameters(bVar.a(), bVar.a(), bVar.a()));
        } else if (strFromByteArray.startsWith("ecdsa")) {
            String strFromByteArray2 = Strings.fromByteArray(bVar.b());
            if (strFromByteArray2.startsWith("nist")) {
                String strSubstring = strFromByteArray2.substring(4);
                strFromByteArray2 = strSubstring.substring(0, 1) + Constant.DASH_STRING + strSubstring.substring(1);
            }
            X9ECParameters byName = ECNamedCurveTable.getByName(strFromByteArray2);
            if (byName == null) {
                throw new IllegalStateException(androidx.camera.core.impl.utils.c.a("unable to find curve for ", strFromByteArray, " using curve name ", strFromByteArray2));
            }
            ECCurve curve = byName.getCurve();
            ed25519PublicKeyParameters = new ECPublicKeyParameters(curve.decodePoint(bVar.b()), new ECDomainParameters(curve, byName.getG(), byName.getN(), byName.getH(), byName.getSeed()));
        } else if ("ssh-ed25519".equals(strFromByteArray)) {
            byte[] bArrB = bVar.b();
            if (bArrB.length != 32) {
                throw new IllegalStateException("public key value of wrong length");
            }
            ed25519PublicKeyParameters = new Ed25519PublicKeyParameters(bArrB, 0);
        } else {
            ed25519PublicKeyParameters = null;
        }
        if (ed25519PublicKeyParameters == null) {
            throw new IllegalArgumentException("unable to parse key");
        }
        if (bVar.f83224b >= bVar.f83223a.length) {
            return ed25519PublicKeyParameters;
        }
        throw new IllegalArgumentException("decoded key has trailing data");
    }

    public static AsymmetricKeyParameter parsePublicKey(byte[] bArr) {
        return parsePublicKey(new b(bArr));
    }
}
