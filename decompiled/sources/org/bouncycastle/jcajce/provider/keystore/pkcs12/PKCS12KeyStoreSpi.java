package org.bouncycastle.jcajce.provider.keystore.pkcs12;

import androidx.appcompat.widget.o1;
import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import com.nimbusds.jose.jwk.source.RemoteJWKSet;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERBMPString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.GOST28147Parameters;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.AuthenticatedSafe;
import org.bouncycastle.asn1.pkcs.CertBag;
import org.bouncycastle.asn1.pkcs.ContentInfo;
import org.bouncycastle.asn1.pkcs.EncryptedData;
import org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.MacData;
import org.bouncycastle.asn1.pkcs.PBES2Parameters;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.Pfx;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.SafeBag;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.PKCS12StoreParameter;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.jcajce.spec.PBKDF2KeySpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.interfaces.BCKeyStore;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.JDKPKCS12StoreParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Properties;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes8.dex */
public class PKCS12KeyStoreSpi extends KeyStoreSpi implements PKCSObjectIdentifiers, X509ObjectIdentifiers, BCKeyStore {
    public static final b G0 = new b();
    public final CertificateFactory v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final ASN1ObjectIdentifier f90116w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final ASN1ObjectIdentifier f90117x0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BCJcaJceHelper f90110p0 = new BCJcaJceHelper();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public c f90111q0 = new c();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Hashtable f90112r0 = new Hashtable();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public c f90113s0 = new c();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Hashtable f90114t0 = new Hashtable();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Hashtable f90115u0 = new Hashtable();
    protected SecureRandom random = CryptoServicesRegistrar.getSecureRandom();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public AlgorithmIdentifier f90118y0 = new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE);
    public int E0 = 102400;
    public int F0 = 20;

    public static class BCPKCS12KeyStore extends PKCS12KeyStoreSpi {
        public BCPKCS12KeyStore() {
            super(new BCJcaJceHelper(), PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC);
        }
    }

    public static class BCPKCS12KeyStore3DES extends PKCS12KeyStoreSpi {
        public BCPKCS12KeyStore3DES() {
            BCJcaJceHelper bCJcaJceHelper = new BCJcaJceHelper();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC;
            super(bCJcaJceHelper, aSN1ObjectIdentifier, aSN1ObjectIdentifier);
        }
    }

    public static class DefPKCS12KeyStore extends PKCS12KeyStoreSpi {
        public DefPKCS12KeyStore() {
            super(new DefaultJcaJceHelper(), PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC);
        }
    }

    public static class DefPKCS12KeyStore3DES extends PKCS12KeyStoreSpi {
        public DefPKCS12KeyStore3DES() {
            DefaultJcaJceHelper defaultJcaJceHelper = new DefaultJcaJceHelper();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC;
            super(defaultJcaJceHelper, aSN1ObjectIdentifier, aSN1ObjectIdentifier);
        }
    }

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f90119a;

        public a(PKCS12KeyStoreSpi pKCS12KeyStoreSpi, PublicKey publicKey) {
            b bVar = PKCS12KeyStoreSpi.G0;
            pKCS12KeyStoreSpi.getClass();
            this.f90119a = PKCS12KeyStoreSpi.d(publicKey).getKeyIdentifier();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                return Arrays.areEqual(this.f90119a, ((a) obj).f90119a);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f90119a);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f90120a;

        public b() {
            HashMap map = new HashMap();
            map.put(new ASN1ObjectIdentifier("1.2.840.113533.7.66.10"), Integers.valueOf(128));
            map.put(PKCSObjectIdentifiers.des_EDE3_CBC, Integers.valueOf(192));
            map.put(NISTObjectIdentifiers.id_aes128_CBC, Integers.valueOf(128));
            map.put(NISTObjectIdentifiers.id_aes192_CBC, Integers.valueOf(192));
            map.put(NISTObjectIdentifiers.id_aes256_CBC, Integers.valueOf(256));
            map.put(NTTObjectIdentifiers.id_camellia128_cbc, Integers.valueOf(128));
            map.put(NTTObjectIdentifiers.id_camellia192_cbc, Integers.valueOf(192));
            map.put(NTTObjectIdentifiers.id_camellia256_cbc, Integers.valueOf(256));
            map.put(CryptoProObjectIdentifiers.gostR28147_gcfb, Integers.valueOf(256));
            this.f90120a = Collections.unmodifiableMap(map);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Hashtable f90121a = new Hashtable();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Hashtable f90122b = new Hashtable();

        public final Object a(String str) {
            String str2 = (String) this.f90122b.get(str == null ? null : Strings.toLowerCase(str));
            if (str2 == null) {
                return null;
            }
            return this.f90121a.get(str2);
        }

        public final void b(Object obj, String str) {
            String lowerCase = str == null ? null : Strings.toLowerCase(str);
            Hashtable hashtable = this.f90122b;
            String str2 = (String) hashtable.get(lowerCase);
            Hashtable hashtable2 = this.f90121a;
            if (str2 != null) {
                hashtable2.remove(str2);
            }
            hashtable.put(lowerCase, str);
            hashtable2.put(str, obj);
        }

        public final Object c(String str) {
            String str2 = (String) this.f90122b.remove(str == null ? null : Strings.toLowerCase(str));
            if (str2 == null) {
                return null;
            }
            return this.f90121a.remove(str2);
        }
    }

    public PKCS12KeyStoreSpi(JcaJceHelper jcaJceHelper, ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier2) {
        this.f90116w0 = aSN1ObjectIdentifier;
        this.f90117x0 = aSN1ObjectIdentifier2;
        try {
            this.v0 = jcaJceHelper.createCertificateFactory(ConstantKt.CERTIFICATE_TYPE_X509);
        } catch (Exception e5) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("can't create cert factory - ")));
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    /* JADX WARN: Multi-variable type inference failed */
    public static SafeBag c(String str, Certificate certificate) throws CertificateEncodingException {
        CertBag certBag = new CertBag(PKCSObjectIdentifiers.x509Certificate, new DEROctetString(certificate.getEncoded()));
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (certificate instanceof PKCS12BagAttributeCarrier) {
            PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier = (PKCS12BagAttributeCarrier) certificate;
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.pkcs_9_at_friendlyName;
            DERBMPString dERBMPString = (DERBMPString) pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier);
            if ((dERBMPString == null || !dERBMPString.getString().equals(str)) && str != null) {
                pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier, new DERBMPString(str));
            }
            Enumeration bagAttributeKeys = pKCS12BagAttributeCarrier.getBagAttributeKeys();
            boolean z10 = false;
            while (bagAttributeKeys.hasMoreElements()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier) bagAttributeKeys.nextElement();
                if (!aSN1ObjectIdentifier2.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                    ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                    aSN1EncodableVector2.add(aSN1ObjectIdentifier2);
                    aSN1EncodableVector2.add(new DERSet(pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier2)));
                    aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
                    z10 = true;
                }
            }
            if (!z10) {
                ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
                aSN1EncodableVector3.add(PKCSObjectIdentifiers.pkcs_9_at_friendlyName);
                aSN1EncodableVector3.add(new DERSet(new DERBMPString(str)));
                aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector3));
            }
        } else {
            ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
            aSN1EncodableVector4.add(PKCSObjectIdentifiers.pkcs_9_at_friendlyName);
            aSN1EncodableVector4.add(new DERSet(new DERBMPString(str)));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector4));
        }
        return new SafeBag(PKCSObjectIdentifiers.certBag, certBag.toASN1Primitive(), new DERSet(aSN1EncodableVector));
    }

    public static SubjectKeyIdentifier d(PublicKey publicKey) {
        try {
            SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(publicKey.getEncoded());
            Digest digestCreateSHA1 = DigestFactory.createSHA1();
            byte[] bArr = new byte[digestCreateSHA1.getDigestSize()];
            byte[] bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
            digestCreateSHA1.update(bytes, 0, bytes.length);
            digestCreateSHA1.doFinal(bArr, 0);
            return new SubjectKeyIdentifier(bArr);
        } catch (Exception unused) {
            throw new RuntimeException("error creating key");
        }
    }

    public static int f(BigInteger bigInteger) {
        int iIntValue = bigInteger.intValue();
        if (iIntValue < 0) {
            throw new IllegalStateException("negative iteration count found");
        }
        BigInteger bigIntegerAsBigInteger = Properties.asBigInteger("org.bouncycastle.pkcs12.max_it_count");
        if (bigIntegerAsBigInteger == null || bigIntegerAsBigInteger.intValue() >= iIntValue) {
            return iIntValue;
        }
        StringBuilder sbC = o1.c("iteration count ", iIntValue, " greater than ");
        sbC.append(bigIntegerAsBigInteger.intValue());
        throw new IllegalStateException(sbC.toString());
    }

    public final byte[] a(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr, int i10, char[] cArr, boolean z10, byte[] bArr2) throws Exception {
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i10);
        Mac macCreateMac = this.f90110p0.createMac(aSN1ObjectIdentifier.getId());
        macCreateMac.init(new PKCS12Key(cArr, z10), pBEParameterSpec);
        macCreateMac.update(bArr2);
        return macCreateMac.doFinal();
    }

    public final Cipher b(int i10, char[] cArr, AlgorithmIdentifier algorithmIdentifier) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        SecretKey secretKeyGenerateSecret;
        AlgorithmParameterSpec gOST28147ParameterSpec;
        PBES2Parameters pBES2Parameters = PBES2Parameters.getInstance(algorithmIdentifier.getParameters());
        PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(pBES2Parameters.getKeyDerivationFunc().getParameters());
        AlgorithmIdentifier algorithmIdentifier2 = AlgorithmIdentifier.getInstance(pBES2Parameters.getEncryptionScheme());
        SecretKeyFactory secretKeyFactoryCreateSecretKeyFactory = this.f90110p0.createSecretKeyFactory(pBES2Parameters.getKeyDerivationFunc().getAlgorithm().getId());
        boolean zIsDefaultPrf = pBKDF2Params.isDefaultPrf();
        b bVar = G0;
        if (zIsDefaultPrf) {
            byte[] salt = pBKDF2Params.getSalt();
            int iF = f(pBKDF2Params.getIterationCount());
            Integer num = (Integer) bVar.f90120a.get(algorithmIdentifier2.getAlgorithm());
            secretKeyGenerateSecret = secretKeyFactoryCreateSecretKeyFactory.generateSecret(new PBEKeySpec(cArr, salt, iF, num != null ? num.intValue() : -1));
        } else {
            byte[] salt2 = pBKDF2Params.getSalt();
            int iF2 = f(pBKDF2Params.getIterationCount());
            Integer num2 = (Integer) bVar.f90120a.get(algorithmIdentifier2.getAlgorithm());
            secretKeyGenerateSecret = secretKeyFactoryCreateSecretKeyFactory.generateSecret(new PBKDF2KeySpec(cArr, salt2, iF2, num2 != null ? num2.intValue() : -1, pBKDF2Params.getPrf()));
        }
        Cipher cipher = Cipher.getInstance(pBES2Parameters.getEncryptionScheme().getAlgorithm().getId());
        ASN1Encodable parameters = pBES2Parameters.getEncryptionScheme().getParameters();
        if (parameters instanceof ASN1OctetString) {
            gOST28147ParameterSpec = new IvParameterSpec(ASN1OctetString.getInstance(parameters).getOctets());
        } else {
            GOST28147Parameters gOST28147Parameters = GOST28147Parameters.getInstance(parameters);
            gOST28147ParameterSpec = new GOST28147ParameterSpec(gOST28147Parameters.getEncryptionParamSet(), gOST28147Parameters.getIV());
        }
        cipher.init(i10, secretKeyGenerateSecret, gOST28147ParameterSpec);
        return cipher;
    }

    public byte[] cryptData(boolean z10, AlgorithmIdentifier algorithmIdentifier, char[] cArr, boolean z11, byte[] bArr) throws IOException {
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        int i10 = z10 ? 1 : 2;
        if (!algorithm.on(PKCSObjectIdentifiers.pkcs_12PbeIds)) {
            if (algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.id_PBES2)) {
                try {
                    return b(i10, cArr, algorithmIdentifier).doFinal(bArr);
                } catch (Exception e5) {
                    throw new IOException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("exception decrypting data - ")));
                }
            }
            throw new IOException("unknown PBE algorithm: " + algorithm);
        }
        PKCS12PBEParams pKCS12PBEParams = PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
        try {
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
            PKCS12Key pKCS12Key = new PKCS12Key(cArr, z11);
            Cipher cipherCreateCipher = this.f90110p0.createCipher(algorithm.getId());
            cipherCreateCipher.init(i10, pKCS12Key, pBEParameterSpec);
            return cipherCreateCipher.doFinal(bArr);
        } catch (Exception e7) {
            throw new IOException(androidx.appcompat.view.menu.b.c(e7, new StringBuilder("exception decrypting data - ")));
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0174  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.Hashtable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Hashtable] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, java.security.cert.Certificate] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.security.cert.Certificate] */
    public final void e(OutputStream outputStream, char[] cArr, boolean z10) throws IOException {
        String str;
        int size = this.f90111q0.f90121a.size();
        String str2 = ASN1Encoding.BER;
        if (size == 0) {
            if (cArr == null) {
                Enumeration enumerationKeys = this.f90113s0.f90121a.keys();
                ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                while (enumerationKeys.hasMoreElements()) {
                    try {
                        String str3 = (String) enumerationKeys.nextElement();
                        aSN1EncodableVector.add(c(str3, (Certificate) this.f90113s0.a(str3)));
                    } catch (CertificateEncodingException e5) {
                        throw new IOException("Error encoding certificate: " + e5.toString());
                    }
                }
                ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.data;
                if (z10) {
                    new Pfx(new ContentInfo(aSN1ObjectIdentifier, new DEROctetString(new DERSequence(new ContentInfo(aSN1ObjectIdentifier, new DEROctetString(new DERSequence(aSN1EncodableVector).getEncoded()))).getEncoded())), null).encodeTo(outputStream, ASN1Encoding.DER);
                    return;
                } else {
                    new Pfx(new ContentInfo(aSN1ObjectIdentifier, new BEROctetString(new BERSequence(new ContentInfo(aSN1ObjectIdentifier, new BEROctetString(new BERSequence(aSN1EncodableVector).getEncoded()))).getEncoded())), null).encodeTo(outputStream, ASN1Encoding.BER);
                    return;
                }
            }
        } else if (cArr == null) {
            throw new NullPointerException("no password supplied for PKCS#12 KeyStore");
        }
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        Enumeration enumerationKeys2 = this.f90111q0.f90121a.keys();
        while (enumerationKeys2.hasMoreElements()) {
            byte[] bArr = new byte[20];
            this.random.nextBytes(bArr);
            String str4 = (String) enumerationKeys2.nextElement();
            PrivateKey privateKey = (PrivateKey) this.f90111q0.a(str4);
            PKCS12PBEParams pKCS12PBEParams = new PKCS12PBEParams(bArr, RemoteJWKSet.DEFAULT_HTTP_SIZE_LIMIT);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = this.f90116w0;
            EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(new AlgorithmIdentifier(aSN1ObjectIdentifier2, pKCS12PBEParams.toASN1Primitive()), wrapKey(aSN1ObjectIdentifier2.getId(), privateKey, pKCS12PBEParams, cArr));
            ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
            if (privateKey instanceof PKCS12BagAttributeCarrier) {
                PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier = (PKCS12BagAttributeCarrier) privateKey;
                ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PKCSObjectIdentifiers.pkcs_9_at_friendlyName;
                DERBMPString dERBMPString = (DERBMPString) pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier3);
                if (dERBMPString == null || !dERBMPString.getString().equals(str4)) {
                    pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier3, new DERBMPString(str4));
                }
                ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.pkcs_9_at_localKeyId;
                if (pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier4) == null) {
                    pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier4, d(engineGetCertificate(str4).getPublicKey()));
                }
                Enumeration bagAttributeKeys = pKCS12BagAttributeCarrier.getBagAttributeKeys();
                boolean z11 = false;
                while (bagAttributeKeys.hasMoreElements()) {
                    ASN1ObjectIdentifier aSN1ObjectIdentifier5 = (ASN1ObjectIdentifier) bagAttributeKeys.nextElement();
                    ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
                    aSN1EncodableVector4.add(aSN1ObjectIdentifier5);
                    aSN1EncodableVector4.add(new DERSet(pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier5)));
                    aSN1EncodableVector3.add(new DERSequence(aSN1EncodableVector4));
                    z11 = true;
                }
                if (!z11) {
                    ASN1EncodableVector aSN1EncodableVector5 = new ASN1EncodableVector();
                    Certificate certificateEngineGetCertificate = engineGetCertificate(str4);
                    aSN1EncodableVector5.add(PKCSObjectIdentifiers.pkcs_9_at_localKeyId);
                    aSN1EncodableVector5.add(new DERSet(d(certificateEngineGetCertificate.getPublicKey())));
                    aSN1EncodableVector3.add(new DERSequence(aSN1EncodableVector5));
                    ASN1EncodableVector aSN1EncodableVector6 = new ASN1EncodableVector();
                    aSN1EncodableVector6.add(PKCSObjectIdentifiers.pkcs_9_at_friendlyName);
                    aSN1EncodableVector6.add(new DERSet(new DERBMPString(str4)));
                    aSN1EncodableVector3.add(new DERSequence(aSN1EncodableVector6));
                }
            } else {
                ASN1EncodableVector aSN1EncodableVector7 = new ASN1EncodableVector();
                Certificate certificateEngineGetCertificate2 = engineGetCertificate(str4);
                aSN1EncodableVector7.add(PKCSObjectIdentifiers.pkcs_9_at_localKeyId);
                aSN1EncodableVector7.add(new DERSet(d(certificateEngineGetCertificate2.getPublicKey())));
                aSN1EncodableVector3.add(new DERSequence(aSN1EncodableVector7));
                ASN1EncodableVector aSN1EncodableVector8 = new ASN1EncodableVector();
                aSN1EncodableVector8.add(PKCSObjectIdentifiers.pkcs_9_at_friendlyName);
                aSN1EncodableVector8.add(new DERSet(new DERBMPString(str4)));
                aSN1EncodableVector3.add(new DERSequence(aSN1EncodableVector8));
            }
            aSN1EncodableVector2.add(new SafeBag(PKCSObjectIdentifiers.pkcs8ShroudedKeyBag, encryptedPrivateKeyInfo.toASN1Primitive(), new DERSet(aSN1EncodableVector3)));
        }
        BEROctetString bEROctetString = new BEROctetString(new DERSequence(aSN1EncodableVector2).getEncoded(ASN1Encoding.DER));
        byte[] bArr2 = new byte[20];
        this.random.nextBytes(bArr2);
        ASN1EncodableVector aSN1EncodableVector9 = new ASN1EncodableVector();
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(this.f90117x0, new PKCS12PBEParams(bArr2, RemoteJWKSet.DEFAULT_HTTP_SIZE_LIMIT).toASN1Primitive());
        ?? hashtable = new Hashtable();
        Enumeration enumerationKeys3 = this.f90111q0.f90121a.keys();
        while (enumerationKeys3.hasMoreElements()) {
            try {
                String str5 = (String) enumerationKeys3.nextElement();
                ?? EngineGetCertificate = engineGetCertificate(str5);
                Enumeration enumeration = enumerationKeys3;
                CertBag certBag = new CertBag(PKCSObjectIdentifiers.x509Certificate, new DEROctetString(EngineGetCertificate.getEncoded()));
                ASN1EncodableVector aSN1EncodableVector10 = new ASN1EncodableVector();
                if (EngineGetCertificate instanceof PKCS12BagAttributeCarrier) {
                    PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier2 = (PKCS12BagAttributeCarrier) EngineGetCertificate;
                    ASN1ObjectIdentifier aSN1ObjectIdentifier6 = PKCSObjectIdentifiers.pkcs_9_at_friendlyName;
                    DERBMPString dERBMPString2 = (DERBMPString) pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier6);
                    if (dERBMPString2 == null || !dERBMPString2.getString().equals(str5)) {
                        pKCS12BagAttributeCarrier2.setBagAttribute(aSN1ObjectIdentifier6, new DERBMPString(str5));
                    }
                    ASN1ObjectIdentifier aSN1ObjectIdentifier7 = PKCSObjectIdentifiers.pkcs_9_at_localKeyId;
                    if (pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier7) == null) {
                        pKCS12BagAttributeCarrier2.setBagAttribute(aSN1ObjectIdentifier7, d(EngineGetCertificate.getPublicKey()));
                    }
                    Enumeration bagAttributeKeys2 = pKCS12BagAttributeCarrier2.getBagAttributeKeys();
                    boolean z12 = false;
                    while (bagAttributeKeys2.hasMoreElements()) {
                        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = (ASN1ObjectIdentifier) bagAttributeKeys2.nextElement();
                        Enumeration enumeration2 = bagAttributeKeys2;
                        ASN1EncodableVector aSN1EncodableVector11 = new ASN1EncodableVector();
                        aSN1EncodableVector11.add(aSN1ObjectIdentifier8);
                        aSN1EncodableVector11.add(new DERSet(pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier8)));
                        aSN1EncodableVector10.add(new DERSequence(aSN1EncodableVector11));
                        bagAttributeKeys2 = enumeration2;
                        str2 = str2;
                        z12 = true;
                    }
                    str = str2;
                    if (!z12) {
                    }
                    aSN1EncodableVector9.add(new SafeBag(PKCSObjectIdentifiers.certBag, certBag.toASN1Primitive(), new DERSet(aSN1EncodableVector10)));
                    hashtable.put(EngineGetCertificate, EngineGetCertificate);
                    enumerationKeys3 = enumeration;
                    str2 = str;
                } else {
                    str = str2;
                }
                ASN1EncodableVector aSN1EncodableVector12 = new ASN1EncodableVector();
                aSN1EncodableVector12.add(PKCSObjectIdentifiers.pkcs_9_at_localKeyId);
                aSN1EncodableVector12.add(new DERSet(d(EngineGetCertificate.getPublicKey())));
                aSN1EncodableVector10.add(new DERSequence(aSN1EncodableVector12));
                ASN1EncodableVector aSN1EncodableVector13 = new ASN1EncodableVector();
                aSN1EncodableVector13.add(PKCSObjectIdentifiers.pkcs_9_at_friendlyName);
                aSN1EncodableVector13.add(new DERSet(new DERBMPString(str5)));
                aSN1EncodableVector10.add(new DERSequence(aSN1EncodableVector13));
                aSN1EncodableVector9.add(new SafeBag(PKCSObjectIdentifiers.certBag, certBag.toASN1Primitive(), new DERSet(aSN1EncodableVector10)));
                hashtable.put(EngineGetCertificate, EngineGetCertificate);
                enumerationKeys3 = enumeration;
                str2 = str;
            } catch (CertificateEncodingException e7) {
                throw new IOException("Error encoding certificate: " + e7.toString());
            }
        }
        String str6 = str2;
        Enumeration enumerationKeys4 = this.f90113s0.f90121a.keys();
        while (enumerationKeys4.hasMoreElements()) {
            try {
                String str7 = (String) enumerationKeys4.nextElement();
                Certificate certificate = (Certificate) this.f90113s0.a(str7);
                if (this.f90111q0.a(str7) == null) {
                    aSN1EncodableVector9.add(c(str7, certificate));
                    hashtable.put(certificate, certificate);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException("Error encoding certificate: " + e10.toString());
            }
        }
        ?? hashSet = new HashSet();
        Enumeration enumerationKeys5 = this.f90111q0.f90121a.keys();
        while (enumerationKeys5.hasMoreElements()) {
            Certificate[] certificateArrEngineGetCertificateChain = engineGetCertificateChain((String) enumerationKeys5.nextElement());
            for (int i10 = 0; i10 != certificateArrEngineGetCertificateChain.length; i10++) {
                hashSet.add(certificateArrEngineGetCertificateChain[i10]);
            }
        }
        Enumeration enumerationKeys6 = this.f90113s0.f90121a.keys();
        while (enumerationKeys6.hasMoreElements()) {
            hashSet.add(engineGetCertificate((String) enumerationKeys6.nextElement()));
        }
        Enumeration enumerationKeys7 = this.f90114t0.keys();
        while (enumerationKeys7.hasMoreElements()) {
            try {
                ?? r10 = (Certificate) this.f90114t0.get((a) enumerationKeys7.nextElement());
                if (hashSet.contains(r10) && hashtable.get(r10) == null) {
                    CertBag certBag2 = new CertBag(PKCSObjectIdentifiers.x509Certificate, new DEROctetString(r10.getEncoded()));
                    ASN1EncodableVector aSN1EncodableVector14 = new ASN1EncodableVector();
                    if (r10 instanceof PKCS12BagAttributeCarrier) {
                        PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier3 = (PKCS12BagAttributeCarrier) r10;
                        Enumeration bagAttributeKeys3 = pKCS12BagAttributeCarrier3.getBagAttributeKeys();
                        while (bagAttributeKeys3.hasMoreElements()) {
                            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = (ASN1ObjectIdentifier) bagAttributeKeys3.nextElement();
                            if (!aSN1ObjectIdentifier9.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                ASN1EncodableVector aSN1EncodableVector15 = new ASN1EncodableVector();
                                aSN1EncodableVector15.add(aSN1ObjectIdentifier9);
                                aSN1EncodableVector15.add(new DERSet(pKCS12BagAttributeCarrier3.getBagAttribute(aSN1ObjectIdentifier9)));
                                aSN1EncodableVector14.add(new DERSequence(aSN1EncodableVector15));
                                hashtable = hashtable;
                            }
                        }
                    }
                    ?? r16 = hashtable;
                    aSN1EncodableVector9.add(new SafeBag(PKCSObjectIdentifiers.certBag, certBag2.toASN1Primitive(), new DERSet(aSN1EncodableVector14)));
                    hashtable = r16;
                }
            } catch (CertificateEncodingException e11) {
                throw new IOException("Error encoding certificate: " + e11.toString());
            }
        }
        byte[] bArrCryptData = cryptData(true, algorithmIdentifier, cArr, false, new DERSequence(aSN1EncodableVector9).getEncoded(ASN1Encoding.DER));
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = PKCSObjectIdentifiers.data;
        ContentInfo contentInfo = new ContentInfo(aSN1ObjectIdentifier10, new BEROctetString(new AuthenticatedSafe(new ContentInfo[]{new ContentInfo(aSN1ObjectIdentifier10, bEROctetString), new ContentInfo(PKCSObjectIdentifiers.encryptedData, new EncryptedData(aSN1ObjectIdentifier10, algorithmIdentifier, new BEROctetString(bArrCryptData)).toASN1Primitive())}).getEncoded(z10 ? ASN1Encoding.DER : str6)));
        byte[] bArr3 = new byte[this.F0];
        this.random.nextBytes(bArr3);
        try {
            new Pfx(contentInfo, new MacData(new DigestInfo(this.f90118y0, a(this.f90118y0.getAlgorithm(), bArr3, this.E0, cArr, false, ((ASN1OctetString) contentInfo.getContent()).getOctets())), bArr3, this.E0)).encodeTo(outputStream, z10 ? ASN1Encoding.DER : str6);
        } catch (Exception e12) {
            throw new IOException(androidx.appcompat.view.menu.b.c(e12, new StringBuilder("error constructing MAC: ")));
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        Hashtable hashtable = new Hashtable();
        Enumeration enumerationKeys = this.f90113s0.f90121a.keys();
        while (enumerationKeys.hasMoreElements()) {
            hashtable.put(enumerationKeys.nextElement(), "cert");
        }
        Enumeration enumerationKeys2 = this.f90111q0.f90121a.keys();
        while (enumerationKeys2.hasMoreElements()) {
            String str = (String) enumerationKeys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.keys();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        return (this.f90113s0.a(str) == null && this.f90111q0.a(str) == null) ? false : true;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) throws KeyStoreException {
        Key key = (Key) this.f90111q0.c(str);
        Certificate certificate = (Certificate) this.f90113s0.c(str);
        if (certificate != null) {
            this.f90114t0.remove(new a(this, certificate.getPublicKey()));
        }
        if (key != null) {
            String str2 = (String) this.f90112r0.remove(str);
            if (str2 != null) {
                certificate = (Certificate) this.f90115u0.remove(str2);
            }
            if (certificate != null) {
                this.f90114t0.remove(new a(this, certificate.getPublicKey()));
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null alias passed to getCertificate.");
        }
        Certificate certificate = (Certificate) this.f90113s0.a(str);
        if (certificate != null) {
            return certificate;
        }
        String str2 = (String) this.f90112r0.get(str);
        return (Certificate) (str2 != null ? this.f90115u0.get(str2) : this.f90115u0.get(str));
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        Enumeration enumerationElements = this.f90113s0.f90121a.elements();
        Enumeration enumerationKeys = this.f90113s0.f90121a.keys();
        while (enumerationElements.hasMoreElements()) {
            Certificate certificate2 = (Certificate) enumerationElements.nextElement();
            String str = (String) enumerationKeys.nextElement();
            if (certificate2.equals(certificate)) {
                return str;
            }
        }
        Enumeration enumerationElements2 = this.f90115u0.elements();
        Enumeration enumerationKeys2 = this.f90115u0.keys();
        while (enumerationElements2.hasMoreElements()) {
            Certificate certificate3 = (Certificate) enumerationElements2.nextElement();
            String str2 = (String) enumerationKeys2.nextElement();
            if (certificate3.equals(certificate)) {
                return str2;
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        Certificate certificate;
        byte[] keyIdentifier;
        if (str == null) {
            throw new IllegalArgumentException("null alias passed to getCertificateChain.");
        }
        Certificate[] certificateArr = null;
        if (!engineIsKeyEntry(str)) {
            return null;
        }
        Certificate certificateEngineGetCertificate = engineGetCertificate(str);
        if (certificateEngineGetCertificate != null) {
            Vector vector = new Vector();
            while (certificateEngineGetCertificate != null) {
                X509Certificate x509Certificate = (X509Certificate) certificateEngineGetCertificate;
                byte[] extensionValue = x509Certificate.getExtensionValue(Extension.authorityKeyIdentifier.getId());
                if (extensionValue == null || (keyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1OctetString.getInstance(extensionValue).getOctets()).getKeyIdentifier()) == null) {
                    certificate = null;
                } else {
                    Hashtable hashtable = this.f90114t0;
                    a aVar = new a();
                    aVar.f90119a = keyIdentifier;
                    certificate = (Certificate) hashtable.get(aVar);
                }
                if (certificate == null) {
                    Principal issuerDN = x509Certificate.getIssuerDN();
                    if (!issuerDN.equals(x509Certificate.getSubjectDN())) {
                        Enumeration enumerationKeys = this.f90114t0.keys();
                        while (enumerationKeys.hasMoreElements()) {
                            X509Certificate x509Certificate2 = (X509Certificate) this.f90114t0.get(enumerationKeys.nextElement());
                            if (x509Certificate2.getSubjectDN().equals(issuerDN)) {
                                try {
                                    x509Certificate.verify(x509Certificate2.getPublicKey());
                                    certificate = x509Certificate2;
                                    break;
                                } catch (Exception unused) {
                                    continue;
                                }
                            }
                        }
                    }
                }
                if (!vector.contains(certificateEngineGetCertificate)) {
                    vector.addElement(certificateEngineGetCertificate);
                    if (certificate != certificateEngineGetCertificate) {
                        certificateEngineGetCertificate = certificate;
                    }
                }
                certificateEngineGetCertificate = null;
            }
            int size = vector.size();
            certificateArr = new Certificate[size];
            for (int i10 = 0; i10 != size; i10++) {
                certificateArr[i10] = (Certificate) vector.elementAt(i10);
            }
        }
        return certificateArr;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        if (str == null) {
            throw new NullPointerException("alias == null");
        }
        if (this.f90111q0.a(str) == null && this.f90113s0.a(str) == null) {
            return null;
        }
        return new Date();
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        if (str != null) {
            return (Key) this.f90111q0.a(str);
        }
        throw new IllegalArgumentException("null alias passed to getKey.");
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        return this.f90113s0.a(str) != null && this.f90111q0.a(str) == null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        return this.f90111q0.a(str) != null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:104:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:106:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:108:0x0304  */
    /* JADX WARN: Code duplicated, block: B:113:0x0315  */
    /* JADX WARN: Code duplicated, block: B:114:0x0319  */
    /* JADX WARN: Code duplicated, block: B:117:0x0322  */
    /* JADX WARN: Code duplicated, block: B:118:0x032e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0336  */
    /* JADX WARN: Code duplicated, block: B:124:0x0351  */
    /* JADX WARN: Code duplicated, block: B:125:0x0358  */
    /* JADX WARN: Code duplicated, block: B:126:0x035f  */
    /* JADX WARN: Code duplicated, block: B:128:0x036f  */
    /* JADX WARN: Code duplicated, block: B:131:0x038e  */
    /* JADX WARN: Code duplicated, block: B:135:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:140:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:149:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:150:0x0404  */
    /* JADX WARN: Code duplicated, block: B:151:0x040a  */
    /* JADX WARN: Code duplicated, block: B:154:0x0433  */
    /* JADX WARN: Code duplicated, block: B:156:0x0474  */
    /* JADX WARN: Code duplicated, block: B:160:0x0492  */
    /* JADX WARN: Code duplicated, block: B:165:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:168:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:172:0x0501  */
    /* JADX WARN: Code duplicated, block: B:174:0x050a  */
    /* JADX WARN: Code duplicated, block: B:179:0x051b  */
    /* JADX WARN: Code duplicated, block: B:187:0x053c  */
    /* JADX WARN: Code duplicated, block: B:190:0x0550  */
    /* JADX WARN: Code duplicated, block: B:192:0x0558  */
    /* JADX WARN: Code duplicated, block: B:193:0x057c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:194:0x057e  */
    /* JADX WARN: Code duplicated, block: B:196:0x0592  */
    /* JADX WARN: Code duplicated, block: B:211:0x04ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x030f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x0339 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x03ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x03e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x03d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x03eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0388 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x0388 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x05a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0515 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x0597 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x0597 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x04f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x052d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0526 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0535 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x04d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x04d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0102  */
    /* JADX WARN: Code duplicated, block: B:46:0x011c  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0143  */
    /* JADX WARN: Code duplicated, block: B:53:0x0157  */
    /* JADX WARN: Code duplicated, block: B:55:0x0171  */
    /* JADX WARN: Code duplicated, block: B:58:0x0182  */
    /* JADX WARN: Code duplicated, block: B:60:0x019e  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:83:0x0205  */
    /* JADX WARN: Code duplicated, block: B:84:0x020b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0213  */
    /* JADX WARN: Code duplicated, block: B:87:0x021f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0223  */
    /* JADX WARN: Code duplicated, block: B:91:0x024c  */
    /* JADX WARN: Code duplicated, block: B:93:0x025a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0287  */
    /* JADX WARN: Code duplicated, block: B:98:0x029b  */
    /* JADX WARN: Code duplicated, block: B:99:0x02a4  */
    /* JADX WARN: Instruction removed from duplicated block: B:151:0x040a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:154:0x0433, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:88:0x0223, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
        boolean z10;
        boolean z11;
        int i10;
        SafeBag safeBag;
        CertBag certBag;
        Certificate certificateGenerateCertificate;
        String string;
        ASN1OctetString aSN1OctetString;
        Enumeration objects;
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        ASN1Set aSN1Set;
        ASN1Primitive aSN1Primitive;
        PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier;
        ASN1Encodable bagAttribute;
        ContentInfo[] contentInfo;
        int i11;
        boolean z12;
        int i12;
        ASN1Sequence aSN1Sequence;
        int i13;
        SafeBag safeBag2;
        boolean z13;
        ASN1Sequence aSN1Sequence2;
        PrivateKey privateKey;
        PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier2;
        Enumeration objects2;
        ASN1OctetString aSN1OctetString2;
        String string2;
        String str;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2;
        ASN1Set aSN1Set2;
        ASN1Primitive aSN1Primitive2;
        ASN1Encodable bagAttribute2;
        PrivateKey privateKeyUnwrapKey;
        PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier3;
        Enumeration objects3;
        ASN1OctetString aSN1OctetString3;
        String string3;
        String str2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3;
        ASN1Set aSN1Set3;
        ASN1Primitive aSN1Primitive3;
        ASN1Encodable bagAttribute3;
        ASN1Sequence aSN1Sequence3;
        int i14;
        SafeBag safeBag3;
        PrivateKey privateKeyUnwrapKey2;
        String string4;
        ASN1OctetString aSN1OctetString4;
        String str3;
        Enumeration objects4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4;
        ASN1Set aSN1Set4;
        ASN1Primitive aSN1Primitive4;
        PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier4;
        ASN1Encodable bagAttribute4;
        if (inputStream == null) {
            return;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        bufferedInputStream.mark(10);
        if (bufferedInputStream.read() != 48) {
            throw new IOException("stream does not represent a PKCS12 key store");
        }
        bufferedInputStream.reset();
        try {
            Pfx pfx = Pfx.getInstance(new ASN1InputStream(bufferedInputStream).readObject());
            ContentInfo authSafe = pfx.getAuthSafe();
            Vector vector = new Vector();
            int i15 = 1;
            int i16 = 0;
            if (pfx.getMacData() != null) {
                if (cArr == null) {
                    throw new NullPointerException("no password supplied when one expected");
                }
                MacData macData = pfx.getMacData();
                DigestInfo mac = macData.getMac();
                this.f90118y0 = mac.getAlgorithmId();
                byte[] salt = macData.getSalt();
                this.E0 = f(macData.getIterationCount());
                this.F0 = salt.length;
                byte[] octets = ((ASN1OctetString) authSafe.getContent()).getOctets();
                try {
                    byte[] bArrA = a(this.f90118y0.getAlgorithm(), salt, this.E0, cArr, false, octets);
                    byte[] digest = mac.getDigest();
                    if (!Arrays.constantTimeAreEqual(bArrA, digest)) {
                        if (cArr.length > 0) {
                            throw new IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
                        }
                        if (!Arrays.constantTimeAreEqual(a(this.f90118y0.getAlgorithm(), salt, this.E0, cArr, true, octets), digest)) {
                            throw new IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
                        }
                        z10 = true;
                    }
                    this.f90111q0 = new c();
                    this.f90112r0 = new Hashtable();
                    if (authSafe.getContentType().equals((ASN1Primitive) PKCSObjectIdentifiers.data)) {
                        contentInfo = AuthenticatedSafe.getInstance(ASN1OctetString.getInstance(authSafe.getContent()).getOctets()).getContentInfo();
                        i11 = 0;
                        z11 = false;
                        while (i11 != contentInfo.length) {
                            if (contentInfo[i11].getContentType().equals((ASN1Primitive) PKCSObjectIdentifiers.data)) {
                                aSN1Sequence3 = ASN1Sequence.getInstance(ASN1OctetString.getInstance(contentInfo[i11].getContent()).getOctets());
                                i14 = i16;
                                while (i14 != aSN1Sequence3.size()) {
                                    safeBag3 = SafeBag.getInstance(aSN1Sequence3.getObjectAt(i14));
                                    if (safeBag3.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs8ShroudedKeyBag)) {
                                        EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = EncryptedPrivateKeyInfo.getInstance(safeBag3.getBagValue());
                                        privateKeyUnwrapKey2 = unwrapKey(encryptedPrivateKeyInfo.getEncryptionAlgorithm(), encryptedPrivateKeyInfo.getEncryptedData(), cArr, z10);
                                        if (safeBag3.getBagAttributes() != null) {
                                            objects4 = safeBag3.getBagAttributes().getObjects();
                                            string4 = null;
                                            aSN1OctetString4 = null;
                                            while (objects4.hasMoreElements()) {
                                                ASN1Sequence aSN1Sequence4 = (ASN1Sequence) objects4.nextElement();
                                                aSN1ObjectIdentifier4 = (ASN1ObjectIdentifier) aSN1Sequence4.getObjectAt(i16);
                                                aSN1Set4 = (ASN1Set) aSN1Sequence4.getObjectAt(i15);
                                                if (aSN1Set4.size() > 0) {
                                                    aSN1Primitive4 = (ASN1Primitive) aSN1Set4.getObjectAt(0);
                                                    if (privateKeyUnwrapKey2 instanceof PKCS12BagAttributeCarrier) {
                                                        pKCS12BagAttributeCarrier4 = (PKCS12BagAttributeCarrier) privateKeyUnwrapKey2;
                                                        bagAttribute4 = pKCS12BagAttributeCarrier4.getBagAttribute(aSN1ObjectIdentifier4);
                                                        if (bagAttribute4 != null) {
                                                            pKCS12BagAttributeCarrier4.setBagAttribute(aSN1ObjectIdentifier4, aSN1Primitive4);
                                                        } else if (!bagAttribute4.toASN1Primitive().equals(aSN1Primitive4)) {
                                                            throw new IOException("attempt to add existing attribute with different value");
                                                        }
                                                    }
                                                } else {
                                                    aSN1Primitive4 = null;
                                                }
                                                if (aSN1ObjectIdentifier4.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                                    string4 = ((DERBMPString) aSN1Primitive4).getString();
                                                    this.f90111q0.b(privateKeyUnwrapKey2, string4);
                                                } else if (aSN1ObjectIdentifier4.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                                    aSN1OctetString4 = (ASN1OctetString) aSN1Primitive4;
                                                }
                                                i15 = 1;
                                                i16 = 0;
                                            }
                                        } else {
                                            string4 = null;
                                            aSN1OctetString4 = null;
                                        }
                                        if (aSN1OctetString4 != null) {
                                            str3 = new String(Hex.encode(aSN1OctetString4.getOctets()));
                                            if (string4 == null) {
                                                this.f90111q0.b(privateKeyUnwrapKey2, str3);
                                            } else {
                                                this.f90112r0.put(string4, str3);
                                            }
                                        } else {
                                            this.f90111q0.b(privateKeyUnwrapKey2, "unmarked");
                                            z11 = true;
                                        }
                                    } else if (safeBag3.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.certBag)) {
                                        vector.addElement(safeBag3);
                                    } else {
                                        PrintStream printStream = System.out;
                                        printStream.println("extra in data " + safeBag3.getBagId());
                                        printStream.println(ASN1Dump.dumpAsString(safeBag3));
                                    }
                                    i14++;
                                    i15 = 1;
                                    i16 = 0;
                                }
                                z12 = z10;
                                i12 = i11;
                            } else if (contentInfo[i11].getContentType().equals((ASN1Primitive) PKCSObjectIdentifiers.encryptedData)) {
                                EncryptedData encryptedData = EncryptedData.getInstance(contentInfo[i11].getContent());
                                i12 = i11;
                                aSN1Sequence = ASN1Sequence.getInstance(cryptData(false, encryptedData.getEncryptionAlgorithm(), cArr, z10, encryptedData.getContent().getOctets()));
                                i13 = 0;
                                while (i13 != aSN1Sequence.size()) {
                                    safeBag2 = SafeBag.getInstance(aSN1Sequence.getObjectAt(i13));
                                    if (safeBag2.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.certBag)) {
                                        vector.addElement(safeBag2);
                                        z13 = z10;
                                        aSN1Sequence2 = aSN1Sequence;
                                    } else if (safeBag2.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs8ShroudedKeyBag)) {
                                        EncryptedPrivateKeyInfo encryptedPrivateKeyInfo2 = EncryptedPrivateKeyInfo.getInstance(safeBag2.getBagValue());
                                        privateKeyUnwrapKey = unwrapKey(encryptedPrivateKeyInfo2.getEncryptionAlgorithm(), encryptedPrivateKeyInfo2.getEncryptedData(), cArr, z10);
                                        pKCS12BagAttributeCarrier3 = (PKCS12BagAttributeCarrier) privateKeyUnwrapKey;
                                        objects3 = safeBag2.getBagAttributes().getObjects();
                                        aSN1OctetString3 = null;
                                        string3 = null;
                                        while (objects3.hasMoreElements()) {
                                            ASN1Sequence aSN1Sequence5 = (ASN1Sequence) objects3.nextElement();
                                            boolean z14 = z10;
                                            aSN1ObjectIdentifier3 = (ASN1ObjectIdentifier) aSN1Sequence5.getObjectAt(0);
                                            ASN1Sequence aSN1Sequence6 = aSN1Sequence;
                                            aSN1Set3 = (ASN1Set) aSN1Sequence5.getObjectAt(1);
                                            if (aSN1Set3.size() > 0) {
                                                aSN1Primitive3 = (ASN1Primitive) aSN1Set3.getObjectAt(0);
                                                bagAttribute3 = pKCS12BagAttributeCarrier3.getBagAttribute(aSN1ObjectIdentifier3);
                                                if (bagAttribute3 != null) {
                                                    pKCS12BagAttributeCarrier3.setBagAttribute(aSN1ObjectIdentifier3, aSN1Primitive3);
                                                } else if (!bagAttribute3.toASN1Primitive().equals(aSN1Primitive3)) {
                                                    throw new IOException("attempt to add existing attribute with different value");
                                                }
                                            } else {
                                                aSN1Primitive3 = null;
                                            }
                                            if (aSN1ObjectIdentifier3.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                                string3 = ((DERBMPString) aSN1Primitive3).getString();
                                                this.f90111q0.b(privateKeyUnwrapKey, string3);
                                            } else if (aSN1ObjectIdentifier3.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                                aSN1OctetString3 = (ASN1OctetString) aSN1Primitive3;
                                            }
                                            z10 = z14;
                                            aSN1Sequence = aSN1Sequence6;
                                        }
                                        z13 = z10;
                                        aSN1Sequence2 = aSN1Sequence;
                                        str2 = new String(Hex.encode(aSN1OctetString3.getOctets()));
                                        if (string3 == null) {
                                            this.f90111q0.b(privateKeyUnwrapKey, str2);
                                        } else {
                                            this.f90112r0.put(string3, str2);
                                        }
                                    } else {
                                        z13 = z10;
                                        aSN1Sequence2 = aSN1Sequence;
                                        if (safeBag2.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.keyBag)) {
                                            privateKey = BouncyCastleProvider.getPrivateKey(PrivateKeyInfo.getInstance(safeBag2.getBagValue()));
                                            pKCS12BagAttributeCarrier2 = (PKCS12BagAttributeCarrier) privateKey;
                                            objects2 = safeBag2.getBagAttributes().getObjects();
                                            aSN1OctetString2 = null;
                                            string2 = null;
                                            while (objects2.hasMoreElements()) {
                                                ASN1Sequence aSN1Sequence7 = ASN1Sequence.getInstance(objects2.nextElement());
                                                aSN1ObjectIdentifier2 = ASN1ObjectIdentifier.getInstance(aSN1Sequence7.getObjectAt(0));
                                                aSN1Set2 = ASN1Set.getInstance(aSN1Sequence7.getObjectAt(1));
                                                if (aSN1Set2.size() > 0) {
                                                    aSN1Primitive2 = (ASN1Primitive) aSN1Set2.getObjectAt(0);
                                                    bagAttribute2 = pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier2);
                                                    if (bagAttribute2 != null) {
                                                        pKCS12BagAttributeCarrier2.setBagAttribute(aSN1ObjectIdentifier2, aSN1Primitive2);
                                                    } else if (!bagAttribute2.toASN1Primitive().equals(aSN1Primitive2)) {
                                                        throw new IOException("attempt to add existing attribute with different value");
                                                    }
                                                    if (aSN1ObjectIdentifier2.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                                        string2 = ((DERBMPString) aSN1Primitive2).getString();
                                                        this.f90111q0.b(privateKey, string2);
                                                    } else if (aSN1ObjectIdentifier2.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                                        aSN1OctetString2 = (ASN1OctetString) aSN1Primitive2;
                                                    }
                                                }
                                            }
                                            str = new String(Hex.encode(aSN1OctetString2.getOctets()));
                                            if (string2 == null) {
                                                this.f90111q0.b(privateKey, str);
                                            } else {
                                                this.f90112r0.put(string2, str);
                                            }
                                        } else {
                                            PrintStream printStream2 = System.out;
                                            printStream2.println("extra in encryptedData " + safeBag2.getBagId());
                                            printStream2.println(ASN1Dump.dumpAsString(safeBag2));
                                        }
                                    }
                                    i13++;
                                    z10 = z13;
                                    aSN1Sequence = aSN1Sequence2;
                                }
                                z12 = z10;
                            } else {
                                z12 = z10;
                                i12 = i11;
                                PrintStream printStream3 = System.out;
                                printStream3.println("extra " + contentInfo[i12].getContentType().getId());
                                printStream3.println("extra " + ASN1Dump.dumpAsString(contentInfo[i12].getContent()));
                            }
                            i11 = i12 + 1;
                            z10 = z12;
                            i15 = 1;
                            i16 = 0;
                        }
                    } else {
                        z11 = false;
                    }
                    this.f90113s0 = new c();
                    this.f90114t0 = new Hashtable();
                    this.f90115u0 = new Hashtable();
                    for (i10 = 0; i10 != vector.size(); i10++) {
                        safeBag = (SafeBag) vector.elementAt(i10);
                        certBag = CertBag.getInstance(safeBag.getBagValue());
                        if (certBag.getCertId().equals((ASN1Primitive) PKCSObjectIdentifiers.x509Certificate)) {
                            throw new RuntimeException("Unsupported certificate type: " + certBag.getCertId());
                        }
                        try {
                            certificateGenerateCertificate = this.v0.generateCertificate(new ByteArrayInputStream(((ASN1OctetString) certBag.getCertValue()).getOctets()));
                            if (safeBag.getBagAttributes() != null) {
                                objects = safeBag.getBagAttributes().getObjects();
                                string = null;
                                aSN1OctetString = null;
                                while (objects.hasMoreElements()) {
                                    ASN1Sequence aSN1Sequence8 = ASN1Sequence.getInstance(objects.nextElement());
                                    aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(aSN1Sequence8.getObjectAt(0));
                                    aSN1Set = ASN1Set.getInstance(aSN1Sequence8.getObjectAt(1));
                                    if (aSN1Set.size() > 0) {
                                        aSN1Primitive = (ASN1Primitive) aSN1Set.getObjectAt(0);
                                        if (certificateGenerateCertificate instanceof PKCS12BagAttributeCarrier) {
                                            pKCS12BagAttributeCarrier = (PKCS12BagAttributeCarrier) certificateGenerateCertificate;
                                            bagAttribute = pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier);
                                            if (bagAttribute != null) {
                                                pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Primitive);
                                            } else if (!bagAttribute.toASN1Primitive().equals(aSN1Primitive)) {
                                                throw new IOException("attempt to add existing attribute with different value");
                                            }
                                        }
                                        if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                            string = ((DERBMPString) aSN1Primitive).getString();
                                        } else if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                            aSN1OctetString = (ASN1OctetString) aSN1Primitive;
                                        }
                                    }
                                }
                            } else {
                                string = null;
                                aSN1OctetString = null;
                            }
                            this.f90114t0.put(new a(this, certificateGenerateCertificate.getPublicKey()), certificateGenerateCertificate);
                            if (z11) {
                                if (aSN1OctetString != null) {
                                    this.f90115u0.put(new String(Hex.encode(aSN1OctetString.getOctets())), certificateGenerateCertificate);
                                }
                                if (string != null) {
                                    this.f90113s0.b(certificateGenerateCertificate, string);
                                }
                            } else if (this.f90115u0.isEmpty()) {
                                String str4 = new String(Hex.encode(d(certificateGenerateCertificate.getPublicKey()).getKeyIdentifier()));
                                this.f90115u0.put(str4, certificateGenerateCertificate);
                                c cVar = this.f90111q0;
                                cVar.b(cVar.c("unmarked"), str4);
                            }
                        } catch (Exception e5) {
                            throw new RuntimeException(e5.toString());
                        }
                    }
                } catch (IOException e7) {
                    throw e7;
                } catch (Exception e10) {
                    throw new IOException(androidx.appcompat.view.menu.b.c(e10, new StringBuilder("error constructing MAC: ")));
                }
            }
            if (cArr != null && !Properties.isOverrideSet("org.bouncycastle.pkcs12.ignore_useless_passwd")) {
                throw new IOException("password supplied for keystore that does not require one");
            }
            z10 = false;
            this.f90111q0 = new c();
            this.f90112r0 = new Hashtable();
            if (authSafe.getContentType().equals((ASN1Primitive) PKCSObjectIdentifiers.data)) {
                contentInfo = AuthenticatedSafe.getInstance(ASN1OctetString.getInstance(authSafe.getContent()).getOctets()).getContentInfo();
                i11 = 0;
                z11 = false;
                while (i11 != contentInfo.length) {
                    if (contentInfo[i11].getContentType().equals((ASN1Primitive) PKCSObjectIdentifiers.data)) {
                        aSN1Sequence3 = ASN1Sequence.getInstance(ASN1OctetString.getInstance(contentInfo[i11].getContent()).getOctets());
                        i14 = i16;
                        while (i14 != aSN1Sequence3.size()) {
                            safeBag3 = SafeBag.getInstance(aSN1Sequence3.getObjectAt(i14));
                            if (safeBag3.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs8ShroudedKeyBag)) {
                                EncryptedPrivateKeyInfo encryptedPrivateKeyInfo3 = EncryptedPrivateKeyInfo.getInstance(safeBag3.getBagValue());
                                privateKeyUnwrapKey2 = unwrapKey(encryptedPrivateKeyInfo3.getEncryptionAlgorithm(), encryptedPrivateKeyInfo3.getEncryptedData(), cArr, z10);
                                if (safeBag3.getBagAttributes() != null) {
                                    objects4 = safeBag3.getBagAttributes().getObjects();
                                    string4 = null;
                                    aSN1OctetString4 = null;
                                    while (objects4.hasMoreElements()) {
                                        ASN1Sequence aSN1Sequence9 = (ASN1Sequence) objects4.nextElement();
                                        aSN1ObjectIdentifier4 = (ASN1ObjectIdentifier) aSN1Sequence9.getObjectAt(i16);
                                        aSN1Set4 = (ASN1Set) aSN1Sequence9.getObjectAt(i15);
                                        if (aSN1Set4.size() > 0) {
                                            aSN1Primitive4 = (ASN1Primitive) aSN1Set4.getObjectAt(0);
                                            if (privateKeyUnwrapKey2 instanceof PKCS12BagAttributeCarrier) {
                                                pKCS12BagAttributeCarrier4 = (PKCS12BagAttributeCarrier) privateKeyUnwrapKey2;
                                                bagAttribute4 = pKCS12BagAttributeCarrier4.getBagAttribute(aSN1ObjectIdentifier4);
                                                if (bagAttribute4 != null) {
                                                    pKCS12BagAttributeCarrier4.setBagAttribute(aSN1ObjectIdentifier4, aSN1Primitive4);
                                                } else if (!bagAttribute4.toASN1Primitive().equals(aSN1Primitive4)) {
                                                    throw new IOException("attempt to add existing attribute with different value");
                                                }
                                            }
                                        } else {
                                            aSN1Primitive4 = null;
                                        }
                                        if (aSN1ObjectIdentifier4.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                            string4 = ((DERBMPString) aSN1Primitive4).getString();
                                            this.f90111q0.b(privateKeyUnwrapKey2, string4);
                                        } else if (aSN1ObjectIdentifier4.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                            aSN1OctetString4 = (ASN1OctetString) aSN1Primitive4;
                                        }
                                        i15 = 1;
                                        i16 = 0;
                                    }
                                } else {
                                    string4 = null;
                                    aSN1OctetString4 = null;
                                }
                                if (aSN1OctetString4 != null) {
                                    str3 = new String(Hex.encode(aSN1OctetString4.getOctets()));
                                    if (string4 == null) {
                                        this.f90111q0.b(privateKeyUnwrapKey2, str3);
                                    } else {
                                        this.f90112r0.put(string4, str3);
                                    }
                                } else {
                                    this.f90111q0.b(privateKeyUnwrapKey2, "unmarked");
                                    z11 = true;
                                }
                            } else if (safeBag3.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.certBag)) {
                                vector.addElement(safeBag3);
                            } else {
                                PrintStream printStream4 = System.out;
                                printStream4.println("extra in data " + safeBag3.getBagId());
                                printStream4.println(ASN1Dump.dumpAsString(safeBag3));
                            }
                            i14++;
                            i15 = 1;
                            i16 = 0;
                        }
                        z12 = z10;
                        i12 = i11;
                    } else if (contentInfo[i11].getContentType().equals((ASN1Primitive) PKCSObjectIdentifiers.encryptedData)) {
                        EncryptedData encryptedData2 = EncryptedData.getInstance(contentInfo[i11].getContent());
                        i12 = i11;
                        aSN1Sequence = ASN1Sequence.getInstance(cryptData(false, encryptedData2.getEncryptionAlgorithm(), cArr, z10, encryptedData2.getContent().getOctets()));
                        i13 = 0;
                        while (i13 != aSN1Sequence.size()) {
                            safeBag2 = SafeBag.getInstance(aSN1Sequence.getObjectAt(i13));
                            if (safeBag2.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.certBag)) {
                                vector.addElement(safeBag2);
                                z13 = z10;
                                aSN1Sequence2 = aSN1Sequence;
                            } else if (safeBag2.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs8ShroudedKeyBag)) {
                                EncryptedPrivateKeyInfo encryptedPrivateKeyInfo4 = EncryptedPrivateKeyInfo.getInstance(safeBag2.getBagValue());
                                privateKeyUnwrapKey = unwrapKey(encryptedPrivateKeyInfo4.getEncryptionAlgorithm(), encryptedPrivateKeyInfo4.getEncryptedData(), cArr, z10);
                                pKCS12BagAttributeCarrier3 = (PKCS12BagAttributeCarrier) privateKeyUnwrapKey;
                                objects3 = safeBag2.getBagAttributes().getObjects();
                                aSN1OctetString3 = null;
                                string3 = null;
                                while (objects3.hasMoreElements()) {
                                    ASN1Sequence aSN1Sequence10 = (ASN1Sequence) objects3.nextElement();
                                    boolean z15 = z10;
                                    aSN1ObjectIdentifier3 = (ASN1ObjectIdentifier) aSN1Sequence10.getObjectAt(0);
                                    ASN1Sequence aSN1Sequence11 = aSN1Sequence;
                                    aSN1Set3 = (ASN1Set) aSN1Sequence10.getObjectAt(1);
                                    if (aSN1Set3.size() > 0) {
                                        aSN1Primitive3 = (ASN1Primitive) aSN1Set3.getObjectAt(0);
                                        bagAttribute3 = pKCS12BagAttributeCarrier3.getBagAttribute(aSN1ObjectIdentifier3);
                                        if (bagAttribute3 != null) {
                                            pKCS12BagAttributeCarrier3.setBagAttribute(aSN1ObjectIdentifier3, aSN1Primitive3);
                                        } else if (!bagAttribute3.toASN1Primitive().equals(aSN1Primitive3)) {
                                            throw new IOException("attempt to add existing attribute with different value");
                                        }
                                    } else {
                                        aSN1Primitive3 = null;
                                    }
                                    if (aSN1ObjectIdentifier3.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                        string3 = ((DERBMPString) aSN1Primitive3).getString();
                                        this.f90111q0.b(privateKeyUnwrapKey, string3);
                                    } else if (aSN1ObjectIdentifier3.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                        aSN1OctetString3 = (ASN1OctetString) aSN1Primitive3;
                                    }
                                    z10 = z15;
                                    aSN1Sequence = aSN1Sequence11;
                                }
                                z13 = z10;
                                aSN1Sequence2 = aSN1Sequence;
                                str2 = new String(Hex.encode(aSN1OctetString3.getOctets()));
                                if (string3 == null) {
                                    this.f90111q0.b(privateKeyUnwrapKey, str2);
                                } else {
                                    this.f90112r0.put(string3, str2);
                                }
                            } else {
                                z13 = z10;
                                aSN1Sequence2 = aSN1Sequence;
                                if (safeBag2.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.keyBag)) {
                                    privateKey = BouncyCastleProvider.getPrivateKey(PrivateKeyInfo.getInstance(safeBag2.getBagValue()));
                                    pKCS12BagAttributeCarrier2 = (PKCS12BagAttributeCarrier) privateKey;
                                    objects2 = safeBag2.getBagAttributes().getObjects();
                                    aSN1OctetString2 = null;
                                    string2 = null;
                                    while (objects2.hasMoreElements()) {
                                        ASN1Sequence aSN1Sequence12 = ASN1Sequence.getInstance(objects2.nextElement());
                                        aSN1ObjectIdentifier2 = ASN1ObjectIdentifier.getInstance(aSN1Sequence12.getObjectAt(0));
                                        aSN1Set2 = ASN1Set.getInstance(aSN1Sequence12.getObjectAt(1));
                                        if (aSN1Set2.size() > 0) {
                                            aSN1Primitive2 = (ASN1Primitive) aSN1Set2.getObjectAt(0);
                                            bagAttribute2 = pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier2);
                                            if (bagAttribute2 != null) {
                                                pKCS12BagAttributeCarrier2.setBagAttribute(aSN1ObjectIdentifier2, aSN1Primitive2);
                                            } else if (!bagAttribute2.toASN1Primitive().equals(aSN1Primitive2)) {
                                                throw new IOException("attempt to add existing attribute with different value");
                                            }
                                            if (aSN1ObjectIdentifier2.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                                string2 = ((DERBMPString) aSN1Primitive2).getString();
                                                this.f90111q0.b(privateKey, string2);
                                            } else if (aSN1ObjectIdentifier2.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                                aSN1OctetString2 = (ASN1OctetString) aSN1Primitive2;
                                            }
                                        }
                                    }
                                    str = new String(Hex.encode(aSN1OctetString2.getOctets()));
                                    if (string2 == null) {
                                        this.f90111q0.b(privateKey, str);
                                    } else {
                                        this.f90112r0.put(string2, str);
                                    }
                                } else {
                                    PrintStream printStream5 = System.out;
                                    printStream5.println("extra in encryptedData " + safeBag2.getBagId());
                                    printStream5.println(ASN1Dump.dumpAsString(safeBag2));
                                }
                            }
                            i13++;
                            z10 = z13;
                            aSN1Sequence = aSN1Sequence2;
                        }
                        z12 = z10;
                    } else {
                        z12 = z10;
                        i12 = i11;
                        PrintStream printStream6 = System.out;
                        printStream6.println("extra " + contentInfo[i12].getContentType().getId());
                        printStream6.println("extra " + ASN1Dump.dumpAsString(contentInfo[i12].getContent()));
                    }
                    i11 = i12 + 1;
                    z10 = z12;
                    i15 = 1;
                    i16 = 0;
                }
            } else {
                z11 = false;
            }
            this.f90113s0 = new c();
            this.f90114t0 = new Hashtable();
            this.f90115u0 = new Hashtable();
            while (i10 != vector.size()) {
                safeBag = (SafeBag) vector.elementAt(i10);
                certBag = CertBag.getInstance(safeBag.getBagValue());
                if (certBag.getCertId().equals((ASN1Primitive) PKCSObjectIdentifiers.x509Certificate)) {
                    throw new RuntimeException("Unsupported certificate type: " + certBag.getCertId());
                }
                certificateGenerateCertificate = this.v0.generateCertificate(new ByteArrayInputStream(((ASN1OctetString) certBag.getCertValue()).getOctets()));
                if (safeBag.getBagAttributes() != null) {
                    objects = safeBag.getBagAttributes().getObjects();
                    string = null;
                    aSN1OctetString = null;
                    while (objects.hasMoreElements()) {
                        ASN1Sequence aSN1Sequence13 = ASN1Sequence.getInstance(objects.nextElement());
                        aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(aSN1Sequence13.getObjectAt(0));
                        aSN1Set = ASN1Set.getInstance(aSN1Sequence13.getObjectAt(1));
                        if (aSN1Set.size() > 0) {
                            aSN1Primitive = (ASN1Primitive) aSN1Set.getObjectAt(0);
                            if (certificateGenerateCertificate instanceof PKCS12BagAttributeCarrier) {
                                pKCS12BagAttributeCarrier = (PKCS12BagAttributeCarrier) certificateGenerateCertificate;
                                bagAttribute = pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier);
                                if (bagAttribute != null) {
                                    pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Primitive);
                                } else if (!bagAttribute.toASN1Primitive().equals(aSN1Primitive)) {
                                    throw new IOException("attempt to add existing attribute with different value");
                                }
                            }
                            if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                string = ((DERBMPString) aSN1Primitive).getString();
                            } else if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                aSN1OctetString = (ASN1OctetString) aSN1Primitive;
                            }
                        }
                    }
                } else {
                    string = null;
                    aSN1OctetString = null;
                }
                this.f90114t0.put(new a(this, certificateGenerateCertificate.getPublicKey()), certificateGenerateCertificate);
                if (z11) {
                    if (aSN1OctetString != null) {
                        this.f90115u0.put(new String(Hex.encode(aSN1OctetString.getOctets())), certificateGenerateCertificate);
                    }
                    if (string != null) {
                        this.f90113s0.b(certificateGenerateCertificate, string);
                    }
                } else if (this.f90115u0.isEmpty()) {
                    String str5 = new String(Hex.encode(d(certificateGenerateCertificate.getPublicKey()).getKeyIdentifier()));
                    this.f90115u0.put(str5, certificateGenerateCertificate);
                    c cVar2 = this.f90111q0;
                    cVar2.b(cVar2.c("unmarked"), str5);
                }
            }
        } catch (Exception e11) {
            throw new IOException(e11.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        if (this.f90111q0.a(str) != null) {
            throw new KeyStoreException(h0.b("There is a key entry with the name ", str, Constant.DOT_STRING));
        }
        this.f90113s0.b(certificate, str);
        this.f90114t0.put(new a(this, certificate.getPublicKey()), certificate);
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        boolean z10 = key instanceof PrivateKey;
        if (!z10) {
            throw new KeyStoreException("PKCS12 does not support non-PrivateKeys");
        }
        if (z10 && certificateArr == null) {
            throw new KeyStoreException("no certificate chain for private key");
        }
        if (this.f90111q0.a(str) != null) {
            engineDeleteEntry(str);
        }
        this.f90111q0.b(key, str);
        if (certificateArr != null) {
            this.f90113s0.b(certificateArr[0], str);
            for (int i10 = 0; i10 != certificateArr.length; i10++) {
                this.f90114t0.put(new a(this, certificateArr[i10].getPublicKey()), certificateArr[i10]);
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        Hashtable hashtable = new Hashtable();
        Enumeration enumerationKeys = this.f90113s0.f90121a.keys();
        while (enumerationKeys.hasMoreElements()) {
            hashtable.put(enumerationKeys.nextElement(), "cert");
        }
        Enumeration enumerationKeys2 = this.f90111q0.f90121a.keys();
        while (enumerationKeys2.hasMoreElements()) {
            String str = (String) enumerationKeys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
        e(outputStream, cArr, false);
    }

    @Override // org.bouncycastle.jce.interfaces.BCKeyStore
    public void setRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    public PrivateKey unwrapKey(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, char[] cArr, boolean z10) throws IOException {
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        try {
            if (algorithm.on(PKCSObjectIdentifiers.pkcs_12PbeIds)) {
                PKCS12PBEParams pKCS12PBEParams = PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), f(pKCS12PBEParams.getIterations()));
                Cipher cipherCreateCipher = this.f90110p0.createCipher(algorithm.getId());
                cipherCreateCipher.init(4, new PKCS12Key(cArr, z10), pBEParameterSpec);
                return (PrivateKey) cipherCreateCipher.unwrap(bArr, "", 2);
            }
            if (algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.id_PBES2)) {
                return (PrivateKey) b(4, cArr, algorithmIdentifier).unwrap(bArr, "", 2);
            }
            throw new IOException("exception unwrapping private key - cannot recognise: " + algorithm);
        } catch (Exception e5) {
            throw new IOException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("exception unwrapping private key - ")));
        }
    }

    public byte[] wrapKey(String str, Key key, PKCS12PBEParams pKCS12PBEParams, char[] cArr) throws IOException {
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
        BCJcaJceHelper bCJcaJceHelper = this.f90110p0;
        try {
            SecretKeyFactory secretKeyFactoryCreateSecretKeyFactory = bCJcaJceHelper.createSecretKeyFactory(str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
            Cipher cipherCreateCipher = bCJcaJceHelper.createCipher(str);
            cipherCreateCipher.init(3, secretKeyFactoryCreateSecretKeyFactory.generateSecret(pBEKeySpec), pBEParameterSpec);
            return cipherCreateCipher.wrap(key);
        } catch (Exception e5) {
            throw new IOException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("exception encrypting data - ")));
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        throw new RuntimeException("operation not supported");
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException, CertificateException {
        PKCS12StoreParameter pKCS12StoreParameter;
        char[] password;
        if (loadStoreParameter == null) {
            throw new IllegalArgumentException("'param' arg cannot be null");
        }
        boolean z10 = loadStoreParameter instanceof PKCS12StoreParameter;
        if (!z10 && !(loadStoreParameter instanceof JDKPKCS12StoreParameter)) {
            throw new IllegalArgumentException("No support for 'param' of type ".concat(loadStoreParameter.getClass().getName()));
        }
        if (z10) {
            pKCS12StoreParameter = (PKCS12StoreParameter) loadStoreParameter;
        } else {
            JDKPKCS12StoreParameter jDKPKCS12StoreParameter = (JDKPKCS12StoreParameter) loadStoreParameter;
            pKCS12StoreParameter = new PKCS12StoreParameter(jDKPKCS12StoreParameter.getOutputStream(), loadStoreParameter.getProtectionParameter(), jDKPKCS12StoreParameter.isUseDEREncoding());
        }
        KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            password = null;
        } else {
            if (!(protectionParameter instanceof KeyStore.PasswordProtection)) {
                throw new IllegalArgumentException("No support for protection parameter of type ".concat(protectionParameter.getClass().getName()));
            }
            password = ((KeyStore.PasswordProtection) protectionParameter).getPassword();
        }
        e(pKCS12StoreParameter.getOutputStream(), password, pKCS12StoreParameter.isForDEREncoding());
    }
}
