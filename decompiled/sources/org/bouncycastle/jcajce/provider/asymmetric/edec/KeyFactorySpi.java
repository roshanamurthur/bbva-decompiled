package org.bouncycastle.jcajce.provider.asymmetric.edec;

import androidx.camera.core.impl.a;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.util.OpenSSHPrivateKeyUtil;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec;
import org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes8.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f89933c = Hex.decode("3042300506032b656f033900");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f89934d = Hex.decode("302a300506032b656e032100");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f89935e = Hex.decode("3043300506032b6571033a00");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f89936f = Hex.decode("302a300506032b6570032100");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f89937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89938b;

    public static class Ed25519 extends KeyFactorySpi {
        public Ed25519() {
            super(EdDSAParameterSpec.Ed25519, false, 112);
        }
    }

    public static class Ed448 extends KeyFactorySpi {
        public Ed448() {
            super(EdDSAParameterSpec.Ed448, false, 113);
        }
    }

    public static class EdDSA extends KeyFactorySpi {
        public EdDSA() {
            super("EdDSA", false, 0);
        }
    }

    public static class X25519 extends KeyFactorySpi {
        public X25519() {
            super(XDHParameterSpec.X25519, true, 110);
        }
    }

    public static class X448 extends KeyFactorySpi {
        public X448() {
            super(XDHParameterSpec.X448, true, 111);
        }
    }

    public static class XDH extends KeyFactorySpi {
        public XDH() {
            super("XDH", true, 0);
        }
    }

    public KeyFactorySpi(String str, boolean z10, int i10) {
        this.f89937a = z10;
        this.f89938b = i10;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof OpenSSHPrivateKeySpec)) {
            return super.engineGeneratePrivate(keySpec);
        }
        AsymmetricKeyParameter privateKeyBlob = OpenSSHPrivateKeyUtil.parsePrivateKeyBlob(((OpenSSHPrivateKeySpec) keySpec).getEncoded());
        if (privateKeyBlob instanceof Ed25519PrivateKeyParameters) {
            return new BCEdDSAPrivateKey((Ed25519PrivateKeyParameters) privateKeyBlob);
        }
        throw new IllegalStateException("openssh private key not Ed25519 private key");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            byte[] encoded = ((X509EncodedKeySpec) keySpec).getEncoded();
            int i10 = this.f89938b;
            if (i10 == 0 || i10 == encoded[8]) {
                if (encoded[9] == 5 && encoded[10] == 0) {
                    SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(encoded);
                    try {
                        encoded = new SubjectPublicKeyInfo(new AlgorithmIdentifier(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()), subjectPublicKeyInfo.getPublicKeyData().getBytes()).getEncoded(ASN1Encoding.DER);
                    } catch (IOException e5) {
                        throw new InvalidKeySpecException(a.d(e5, new StringBuilder("attempt to reconstruct key failed: ")));
                    }
                }
                switch (encoded[8]) {
                    case 110:
                        return new BCXDHPublicKey(f89934d, encoded);
                    case 111:
                        return new BCXDHPublicKey(f89933c, encoded);
                    case 112:
                        return new BCEdDSAPublicKey(f89936f, encoded);
                    case 113:
                        return new BCEdDSAPublicKey(f89935e, encoded);
                    default:
                        return super.engineGeneratePublic(keySpec);
                }
            }
        } else if (keySpec instanceof OpenSSHPublicKeySpec) {
            AsymmetricKeyParameter publicKey = OpenSSHPublicKeyUtil.parsePublicKey(((OpenSSHPublicKeySpec) keySpec).getEncoded());
            if (publicKey instanceof Ed25519PublicKeyParameters) {
                return new BCEdDSAPublicKey(new byte[0], ((Ed25519PublicKeyParameters) publicKey).getEncoded());
            }
            throw new IllegalStateException("openssh public key not Ed25519 public key");
        }
        return super.engineGeneratePublic(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(OpenSSHPrivateKeySpec.class) && (key instanceof BCEdDSAPrivateKey)) {
            try {
                return new OpenSSHPrivateKeySpec(OpenSSHPrivateKeyUtil.encodePrivateKey(new Ed25519PrivateKeyParameters(ASN1OctetString.getInstance(new ASN1InputStream(((DEROctetString) ASN1Sequence.getInstance(key.getEncoded()).getObjectAt(2)).getOctets()).readObject()).getOctets(), 0)));
            } catch (IOException e5) {
                throw new InvalidKeySpecException(e5.getMessage(), e5.getCause());
            }
        }
        boolean zIsAssignableFrom = cls.isAssignableFrom(OpenSSHPublicKeySpec.class);
        byte[] bArr = f89936f;
        if (zIsAssignableFrom && (key instanceof BCEdDSAPublicKey)) {
            try {
                return new OpenSSHPublicKeySpec(OpenSSHPublicKeyUtil.encodePublicKey(new Ed25519PublicKeyParameters(key.getEncoded(), bArr.length)));
            } catch (IOException e7) {
                throw new InvalidKeySpecException(e7.getMessage(), e7.getCause());
            }
        }
        if (cls.isAssignableFrom(org.bouncycastle.jce.spec.OpenSSHPrivateKeySpec.class) && (key instanceof BCEdDSAPrivateKey)) {
            try {
                return new org.bouncycastle.jce.spec.OpenSSHPrivateKeySpec(OpenSSHPrivateKeyUtil.encodePrivateKey(new Ed25519PrivateKeyParameters(ASN1OctetString.getInstance(new ASN1InputStream(((DEROctetString) ASN1Sequence.getInstance(key.getEncoded()).getObjectAt(2)).getOctets()).readObject()).getOctets(), 0)));
            } catch (IOException e10) {
                throw new InvalidKeySpecException(e10.getMessage(), e10.getCause());
            }
        }
        if (!cls.isAssignableFrom(org.bouncycastle.jce.spec.OpenSSHPublicKeySpec.class) || !(key instanceof BCEdDSAPublicKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        try {
            return new org.bouncycastle.jce.spec.OpenSSHPublicKeySpec(OpenSSHPublicKeyUtil.encodePublicKey(new Ed25519PublicKeyParameters(key.getEncoded(), bArr.length)));
        } catch (IOException e11) {
            throw new InvalidKeySpecException(e11.getMessage(), e11.getCause());
        }
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException("key type unknown");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        boolean z10 = this.f89937a;
        int i10 = this.f89938b;
        if (!z10) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = EdECObjectIdentifiers.id_Ed448;
            if (algorithm.equals((ASN1Primitive) aSN1ObjectIdentifier) || algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_Ed25519)) {
                if ((i10 == 0 || i10 == 113) && algorithm.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                    return new BCEdDSAPrivateKey(privateKeyInfo);
                }
                if ((i10 == 0 || i10 == 112) && algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_Ed25519)) {
                    return new BCEdDSAPrivateKey(privateKeyInfo);
                }
            }
        } else {
            if ((i10 == 0 || i10 == 111) && algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_X448)) {
                return new BCXDHPrivateKey(privateKeyInfo);
            }
            if ((i10 == 0 || i10 == 110) && algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_X25519)) {
                return new BCXDHPrivateKey(privateKeyInfo);
            }
        }
        throw new IOException(androidx.constraintlayout.core.parser.a.b("algorithm identifier ", algorithm, " in key not recognized"));
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        boolean z10 = this.f89937a;
        int i10 = this.f89938b;
        if (!z10) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = EdECObjectIdentifiers.id_Ed448;
            if (algorithm.equals((ASN1Primitive) aSN1ObjectIdentifier) || algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_Ed25519)) {
                if ((i10 == 0 || i10 == 113) && algorithm.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                    return new BCEdDSAPublicKey(subjectPublicKeyInfo);
                }
                if ((i10 == 0 || i10 == 112) && algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_Ed25519)) {
                    return new BCEdDSAPublicKey(subjectPublicKeyInfo);
                }
            }
        } else {
            if ((i10 == 0 || i10 == 111) && algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_X448)) {
                return new BCXDHPublicKey(subjectPublicKeyInfo);
            }
            if ((i10 == 0 || i10 == 110) && algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_X25519)) {
                return new BCXDHPublicKey(subjectPublicKeyInfo);
            }
        }
        throw new IOException(androidx.constraintlayout.core.parser.a.b("algorithm identifier ", algorithm, " in key not recognized"));
    }
}
