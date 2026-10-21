package org.bouncycastle.jcajce.provider.asymmetric.ec;

import androidx.camera.core.processing.f;
import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import om.a;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECCurve;

/* JADX INFO: loaded from: classes8.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ECParameterSpec f89823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f89824b;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() throws IOException {
        return engineGetEncoded("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    public <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (ECParameterSpec.class.isAssignableFrom(cls) || cls == AlgorithmParameterSpec.class) {
            return this.f89823a;
        }
        if (ECGenParameterSpec.class.isAssignableFrom(cls)) {
            String str = this.f89824b;
            if (str != null) {
                ASN1ObjectIdentifier namedCurveOid = ECUtil.getNamedCurveOid(str);
                return namedCurveOid != null ? new ECGenParameterSpec(namedCurveOid.getId()) : new ECGenParameterSpec(this.f89824b);
            }
            ASN1ObjectIdentifier namedCurveOid2 = ECUtil.getNamedCurveOid(EC5Util.convertSpec(this.f89823a));
            if (namedCurveOid2 != null) {
                return new ECGenParameterSpec(namedCurveOid2.getId());
            }
        }
        throw new InvalidParameterSpecException("EC AlgorithmParameters cannot convert to ".concat(cls.getName()));
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof ECGenParameterSpec)) {
            if (!(algorithmParameterSpec instanceof ECParameterSpec)) {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
            }
            this.f89824b = algorithmParameterSpec instanceof ECNamedCurveSpec ? ((ECNamedCurveSpec) algorithmParameterSpec).getName() : null;
            this.f89823a = (ECParameterSpec) algorithmParameterSpec;
            return;
        }
        ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) algorithmParameterSpec;
        X9ECParameters x9ECParametersC = a.c(eCGenParameterSpec.getName());
        if (x9ECParametersC == null) {
            throw new InvalidParameterSpecException("EC curve name not recognized: " + eCGenParameterSpec.getName());
        }
        this.f89824b = eCGenParameterSpec.getName();
        ECParameterSpec eCParameterSpecConvertToSpec = EC5Util.convertToSpec(x9ECParametersC);
        this.f89823a = new ECNamedCurveSpec(this.f89824b, eCParameterSpecConvertToSpec.getCurve(), eCParameterSpecConvertToSpec.getGenerator(), eCParameterSpecConvertToSpec.getOrder(), BigInteger.valueOf(eCParameterSpecConvertToSpec.getCofactor()));
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "EC Parameters";
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) throws IOException {
        X962Parameters x962Parameters;
        if (!isASN1FormatString(str)) {
            throw new IOException(f.d("Unknown parameters format in AlgorithmParameters object: ", str));
        }
        ECParameterSpec eCParameterSpec = this.f89823a;
        if (eCParameterSpec == null) {
            x962Parameters = new X962Parameters((ASN1Null) DERNull.INSTANCE);
        } else {
            String str2 = this.f89824b;
            if (str2 != null) {
                x962Parameters = new X962Parameters(ECUtil.getNamedCurveOid(str2));
            } else {
                org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpecConvertSpec = EC5Util.convertSpec(eCParameterSpec);
                x962Parameters = new X962Parameters(new X9ECParameters(eCParameterSpecConvertSpec.getCurve(), new X9ECPoint(eCParameterSpecConvertSpec.getG(), false), eCParameterSpecConvertSpec.getN(), eCParameterSpecConvertSpec.getH(), eCParameterSpecConvertSpec.getSeed()));
            }
        }
        return x962Parameters.getEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        engineInit(bArr, "ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (!isASN1FormatString(str)) {
            throw new IOException(f.d("Unknown encoded parameters format in AlgorithmParameters object: ", str));
        }
        X962Parameters x962Parameters = X962Parameters.getInstance(bArr);
        ECCurve curve = EC5Util.getCurve(BouncyCastleProvider.CONFIGURATION, x962Parameters);
        if (x962Parameters.isNamedCurve()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters());
            String name = ECNamedCurveTable.getName(aSN1ObjectIdentifier);
            this.f89824b = name;
            if (name == null) {
                this.f89824b = aSN1ObjectIdentifier.getId();
            }
        }
        this.f89823a = EC5Util.convertToSpec(x962Parameters, curve);
    }
}
