package org.bouncycastle.jce.provider;

import androidx.camera.camera2.internal.h0;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.isara.IsaraObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.jcajce.provider.lms.LMSKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.newhope.NHKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.qtesla.QTESLAKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.sphincs.Sphincs256KeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.xmss.XMSSKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTKeyFactorySpi;

/* JADX INFO: loaded from: classes8.dex */
public final class BouncyCastleProvider extends Provider implements ConfigurableProvider {
    public static final ProviderConfiguration CONFIGURATION = new org.bouncycastle.jce.provider.a();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final HashMap f90373p0 = new HashMap();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String[] f90374q0 = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String[] f90375r0 = {"SipHash", "SipHash128", "Poly1305"};

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String[] f90376s0 = {"AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624", "GOST3412_2015", "Zuc"};

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String[] f90377t0 = {"X509", "IES"};

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String[] f90378u0 = {"DSA", "DH", LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC, "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC"};
    public static final String[] v0 = {"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka"};
    public static final String PROVIDER_NAME = "BC";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String[] f90379w0 = {PROVIDER_NAME, "BCFKS", "PKCS12"};

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String[] f90380x0 = {"DRBG"};

    public class a implements PrivilegedAction {
        public a() {
        }

        @Override // java.security.PrivilegedAction
        public final Object run() {
            String[] strArr = BouncyCastleProvider.v0;
            BouncyCastleProvider bouncyCastleProvider = BouncyCastleProvider.this;
            bouncyCastleProvider.a("org.bouncycastle.jcajce.provider.digest.", strArr);
            bouncyCastleProvider.a("org.bouncycastle.jcajce.provider.symmetric.", BouncyCastleProvider.f90374q0);
            bouncyCastleProvider.a("org.bouncycastle.jcajce.provider.symmetric.", BouncyCastleProvider.f90375r0);
            bouncyCastleProvider.a("org.bouncycastle.jcajce.provider.symmetric.", BouncyCastleProvider.f90376s0);
            bouncyCastleProvider.a("org.bouncycastle.jcajce.provider.asymmetric.", BouncyCastleProvider.f90377t0);
            bouncyCastleProvider.a("org.bouncycastle.jcajce.provider.asymmetric.", BouncyCastleProvider.f90378u0);
            bouncyCastleProvider.a("org.bouncycastle.jcajce.provider.keystore.", BouncyCastleProvider.f90379w0);
            bouncyCastleProvider.a("org.bouncycastle.jcajce.provider.drbg.", BouncyCastleProvider.f90380x0);
            bouncyCastleProvider.addKeyInfoConverter(PQCObjectIdentifiers.sphincs256, new Sphincs256KeyFactorySpi());
            bouncyCastleProvider.addKeyInfoConverter(PQCObjectIdentifiers.newHope, new NHKeyFactorySpi());
            bouncyCastleProvider.addKeyInfoConverter(PQCObjectIdentifiers.xmss, new XMSSKeyFactorySpi());
            bouncyCastleProvider.addKeyInfoConverter(IsaraObjectIdentifiers.id_alg_xmss, new XMSSKeyFactorySpi());
            bouncyCastleProvider.addKeyInfoConverter(PQCObjectIdentifiers.xmss_mt, new XMSSMTKeyFactorySpi());
            bouncyCastleProvider.addKeyInfoConverter(IsaraObjectIdentifiers.id_alg_xmssmt, new XMSSMTKeyFactorySpi());
            bouncyCastleProvider.addKeyInfoConverter(PQCObjectIdentifiers.mcEliece, new McElieceKeyFactorySpi());
            bouncyCastleProvider.addKeyInfoConverter(PQCObjectIdentifiers.mcElieceCca2, new McElieceCCA2KeyFactorySpi());
            bouncyCastleProvider.addKeyInfoConverter(PQCObjectIdentifiers.rainbow, new RainbowKeyFactorySpi());
            bouncyCastleProvider.addKeyInfoConverter(PQCObjectIdentifiers.qTESLA_p_I, new QTESLAKeyFactorySpi());
            bouncyCastleProvider.addKeyInfoConverter(PQCObjectIdentifiers.qTESLA_p_III, new QTESLAKeyFactorySpi());
            bouncyCastleProvider.addKeyInfoConverter(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig, new LMSKeyFactorySpi());
            bouncyCastleProvider.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
            bouncyCastleProvider.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
            bouncyCastleProvider.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
            bouncyCastleProvider.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
            bouncyCastleProvider.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
            bouncyCastleProvider.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
            bouncyCastleProvider.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
            bouncyCastleProvider.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
            bouncyCastleProvider.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
            bouncyCastleProvider.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
            bouncyCastleProvider.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
            bouncyCastleProvider.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
            bouncyCastleProvider.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
            bouncyCastleProvider.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
            bouncyCastleProvider.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
            bouncyCastleProvider.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
            bouncyCastleProvider.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
            bouncyCastleProvider.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            bouncyCastleProvider.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
            bouncyCastleProvider.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            bouncyCastleProvider.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
            bouncyCastleProvider.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
            bouncyCastleProvider.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
            bouncyCastleProvider.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
            bouncyCastleProvider.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
            return null;
        }
    }

    public BouncyCastleProvider() {
        super(PROVIDER_NAME, 1.65d, "BouncyCastle Security Provider v1.65");
        AccessController.doPrivileged(new a());
    }

    public static PrivateKey getPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter;
        ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        HashMap map = f90373p0;
        synchronized (map) {
            asymmetricKeyInfoConverter = (AsymmetricKeyInfoConverter) map.get(algorithm);
        }
        if (asymmetricKeyInfoConverter == null) {
            return null;
        }
        return asymmetricKeyInfoConverter.generatePrivate(privateKeyInfo);
    }

    public static PublicKey getPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter;
        ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        HashMap map = f90373p0;
        synchronized (map) {
            asymmetricKeyInfoConverter = (AsymmetricKeyInfoConverter) map.get(algorithm);
        }
        if (asymmetricKeyInfoConverter == null) {
            return null;
        }
        return asymmetricKeyInfoConverter.generatePublic(subjectPublicKeyInfo);
    }

    public final void a(String str, String[] strArr) {
        for (int i10 = 0; i10 != strArr.length; i10++) {
            StringBuilder sbD = androidx.camera.core.impl.utils.c.d(str);
            sbD.append(strArr[i10]);
            sbD.append("$Mappings");
            Class clsLoadClass = ClassUtil.loadClass(BouncyCastleProvider.class, sbD.toString());
            if (clsLoadClass != null) {
                try {
                    ((AlgorithmProvider) clsLoadClass.newInstance()).configure(this);
                } catch (Exception e5) {
                    throw new InternalError("cannot create instance of " + str + strArr[i10] + "$Mappings : " + e5);
                }
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, String str2) {
        if (containsKey(str)) {
            throw new IllegalStateException(h0.b("duplicate provider key (", str, ") found"));
        }
        put(str, str2);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAttributes(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            String strB = androidx.camera.core.impl.utils.a.b(str, " ", str2);
            if (containsKey(strB)) {
                throw new IllegalStateException(h0.b("duplicate provider attribute key (", strB, ") found"));
            }
            put(strB, map.get(str2));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addKeyInfoConverter(ASN1ObjectIdentifier aSN1ObjectIdentifier, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        HashMap map = f90373p0;
        synchronized (map) {
            map.put(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public boolean hasAlgorithm(String str, String str2) {
        if (!containsKey(str + Constant.DOT_STRING + str2)) {
            if (!containsKey("Alg.Alias." + str + Constant.DOT_STRING + str2)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void setParameter(String str, Object obj) {
        ProviderConfiguration providerConfiguration = CONFIGURATION;
        synchronized (providerConfiguration) {
            ((org.bouncycastle.jce.provider.a) providerConfiguration).a(str, obj);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2) {
        addAlgorithm(str + Constant.DOT_STRING + aSN1ObjectIdentifier, str2);
        addAlgorithm(str + ".OID." + aSN1ObjectIdentifier, str2);
    }
}
