package org.bouncycastle.jcajce.provider.asymmetric.ec;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import om.a;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.asn1.x9.X9IntegerConverter;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes8.dex */
public class BCECPublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey, ECPointEncoder {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f89831p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f89832q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient ECPublicKeyParameters f89833r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public transient ECParameterSpec f89834s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public transient ProviderConfiguration f89835t0;

    public BCECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec, ProviderConfiguration providerConfiguration) {
        this.f89831p0 = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.f89834s0 = params;
        this.f89833r0 = new ECPublicKeyParameters(EC5Util.convertPoint(params, eCPublicKeySpec.getW()), EC5Util.getDomainParameters(providerConfiguration, eCPublicKeySpec.getParams()));
        this.f89835t0 = providerConfiguration;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        this.f89835t0 = BouncyCastleProvider.CONFIGURATION;
        b(SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(bArr)));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final org.bouncycastle.jce.spec.ECParameterSpec a() {
        ECParameterSpec eCParameterSpec = this.f89834s0;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : this.f89835t0.getEcImplicitlyCa();
    }

    public final void b(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        byte b10;
        X962Parameters x962Parameters = X962Parameters.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
        ECCurve curve = EC5Util.getCurve(this.f89835t0, x962Parameters);
        this.f89834s0 = EC5Util.convertToSpec(x962Parameters, curve);
        byte[] bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
        ASN1OctetString dEROctetString = new DEROctetString(bytes);
        if (bytes[0] == 4 && bytes[1] == bytes.length - 2 && (((b10 = bytes[2]) == 2 || b10 == 3) && new X9IntegerConverter().getByteLength(curve) >= bytes.length - 3)) {
            try {
                dEROctetString = (ASN1OctetString) ASN1Primitive.fromByteArray(bytes);
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering public key");
            }
        }
        this.f89833r0 = new ECPublicKeyParameters(new X9ECPoint(curve, dEROctetString).getPoint(), ECUtil.getDomainParameters(this.f89835t0, x962Parameters));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECPublicKey)) {
            return false;
        }
        BCECPublicKey bCECPublicKey = (BCECPublicKey) obj;
        return this.f89833r0.getQ().equals(bCECPublicKey.f89833r0.getQ()) && a().equals(bCECPublicKey.a());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f89831p0;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, a.b(this.f89834s0, this.f89832q0)), this.f89833r0.getQ().getEncoded(this.f89832q0));
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    @Override // org.bouncycastle.jce.interfaces.ECKey
    public org.bouncycastle.jce.spec.ECParameterSpec getParameters() {
        ECParameterSpec eCParameterSpec = this.f89834s0;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.f89834s0;
    }

    @Override // org.bouncycastle.jce.interfaces.ECPublicKey
    public ECPoint getQ() {
        ECPoint q10 = this.f89833r0.getQ();
        return this.f89834s0 == null ? q10.getDetachedPoint() : q10;
    }

    @Override // java.security.interfaces.ECPublicKey
    public java.security.spec.ECPoint getW() {
        return EC5Util.convertPoint(this.f89833r0.getQ());
    }

    public int hashCode() {
        return this.f89833r0.getQ().hashCode() ^ a().hashCode();
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(String str) {
        this.f89832q0 = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.publicKeyToString(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC, this.f89833r0.getQ(), a());
    }

    public BCECPublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters, ECParameterSpec eCParameterSpec, ProviderConfiguration providerConfiguration) {
        this.f89831p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.f89831p0 = str;
        this.f89833r0 = eCPublicKeyParameters;
        if (eCParameterSpec == null) {
            this.f89834s0 = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.f89834s0 = eCParameterSpec;
        }
        this.f89835t0 = providerConfiguration;
    }

    public BCECPublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters, ProviderConfiguration providerConfiguration) {
        this.f89831p0 = str;
        this.f89833r0 = eCPublicKeyParameters;
        this.f89834s0 = null;
        this.f89835t0 = providerConfiguration;
    }

    public BCECPublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec, ProviderConfiguration providerConfiguration) {
        this.f89831p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.f89831p0 = str;
        if (eCParameterSpec == null) {
            this.f89834s0 = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.f89834s0 = EC5Util.convertSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), eCParameterSpec);
        }
        this.f89833r0 = eCPublicKeyParameters;
        this.f89835t0 = providerConfiguration;
    }

    public BCECPublicKey(String str, BCECPublicKey bCECPublicKey) {
        this.f89831p0 = str;
        this.f89833r0 = bCECPublicKey.f89833r0;
        this.f89834s0 = bCECPublicKey.f89834s0;
        this.f89832q0 = bCECPublicKey.f89832q0;
        this.f89835t0 = bCECPublicKey.f89835t0;
    }

    public BCECPublicKey(String str, org.bouncycastle.jce.spec.ECPublicKeySpec eCPublicKeySpec, ProviderConfiguration providerConfiguration) {
        this.f89831p0 = str;
        if (eCPublicKeySpec.getParams() != null) {
            EllipticCurve ellipticCurveConvertCurve = EC5Util.convertCurve(eCPublicKeySpec.getParams().getCurve(), eCPublicKeySpec.getParams().getSeed());
            this.f89833r0 = new ECPublicKeyParameters(eCPublicKeySpec.getQ(), ECUtil.getDomainParameters(providerConfiguration, eCPublicKeySpec.getParams()));
            this.f89834s0 = EC5Util.convertSpec(ellipticCurveConvertCurve, eCPublicKeySpec.getParams());
        } else {
            this.f89833r0 = new ECPublicKeyParameters(providerConfiguration.getEcImplicitlyCa().getCurve().createPoint(eCPublicKeySpec.getQ().getAffineXCoord().toBigInteger(), eCPublicKeySpec.getQ().getAffineYCoord().toBigInteger()), EC5Util.getDomainParameters(providerConfiguration, null));
            this.f89834s0 = null;
        }
        this.f89835t0 = providerConfiguration;
    }

    public BCECPublicKey(ECPublicKey eCPublicKey, ProviderConfiguration providerConfiguration) {
        this.f89831p0 = LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC;
        this.f89831p0 = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.f89834s0 = params;
        this.f89833r0 = new ECPublicKeyParameters(EC5Util.convertPoint(params, eCPublicKey.getW()), EC5Util.getDomainParameters(providerConfiguration, eCPublicKey.getParams()));
        this.f89835t0 = providerConfiguration;
    }
}
