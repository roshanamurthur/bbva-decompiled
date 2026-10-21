package org.bouncycastle.jcajce.provider.asymmetric.gost;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.jce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

/* JADX INFO: loaded from: classes8.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GOST3410ParameterSpec f89963a;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        try {
            return new GOST3410PublicKeyAlgParameters(new ASN1ObjectIdentifier(this.f89963a.getPublicKeyParamSetOID()), new ASN1ObjectIdentifier(this.f89963a.getDigestParamSetOID()), new ASN1ObjectIdentifier(this.f89963a.getEncryptionParamSetOID())).getEncoded(ASN1Encoding.DER);
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding GOST3410Parameters");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls != null) {
            return localEngineGetParameterSpec(cls);
        }
        throw new NullPointerException("argument to getParameterSpec must not be null");
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof GOST3410ParameterSpec)) {
            throw new InvalidParameterSpecException("GOST3410ParameterSpec required to initialise a GOST3410 algorithm parameters object");
        }
        this.f89963a = (GOST3410ParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "GOST3410 Parameters";
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == GOST3410PublicKeyParameterSetSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.f89963a;
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to GOST3410 parameters object.");
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) {
        if (isASN1FormatString(str) || str.equalsIgnoreCase(ConstantKt.CERTIFICATE_TYPE_X509)) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        try {
            this.f89963a = GOST3410ParameterSpec.fromPublicKeyAlg(GOST3410PublicKeyAlgParameters.getInstance((ASN1Sequence) ASN1Primitive.fromByteArray(bArr)));
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IOException("Not a valid GOST3410 Parameter encoding.");
        } catch (ClassCastException unused2) {
            throw new IOException("Not a valid GOST3410 Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (!isASN1FormatString(str) && !str.equalsIgnoreCase(ConstantKt.CERTIFICATE_TYPE_X509)) {
            throw new IOException("Unknown parameter format ".concat(str));
        }
        engineInit(bArr);
    }
}
