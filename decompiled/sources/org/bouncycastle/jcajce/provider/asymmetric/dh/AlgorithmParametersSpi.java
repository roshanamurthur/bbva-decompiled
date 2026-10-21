package org.bouncycastle.jcajce.provider.asymmetric.dh;

import androidx.camera.core.processing.f;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.pkcs.DHParameter;

/* JADX INFO: loaded from: classes8.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DHParameterSpec f89749a;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        try {
            return new DHParameter(this.f89749a.getP(), this.f89749a.getG(), this.f89749a.getL()).getEncoded(ASN1Encoding.DER);
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding DHParameters");
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
        if (!(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidParameterSpecException("DHParameterSpec required to initialise a Diffie-Hellman algorithm parameters object");
        }
        this.f89749a = (DHParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "Diffie-Hellman Parameters";
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == DHParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.f89749a;
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to DH parameters object.");
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
            DHParameter dHParameter = DHParameter.getInstance(bArr);
            this.f89749a = dHParameter.getL() != null ? new DHParameterSpec(dHParameter.getP(), dHParameter.getG(), dHParameter.getL().intValue()) : new DHParameterSpec(dHParameter.getP(), dHParameter.getG());
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IOException("Not a valid DH Parameter encoding.");
        } catch (ClassCastException unused2) {
            throw new IOException("Not a valid DH Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (!isASN1FormatString(str)) {
            throw new IOException(f.d("Unknown parameter format ", str));
        }
        engineInit(bArr);
    }
}
