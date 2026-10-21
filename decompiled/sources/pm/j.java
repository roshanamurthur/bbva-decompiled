package pm;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.jcajce.util.MessageDigestUtils;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f92726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DERNull f92727b;

    static {
        HashMap map = new HashMap();
        f92726a = map;
        map.put(EdECObjectIdentifiers.id_Ed25519, EdDSAParameterSpec.Ed25519);
        map.put(EdECObjectIdentifiers.id_Ed448, EdDSAParameterSpec.Ed448);
        map.put(OIWObjectIdentifiers.dsaWithSHA1, "SHA1withDSA");
        map.put(X9ObjectIdentifiers.id_dsa_with_sha1, "SHA1withDSA");
        f92727b = DERNull.INSTANCE;
    }

    public static String a(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String digestName = MessageDigestUtils.getDigestName(aSN1ObjectIdentifier);
        int iIndexOf = digestName.indexOf(45);
        if (iIndexOf <= 0 || digestName.startsWith("SHA3")) {
            return MessageDigestUtils.getDigestName(aSN1ObjectIdentifier);
        }
        return digestName.substring(0, iIndexOf) + digestName.substring(iIndexOf + 1);
    }

    public static String b(AlgorithmIdentifier algorithmIdentifier) {
        String strC;
        String strC2;
        StringBuilder sb2;
        String str;
        ASN1Encodable parameters = algorithmIdentifier.getParameters();
        if (parameters != null && !f92727b.equals(parameters)) {
            if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSASSA_PSS)) {
                RSASSAPSSparams rSASSAPSSparams = RSASSAPSSparams.getInstance(parameters);
                sb2 = new StringBuilder();
                sb2.append(a(rSASSAPSSparams.getHashAlgorithm().getAlgorithm()));
                str = "withRSAandMGF1";
            } else if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) X9ObjectIdentifiers.ecdsa_with_SHA2)) {
                ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(parameters);
                sb2 = new StringBuilder();
                sb2.append(a((ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0)));
                str = "withECDSA";
            }
            sb2.append(str);
            return sb2.toString();
        }
        String str2 = (String) f92726a.get(algorithmIdentifier.getAlgorithm());
        if (str2 != null) {
            return str2;
        }
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        Provider provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
        if (provider != null && (strC2 = c(provider, algorithm)) != null) {
            return strC2;
        }
        Provider[] providers = Security.getProviders();
        for (int i10 = 0; i10 != providers.length; i10++) {
            Provider provider2 = providers[i10];
            if (provider != provider2 && (strC = c(provider2, algorithm)) != null) {
                return strC;
            }
        }
        return algorithm.getId();
    }

    public static String c(Provider provider, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String property = provider.getProperty("Alg.Alias.Signature." + aSN1ObjectIdentifier);
        if (property != null) {
            return property;
        }
        String property2 = provider.getProperty("Alg.Alias.Signature.OID." + aSN1ObjectIdentifier);
        if (property2 != null) {
            return property2;
        }
        return null;
    }

    public static void d(Signature signature, ASN1Encodable aSN1Encodable) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (aSN1Encodable == null || f92727b.equals(aSN1Encodable)) {
            return;
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
        try {
            algorithmParameters.init(aSN1Encodable.toASN1Primitive().getEncoded());
            if (signature.getAlgorithm().endsWith("MGF1")) {
                try {
                    signature.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                } catch (GeneralSecurityException e5) {
                    throw new SignatureException(androidx.emoji2.text.flatbuffer.a.d(e5, new StringBuilder("Exception extracting parameters: ")));
                }
            }
        } catch (IOException e7) {
            throw new SignatureException(androidx.camera.core.impl.a.d(e7, new StringBuilder("IOException decoding parameters: ")));
        }
    }
}
