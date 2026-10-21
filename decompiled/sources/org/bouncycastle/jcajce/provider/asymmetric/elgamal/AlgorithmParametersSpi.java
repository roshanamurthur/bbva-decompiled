package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.oiw.ElGamalParameter;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jce.spec.ElGamalParameterSpec;

/* JADX INFO: loaded from: classes8.dex */
public class AlgorithmParametersSpi extends BaseAlgorithmParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ElGamalParameterSpec f89947a;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        try {
            return new ElGamalParameter(this.f89947a.getP(), this.f89947a.getG()).getEncoded(ASN1Encoding.DER);
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding ElGamalParameters");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        boolean z10 = algorithmParameterSpec instanceof ElGamalParameterSpec;
        if (!z10 && !(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidParameterSpecException("DHParameterSpec required to initialise a ElGamal algorithm parameters object");
        }
        if (z10) {
            this.f89947a = (ElGamalParameterSpec) algorithmParameterSpec;
        } else {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            this.f89947a = new ElGamalParameterSpec(dHParameterSpec.getP(), dHParameterSpec.getG());
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "ElGamal Parameters";
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == ElGamalParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.f89947a;
        }
        if (cls == DHParameterSpec.class) {
            return new DHParameterSpec(this.f89947a.getP(), this.f89947a.getG());
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
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
            ElGamalParameter elGamalParameter = ElGamalParameter.getInstance(ASN1Primitive.fromByteArray(bArr));
            this.f89947a = new ElGamalParameterSpec(elGamalParameter.getP(), elGamalParameter.getG());
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IOException("Not a valid ElGamal Parameter encoding.");
        } catch (ClassCastException unused2) {
            throw new IOException("Not a valid ElGamal Parameter encoding.");
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
