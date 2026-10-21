package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x509.DSAParameter;

/* JADX INFO: loaded from: classes8.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DSAParameterSpec f89785a;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        try {
            return new DSAParameter(this.f89785a.getP(), this.f89785a.getQ(), this.f89785a.getG()).getEncoded(ASN1Encoding.DER);
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding DSAParameters");
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
        if (!(algorithmParameterSpec instanceof DSAParameterSpec)) {
            throw new InvalidParameterSpecException("DSAParameterSpec required to initialise a DSA algorithm parameters object");
        }
        this.f89785a = (DSAParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "DSA Parameters";
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == DSAParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.f89785a;
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to DSA parameters object.");
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) {
        if (isASN1FormatString(str)) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        try {
            DSAParameter dSAParameter = DSAParameter.getInstance(ASN1Primitive.fromByteArray(bArr));
            this.f89785a = new DSAParameterSpec(dSAParameter.getP(), dSAParameter.getQ(), dSAParameter.getG());
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IOException("Not a valid DSA Parameter encoding.");
        } catch (ClassCastException unused2) {
            throw new IOException("Not a valid DSA Parameter encoding.");
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
