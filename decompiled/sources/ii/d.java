package ii;

import com.nimbusds.jose.JOSEException;
import java.io.StringReader;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.ArrayList;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.openssl.PEMException;
import org.bouncycastle.openssl.PEMKeyPair;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;

/* JADX INFO: compiled from: PEMEncodedKeyParser.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JcaPEMKeyConverter f69717a = new JcaPEMKeyConverter();

    public static ArrayList a(String str) throws JOSEException {
        Object object;
        PEMParser pEMParser = new PEMParser(new StringReader(str));
        ArrayList arrayList = new ArrayList();
        do {
            try {
                object = pEMParser.readObject();
                if (object instanceof SubjectPublicKeyInfo) {
                    arrayList.add(c((SubjectPublicKeyInfo) object));
                } else if (object instanceof X509CertificateHolder) {
                    arrayList.add(d((X509CertificateHolder) object));
                } else if (object instanceof PEMKeyPair) {
                    arrayList.add(e((PEMKeyPair) object));
                } else if (object instanceof PrivateKeyInfo) {
                    arrayList.add(b((PrivateKeyInfo) object));
                }
            } catch (Exception e5) {
                throw new JOSEException(e5.getMessage(), e5);
            }
        } while (object != null);
        return arrayList;
    }

    public static KeyPair b(PrivateKeyInfo privateKeyInfo) throws InvalidKeySpecException, NoSuchAlgorithmException, PEMException {
        PrivateKey privateKey = f69717a.getPrivateKey(privateKeyInfo);
        if (!(privateKey instanceof RSAPrivateCrtKey)) {
            return new KeyPair(null, privateKey);
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) privateKey;
        return new KeyPair(KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent())), privateKey);
    }

    public static KeyPair c(SubjectPublicKeyInfo subjectPublicKeyInfo) throws PEMException {
        return new KeyPair(f69717a.getPublicKey(subjectPublicKeyInfo), null);
    }

    public static KeyPair d(X509CertificateHolder x509CertificateHolder) throws PEMException {
        return new KeyPair(f69717a.getPublicKey(x509CertificateHolder.getSubjectPublicKeyInfo()), null);
    }

    public static KeyPair e(PEMKeyPair pEMKeyPair) throws PEMException {
        return f69717a.getKeyPair(pEMKeyPair);
    }
}
