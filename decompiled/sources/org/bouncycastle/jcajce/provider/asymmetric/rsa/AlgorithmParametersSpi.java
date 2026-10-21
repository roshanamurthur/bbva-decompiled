package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSAESOAEPparams;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.jcajce.util.MessageDigestUtils;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {

    public static class OAEP extends AlgorithmParametersSpi {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OAEPParameterSpec f89976a;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            ASN1ObjectIdentifier oid = DigestFactory.getOID(this.f89976a.getDigestAlgorithm());
            DERNull dERNull = DERNull.INSTANCE;
            try {
                return new RSAESOAEPparams(new AlgorithmIdentifier(oid, dERNull), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, new AlgorithmIdentifier(DigestFactory.getOID(((MGF1ParameterSpec) this.f89976a.getMGFParameters()).getDigestAlgorithm()), dERNull)), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_pSpecified, new DEROctetString(((PSource.PSpecified) this.f89976a.getPSource()).getValue()))).getEncoded(ASN1Encoding.DER);
            } catch (IOException unused) {
                throw new RuntimeException("Error encoding OAEPParameters");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof OAEPParameterSpec)) {
                throw new InvalidParameterSpecException("OAEPParameterSpec required to initialise an OAEP algorithm parameters object");
            }
            this.f89976a = (OAEPParameterSpec) algorithmParameterSpec;
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "OAEP Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == OAEPParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return this.f89976a;
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to OAEP parameters object.");
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
                RSAESOAEPparams rSAESOAEPparams = RSAESOAEPparams.getInstance(bArr);
                if (rSAESOAEPparams.getMaskGenAlgorithm().getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_mgf1)) {
                    this.f89976a = new OAEPParameterSpec(MessageDigestUtils.getDigestName(rSAESOAEPparams.getHashAlgorithm().getAlgorithm()), OAEPParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(MessageDigestUtils.getDigestName(AlgorithmIdentifier.getInstance(rSAESOAEPparams.getMaskGenAlgorithm().getParameters()).getAlgorithm())), new PSource.PSpecified(ASN1OctetString.getInstance(rSAESOAEPparams.getPSourceAlgorithm().getParameters()).getOctets()));
                } else {
                    throw new IOException("unknown mask generation function: " + rSAESOAEPparams.getMaskGenAlgorithm().getAlgorithm());
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Not a valid OAEP Parameter encoding.");
            } catch (ClassCastException unused2) {
                throw new IOException("Not a valid OAEP Parameter encoding.");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (!str.equalsIgnoreCase(ConstantKt.CERTIFICATE_TYPE_X509) && !str.equalsIgnoreCase("ASN.1")) {
                throw new IOException("Unknown parameter format ".concat(str));
            }
            engineInit(bArr);
        }
    }

    public static class PSS extends AlgorithmParametersSpi {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PSSParameterSpec f89977a;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            PSSParameterSpec pSSParameterSpec = this.f89977a;
            ASN1ObjectIdentifier oid = DigestFactory.getOID(pSSParameterSpec.getDigestAlgorithm());
            DERNull dERNull = DERNull.INSTANCE;
            return new RSASSAPSSparams(new AlgorithmIdentifier(oid, dERNull), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, new AlgorithmIdentifier(DigestFactory.getOID(((MGF1ParameterSpec) pSSParameterSpec.getMGFParameters()).getDigestAlgorithm()), dERNull)), new ASN1Integer(pSSParameterSpec.getSaltLength()), new ASN1Integer(pSSParameterSpec.getTrailerField())).getEncoded(ASN1Encoding.DER);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
                throw new InvalidParameterSpecException("PSSParameterSpec required to initialise an PSS algorithm parameters object");
            }
            this.f89977a = (PSSParameterSpec) algorithmParameterSpec;
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "PSS Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == PSSParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return this.f89977a;
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to PSS parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (str.equalsIgnoreCase(ConstantKt.CERTIFICATE_TYPE_X509) || str.equalsIgnoreCase("ASN.1")) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            try {
                RSASSAPSSparams rSASSAPSSparams = RSASSAPSSparams.getInstance(bArr);
                if (rSASSAPSSparams.getMaskGenAlgorithm().getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_mgf1)) {
                    this.f89977a = new PSSParameterSpec(MessageDigestUtils.getDigestName(rSASSAPSSparams.getHashAlgorithm().getAlgorithm()), PSSParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(MessageDigestUtils.getDigestName(AlgorithmIdentifier.getInstance(rSASSAPSSparams.getMaskGenAlgorithm().getParameters()).getAlgorithm())), rSASSAPSSparams.getSaltLength().intValue(), rSASSAPSSparams.getTrailerField().intValue());
                } else {
                    throw new IOException("unknown mask generation function: " + rSASSAPSSparams.getMaskGenAlgorithm().getAlgorithm());
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Not a valid PSS Parameter encoding.");
            } catch (ClassCastException unused2) {
                throw new IOException("Not a valid PSS Parameter encoding.");
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

    @Override // java.security.AlgorithmParametersSpi
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls != null) {
            return localEngineGetParameterSpec(cls);
        }
        throw new NullPointerException("argument to getParameterSpec must not be null");
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    public abstract AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException;
}
