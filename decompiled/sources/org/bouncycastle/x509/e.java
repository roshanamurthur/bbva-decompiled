package org.bouncycastle.x509;

import androidx.camera.camera2.internal.h0;
import androidx.camera.core.processing.f;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Hashtable f91746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Hashtable f91747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f91748c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f91749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Provider f91750b;
    }

    static {
        Hashtable hashtable = new Hashtable();
        f91746a = hashtable;
        Hashtable hashtable2 = new Hashtable();
        f91747b = hashtable2;
        HashSet hashSet = new HashSet();
        f91748c = hashSet;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.md2WithRSAEncryption;
        hashtable.put("MD2WITHRSAENCRYPTION", aSN1ObjectIdentifier);
        hashtable.put("MD2WITHRSA", aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.md5WithRSAEncryption;
        hashtable.put("MD5WITHRSAENCRYPTION", aSN1ObjectIdentifier2);
        hashtable.put("MD5WITHRSA", aSN1ObjectIdentifier2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PKCSObjectIdentifiers.sha1WithRSAEncryption;
        hashtable.put("SHA1WITHRSAENCRYPTION", aSN1ObjectIdentifier3);
        hashtable.put("SHA1WITHRSA", aSN1ObjectIdentifier3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.sha224WithRSAEncryption;
        hashtable.put("SHA224WITHRSAENCRYPTION", aSN1ObjectIdentifier4);
        hashtable.put("SHA224WITHRSA", aSN1ObjectIdentifier4);
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.sha256WithRSAEncryption;
        hashtable.put("SHA256WITHRSAENCRYPTION", aSN1ObjectIdentifier5);
        hashtable.put("SHA256WITHRSA", aSN1ObjectIdentifier5);
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = PKCSObjectIdentifiers.sha384WithRSAEncryption;
        hashtable.put("SHA384WITHRSAENCRYPTION", aSN1ObjectIdentifier6);
        hashtable.put("SHA384WITHRSA", aSN1ObjectIdentifier6);
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = PKCSObjectIdentifiers.sha512WithRSAEncryption;
        hashtable.put("SHA512WITHRSAENCRYPTION", aSN1ObjectIdentifier7);
        hashtable.put("SHA512WITHRSA", aSN1ObjectIdentifier7);
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = PKCSObjectIdentifiers.id_RSASSA_PSS;
        hashtable.put("SHA1WITHRSAANDMGF1", aSN1ObjectIdentifier8);
        hashtable.put("SHA224WITHRSAANDMGF1", aSN1ObjectIdentifier8);
        hashtable.put("SHA256WITHRSAANDMGF1", aSN1ObjectIdentifier8);
        hashtable.put("SHA384WITHRSAANDMGF1", aSN1ObjectIdentifier8);
        hashtable.put("SHA512WITHRSAANDMGF1", aSN1ObjectIdentifier8);
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160;
        hashtable.put("RIPEMD160WITHRSAENCRYPTION", aSN1ObjectIdentifier9);
        hashtable.put("RIPEMD160WITHRSA", aSN1ObjectIdentifier9);
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128;
        hashtable.put("RIPEMD128WITHRSAENCRYPTION", aSN1ObjectIdentifier10);
        hashtable.put("RIPEMD128WITHRSA", aSN1ObjectIdentifier10);
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256;
        hashtable.put("RIPEMD256WITHRSAENCRYPTION", aSN1ObjectIdentifier11);
        hashtable.put("RIPEMD256WITHRSA", aSN1ObjectIdentifier11);
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = X9ObjectIdentifiers.id_dsa_with_sha1;
        hashtable.put("SHA1WITHDSA", aSN1ObjectIdentifier12);
        hashtable.put("DSAWITHSHA1", aSN1ObjectIdentifier12);
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = NISTObjectIdentifiers.dsa_with_sha224;
        hashtable.put("SHA224WITHDSA", aSN1ObjectIdentifier13);
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = NISTObjectIdentifiers.dsa_with_sha256;
        hashtable.put("SHA256WITHDSA", aSN1ObjectIdentifier14);
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = NISTObjectIdentifiers.dsa_with_sha384;
        hashtable.put("SHA384WITHDSA", aSN1ObjectIdentifier15);
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = NISTObjectIdentifiers.dsa_with_sha512;
        hashtable.put("SHA512WITHDSA", aSN1ObjectIdentifier16);
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = X9ObjectIdentifiers.ecdsa_with_SHA1;
        hashtable.put("SHA1WITHECDSA", aSN1ObjectIdentifier17);
        hashtable.put("ECDSAWITHSHA1", aSN1ObjectIdentifier17);
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = X9ObjectIdentifiers.ecdsa_with_SHA224;
        hashtable.put("SHA224WITHECDSA", aSN1ObjectIdentifier18);
        ASN1ObjectIdentifier aSN1ObjectIdentifier19 = X9ObjectIdentifiers.ecdsa_with_SHA256;
        hashtable.put("SHA256WITHECDSA", aSN1ObjectIdentifier19);
        ASN1ObjectIdentifier aSN1ObjectIdentifier20 = X9ObjectIdentifiers.ecdsa_with_SHA384;
        hashtable.put("SHA384WITHECDSA", aSN1ObjectIdentifier20);
        ASN1ObjectIdentifier aSN1ObjectIdentifier21 = X9ObjectIdentifiers.ecdsa_with_SHA512;
        hashtable.put("SHA512WITHECDSA", aSN1ObjectIdentifier21);
        ASN1ObjectIdentifier aSN1ObjectIdentifier22 = CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94;
        hashtable.put("GOST3411WITHGOST3410", aSN1ObjectIdentifier22);
        hashtable.put("GOST3411WITHGOST3410-94", aSN1ObjectIdentifier22);
        ASN1ObjectIdentifier aSN1ObjectIdentifier23 = CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001;
        hashtable.put("GOST3411WITHECGOST3410", aSN1ObjectIdentifier23);
        hashtable.put("GOST3411WITHECGOST3410-2001", aSN1ObjectIdentifier23);
        hashtable.put("GOST3411WITHGOST3410-2001", aSN1ObjectIdentifier23);
        hashSet.add(aSN1ObjectIdentifier17);
        hashSet.add(aSN1ObjectIdentifier18);
        hashSet.add(aSN1ObjectIdentifier19);
        hashSet.add(aSN1ObjectIdentifier20);
        hashSet.add(aSN1ObjectIdentifier21);
        hashSet.add(aSN1ObjectIdentifier12);
        hashSet.add(aSN1ObjectIdentifier13);
        hashSet.add(aSN1ObjectIdentifier14);
        hashSet.add(aSN1ObjectIdentifier15);
        hashSet.add(aSN1ObjectIdentifier16);
        hashSet.add(aSN1ObjectIdentifier22);
        hashSet.add(aSN1ObjectIdentifier23);
        ASN1ObjectIdentifier aSN1ObjectIdentifier24 = OIWObjectIdentifiers.idSHA1;
        DERNull dERNull = DERNull.INSTANCE;
        hashtable2.put("SHA1WITHRSAANDMGF1", c(new AlgorithmIdentifier(aSN1ObjectIdentifier24, dERNull), 20));
        hashtable2.put("SHA224WITHRSAANDMGF1", c(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha224, dERNull), 28));
        hashtable2.put("SHA256WITHRSAANDMGF1", c(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256, dERNull), 32));
        hashtable2.put("SHA384WITHRSAANDMGF1", c(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384, dERNull), 48));
        hashtable2.put("SHA512WITHRSAANDMGF1", c(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512, dERNull), 64));
    }

    public static byte[] a(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, String str2, PrivateKey privateKey, SecureRandom secureRandom, ASN1Object aSN1Object) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, NoSuchProviderException {
        if (aSN1ObjectIdentifier == null) {
            throw new IllegalStateException("no signature algorithm specified");
        }
        Signature signature = str2 != null ? Signature.getInstance(str, str2) : Signature.getInstance(str);
        if (secureRandom != null) {
            signature.initSign(privateKey, secureRandom);
        } else {
            signature.initSign(privateKey);
        }
        signature.update(aSN1Object.toASN1Primitive().getEncoded(ASN1Encoding.DER));
        return signature.sign();
    }

    public static byte[] b(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, PrivateKey privateKey, SecureRandom secureRandom, ASN1Object aSN1Object) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, IOException {
        if (aSN1ObjectIdentifier == null) {
            throw new IllegalStateException("no signature algorithm specified");
        }
        Signature signature = Signature.getInstance(str);
        if (secureRandom != null) {
            signature.initSign(privateKey, secureRandom);
        } else {
            signature.initSign(privateKey);
        }
        signature.update(aSN1Object.toASN1Primitive().getEncoded(ASN1Encoding.DER));
        return signature.sign();
    }

    public static RSASSAPSSparams c(AlgorithmIdentifier algorithmIdentifier, int i10) {
        return new RSASSAPSSparams(algorithmIdentifier, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, algorithmIdentifier), new ASN1Integer(i10), new ASN1Integer(1L));
    }

    public static Iterator d() {
        Enumeration enumerationKeys = f91746a.keys();
        ArrayList arrayList = new ArrayList();
        while (enumerationKeys.hasMoreElements()) {
            arrayList.add(enumerationKeys.nextElement());
        }
        return arrayList.iterator();
    }

    public static ASN1ObjectIdentifier e(String str) {
        String upperCase = Strings.toUpperCase(str);
        Hashtable hashtable = f91746a;
        return hashtable.containsKey(upperCase) ? (ASN1ObjectIdentifier) hashtable.get(upperCase) : new ASN1ObjectIdentifier(upperCase);
    }

    public static a f(String str, String str2) throws NoSuchAlgorithmException {
        Provider[] providers = Security.getProviders();
        if (providers.length != 0) {
            return g(str, Strings.toUpperCase(str2), providers[0]);
        }
        throw new NoSuchAlgorithmException(f.d("cannot find implementation ", str2));
    }

    public static a g(String str, String str2, Provider provider) throws NoSuchAlgorithmException {
        String upperCase = Strings.toUpperCase(str2);
        while (true) {
            String property = provider.getProperty("Alg.Alias." + str + Constant.DOT_STRING + upperCase);
            if (property == null) {
                break;
            }
            upperCase = property;
        }
        String property2 = provider.getProperty(str + Constant.DOT_STRING + upperCase);
        if (property2 == null) {
            StringBuilder sbD = ci.a.d("cannot find implementation ", upperCase, " for provider ");
            sbD.append(provider.getName());
            throw new NoSuchAlgorithmException(sbD.toString());
        }
        try {
            ClassLoader classLoader = provider.getClass().getClassLoader();
            Object objNewInstance = (classLoader != null ? classLoader.loadClass(property2) : Class.forName(property2)).newInstance();
            a aVar = new a();
            aVar.f91749a = objNewInstance;
            aVar.f91750b = provider;
            return aVar;
        } catch (ClassNotFoundException unused) {
            StringBuilder sbD2 = ci.a.d("algorithm ", upperCase, " in provider ");
            sbD2.append(provider.getName());
            sbD2.append(" but no class \"");
            sbD2.append(property2);
            sbD2.append("\" found!");
            throw new IllegalStateException(sbD2.toString());
        } catch (Exception unused2) {
            StringBuilder sbD3 = ci.a.d("algorithm ", upperCase, " in provider ");
            sbD3.append(provider.getName());
            sbD3.append(" but class \"");
            sbD3.append(property2);
            sbD3.append("\" inaccessible!");
            throw new IllegalStateException(sbD3.toString());
        }
    }

    public static Provider h(String str) throws NoSuchProviderException {
        Provider provider = Security.getProvider(str);
        if (provider != null) {
            return provider;
        }
        throw new NoSuchProviderException(h0.b("Provider ", str, " not found"));
    }

    public static AlgorithmIdentifier i(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (f91748c.contains(aSN1ObjectIdentifier)) {
            return new AlgorithmIdentifier(aSN1ObjectIdentifier);
        }
        String upperCase = Strings.toUpperCase(str);
        Hashtable hashtable = f91747b;
        return hashtable.containsKey(upperCase) ? new AlgorithmIdentifier(aSN1ObjectIdentifier, (ASN1Encodable) hashtable.get(upperCase)) : new AlgorithmIdentifier(aSN1ObjectIdentifier, DERNull.INSTANCE);
    }
}
