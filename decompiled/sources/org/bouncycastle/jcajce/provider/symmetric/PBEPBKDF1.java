package org.bouncycastle.jcajce.provider.symmetric;

import androidx.camera.camera2.internal.h0;
import androidx.fragment.app.a;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.pkcs.PBEParameter;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes8.dex */
public class PBEPBKDF1 {

    public static class AlgParams extends BaseAlgorithmParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PBEParameter f90167a;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            try {
                return this.f90167a.getEncoded(ASN1Encoding.DER);
            } catch (IOException e5) {
                throw new RuntimeException("Oooops! " + e5.toString());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PBKDF1 PBE parameters algorithm parameters object");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            this.f90167a = new PBEParameter(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "PBKDF1 Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == PBEParameterSpec.class) {
                return new PBEParameterSpec(this.f90167a.getSalt(), this.f90167a.getIterationCount().intValue());
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to PBKDF1 PBE parameters object.");
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
            this.f90167a = PBEParameter.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (!isASN1FormatString(str)) {
                throw new IOException("Unknown parameters format in PBKDF2 parameters object");
            }
            engineInit(bArr);
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90168a = PBEPBKDF1.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            h0.c(a.b(a.b(a.b(a.b(androidx.collection.a.d(f90168a, "$AlgParams", configurableProvider, "AlgorithmParameters.PBKDF1", "Alg.Alias.AlgorithmParameters."), PKCSObjectIdentifiers.pbeWithMD2AndDES_CBC, configurableProvider, "PBKDF1", "Alg.Alias.AlgorithmParameters."), PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC, configurableProvider, "PBKDF1", "Alg.Alias.AlgorithmParameters."), PKCSObjectIdentifiers.pbeWithMD5AndRC2_CBC, configurableProvider, "PBKDF1", "Alg.Alias.AlgorithmParameters."), PKCSObjectIdentifiers.pbeWithSHA1AndDES_CBC, configurableProvider, "PBKDF1", "Alg.Alias.AlgorithmParameters."), PKCSObjectIdentifiers.pbeWithSHA1AndRC2_CBC, configurableProvider, "PBKDF1");
        }
    }
}
